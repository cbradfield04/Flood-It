# 🎨 Flood It

A **Java-based puzzle game** inspired by the classic *Flood It!* where players aim to fill the entire board with one color in as few moves as possible.  
Developed to demonstrate **algorithmic problem-solving**, **GUI development**, and **object-oriented programming** principles.

---

## 🧩 Overview

The player starts from the top-left corner of a colored grid and selects colors to “flood” adjacent tiles.  
Each move spreads the chosen color across connected tiles until the entire board becomes one uniform color.  
The challenge: **complete the board using the fewest moves possible.**

---

## ✨ Features

- 🎲 **Dynamic Board Generation** – A new randomized grid for every game.  
- 🧠 **BFS & DFS Algorithms** – Implements both Breadth-First and Depth-First Search for color spreading logic.  
- 🖥️ **Interactive GUI** – Built with Swing/AWT for responsive visuals and user input.  
- 🔢 **Move Counter** – Tracks moves and displays win/lose conditions.  
- ⚙️ **Customizable Settings** – Adjustable grid size and color palette for varied difficulty.

---

## ⚙️ Technical Details

- **Language:** Java  
- **Libraries:** Swing, AWT  
- **Paradigm:** Object-Oriented Programming (OOP)  
- **Design Pattern:** Model-View-Controller (MVC)  

---

## 🚀 Highlights

- Designed recursive and iterative algorithms for color propagation.  
- Focused on visualization and user feedback to make the algorithmic process intuitive.  
- Structured with modular, maintainable code for future expansion.

---

## 🖼️ Example Gameplay

*(Add a screenshot or GIF here — e.g., `![Flood It Gameplay](screenshots/gameplay.png)`)*

---

## 💻 How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.iu.edu/<your-username>/flood-it.git

cd flood-it

javac FloodIt.java

java FloodIt
