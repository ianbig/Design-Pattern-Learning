#ifndef LINUX_BUTTON_HPP
#define LINUX_BUTTON_HPP

#include <iostream>
#include "ButtonInterface.hpp"

class LinuxButton : public ButtonInterface {
  public:
  virtual void paint() override {
    std::cout << "Linux Button!" << std::endl;
  }
};

#endif