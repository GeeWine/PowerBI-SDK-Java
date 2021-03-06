/**
 * Code generated by Microsoft (R) AutoRest Code Generator 0.16.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package microsoft.powerbi.api.v1.models;


/**
 * A Power BI Workspace.
 */
public class Workspace {
    /**
     * The workspace id.
     */
    private String workspaceId;

    /**
     * The workspace collection name.
     */
    private String workspaceCollectionName;

    /**
     * Get the workspaceId value.
     *
     * @return the workspaceId value
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * Set the workspaceId value.
     *
     * @param workspaceId the workspaceId value to set
     */
    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * Get the workspaceCollectionName value.
     *
     * @return the workspaceCollectionName value
     */
    public String getWorkspaceCollectionName() {
        return this.workspaceCollectionName;
    }

    /**
     * Set the workspaceCollectionName value.
     *
     * @param workspaceCollectionName the workspaceCollectionName value to set
     */
    public void setWorkspaceCollectionName(String workspaceCollectionName) {
        this.workspaceCollectionName = workspaceCollectionName;
    }

}
