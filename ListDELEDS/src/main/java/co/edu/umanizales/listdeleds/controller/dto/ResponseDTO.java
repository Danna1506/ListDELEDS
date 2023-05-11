package co.edu.umanizales.listdeleds.controller.dto;

import lombok.Data;

import java.util.List;
@Data
public class ResponseDTO {
    private int code;
    private Object data;
    private List<ErrorDTO> errors;
}
