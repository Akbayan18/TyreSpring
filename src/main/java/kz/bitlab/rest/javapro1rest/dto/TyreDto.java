package kz.bitlab.rest.javapro1rest.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TyreDto {
    private Long id;
    private String tyreName;
    private String tyreProfile;
    private int price;
    private String manufacturer;
}
