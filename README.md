# Goods Logistics System

The **Goods Logistics System** is a Java application designed to simulate a logistics system for loading goods onto a delivery van. The system calculates the time required to load a specific quantity of goods and provides real-time updates on the progress of the loading process.

## How It Works

The system operates based on the following principles:

1. **Arrival and Initialization:**
   - The system takes the arrival time of the delivery van and the quantity of goods to be loaded as input.
   - It calculates the initial capacity of the van based on the quantity of goods plus one.
   - A constant value, calculated as ((89 % 3) + 1), represents the time in minutes needed to prepare three goods simultaneously.

2. **Loading Simulation:**
   - The system simulates the loading process in a loop, incrementing time in minutes.
   - For each minute, it calculates the expected time of completion for the current state of loading.
   - It provides updates on the remaining goods in the queue and the progress of the loading process.

3. **Loading Events:**
   - Loading events occur based on specific time intervals.
   - If two minutes pass, one additional goods item is added to the queue.
   - If three minutes pass, three goods items are processed, reducing the queue accordingly.

4. **Completion and Delivery:**
   - The simulation continues until all goods are loaded onto the van.
   - Once the loading is complete, the system prints a message indicating the remaining goods, finalizes the loading process, and provides the scheduled delivery time.

## How to Use

To use the system, follow these steps:

1. Ensure you have the Java environment configured on your machine.
2. Create an instance of the `GerarFila` class and call the `sistemaDeLogistica` method, providing a `GerarCargaDeMercadoria` object with the arrival time and quantity of goods.
