Lab Equipment Management System

This repository contains a Java program for managing lab equipment using inheritance and abstract classes.

Description

The Lab Equipment Management System provides classes to represent different types of lab equipment, including Microscope and Centrifuge. These classes inherit from the abstract class LabEquipment, which defines common properties and behaviors for all lab equipment. The program also includes a Lab class to manage a collection of lab equipment objects.

Getting Started

To run the program locally or integrate it into your project, follow these steps:

Clone this repository or download the source code.
Import the necessary classes from the Model package into your project.
Instantiate objects of Microscope, Centrifuge, and Lab classes to manage lab equipment.
Use the provided methods to perform actions such as adding lab equipment, retrieving lab equipment, and updating lab equipment details.
Usage Example

Here's an example of how to use the Lab Equipment Management System:
public class Main {
    public static void main(String[] args) {
        // Instantiate lab equipment objects
        Microscope microscope1 = new Microscope("Nikon", "E200", 2021, 1000);
        Centrifuge centrifuge1 = new Centrifuge("Eppendorf", "5424R", 2020, 15000);

        // ...

        // Perform operations on lab equipment using Lab class methods
        Lab lab = new Lab();
        lab.addLabEquipment(microscope1);
        lab.addLabEquipment(centrifuge1);
        // ...

        // Print retrieved lab equipment details
        LabEquipment retrievedLabEquipment = lab.getLabEquipment(0);
        System.out.println("Retrieved Lab Equipment: " + retrievedLabEquipment.getManufacturer() + " " + retrievedLabEquipment.getModel());
        // ...

        // Update lab equipment details
        Microscope microscope2 = new Microscope("Olympus", "CX23", 2021, 400);
        lab.setLabEquipment(microscope2, 0);
        // ...

        // Verify updated lab equipment details
        retrievedLabEquipment = lab.getLabEquipment(0);
        System.out.println("Updated Lab Equipment: " + retrievedLabEquipment.getManufacturer() + " " + retrievedLabEquipment.getModel());
    }
}


License

This project is licensed under the MIT License. Feel free to use and modify the code according to your needs.

Contributions

Contributions to this project are welcome. If you find any issues or have suggestions for improvements, please create a pull request or open an issue.

Author

This project is maintained by Mohammed Ziyad. You can contact me at mohdziyadk@gmail.com.

Enjoy managing lab equipment with the Lab Equipment Management System!

Feel free to customize the README file with additional sections, installation instructions, or any other relevant information based on your specific requirements and project structure.
