"""Ejemplos de uso de números enteros en Python."""

import sys


def main():
    entero_minimo = 0
    entero_maximo = 100

    print("Algunos ejemplos con variables int: ")
    print("--------------------------------------------------")
    print("Las variables entero_minimo y entero_maximo se han inicializado a "
          f"{entero_minimo} y {entero_maximo}, respectivamente")

    # Python no limita sus enteros a 32 o 64 bits: crecen mientras haya memoria.
    print("En Python, int no tiene un valor mínimo fijo.")
    print("En Python, int no tiene un valor máximo fijo.")
    print(f"El entero que describe el tamaño de la plataforma es sys.maxsize = {sys.maxsize}")

    print("\nSin desbordamiento: los enteros de Python tienen precisión arbitraria:")
    entero_grande = 2**63 - 1
    print(f"2**63 - 1 = {entero_grande}")
    print(f"2**63     = {entero_grande + 1}")

    # Expresiones aritméticas. // representa la división entera.
    x = 25
    y = 3
    resultado = (3 + 4 * x) // 5 - 10 * (y - 5) * (3 + 5 + 9) // x + 9 * (4 // x) + (9 + x) // y
    print(f"\nEl resultado de la expresión aritmética es = {resultado}")
    print()
    print(f"La division {x}/{y} = {x // y}")
    print(f"El módulo   {x}%{y} = {x % y}")

    # int convierte otros valores a enteros truncando la parte decimal.
    entero_largo = x
    print(f"\nVariable int x = {x}")
    print(f"Variable int entero_largo = {entero_largo}")

    # Python no tiene los operadores ++ y --.
    print("\nIncremento y decremento de una variable x:")
    print(f"x = {x}")
    x += 1
    print(f"x += 1\nx = {x}")
    x -= 1
    print(f"x -= 1\nx = {x}")

    print("\nOperadores combinados de asignación y operación:")
    print(f"x = {x}")
    x += 5
    print(f"x += 5\nx = {x}")
    x -= 5
    print(f"x -= 5\nx = {x}")
    x *= 2
    print(f"x *= 2\nx = {x}")
    x //= 4
    print(f"x //= 4\nx = {x}")
    x %= 5
    print(f"x %= 5\nx = {x}")


if __name__ == "__main__":
    main()
