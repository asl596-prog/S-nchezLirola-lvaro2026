"""Ejemplos de uso de caracteres Unicode y valores booleanos."""


def main():
    # Python no tiene un tipo char distinto: un carácter es un str de longitud 1.
    c1 = "a"
    c2 = "A"

    print(f"Caracter c1: {c1}")
    print(f"Caracter c2: {c2}")

    # ord obtiene el código Unicode y chr realiza la conversión inversa.
    c1 = chr(ord(c1) + 3)
    c2 = chr(ord(c2) + 20)

    print(f"Caracter c1: {c1}")
    print(f"Caracter c2: {c2}")

    caracter_pi = "\u03c0"
    caracter_sigma = "\u03a3"
    print(f"Greek Small Letter Pi (U+03C0): {caracter_pi}")
    print(f"Greek Capital Letter Sigma (U+03A3): {caracter_sigma}")

    print()
    print("Ejemplos con valores booleanos")
    print("--------------------------------")
    son_iguales = c1 == c2
    son_distintos = c1 != c2
    print(f"Los caracteres {c1} y {c2} son iguales?: {son_iguales}")
    print(f"Los caracteres {c1} y {c2} son distintos?: {son_distintos}")
    print(f"Los caracteres a y a son iguales?: {'a' == 'a'}")
    print(f"Los caracteres z y q son iguales?: {'z' == 'q'}")


if __name__ == "__main__":
    main()
