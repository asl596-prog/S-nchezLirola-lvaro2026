"""Lee dos enteros y muestra el cociente de su división entera."""

def main():
    print("Introduzca dos enteros: ")
    num1 = int(input())
    num2 = int(input())
    cociente = num1 // num2 
    resto = num1 % num2
    print(f"{num1} / {num2} es {cociente}")
    print(f"Resto {resto}")


if __name__ == "__main__":
    main()
