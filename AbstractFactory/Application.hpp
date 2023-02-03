#ifndef APPLICATION_HPP
#define APPLICATION_HPP

#include <stdexcept>
#include <iostream>
#include <memory>
#include "AbstractFactoryInterface.hpp"
#include "MacFactory.hpp"
#include "LinuxFactory.hpp"


class Application {
  std::unique_ptr<AbstractFactoryInterface> factory;
  std::unique_ptr<ButtonInterface> button;
  std::unique_ptr<FolderInterface> folder;

  void configSystem(std::string & system) {
    AbstractFactoryInterface * _factory = nullptr;
    if (system == "Mac") {
      _factory = new MacFactory();
      factory.reset(_factory);
    } else if (system == "Linux") {
      _factory = new LinuxFactory();
      factory.reset(_factory);
    } else {
      throw std::invalid_argument("system not supported");
    }
  }

  void paintUI() {
    std::unique_ptr<ButtonInterface> button =  factory->createButton();
    std::unique_ptr<FolderInterface> folder = factory->createFolder();

    button->paint();
    folder->paint();
  }
  public:
  Application(std::string && sys) {
    configSystem(sys);
    paintUI();
  }
};

#endif