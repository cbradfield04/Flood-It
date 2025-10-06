// Imports for the parameters of flood

import java.lang.reflect.Array;
import java.util.*;


public class Flood {

    // Students implement this flood function.
    public static void flood1(WaterColor color,
                              LinkedList<Coord> flooded_list,
                              Tile[][] tiles,
                              Integer board_size) {
        HashSet<Coord> visited = new HashSet<>();
        int i = 0;
        while (i < flooded_list.size()) {
            Coord currentFlood = flooded_list.get(i);
            if (visited.contains(currentFlood)) {
                i++;
                continue;
            }
            visited.add(currentFlood);
            List<Coord> neighbors = currentFlood.neighbors(board_size);
            for (Coord currentNeighbor : neighbors) {
                Tile currentNeighborTile = tiles[currentNeighbor.getY()][currentNeighbor.getX()];
                if (currentNeighborTile.getColor() == color && currentNeighbor.onBoard(board_size) && !visited.contains(currentNeighbor)) {
                    if (!flooded_list.contains(currentNeighbor))
                        flooded_list.add(currentNeighbor);
                }
            }
            ++i;
        }
    }


    // An alternative implementation goes here.
    public static void flood(WaterColor color,
                             LinkedList<Coord> flooded_list,
                             Tile[][] tiles,
                             Integer board_size) {
        HashSet<Coord> floodedSet = new HashSet<>(flooded_list); // Additional HashSet for quick lookup

        for (int i = 0; i < flooded_list.size(); i++) {
            Coord currentFlood = flooded_list.get(i);
            List<Coord> neighbors = currentFlood.neighbors(board_size);

            for (Coord currentNeighbor : neighbors) {
                if (currentNeighbor.onBoard(board_size)) {
                    Tile currentNeighborTile = tiles[currentNeighbor.getY()][currentNeighbor.getX()];
                    if (currentNeighborTile.getColor() == color && !floodedSet.contains(currentNeighbor)) {
                        flooded_list.addLast(currentNeighbor); // Add to the end of the list
                        floodedSet.add(currentNeighbor); // Also add to the HashSet
                    }
                }
            }
        }
    }
}




