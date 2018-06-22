package db;

import org.litepal.crud.LitePalSupport;

public class Country  extends LitePalSupport {
    private int id;
    private String countryName;
    private String weartherId;
    private int cityId;
    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String getCountryName(){
        return countryName;
    }
    public void setCountryName(){
        this.countryName = countryName;
    }
    public String getWeartherId(){
        return weartherId;
    }
    public void setWeartherId(){
        this.weartherId = weartherId;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(){
        this.cityId = cityId;
    }
}
