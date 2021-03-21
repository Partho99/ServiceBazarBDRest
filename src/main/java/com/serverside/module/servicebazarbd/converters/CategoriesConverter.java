package com.serverside.module.servicebazarbd.converters;

import com.serverside.module.servicebazarbd.dtos.CategoriesWithTypeDto;
import com.serverside.module.servicebazarbd.entities.Categories;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoriesConverter {
    private final ModelMapper modelMapper;

    @Autowired
    public CategoriesConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public CategoriesWithTypeDto entityToDto(Categories categories) {
        CategoriesWithTypeDto categoriesWithTypeDto = modelMapper.map(categories, CategoriesWithTypeDto.class);
        return categoriesWithTypeDto;
    }

    public List<CategoriesWithTypeDto> entityToDto(List<Categories> categories) {
        return categories.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
    }

    public Categories dtoToEntity(CategoriesWithTypeDto categoriesWithTypeDto) {
        Categories categories = modelMapper.map(categoriesWithTypeDto, Categories.class);
        return categories;
    }


    public List<Categories> dtoToEntity(List<CategoriesWithTypeDto> categoriesWithTypeDto) {
        return categoriesWithTypeDto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
    }
}
