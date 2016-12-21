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
import java.util.Map;
import microsoft.powerbi.api.v1.models.Dataset;
import microsoft.powerbi.api.v1.models.ODataResponseListDataset;
import microsoft.powerbi.api.v1.models.ODataResponseListDatasource;
import microsoft.powerbi.api.v1.models.ODataResponseListGatewayDatasource;
import microsoft.powerbi.api.v1.models.ODataResponseListTable;

/**
 * An instance of this class provides access to all the operations defined
 * in DatasetsOperations.
 */
public interface DatasetsOperations {
    /**
     * Returns the datasets.
     *
     * @param collectionName The workspace collection name
     * @param workspaceId The workspace id
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ODataResponseListDataset object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ODataResponseListDataset> getDatasets(String collectionName, String workspaceId) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Returns the datasets.
     *
     * @param collectionName The workspace collection name
     * @param workspaceId The workspace id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDatasetsAsync(String collectionName, String workspaceId, final ServiceCallback<ODataResponseListDataset> serviceCallback) throws IllegalArgumentException;

    /**
     * Post a new entity to datasets.
     *
     * @param collectionName The workspace collection name
     * @param workspaceId The workspace id
     * @param dataset The entity to post
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> postDataset(String collectionName, String workspaceId, Dataset dataset) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Post a new entity to datasets.
     *
     * @param collectionName The workspace collection name
     * @param workspaceId The workspace id
     * @param dataset The entity to post
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postDatasetAsync(String collectionName, String workspaceId, Dataset dataset, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Posts new data rows into the specified table.
     *
     * @param collectionName The workspace collection name
     * @param workspaceId The workspace id
     * @param datasetKey The dataset id
     * @param tableName The table name
     * @param requestMessage The request message
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> postRows(String collectionName, String workspaceId, String datasetKey, String tableName, Object requestMessage) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Posts new data rows into the specified table.
     *
     * @param collectionName The workspace collection name
     * @param workspaceId The workspace id
     * @param datasetKey The dataset id
     * @param tableName The table name
     * @param requestMessage The request message
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postRowsAsync(String collectionName, String workspaceId, String datasetKey, String tableName, Object requestMessage, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Deletes all rows from the specified table.
     *
     * @param collectionName The workspace collection name
     * @param workspaceId The workspace id
     * @param datasetKey The dataset id
     * @param tableName The table name
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteRows(String collectionName, String workspaceId, String datasetKey, String tableName) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Deletes all rows from the specified table.
     *
     * @param collectionName The workspace collection name
     * @param workspaceId The workspace id
     * @param datasetKey The dataset id
     * @param tableName The table name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteRowsAsync(String collectionName, String workspaceId, String datasetKey, String tableName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets all tables within the specified dataset.
     *
     * @param collectionName The workspace collection name
     * @param workspaceId The workspace id
     * @param datasetKey The dataset id
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ODataResponseListTable object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ODataResponseListTable> getTables(String collectionName, String workspaceId, String datasetKey) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Gets all tables within the specified dataset.
     *
     * @param collectionName The workspace collection name
     * @param workspaceId The workspace id
     * @param datasetKey The dataset id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getTablesAsync(String collectionName, String workspaceId, String datasetKey, final ServiceCallback<ODataResponseListTable> serviceCallback) throws IllegalArgumentException;

    /**
     * Updates a schema and metadata for the specified table.
     *
     * @param collectionName The workspace collection name
     * @param workspaceId The workspace id
     * @param datasetKey The dataset id
     * @param tableName The table name
     * @param requestMessage The request message
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> putTable(String collectionName, String workspaceId, String datasetKey, String tableName, Object requestMessage) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Updates a schema and metadata for the specified table.
     *
     * @param collectionName The workspace collection name
     * @param workspaceId The workspace id
     * @param datasetKey The dataset id
     * @param tableName The table name
     * @param requestMessage The request message
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall putTableAsync(String collectionName, String workspaceId, String datasetKey, String tableName, Object requestMessage, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the dataset metadata for the specifeid dataset id.
     *
     * @param collectionName The workspace collection name
     * @param workspaceId The workspace id
     * @param datasetKey The dataset id
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Dataset object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Dataset> getDatasetById(String collectionName, String workspaceId, String datasetKey) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Gets the dataset metadata for the specifeid dataset id.
     *
     * @param collectionName The workspace collection name
     * @param workspaceId The workspace id
     * @param datasetKey The dataset id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDatasetByIdAsync(String collectionName, String workspaceId, String datasetKey, final ServiceCallback<Dataset> serviceCallback) throws IllegalArgumentException;

    /**
     * Deletes the dataset with the specified id.
     *
     * @param collectionName The workspace collection name
     * @param workspaceId The workspace id
     * @param datasetKey The dataset id
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteDatasetById(String collectionName, String workspaceId, String datasetKey) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Deletes the dataset with the specified id.
     *
     * @param collectionName The workspace collection name
     * @param workspaceId The workspace id
     * @param datasetKey The dataset id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteDatasetByIdAsync(String collectionName, String workspaceId, String datasetKey, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a list of bound gateway datasources for the specified dataset.
     *
     * @param collectionName The workspace collection name
     * @param workspaceId The workspace id
     * @param datasetKey The dataset id
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ODataResponseListGatewayDatasource object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ODataResponseListGatewayDatasource> getGatewayDatasources(String collectionName, String workspaceId, String datasetKey) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Gets a list of bound gateway datasources for the specified dataset.
     *
     * @param collectionName The workspace collection name
     * @param workspaceId The workspace id
     * @param datasetKey The dataset id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getGatewayDatasourcesAsync(String collectionName, String workspaceId, String datasetKey, final ServiceCallback<ODataResponseListGatewayDatasource> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a list of datasource for the specified dataset.
     *
     * @param collectionName The workspace collection name
     * @param workspaceId The workspace id
     * @param datasetKey the String value
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ODataResponseListDatasource object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ODataResponseListDatasource> getDatasources(String collectionName, String workspaceId, String datasetKey) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Gets a list of datasource for the specified dataset.
     *
     * @param collectionName The workspace collection name
     * @param workspaceId The workspace id
     * @param datasetKey the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDatasourcesAsync(String collectionName, String workspaceId, String datasetKey, final ServiceCallback<ODataResponseListDatasource> serviceCallback) throws IllegalArgumentException;

    /**
     * Sets all connections for the specified dataset.
     *
     * @param collectionName The workspace collection name
     * @param workspaceId The workspace id
     * @param datasetKey The dataset id
     * @param parameters The body
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> setAllConnections(String collectionName, String workspaceId, String datasetKey, Map<String, Object> parameters) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Sets all connections for the specified dataset.
     *
     * @param collectionName The workspace collection name
     * @param workspaceId The workspace id
     * @param datasetKey The dataset id
     * @param parameters The body
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall setAllConnectionsAsync(String collectionName, String workspaceId, String datasetKey, Map<String, Object> parameters, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

}
