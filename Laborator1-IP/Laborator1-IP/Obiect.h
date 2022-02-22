#pragma once

#include <cstring>
#include <cstdlib>
using namespace std;
//id, nume, price, data fabricare-valabilitate
class Object {
public:
	int id_object, price;
	char* name, exp_date, fab_date;

	Object(int _id, int _price,const char* _name,const char* _exp_date,const char* _fab_date)
	{
		id_object = _id;
		price = _price;
		strcpy(name, _name);
		strcpy(exp_date,_exp_date);
		strcpy(fab_date, _fab_date);
	}

};