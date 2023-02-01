#include <iostream>
#include <unique_ptr>
#include <cstdlib>
#include "ButtonInterface.hpp"
#include "ButtonFactory.hpp"

int main() {
  std::string ins[] = {"jump", "hit"};
  std::vector<std::unique_ptr<ButtonInterface>> buttons;
  ButtonFactory bf;
  for (int i = 0; i < 10; i++) {
    int idx = rand() % 2;
    ButtonInterface * b = bf.createButton(ins[idx]);
    buttons.push_back(b);
  }
}