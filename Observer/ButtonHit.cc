#include "ButtonHit.hpp"
#include <iostream>

ButtonHit::ButtonHit(std::string & _name) : ButtonAbstract(_name) {}

void ButtonHit::click() {
  std::cout << "Button " << name << "execute hit logic" << std::endl;
}