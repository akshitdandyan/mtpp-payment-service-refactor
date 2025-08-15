# Payment Service - Factory Pattern Refactoring

This repository contains a simplified Java example of a payment processing system, created for a university assignment in the subject **Methods and Technologies of Professional Programming**.

## Overview

The project is structured in two versions:

- **v1 (main branch)** – Original implementation by myself with intentional design issues (violating SOLID principles and clean code practices) for analysis.

  **Note:** In this v1 version, I have added comments starting with `BAD:` — these were manually added to highlight specific design principle violations.

- **v2 (refactored branch)** – Improved implementation applying the **Factory Pattern** to address the identified issues while preserving the same external behavior.

## Running the Code

A helper script `run.sh` is provided to compile and execute the code.

### Steps:

1. Give execution permission (only once):

   ```bash
   chmod +x run.sh
   ```

2. Run the demo:
   ```bash
   ./run.sh
   ```

The `run.sh` script will:

- Compile all Java files in src/main/java/app
- Run the Main class
- Clean up compiled .class files after execution
