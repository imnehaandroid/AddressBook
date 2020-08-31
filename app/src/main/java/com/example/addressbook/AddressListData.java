package com.example.addressbook;

public class AddressListData {


    private String address1;
    private String address2;
    private String address3 ;


    public AddressListData(String address1, String address2, String address3) {

             this.address1 =address1;
             this.address2=address2;
             this.address3=address3;


    }


       public String getAddress1(){
          return address1;
    }
       public String getAddress2(){
        return address2;
    }

        public String getAddress3(){
        return address3;
    }







}
