package com.manual.clothing.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ApiResult<T> extends BaseApiResult {

    @JsonProperty("data")
    private T data;
}
