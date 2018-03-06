#include <iostream>		// for <<
#include <argos3/core/utility/math/vector3.h>

using namespace argos;

int main()
{
	std::cout << "Hello, ARGoS\n" << std::endl;
	CVector3 a(CVector3::X);
	std::cout << "a CVec3 has been set\n" << a << std::endl;
	return 0;
}
