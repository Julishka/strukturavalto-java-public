package exam03retake02;

public class Station {
    protected Integer id;
    protected String allomas;
    protected Double lat;
    protected Double lng;
    protected String description;
    protected Integer level;
    protected String groupId;
    protected String stationType;

    public Station(Integer id, String allomas, Double lat, Double lng, String description, Integer level, String groupId, String stationType) {
        this.id = id;
        this.allomas = allomas;
        this.lat = lat;
        this.lng = lng;
        this.description = description;
        this.level = level;
        this.groupId = groupId;
        this.stationType = stationType;
    }

    public Station() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAllomas() {
        return allomas;
    }

    public void setAllomas(String allomas) {
        this.allomas = allomas;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType;
    }

    @Override
    public String toString() {
        return "Station{" +
                "id=" + id +
                ", allomas='" + allomas + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                ", description='" + description + '\'' +
                ", level=" + level +
                ", groupId='" + groupId + '\'' +
                ", stationType='" + stationType + '\'' +
                '}';
    }
}
