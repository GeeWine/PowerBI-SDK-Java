/**
 * Code generated by Microsoft (R) AutoRest Code Generator 0.16.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package microsoft.powerbi.api.v1.models;

import java.util.List;

/**
 * The import object.
 */
public class ImportModel {
    /**
     * The import id.
     */
    private String id;

    /**
     * The import name name.
     */
    private String name;

    /**
     * The import upload state.
     */
    private String importState;

    /**
     * The reports associated with this import.
     */
    private List<Report> reports;

    /**
     * The datasets associated with this import.
     */
    private List<Dataset> datasets;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the importState value.
     *
     * @return the importState value
     */
    public String getImportState() {
        return this.importState;
    }

    /**
     * Set the importState value.
     *
     * @param importState the importState value to set
     */
    public void setImportState(String importState) {
        this.importState = importState;
    }

    /**
     * Get the reports value.
     *
     * @return the reports value
     */
    public List<Report> getReports() {
        return this.reports;
    }

    /**
     * Set the reports value.
     *
     * @param reports the reports value to set
     */
    public void setReports(List<Report> reports) {
        this.reports = reports;
    }

    /**
     * Get the datasets value.
     *
     * @return the datasets value
     */
    public List<Dataset> getDatasets() {
        return this.datasets;
    }

    /**
     * Set the datasets value.
     *
     * @param datasets the datasets value to set
     */
    public void setDatasets(List<Dataset> datasets) {
        this.datasets = datasets;
    }

}
