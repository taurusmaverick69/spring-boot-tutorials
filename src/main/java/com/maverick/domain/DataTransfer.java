package com.maverick.domain;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class DataTransfer {

    @Id
    private String sku;
    @SerializedName("servicecode")
    private String serviceCode;
    private String transferType;
    private String fromLocation;
    private String fromLocationType;
    private String toLocation;
    private String toLocationType;
    @SerializedName("usagetype")
    private String usageType;
    private String operation;

}
