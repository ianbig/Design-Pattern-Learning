#include "ButtonEventManager.hpp"


void ButtonventManger::addSubscriber(std::string &e, Subscriber * s) {
  SubscriberVector & svec = subscribers[e];
  svec.push_back(s);
}

void deleteSubscriber(std::string && e, Subscriber * s) {
  
}