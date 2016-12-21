/**
 * Code generated by Microsoft (R) AutoRest Code Generator 0.16.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package microsoft.powerbi.api.v1.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Odata response wrapper for a Power BI Report collection.
 */
public class ODataResponseListReport {
    /**
     * The odatacontext property.
     */
    @JsonProperty(value = "odata.context")
    private String odatacontext;

    /**
     * The report collection.
     */
    private List<Report> value;

    /**
     * Get the odatacontext value.
     *
     * @return the odatacontext value
     */
    public String getOdatacontext() {
        return this.odatacontext;
    }

    /**
     * Set the odatacontext value.
     *
     * @param odatacontext the odatacontext value to set
     */
    public void setOdatacontext(String odatacontext) {
        this.odatacontext = odatacontext;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<Report> getValue() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     */
    public void setValue(List<Report> value) {
        this.value = value;
    }

}
