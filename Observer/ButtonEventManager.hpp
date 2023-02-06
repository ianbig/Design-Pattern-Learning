#ifndef BUTTON_EVENT_MANGER_HPP
#define BUTTON_EVENT_MANGER_HPP

#include "PublisherInterface.hpp"
#include "Subscriber.hpp"
#include <iostream>
#include <unordered_map>
#include <vector>
#include <string>

class ButtonventManger : public PublisherInterface {
  using SubscriberVector = std::vector<Subscriber*>;
  std::unordered_map<std::string, SubscriberVector> subscribers;
  public:
  virtual void addSubscriber(std::string && e, Subscriber * s) override;
  virtual void deleteSubscriber(Subscriber * s) override;
  virtual void notify() override;
};

#endif