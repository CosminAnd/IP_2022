#include <iostream>
#include "Cos.h"
using namespace std;
int main()
{
    Object FirstProduct(110, 100, "Ceas", "01.01.2025", "20.03.2020");
    Object SecondProduct(111, 2500, "Telefon", "10.11.2025", "10.11.2021");
    Object ThirdProduct(112, 550, "Parfum", "05.08.2027", "13.12.2020");
    Object ForthProduct(113, 40, "Husa", "01.01.2023", "01.03.2022");
    Object FifthProduct(114, 10, "Suc", "01.01.2023", "01.01.2022");
    Object SixthProduct(115, 100, "Mancare pisici", "01.01.2024", "20.03.2022");

    Cos list;
    list.AddObject(FirstProduct, 3);
    list.AddObject(SecondProduct, 1);
    list.AddObject(ForthProduct, 1);
    list.ShowNames();
}
