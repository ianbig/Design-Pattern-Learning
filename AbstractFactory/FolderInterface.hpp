#ifndef FOLDER_INTERFACE_HPP
#define FOLDER_INTERFACE_HPP

class FolderInterface {
  public:
  virtual ~FolderInterface() = default;
  virtual void paint() = 0;
};

#endif