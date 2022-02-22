#pragma once
#include "Obiect.h"
#include <vector>
#include <iostream>
using namespace std;

class Cos {
public:
	Cos() {};
	void AddObject(Object product,int count)
	{
		if (count < 1)
		{ 
			return; 
		}
		else
		{
			list[size] = new Object(product.id_object,product.price,product.name,product.exp_date,product.fab_date);
			counts[size] = count;
			size++;
		}
		
	};
	int totalPrice()
	{
		int sum = 0;
		for (int i = 0; i < size; ++i)
		{
			sum += list[i]->price * counts[i];
		}
		return sum;
	};
	void deleteObjects(string nameDelete, int count)
	{
		for (int i = 0; i < size; ++i)
			if (list[i]->name == nameDelete)
				if (count == counts[i])
				{
					for (int j = i; j < size - 1; j++)
						list[j] = list[j + 1];
					size--;
				}
				else if (count < counts[i])
				{
					counts[i] -= count;
				}
				else
					cout << "Cantitate prea mare!" << endl;
	};
	void ShowNames()
	{
		for (int i = 0, i < size; ++i)
		{
			cout << list[i]->name << ' ';
		}
		cout << endl;
	}
private:
	Object** list;
	int* counts;
	int size;
};