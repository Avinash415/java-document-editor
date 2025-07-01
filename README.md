 # 📄 Java Document Editor
## Overview
This repository contains a modular Document Editor built with Java, leveraging Object-Oriented Programming (OOP) principles, design patterns, and file/database persistence strategies. It supports rendering text, images, tab spaces, and new lines, with output saved to a .txt file or a simulated database. The project demonstrates clean architecture using interfaces, composition, and design patterns like Composite and Strategy.

## Table of Contents

- Installation
- Usage
- File Structure
- Contributing
- License

## Installation
### Prerequisites
Ensure you have the following installed:

- Java (JDK 8 or higher)
- Git (optional, for cloning)
- A terminal or IDE (e.g., IntelliJ IDEA, VS Code)

### Clone the Repository

1. Open your terminal and navigate to the directory where you want to clone the repository:

       cd path/to/your/directory


2. Clone the repository:
   
       git clone https://github.com/Avinash415/java-document-editor.git


3. Navigate into the cloned directory:
   
       cd java-document-editor


4. Compile the project:

       javac -d bin src/**/*.java


## Usage
### Compile the Project

Compile all source files using:

    javac -d bin -sourcepath src src/client/DocumentEditorClient.java

This compiles the code into the bin/ directory.
Run the Application

After compilation, run the program using:

    java -cp bin client.DocumentEditorClient

This will render the document in the console and also save it as document.txt.
Making Changes

Edit the files as needed using your preferred code editor.

Check the Git status:

    git status

Stage and commit your changes:

     git add .
     
    git commit -m "Your commit message here"

Push your changes to GitHub:

    git push origin main

## File Structure
    java-document-editor/
    │
    ├── src/                   # Source code for the editor
    │   ├── client/            # Entry point (main method)
    │   │   └── DocumentEditorClient.java # Main class to run the editor
    │   ├── core/              # Core editor logic & document structure
    │   │   ├── Document.java  # Manages document elements
    │   │   ├── DocumentElement.java # Interface for document elements
    │   │   ├── TextElement.java # Text element implementation
    │   │   ├── ImageElement.java # Image element implementation
    │   ├── NewLineElement.java # New line element implementation
    │   │   └── TabSpaceElement.java # Tab space element implementation
    │   └── persistence/       # File/DB storage strategies
    │       ├── PersistenceStrategy.java # Interface for saving strategies
    │       ├── FilePersistenceStrategy.java # Saves to a .txt file
    │       └── DBPersistenceStrategy.java # Simulates DB storage
    ├── bin/                   # Compiled .class files
    ├── document.txt           # Rendered output (generated)
    ├── standardUml.png        # UML diagram of project structure
    ├── .gitignore             # Files/folders to exclude from Git
    └── README.md              # You're reading it 😄

## Contributing

Contributions are welcome! Please follow these steps to contribute to the project:

Fork the repository to your own GitHub account.

Create a new branch for your feature:

    git checkout -b feature/YourFeature

Make your changes and commit them:

    git commit -m "Add some feature"

Push to the branch:

    git push origin feature/YourFeature

Open a Pull Request on the main repository.
License
This project is licensed under the MIT License. See the LICENSE file for details.

Made with ♥ by Avinash415 (https://github.com/Avinash415) — Happy Coding!
