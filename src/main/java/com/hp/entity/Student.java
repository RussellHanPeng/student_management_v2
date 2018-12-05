package com.hp.entity;

import com.hp.entity.basic.BasicEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student extends BasicEntity{

    //学号
    private Integer sno;

    private String name;

    //性别（1-男 2-女）
    private Integer gender;

    private Integer age;

    private String sdept;

}
