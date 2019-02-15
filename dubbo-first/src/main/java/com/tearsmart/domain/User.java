package com.tearsmart.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 * @author tear-smart
 * @date 2019-02-15
 */
@Data
@Accessors(chain = true)
public class User implements Serializable {
    private static final long serialVersionUID = -2668999087589887337L;
    private Long id;
    private String username;
    private String password;
    private Integer age;
}
