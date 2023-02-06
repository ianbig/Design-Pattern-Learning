#ifndef BUTTON_ABSTRACT_HPP
#define BUTTON_ABSTRACT_HPP

#include <string>
#include "ButtonInterface.hpp"
#include "ButtonEventListener.hpp"

class ButtonAbstract : public ButtonInterface {
  protected:
  std::string name;
  ButtonEventListener * listener;
  public:
  ButtonAbstract(std::string _name) : name(_name) {}
};

#endif