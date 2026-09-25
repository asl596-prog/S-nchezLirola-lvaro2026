"""Ejemplos de uso de números reales en Python."""

import sys


def main():
    # float usa normalmente el formato IEEE 754 de doble precisión.
    f1 = 5.0
    f2 = 19.5
    resultado = f1 / f2
    print(f"El resultado de {f1} / {f2} \t\t= {resultado}")
    print(f'El resultado "formateado" de {f1:.1f} / {f2:.1f} = {resultado:.3f}')

    real_minimo = float.fromhex("0x0.0000000000001p-1022")
    real_maximo = sys.float_info.max
    print(f"El float mínimo (positivo) es \t{real_minimo}")
    print(f"El float máximo (positivo) es \t{real_maximo}")
    print(f"En notación estándar: \t\t{real_maximo:f}")
    print(f"En notación científica: \t{real_maximo:.18g}")

    print(f"\nEl float mínimo * 10 es \t{real_minimo * 10}")
    print(f"El float máximo * 10 es \t{real_maximo * 10}")  # Infinito.

    # int trunca hacia cero. Convertir infinito a int sí provoca un error.
    print(f"La conversión de {real_minimo * 10} a entero es {int(real_minimo * 10)}")
    try:
        entero = int(real_maximo * 10)
        print(f"La conversión a entero es {entero}")
    except OverflowError as error:
        print(f"La conversión de infinito a entero produce {type(error).__name__}: {error}")

    print(f"El valor de convertir 14.456 a entero es {int(14.456)}")
    print(f"El valor de convertir 14.956 a entero es {int(14.956)}")


if __name__ == "__main__":
    main()
