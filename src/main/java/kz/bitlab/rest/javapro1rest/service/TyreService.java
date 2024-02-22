9package kz.bitlab.rest.javapro1rest.service;

import kz.bitlab.rest.javapro1rest.dto.TyreDto;
import kz.bitlab.rest.javapro1rest.mapper.TyreMapper;
import kz.bitlab.rest.javapro1rest.model.Tyre;
import kz.bitlab.rest.javapro1rest.repository.TyreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class TyreService {
    private final TyreRepository tyreRepository;
    private final TyreMapper tyreMapper;

    public List<TyreDto> getTyres(){
      List<Tyre> tyres =  tyreRepository.findAll();
      List<TyreDto> tyreDtoList=new ArrayList<>();
      tyres.forEach(tyre -> tyreDtoList.add(tyreMapper.toDto(tyre)));
      return tyreDtoList;
    }

    public TyreDto addTyre(TyreDto dto){
        Tyre tyre =tyreMapper.toEntity(dto);
        return tyreMapper.toDto(tyreRepository.save(tyre));
    }

    public TyreDto updateTyre(TyreDto dto){
        return tyreMapper.toDto(tyreRepository.save(tyreMapper.toEntity(dto)));
    }

    public TyreDto getTyre(Long id){
        return tyreMapper.toDto(tyreRepository.findById(id).orElseThrow());
    }

    public void deleteTyre(Long id){
        tyreRepository.deleteById(id);
    }

//    private  TyreDto toDto(Tyre tyre){
//        TyreDto tyreDto=TyreDto
//                .builder()
//                .id(tyre.getId())
//                .tyreName(tyre.getName())
//                .tyreProfile(tyre.getProfile())
//                .price(tyre.getPrice())
//                .manufacturer(tyre.getManufacturer())
//                .build();
//
//        return tyreDto;
//    }
//
//    private Tyre toEntity(TyreDto dto){
//        Tyre tyre =new Tyre();
//        tyre.setName(dto.getTyreName());
//        tyre.setProfile(dto.getTyreProfile());
//        tyre.setPrice(dto.getPrice());
//        tyre.setManufacturer(dto.getManufacturer());
//        tyre.setId(dto.getId());
//        return tyre;
//    }

}
