#ifndef BUTTON_INTERFACE_HPP
#define BUTTON_INTERFACE_HPP

class ButtonInterface {
  public:
  virtual ~ButtonInterface() = default;
  virtual void paint() = 0;
};

#endif