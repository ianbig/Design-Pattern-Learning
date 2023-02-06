#ifndef BUTTON_INTERFACE_HPP
#define BUTTON_INTERFACE_HPP

#include "Subscriber.hpp"

class ButtonInterface {
  public:
  virtual void click() = 0;
};

#endif