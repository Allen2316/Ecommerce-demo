package company.allen.soft.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.util.Date;

@Data
public class Product {
    private Long id;
    private String name;
    private String description;
    private Double stock;
    private Double price;
    private String status;
    private Date createAt;
    private Category category;
}
