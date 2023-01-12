package com.rest.pojo;

public class createWorkspaceRoot {

    createWorkspace workspace;

    public createWorkspaceRoot(){

    }
    public  createWorkspaceRoot(createWorkspace workspace){
        this.workspace=workspace;
    }
    public createWorkspace getWorkspace() {
        return workspace;
    }

    public void setWorkspace(createWorkspace workspace) {
        this.workspace = workspace;
    }
}
