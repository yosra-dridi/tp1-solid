package com.directi.training.ocp.exercise_refactored;

public interface IResourceTypeManager {
    int allocate();
    void free(int resourceId);
}
