#include "Event.hpp"

Event::Event(const std::string & _eventName) : eventName(_eventName) {}
Event::Event(std::string && _eventName) : eventName(std::move(_eventName)) {}