package com.rabbitmq.consumer.consumer.customMessage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class MessageClass {
    private String messageId;
    private  String message;
    private Date messageDate;
}
