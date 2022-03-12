package innow.entity;

import javax.persistence.*;

@Entity
@Table(name = "campaigns")
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String url;
    @Column(name = "countrys_group")
    @Enumerated(value = EnumType.STRING)
    private CountrysGroup countrysGroup;
    @Enumerated(value = EnumType.STRING)
    private Language language;
    @Column(name = "age_group")
    @Enumerated(value = EnumType.STRING)
    private AgeGroup ageGroup;
    private String location;

    public Campaign(){}

    public Campaign(String url, CountrysGroup countrysGroup, Language language, AgeGroup ageGroup, String location) {
        this.url = url;
        this.countrysGroup = countrysGroup;
        this.language = language;
        this.ageGroup = ageGroup;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CountrysGroup getCountrysGroup() {
        return countrysGroup;
    }

    public void setCountrysGroup(CountrysGroup countrysGroup) {
        this.countrysGroup = countrysGroup;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(AgeGroup ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
//TODO:картинку/видео, целевые страны, языки, группы пользователей по возрасту, геолокация