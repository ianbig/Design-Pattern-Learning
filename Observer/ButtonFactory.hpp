#ifndef BUTTON_FACTORY_HPP
#define BUTTON_FACTORY_HPP

#include "ButtonInterface.hpp"
#include "ButtonEventManager.hpp"

#include <string>

class ButtonFactory {
  ButtonventManger events;

  public:
  ButtonInterface* createButton(std::string types);
};


#endif