import io
import sys
import unittest
from org.ip.sesion01.hola_mundo import main


class TestHolaMundo(unittest.TestCase):

    def test_main_imprime_hola_mundo(self):
        # Capturar la salida estandar
        salida_capturada = io.StringIO()
        sys.stdout = salida_capturada
        try:
            main()
            self.assertEqual(salida_capturada.getvalue().strip(), "Hola Mundo")
        finally:
            sys.stdout = sys.__stdout__


if __name__ == "__main__":
    unittest.main()
