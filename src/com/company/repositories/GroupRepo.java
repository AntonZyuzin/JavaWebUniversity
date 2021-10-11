package com.company.repositories;

import com.company.entities.Group;

public interface GroupRepo {
    void save(Group g);
    void remove(int groupId);
}
