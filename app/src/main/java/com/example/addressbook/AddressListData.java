package com.example.addressbook;

public class AddressListData {
    private Integer id;
    private String firstname;
    private String lastname;
    private String address1;
    private String address2;
    private String city;
    private String zipcode ;
    private String phone;
    private String statename;
    private String alternative_phone ;
    private String company;
    private Integer stateid;
    private Integer country_id;

    public AddressListData(Integer id, String firstname, String lastname, String address1, String address2,
                           String city, String zipcode, String phone, String statename,
                           String alternative_phone, String company, Integer stateid, Integer country_id) {

             this.id = id;
             this.firstname =firstname;
             this.lastname=lastname;
             this.address1 =address1;
             this.address2=address2;
             this.city =city;
             this.zipcode=zipcode;
             this.phone=phone;
             this.statename= statename;
             this.alternative_phone =alternative_phone;
             this.company=company;
             this.stateid =stateid;
             this.country_id=country_id;


    }
        public Integer getId(){
           return id;
        }
        public String getFirstname(){
         return firstname;
        }
       public String getLastname(){
        return lastname;
    }
       public String getAddress1(){
          return address1;
    }
       public String getAddress2(){
        return address2;
    }
       public String getCity(){
        return city;
    }
       public String getZipcode(){
        return zipcode;
    }
       public String getPhone(){
        return phone;
    }
    public String getStatename(){
        return statename;
    }
    public String getAlternative_phone(){
        return alternative_phone;
    }
    public String getCompany(){
        return company;
    }
    public Integer getStateid(){
        return stateid;

    }
    public Integer getCountry_id(){
        return country_id;
    }







}
