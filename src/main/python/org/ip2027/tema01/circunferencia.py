"""Calcula el diámetro, el perímetro y el área de una circunferencia."""

import math


def main():
    radio = 4.57
    diametro = 2.0 * radio
    longitud = 2.0 * math.pi * radio
    area = math.pi * radio**2

    print(f"Radio = {radio}")
    print()
    print(f"Diametro de la circunferencia = {diametro}")
    print(f"Perimetro de la circunferencia = {longitud:.3f}")
    print(f"Area de la circunferencia = {area:.3f}")


if __name__ == "__main__":
    main()
