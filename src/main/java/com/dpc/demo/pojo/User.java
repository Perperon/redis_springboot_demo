package com.dpc.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * @author dupengcheng
 * @date 2023-12-14
 * @apiNote
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private String name;

    private Integer age;

}
