#ifndef MAC_FACTORY_HPP
#define MAC_FACTORY_HPP

#include <iostream>
#include <memory>
#include "AbstractFactoryInterface.hpp"
#include "MacButton.hpp"
#include "MacFolder.hpp"

class MacFactory : public AbstractFactoryInterface {
  public:
  virtual std::unique_ptr<ButtonInterface> createButton() override {
    ButtonInterface * button = new MacButton();
    return std::unique_ptr<ButtonInterface>(button);
  }

  virtual std::unique_ptr<FolderInterface> createFolder() override {
    FolderInterface * folder = new MacFoler();
    return std::unique_ptr<FolderInterface>(folder);
  }
};

#endif