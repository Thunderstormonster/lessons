import java.math.BigDecimal;

public class LogEntry {
    private String nameProd;
    private Categories typeProd;
    private BigDecimal priceProd;
    private String dateSell;

    public LogEntry(String nameProd,BigDecimal priceProd,Categories typeProd,String dateSell){
        this.nameProd=nameProd;
        this.typeProd=typeProd;
        this.priceProd=priceProd;
        this.dateSell =dateSell;
    }
    public LogEntry(){}


    public String getNameProd(){
        return nameProd;
    }

    public void setNameProd(String nameProd){ this.nameProd=nameProd; }

    public Categories getTypeProd(){ return typeProd; }

    public void setTypeProd(Categories typeProd){ this.typeProd=typeProd; }

    public BigDecimal getPriceProd(){ return priceProd; }

    public void setPriceProd(BigDecimal priceProd){ this.priceProd=priceProd; }

    public String getDateSell(){
        return dateSell;
    }

    public void setDateSell(String dateSell){ this.dateSell = dateSell; }

    @Override
    public String toString(){
        return getNameProd()+","+getPriceProd()+","+getTypeProd()+","+getDateSell();
    }



}
