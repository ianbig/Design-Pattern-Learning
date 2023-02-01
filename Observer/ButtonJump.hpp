#ifndef BUTTON_JUMP_HPP
#define BUTTON_JUMP_HPP

#include <string>

#include "ButtonInterface.hpp"
#include "Event.hpp"

class ButtonJump : public ButtonInterface {
  private:
  std::string name;
  public:
  ButtonJump(std::string _name);
  virtual void click() override;
};

#endif