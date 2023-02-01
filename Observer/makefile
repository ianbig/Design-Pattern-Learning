CXX = g++
CFLAGS = --std=c++14 -O3
SOURCE = $(wildcard *.cc)
OBJ = $(patsubst %.cc, %.o, $(SOURCE))
observer: $(OBJ)
	$(CXX) -o $@ $(OBJ) $(CFLAGS)
%.o: %.cc
	$(CXX) $(CFLAGS) -c $< -o $@

.PHONY: clean
clean:
	rm *.o observer