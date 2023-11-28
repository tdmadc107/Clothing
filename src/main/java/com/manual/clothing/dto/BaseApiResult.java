package com.manual.clothing.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseApiResult {

    @JsonProperty("returnCode")
    private Integer returnCode;

    @JsonProperty("message")
    private String message;
}
