# Pharmacy Management System

This project implements a Pharmacy Management System in Java, designed to help pharmacists efficiently manage their inventory, track purchases, and generate reports. 

## Features

* **Add Drugs:** Add new drugs to the inventory, specifying details like name, code, category, quantity, and supplier.
* **Search Drugs:** Search for drugs by code or name to quickly retrieve information.
* **View All Drugs:** Display a comprehensive list of all drugs in the inventory.
* **View Purchase History:** View detailed purchase history for each drug, including date, time, buyer, quantity, and total amount.
* **View Suppliers:** See a list of suppliers for each drug, along with their contact information.
* **Stock Management:** Track stock levels and receive alerts for low or high stock.
* **Report Generation:** Generate reports on drug sales, purchase history, and stock levels.

## Requirements

* Java Development Kit (JDK)
* MySQL Database
* NetBeans IDE (or any other Java IDE)

## Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/pharmacy-management-system.git
   ```

2. **Set up MySQL database:**
   * Create a new database named "pharmacy_db" (or any desired name).
   * Create tables for drugs, suppliers, customers, purchases, and sales.
   * Populate the database with initial data.

3. **Configure database connection:**
   * Update the database connection details in the Java code (e.g., `database.properties` file) to match your MySQL setup.

4. **Build and run the application:**
   * Open the project in your IDE.
   * Build the project.
   * Run the main class to launch the application.

## Usage

1. **Launch the application:** Run the main class.
2. **Login:** Enter your username and password (if authentication is implemented).
3. **Navigate the main menu:** Use the menu options to add drugs, search for drugs, view purchase history, and manage stock.
4. **Generate reports:** Use the report generation feature to create reports on drug sales, purchase history, and stock levels.

## Data Structures and Algorithms

* **Drug Collection:** HashMap (Drug Code as Key, Drug Object as Value)
* **Purchase History:** LinkedList (Each element represents a purchase with details like Date, Time, Buyer, Quantity, Total Amount)
* **Supplier List:** HashMap (Drug Code as Key, List of Supplier Objects as Value)
* **Stock Level:** HashMap (Drug Code as Key, Quantity as Value)

* **Search:** HashMap Search (O(1) average)
* **Sort:** Merge Sort (O(n log n))

## Contributing

Contributions are welcome! Please feel free to open issues or submit pull requests.

## License

This project is licensed under the MIT License.

## Acknowledgements

This project was inspired by [mention any sources or inspirations].

## Contact

For any questions or feedback, please contact [your email address].
