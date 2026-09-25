"""Calcula el perímetro y el área a partir de un radio introducido."""

import math


def main():
    # El usuario introduce el radio.
    radio = float(input("Introduzca el radio: "))

    longitud = 2.0 * math.pi * radio
    area = math.pi * radio**2

    print(f"Radio = {radio}")
    print()
    print(f"Perimetro de la circunferencia = {longitud:.3f}")
    print(f"Area de la circunferencia = {area:.3f}")


if __name__ == "__main__":
    main()
