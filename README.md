# 🕹️ Tic Tac Toe Backend with Ktor & WebSockets

This is the **backend server** for a real-time two-player Tic Tac Toe game built using:
- 🖥️ **Ktor (Kotlin)** backend with WebSockets
- 🧠 **Kotlin Serialization** & **StateFlow** for reactive state management
- 🚀 Deployed on a VPS with port forwarding

It handles all **game logic, player turns, win/draw detection, and broadcasting** of game state to connected clients.  
The backend is designed to work with any WebSocket-compatible frontend (Android, web, desktop).

---

## 📦 Tech Stack

### 🔙 Backend (Ktor - IntelliJ IDEA)
- Kotlin-based Ktor server
- WebSockets for real-time communication
- JSON serialization via `kotlinx.serialization`
- State management with `StateFlow`
- `/play` WebSocket endpoint
- Deployable to VPS or cloud hosting

---

## ⚙️ Features

✅ Real-time two-player Tic Tac Toe  
✅ Automatic game reset after win/draw  
✅ Server-controlled game logic (prevents cheating)  
✅ Lightweight WebSocket message protocol  
✅ Clean separation of logic, models, and networking code  
✅ Easily deployable for online play

---

## 🧪 How It Works

- **The backend**:
    - Assigns players as `X` or `O` in connection order
    - Validates moves (right turn, empty cell, game ongoing)
    - Detects win or draw
    - Broadcasts the full `GameState` JSON to both players after every move
    - Resets the board after a short delay when the game ends


- **Communication format**:

  ```txt
  MakeTurn#{"x":0,"y":2}
  ```

- **Example game state broadcast**:
  ```json
  {
    "playerTurn": "O",
    "field": [["X", null, "O"], [null, "X", null], [null, null, "O"]],
    "winningPlayer": null,
    "isBoardFull": false,
    "connectedPlayers": ["X","O"]
  }
  ```
  
---

## 🚀 Getting Started

### 🖥️ Backend (Local Run)

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/tictactoe-backend.git
   cd tictactoe-backend
   ```
2. Run the server:
   ```bash
   ./gradlew run
   ```
3. Connect via WebSocket:
   ```bash
   ws://localhost:8080/play
   ```

---

## 🌐 Deployment

1. Build a fat JAR:
   ```bash
   ./gradlew shadowJar
   ```
2. Upload to VPS:
   ```bash
   java -jar build/libs/tictactoe-backend-all.jar
   ```
3. Open firewall port (default: `8080`)
4. Update your frontend WebSocket URL to:
   ```
   ws://<your-server-ip>:8080/play
   ```

---

## 🔐 Security Note

* No authentication is implemented yet — it is intended in future updates.

---

## 💡 Possible Improvements

* Game lobby & matchmaking
* Player names & avatars
* Persistent scoreboard
* Spectator mode
* Multiple simultaneous games

---

## 📚 Credits

* [Ktor Official Documentation](https://ktor.io/)

---

## MIT License

Copyright (c) 2025 Nikunj Patel

This project is [MIT](LICENSE) licensed.
