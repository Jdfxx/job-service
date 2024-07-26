package com.filiphagno.jobservice.util;

import com.filiphagno.jobservice.dto.JobDto;
import com.filiphagno.jobservice.entity.Job;
import org.springframework.beans.BeanUtils;

public class EntityDtoUtil {
    public static JobDto toDto(Job job) {
        JobDto dto = new JobDto();
        BeanUtils.copyProperties(job, dto);
        dto.setHostname(AppUtil.getHostname());
        return dto;
    }

    public static Job toEntity(JobDto dto) {
        Job job = new Job();
        BeanUtils.copyProperties(dto, job);
        return job;
    }
}
