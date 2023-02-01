#ifndef BUTTON_EVENT_MANGER_HPP
#define BUTTON_EVENT_MANGER_HPP

#include "PublisherInterface.hpp"
#include "Subscriber.hpp"
#include <iostream>
#include <unordered_set>

class ButtonventManger : public PublisherInterface {
  std::unordered_set<Subscriber> subscribers;
};

#endif