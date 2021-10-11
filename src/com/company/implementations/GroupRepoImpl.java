package com.company.implementations;

import com.company.entities.Group;
import com.company.repositories.GroupRepo;

import static com.company.Database._listOfGroups;

public class GroupRepoImpl implements GroupRepo {
    @Override
    public void save(Group g) {
        _listOfGroups.add(g);
    }

    @Override
    public void remove(int groupId) {
        _listOfGroups.remove(groupId);
    }
}
