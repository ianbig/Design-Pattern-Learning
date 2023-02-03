#ifndef ABSTRACT_FACTORY_INTERFACE_HPP
#define ABSTRACT_FACTORY_INTERFACE_HPP


#include <iostream>
#include <memory>
#include "ButtonInterface.hpp"
#include "FolderInterface.hpp"

class AbstractFactoryInterface {
  public:
  virtual ~AbstractFactoryInterface() = default;
  virtual std::unique_ptr<ButtonInterface> createButton() = 0;
  virtual std::unique_ptr<FolderInterface> createFolder() = 0;
};

#endif