#include "ButtonJump.hpp"
#include <iostream>

ButtonJump::ButtonJump(std::string & _name) : ButtonAbstract(_name) {}

void ButtonJump::click() {
  std::cout << "Button " << name << "execute jump logic" << std::endl;
}
