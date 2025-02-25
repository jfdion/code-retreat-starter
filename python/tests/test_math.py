from unittest import TestCase
from coderetreat.math import sum

class MathTest(TestCase):
    def test_addition(self):

        result = sum(1, 2)

        self.assertEqual(result, 3)

    def test_that_fails(self):
        self.fail("This test should fail")