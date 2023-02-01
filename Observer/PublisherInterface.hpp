#ifndef PUBLISHER_INTERFACE_HPP
#define PUBLISHER_INTERFACE_HPP

#include "Subscriber.hpp"

class PublisherInterface {
  public:
  virtual void notify() = 0;
  virtual void addSubscriber(Event & e, Subscriber & s) = 0;
  virtual void deleteSubscriber(Event &e, Subscriber & s) = 0;
};

#endif