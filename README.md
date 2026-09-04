# 🏨 GAYA Hotel — Booking System

A desktop hotel booking and management application built with **Java Swing**, developed as a NetBeans project. It covers the full guest flow — sign up, log in, browse room info, book a room, order room service, and pay — plus a simple admin view to manage current bookings.

## Features

- **Authentication** — user sign-up and login (`Signup_Hotel`, `Login_Hotel`)
- **Room browsing** — view available room types and nightly rates (`Information_Room`)
- **Booking** — select a room and submit guest details (`For_book`)
- **Room service** — order extras like breakfast, lunch, and dinner (`Room_Service`)
- **Payment** — calculate total cost and process payment (`Payment_Hotel`)
- **Booking management** — table view of current bookings by room number, guest name, and phone (`Manage_Room`)

## Tech Stack

- **Language:** Java
- **UI:** Java Swing, built with the NetBeans GUI Builder (`.form` files)
- **Build tool:** Apache Ant (via NetBeans' generated `build.xml`)
- **Data storage:** plain text files (no database) — see [Data files](#data-files) below

## Project Structure

```
Booking_Hotel/
├── src/booking_hotel/
│   ├── Login_Hotel.java / .form       # Login screen
│   ├── Signup_Hotel.java / .form      # Registration screen
│   ├── Mainform_Hotel.java            # Main menu after login
│   ├── For_book.java / .form          # Room booking form
│   ├── Information_Room.java / .form  # Room info / availability
│   ├── Room_Service.java / .form      # Room service ordering
│   ├── Payment_Hotel.java / .form     # Payment dialog
│   ├── Manage_Room.java               # Booking management table (admin)
│   ├── Person_Check.java              # Guest check-in/out logic
│   ├── Hotel_FileHandler.java         # Reads/writes the .txt data files
│   ├── Hotel_Interface.java           # login()/register() contract
│   └── Images/                        # Icons and UI graphics
├── nbproject/                         # NetBeans project config
└── build.xml                          # Ant build script
```

## Data Files

The app persists data to plain-text files instead of a database:

| File | Contents |
|---|---|
| `RegGayaHotel.txt` | Registered usernames/passwords |
| `Info_Room.txt` | Room number, type, and price |
| `Services.txt` | Room service items and prices |
| `Booking_Person.txt` | Guest booking records |
| `Description_RoomService.txt` | Room service descriptions |

## Getting Started

### Prerequisites
- JDK 8+
- [NetBeans IDE](https://netbeans.apache.org/) (recommended, since the project uses NetBeans `.form` files for the GUI)

### Run from NetBeans
1. Clone the repo and open the `Booking_Hotel` folder as a project in NetBeans.
2. Right-click the project → **Run**.

### Run from the command line
```bash
cd Booking_Hotel
ant run
```

## Known Limitations

- Credentials are stored in **plain text**, not hashed — fine for a class project, but not suitable for production use.
- Data is stored in flat `.txt` files with no transaction safety, so concurrent access (e.g. two staff members booking at once) isn't handled.
- No automated tests.

## Possible Improvements

- Replace the `.txt` file storage with a real database (e.g. SQLite/MySQL) via JDBC.
- Hash passwords (e.g. BCrypt) instead of storing them in plain text.
- Add input validation and unit tests.
- Migrate the UI from Swing to JavaFX for a more modern look.
