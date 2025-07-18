def calculator():
    print("Simple Calculator")
    print("Operations: + (Addition), - (Subtraction), * (Multiplication), / (Division)")

    try:
         num1 = float(input("Enter the first number: "))
         num2 = float(input("Enter the second number: "))
        operation = input("Enter operation (+, -, *, /): ")

        # Perform the selected operation
        if operation == '+':
            result = num1 + num2
        elif operation == '-':
            result = num1 - num2
        elif operation == '*':
            result = num1 * num2
        elif operation == '/':
            if num2 != 0:
                result = num1 / num2
            else:
                print("Error: Division by zero is not allowed.")
                return
        else:
            print("Invalid operation.")
            return

        print(f"Result: {result}")
    except ValueError:
        print("Invalid input. Please enter numeric values.")
calculator()
