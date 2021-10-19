public class EstimateComplexItem extends EstimateItem{
    
    private EstimateItem Item[];
    
    
    public EstimateComplexItem(String historic, float value, EstimateItem[] item) {
        super(historic, value);
        Item = item;
    }
    
    @Override
    public float getValue() {
        int sum = 0;
        for(int i = 1; i < Item.length; i++) {
            sum += Item[i].getValue();
        }
        return sum;
    }
    
    public EstimateItem FindItem(String historic) {
        for(int i = 0; i <= Item.length; i++) {
            if (historic == Item[i].getHistoric()) {
                return Item[i];
            }
        }

        return null;
    }
}
