/*
	Implementing this data type is completely new to me. I'm using http://happybearsoftware.com/implementing-a-dynamic-array.html
	as a reference guide. However, I'm abstracting the data to a void type so that the Vector is easily adaptable for future code.
*/

#define INIT_CAPACITY 100

typedef struct{
	int size;
	int capacity;
	void *data;
} Vector;

void InitVector(Vector *vector);

void AppendVector(Vector, int value);

void GetVector(Vector *vector, int index);

void SetVector(Vector *vector, int index, void value);

void ExpandVector(Vector *vector);

void FreeVector(Vector *vector);