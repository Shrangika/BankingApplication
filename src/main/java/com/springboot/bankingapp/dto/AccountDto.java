package com.springboot.bankingapp.dto;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
/*
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
    private Long id;
    private String accountHolderName;
    private double balance;
}
*/
public record AccountDto(Long id, String accountHolderName,double balance){

}