#include <iostream>
#include <cstdlib>
#include <memory>
#include <vector>
#include <unordered_set>

#include "ButtonEventManager.hpp"
#include "ButtonEventListener.hpp"
#include "ButtonJump.hpp"
#include "ButtonHit.hpp"


class Application {
  private:
  ButtonventManger mangers;
  public:
  ButtonEventListener* createButton(std::string & type, std::string && name) {
    ButtonInterface * button = nullptr;
    ButtonEventListener * listener = new ButtonEventListener();
    if (type == "jump") {
      button = new ButtonJump(name);
      
      mangers.addSubscriber("jump", listener);
      
    } else if (type == "hit") {
      button = new ButtonHit(name);
      mangers.addSubscriber("hit", event);
    }

    button->addListener(listener);
    return button;
  }

  void deleteButton(ButtonInterface * button) {
    mangers.deleteSubscriber(button);
    delete button;
  }
  
};

int main() {
  std::string ins[] = {"jump", "hit"};
  Application app;

  ButtonEventListener * b1 =  app.createButton(ins[0], "b1");
  ButtonEventListener * b2 = app.createButton(ins[1], "b2");
  
}