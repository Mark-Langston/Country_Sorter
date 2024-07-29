# Country Sorter

CountrySorter is a Java program that sorts an `ArrayList<Country>` in decreasing order based on the population of the countries. The program includes the following features:

- A `Country` class with name and population attributes.
- A `Comparator` implementation to compare countries based on their population.
- A main function that creates an `ArrayList<Country>` with the top 12 largest countries in random order.
- Displays the countries before and after sorting.

## Features

- **Country Class**:
  - Contains `name` and `population` attributes.
  - Provides accessors for the data attributes.
  - Overrides the `toString()` method to support string concatenation for consistent output with population numbers formatted with commas.

- **PopulationComparator Class**:
  - Implements the `Comparator` interface to compare `Country` objects based on their population in decreasing order.

- **CountrySorter Class**:
  - Creates an `ArrayList` of `Country` objects with the given data.
  - Prints the list of countries before sorting.
  - Sorts the list using `Collections.sort` with the `PopulationComparator`.
  - Prints the list of countries after sorting.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher

### Running the Program

1. **Clone the repository:**

    ```sh
    git clone https://github.com/Mark-Langston/Country_Sorter.git
    cd CountrySorter
    ```

2. **Compile the Java files:**

    ```sh
    javac CountrySorter.java
    ```

3. **Run the program:**

    ```sh
    java CountrySorter
    ```
