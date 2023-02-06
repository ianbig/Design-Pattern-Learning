#include "ButtonEventListener.hpp"

int ButtonEventListener::buttonId = 0;

ButtonEventListener::ButtonEventListener() : id(buttonId++) {
}

void ButtonEventListener::update(ButtonInterface  * button) {
  button->click();
}