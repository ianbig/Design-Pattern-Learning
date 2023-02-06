#ifndef SUBSCRIBER_HPP
#define SUBSCRIBER_HPP


#include "ButtonInterface.hpp"


class Subscriber {
  public:
  virtual void update(ButtonInterface * button) = 0;
};

#endif