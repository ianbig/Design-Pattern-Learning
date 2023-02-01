#ifndef BUTTON_HIT
#define BUTTON_HIT

#include <string>
#include "ButtonInterface.hpp"

class ButtonHit : public ButtonInterface{
  std::string name; // TODO: an abstract class Button may be a good idea
  public:
  ButtonHit(std::string name);
  virtual void click() override;
};

#endif