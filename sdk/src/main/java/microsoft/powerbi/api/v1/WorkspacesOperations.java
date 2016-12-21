/**
 * Code generated by Microsoft (R) AutoRest Code Generator 0.16.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package microsoft.powerbi.api.v1;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import microsoft.powerbi.api.v1.models.ODataResponseListWorkspace;
import microsoft.powerbi.api.v1.models.Workspace;

/**
 * An instance of this class provides access to all the operations defined
 * in WorkspacesOperations.
 */
public interface WorkspacesOperations {
    /**
     * Returns a list of workspaces for the specified collection.
     *
     * @param collectionName The workspace collection name
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ODataResponseListWorkspace object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ODataResponseListWorkspace> getWorkspacesByCollectionName(String collectionName) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Returns a list of workspaces for the specified collection.
     *
     * @param collectionName The workspace collection name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getWorkspacesByCollectionNameAsync(String collectionName, final ServiceCallback<ODataResponseListWorkspace> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates a new workspace within a workspace collection.
     *
     * @param collectionName The workspace collection name
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Workspace object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Workspace> postWorkspace(String collectionName) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Creates a new workspace within a workspace collection.
     *
     * @param collectionName The workspace collection name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postWorkspaceAsync(String collectionName, final ServiceCallback<Workspace> serviceCallback) throws IllegalArgumentException;

}
