// Hide.h
class Homer{
public:
	Homer();
	~Homer();
	void doh(char);
	void doh(float);
};
class Milhouse{
public:
	Milhouse();
	~Milhouse();
};
class Bart : public Homer{
public:
	Bart();
	~Bart();
	void doh(Milhouse*);
};