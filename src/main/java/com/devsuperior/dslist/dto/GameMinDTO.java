package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

public class GameMinDTO {

    private long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;
    //criando construtor:
    public GameMinDTO(){
    }
    //criando construtor com argumentos:
    // transformamos ele em um construtor que recebe a entidade: public GameMinDTO(long id, String title, Integer year, String imgUrl, String shortDescription)


    //public GameMinDTO(long id, String title, Integer year, String imgUrl, String shortDescription) {
    //    this.id = id;
    //    this.title = title;
    //    this.year = year;
    //    this.imgUrl = imgUrl;
    //    this.shortDescription = shortDescription;

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
