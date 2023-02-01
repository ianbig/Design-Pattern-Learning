#include "ButtonJump.hpp"
#include <iostream>

void ButtonJump::click() {
  std::cout << "Button " << name << "execute jump logic" << std::endl;
}


ButtonJump::ButtonJump(std::string _name) : name(_name) {

}
