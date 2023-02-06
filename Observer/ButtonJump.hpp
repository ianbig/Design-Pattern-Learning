#ifndef BUTTON_JUMP_HPP
#define BUTTON_JUMP_HPP

#include <string>

#include "ButtonAbstract.hpp"

class ButtonJump : public ButtonAbstract {
  public:
  ButtonJump(std::string & _name);
  virtual void click() override;
};

#endif