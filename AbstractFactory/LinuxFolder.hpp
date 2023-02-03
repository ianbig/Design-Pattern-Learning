#ifndef LINUX_FOLDER_HPP
#define LINUX_FOLDER_HPP

#include <iostream>
#include "FolderInterface.hpp"

class LinuxFolder : public FolderInterface {
  public:
  virtual void paint() override {
    std::cout << "Linux Folder!" << std::endl;
  }
};

#endif