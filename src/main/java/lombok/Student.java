package com.sda.json;

import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author marek swietlik
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private String lastName;
    private Address address;


}
