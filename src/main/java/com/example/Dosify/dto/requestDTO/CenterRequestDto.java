package com.example.Dosify.dto.requestDTO;

import com.example.Dosify.Enum.CenterType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CenterRequestDto {
    String name;
    String location;
    CenterType centerType;


}
