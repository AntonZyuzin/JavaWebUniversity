package com.company.entities;

import java.util.ArrayList;

public class Group {
    private int groupId;
    private ArrayList<Integer> _studentId = new ArrayList<Integer>();

    public Group(int groupId, ArrayList<Integer> _studentId) {
        this.groupId = groupId;
        this._studentId = _studentId;
    }

    public int getGroupId() {
        return groupId;
    }

    public ArrayList<Integer> get_studentId() {
        return _studentId;
    }
}


