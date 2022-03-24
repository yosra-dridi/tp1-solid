package com.directi.training.ocp.exercise_refactored;

public class SpaceResourceManager implements IResourceTypeManager
{
    public int allocate() {        
        int resourceId = findFree();
        resource.markBusy(resourceId);
        return resourceId;
    }
    public void free(int resourceId) {        
        markFree(resourceId);
    }

    private findFree() {
        return 0;
    }

    private markFree(int resourceId) {

    }
}
