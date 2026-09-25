"""Muestra un entero pseudoaleatorio entre 0 y N - 1."""

import random


def main():
    limite = 10

    # Genera un real pseudoaleatorio entre 0.0 (incluido) y 1.0 (excluido).
    real_aleatorio = random.random()
    print(f"El valor aleatorio es {real_aleatorio:7.3f}")

    # La conversión a int trunca la parte decimal.
    entero_aleatorio = int(real_aleatorio * limite)
    print(f"Su entero aleatorio es: {entero_aleatorio}")


if __name__ == "__main__":
    main()
