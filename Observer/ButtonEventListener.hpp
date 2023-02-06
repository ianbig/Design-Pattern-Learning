#ifndef BUTTON_EVENT_LISTENER_HPP
#define BUTTON_EVENT_LISTENER_HPP

#include "Subscriber.hpp"

class ButtonEventListener : public Subscriber {
  static int buttonId;
  int id;
  public:
  ButtonEventListener();
  virtual void update(ButtonInterface * button) override;
};

#endif