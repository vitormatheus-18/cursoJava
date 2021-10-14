
public class EstimateItem {
    private float Value;    
    private String Historic;    

    public EstimateItem() {
        
    }

    public EstimateItem(String historic, float value) {
        Historic = historic;
        Value = value;
    }

    public String getHistoric() {
        return Historic;
    }

    public float getValue() {
        return Value;
    }  
}
