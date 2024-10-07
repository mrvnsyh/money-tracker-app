# Money Tracker and Management System Mobile App

## Project Overview
The **Money Tracker and Management System** is an Android mobile app designed to help users track their financial transactions. The app allows users to input income and expenses, categorize transactions, and view transaction history. Built using **Kotlin** and Android UI components, the app leverages **Room Database** for efficient data storage and retrieval, providing full support for CRUD (Create, Read, Update, Delete) operations.

## Features
- **Transaction Management**: Add, update, and delete transactions such as income and expenses.
- **Category Selection**: Choose categories for transactions to make financial tracking organized.
- **Transaction History**: Display all transactions in a list format with details such as amount, type, and date.
- **Room Database**: Utilizes Room Database with **Data Access Objects (DAO)** to perform CRUD operations on the SQLite database.
- **User-Friendly Interface**: Clean, responsive UI built using Android components and Kotlin.

## Key Components
- **Kotlin**: Programming language used for all app logic and UI development.
- **Room Database**: Used for local data storage, enabling CRUD operations on the transaction database.
- **SQLite Database**: Backend database used to store user transaction data.
- **Android UI Components**: Android Material Design components for a seamless user experience.

## How It Works
1. **Add New Transactions**: 
   - Users can input details like the transaction type (income/expense), amount, date, and select a category.
2. **CRUD Operations**:
   - Room Database handles the database operations using **DAO** classes to create, read, update, and delete transactions.
3. **Display Transactions**:
   - Transaction data is dynamically retrieved from the SQLite database and displayed in a user-friendly list format in the app.
4. **Update and Delete**:
   - Users can edit or remove transactions at any time to ensure accurate financial tracking.

## Technologies Used
- **Languages**: Kotlin
- **Database**: SQLite with Room Database integration
- **Frameworks/Tools**: 
  - Android SDK
  - Android Studio
- **UI Components**: Android Material Design, RecyclerView

## Installation and Setup
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/mrvnsyh/money-tracker-app
2. **Open in Android Studio**:
- Open the project folder in Android Studio.
3. **Build the Project**:
- Ensure that all necessary dependencies (e.g., Room, RecyclerView, etc.) are included in the build.gradle file.
- Sync and build the project.
4. **Run the App**:
- Connect an Android device or use an emulator to run the app.
- Use the app to add, view, update, or delete financial transactions.

## Flowchart System Design 
<img src="https://github.com/user-attachments/assets/057cccac-fada-48cb-aef6-fe3489892396" alt="Flowchart" width="400"/>

## Project Screenshots

<img src="https://github.com/user-attachments/assets/485d5929-e29f-4fff-9048-18dafc799527" alt="Screenshot 1" width="200"/>
<img src="https://github.com/user-attachments/assets/3967653c-609e-4a17-94aa-e8978996047c" alt="Screenshot 2" width="200"/>
<img src="https://github.com/user-attachments/assets/0b66789e-8571-45ea-8080-23d3e4b900ca" alt="Screenshot 3" width="200"/>
<img src="https://github.com/user-attachments/assets/d93b3666-17c4-487d-aed0-919ccaf21c1a" alt="Screenshot 4" width="200"/>
<img src="https://github.com/user-attachments/assets/b06207c9-2abb-47ee-b890-399e049db9de" alt="Screenshot 5" width="200"/>
<img src="https://github.com/user-attachments/assets/ed0518ba-c5c3-4e35-a842-1db2adc47d81" alt="Screenshot 6" width="200"/>
<img src="https://github.com/user-attachments/assets/6d4ef7ce-d9ad-4545-a178-1c16a1791dd5" alt="Screenshot 7" width="200"/>



