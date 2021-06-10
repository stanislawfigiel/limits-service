package com.in28minutes.microservices.limitsservice.beans;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Component
@Data
public class Limits {
    private int min;
    private int max;
}
