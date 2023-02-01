#ifndef SUBSCRIBER_HPP
#define SUBSCRIBER_HPP

#include "Event.hpp"

class Subscriber {
  public:
  virtual void update(const Event & context) = 0;
  virtual void update(const Event && context) = 0;
};

#endif