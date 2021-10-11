package com.company.controllers;

import com.company.entities.Group;
import com.company.repositories.GroupRepo;

import java.util.ArrayList;


public class GroupController {
    public GroupRepo groupRepository;

    public void save(int groupId, ArrayList<Integer> _studentId) {
        Group g = new Group(groupId, _studentId);
        groupRepository.save(g);
    }

    public void remove(int id) {
        groupRepository.remove(id);
    }
}
