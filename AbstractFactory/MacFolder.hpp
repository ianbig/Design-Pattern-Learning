#ifndef MAC_FOLDER_HPP
#define MAC_FOLDER_HPP

#include <iostream>
#include "FolderInterface.hpp"

class MacFoler : public FolderInterface {
  public:
  virtual void paint() override {
    std::cout << "Mac Folder!" << std::endl;
  }
};

#endif