package test;

import config.AutoFill;
import dto.WareHouseCreateDto;
import dto.WareHouseUpdateDto;
import service.WareHouseService;
import service.WareHouseServiceImpl;
import shared.CreateDto;

import java.time.LocalDateTime;

public class main {
    public static void main(String[] args) {
        WareHouseService wareHouseService = new WareHouseServiceImpl();

        WareHouseCreateDto wareHouseCreateDto = new WareHouseCreateDto();

//        WareHouseUpdateDto wareHouseUpdateDto= new WareHouseUpdateDto();
//        wareHouseUpdateDto.setCount(20L);
//        wareHouseUpdateDto.setSellRate(180);
//        wareHouseUpdateDto.setBuyRate(220);
//wareHouseUpdateDto.setUpdatedDate(LocalDateTime.now());
//        wareHouseUpdateDto.setId(10);
//        wareHouseService.update(wareHouseUpdateDto);

        AutoFill autoFill= new AutoFill();
      autoFill.findAll();



//        wareHouseCreateDto.setName("Floor");
//        wareHouseCreateDto.setCount(22L);
//        wareHouseCreateDto.setSellRate(200);
//        wareHouseCreateDto.setBuyRate(190);
//        wareHouseCreateDto.setCreatedDate(LocalDateTime.now());
//        wareHouseService.create(wareHouseCreateDto);

//        System.out.println(wareHouseService.retrieveById(1));
//        System.out.println(wareHouseService.retrieveAll());

    }
}
