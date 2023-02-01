#ifndef EVENT_HPP
#define EVENT_HPP

#include <string>

class Event {
  private:
  std::string eventName;
  public:
  Event() = default;
  Event(const std::string & _eventName);
  Event(std::string && _eventName);
  Event(const Event & rhs) = default;
  Event(Event && rhs) = default;
};

#endif