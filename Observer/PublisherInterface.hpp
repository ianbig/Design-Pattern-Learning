#ifndef PUBLISHER_INTERFACE_HPP
#define PUBLISHER_INTERFACE_HPP

#include "Subscriber.hpp"

class PublisherInterface {
  public:
  virtual void notify() = 0;
  virtual void addSubscriber(std::string && e, Subscriber * s) = 0;
  virtual void deleteSubscriber(Subscriber * s) = 0;
};

#endif