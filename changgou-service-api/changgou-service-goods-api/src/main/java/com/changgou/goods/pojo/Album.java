package com.changgou.goods.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tb_album")
public class Album implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;//编号

    @Column(name = "title")
    private String title;//相册名称

    @Column(name = "image")
    private String image;//相册封面

    @Column(name = "image_items")
    private String imageItems;//图片列表

    //get...set...toString..
}
