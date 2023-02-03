#ifndef MAC_BUTTON_HPP
#define MAC_BUTTON_HPP

#include "ButtonInterface.hpp"
#include <iostream>

class MacButton : public ButtonInterface {
  public:
  virtual void paint() override {
    std::cout << "Mac Button!" << std::endl;
  }
};

#endif