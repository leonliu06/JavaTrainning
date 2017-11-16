// Hide.cpp
// #include "Hide.h"
#include <iostream>
using namespace::std;

// Hide.h start
class Homer {
public:
	Homer();
	~Homer();
	void doh(char);
	void doh(float);
};
class Milhouse {
public:
	Milhouse();
	~Milhouse();
};
class Bart : public Homer {
public:
	Bart();
	~Bart();
	void doh(Milhouse*);
};
// Hide.h end

Homer::Homer(){}
Homer::~Homer(){}
void Homer::doh(char c){
	cout << "doh(char)" << endl;
}
void Homer::doh(float f){
	cout << "doh(float)" << endl;
}

Milhouse::Milhouse(){}
Milhouse::~Milhouse(){}

Bart::Bart(){
	Homer();
}
Bart::~Bart(){}
void Bart::doh(Milhouse* m){
	cout << "doh(Milhouse)" << endl;
}

int main(int argc, char* argv[]){
	Bart* b = new Bart();
	//b->doh('x'); // error C2664: 'void Bart::doh(Milhouse *)': cannot convert argument 1 from 'char' to 'Milhouse *'
	//b->doh(1.0f); // error C2664: 'void Bart::doh(Milhouse *)': cannot convert argument 1 from 'float' to 'Milhouse *'
	b->doh(new Milhouse());
	return 0;
}
/* Output:

*/