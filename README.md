# 🖋📝 S1.07.Annotations.Lv1
## 📂 Worker Hierarchy – Inheritance, Overriding, and Deprecation

### 🧾 Exercise Description
The goal of this exercise is to practice object-oriented programming in Java through class inheritance, method overriding, and the use of annotations like @Override and @Deprecated. You'll create a simple worker hierarchy with different salary calculation behaviors and demonstrate how to override methods properly and handle deprecated methods with annotations.

### ✅ Requirements
Level 1 Exercises
Exercise 1
Create a class hierarchy with a base class Worker and two subclasses: OnlineWorker and OnsiteWorker.

The base class should have attributes: name, surname, hourly rate.

It includes a method calculateSalary(int hours) to calculate the salary.

Both subclasses must override this method using @Override:

OnlineWorker adds a constant Internet fee to the salary.

OnsiteWorker adds a static fuel cost to the salary.

Exercise 2

Add deprecated methods to each subclass using the @Deprecated annotation.

From the Main class, invoke these deprecated methods and use @SuppressWarnings("deprecation") to suppress the related compiler warnings.

### 🔨 Methods Implemented

```
// Worker.java
double calculateSalary(int hours)

// OnlineWorker.java
@Override
double calculateSalary(int hours)
@Deprecated
void oldConnectMethod()

// OnsiteWorker.java
@Override
double calculateSalary(int hours)
@Deprecated
void oldCheckInMethod()

// Main.java
public static void main(String[] args)
```
### 💻 Technologies Used
Java 17

IntelliJ IDEA (Community Edition)

No third-party libraries required


### 📋 Prerequisites
Java JDK 17 installed

IntelliJ IDEA Community Edition

Git (optional, for version control)

### 🛠️ Installation and Setup
1. Install Required Tools
   Java JDK 17

IntelliJ IDEA Community Edition

2. Clone the Repository (Optional)

```
   git clone https://github.com/ArnauAsole/S1.07.Annotations.Lv1.git
   cd S1.07.Annotations.Lv1/
   ```

3. Open the Project in IntelliJ
   Go to File → Open and select the root folder of the project.

### ▶️ Running the Project
To run a specific class:

Open the Main.java file

Right-click the file and select Run

The console will display the salary calculations and any deprecated method calls

### 🌐 Deployment
This is a simple console-based Java project meant for local use and educational purposes. No external deployment is needed.

### 🤝 Acknowledgements
Special thanks to the contributors: Arnau, Adrià, Ignasi, Ana, Alejandro, and Marc.
