#ifndef BUTTON_HIT
#define BUTTON_HIT

#include <string>
#include "ButtonAbstract.hpp"

class ButtonHit : public ButtonAbstract {
  public:
  ButtonHit(std::string _name);
  virtual void click() override;
};

#endif