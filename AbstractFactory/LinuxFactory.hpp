#ifndef LINUX_FACTORY_HPP
#define LINUX_FACTROY_HPP

#include "AbstractFactoryInterface.hpp"
#include "LinuxButton.hpp"
#include "LinuxFolder.hpp"

class LinuxFactory : public AbstractFactoryInterface {
  public:
  virtual std::unique_ptr<ButtonInterface> createButton() override {
    ButtonInterface * button = new LinuxButton();
    return std::unique_ptr<ButtonInterface>(button);
  }

  virtual std::unique_ptr<FolderInterface> createFolder() override {
    FolderInterface * folder = new LinuxFolder();
    return std::unique_ptr<FolderInterface>(folder);
  }
};

#endif