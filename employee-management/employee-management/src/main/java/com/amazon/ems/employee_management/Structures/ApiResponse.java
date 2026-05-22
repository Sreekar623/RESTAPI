package com.amazon.ems.employee_management.Structures;

import lombok.Data;

@Data
public class ApiResponse <T>{
    private String status;
    private String message;
    private T data;

    public ApiResponse(String s, String m, T d){
         this.status=s;
         this.message=m;
         this.data=d;
    }
}
