"""Intercambia los valores de dos variables."""


def main():
    x = 5
    y = 100

    print(f"Los valores de x e y son: [{x}] [{y}]")

    # Intercambio de valores usando una variable temporal.
    temp = x
    x = y
    y = temp
    print(f"Los valores de x e y tras el intercambio son: [{x}] [{y}]")
    
    # Python además permite asignación múltiple, intercambio sin una variable temporal.
    x, y = y, x

    print(f"Los valores de x e y tras el intercambio son: [{x}] [{y}]")


if __name__ == "__main__":
    main()
