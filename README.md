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

## Project Review

![Screenshot 2023-05-18 085742](https://github.com/user-attachments/assets/d372c143-ca3a-40a6-ad19-3eff5f418d98)
![Screenshot 2023-05-18 085728](https://github.com/user-attachments/assets/37c9db68-0b1b-440a-85ce-ed48c1512218)
![Screenshot 2023-05-18 085712](https://github.com/user-attachments/assets/18b2748c-b40d-40be-9343-c933bd67e78e)
![Screenshot 2023-05-18 085658](https://github.com/user-attachments/assets/97a3ec20-17d8-4221-bc9e-158681e01adf)
![Screenshot 2023-05-18 091043](https://github.com/user-attachments/assets/6656fbf1-f801-4c92-945f-7523e3fdbbcf)
![Screenshot 2023-05-18 091023](https://github.com/user-attachments/assets/86c0bdd5-e3c1-4792-8ae0-c778785aa67c)
![Screenshot 2023-05-18 091009](https://github.com/user-attachments/assets/02c7fc65-6551-4acf-aee1-4fd59cb90d7d)
