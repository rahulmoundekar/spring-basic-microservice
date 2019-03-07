package com.zeeshan.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Profile implements Serializable {

	private static final long serialVersionUID = 1L;

	private String userId;
	private String name;

}
