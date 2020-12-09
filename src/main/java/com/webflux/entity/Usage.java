package com.webflux.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usage {
	private int cpuUsage;
	private int memoryUsage;
	private Date date;
}
