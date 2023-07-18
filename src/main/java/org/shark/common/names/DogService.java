package org.shark.common.names;

import java.util.List;

public interface DogService {

    List<Dog> getDogs();

    void updateUser(User user);

    void addUser(User user);

    List<User> getUsers();

    void completeOrder();

}
