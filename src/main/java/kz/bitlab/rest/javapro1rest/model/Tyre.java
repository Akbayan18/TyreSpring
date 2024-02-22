package kz.bitlab.rest.javapro1rest.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Tyre extends BaseModel{
    private String name;
    private String profile;
    private int price;
    private String manufacturer;
}
