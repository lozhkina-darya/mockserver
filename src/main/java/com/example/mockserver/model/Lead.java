package com.example.mockserver.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "LEAD")
public class Lead {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;


    private Timestamp date;

    private String rqUID;
    private String segment;
    private String surname;
    private String firstname;
    private String middlename;
    private String phone;
    private String email;
    private String phone2;
    private String suboLeadId;
    private String serviceOfficeId;
    private String source;
    private String organizationName;
    private String inn;
    private String position;
    private String needCreatedFlag;
    //private String leadId;

    public Lead(){};

    public Long getId() { return id;}

    public void setId(Long id) { this.id = id;}

    public Timestamp getDate() { return date;}

    public void setDate(Timestamp date){
        this.date = date;}

    public String getRqUID(){ return rqUID;}

    public void setRqUID(String rqUID){
        this.rqUID = rqUID;}

    public String getSegment(){ return segment;}

    public void setSegment(String segment){
        this.segment = segment;}

    public String getSurname(){ return surname;}

    public void setSurname(String surname) {
        this.surname = surname;}

    public String getFirstname(){ return firstname;}

    public void setFirstname(String firstname){
        this.firstname = firstname;}

    public String getMiddlename() { return middlename;}

    public void setMiddlename(String middlename){
        this.middlename = middlename;}

    public String getOrganizationName(){ return organizationName;}

    public void setOrganizationName(String organizationName){
        this.organizationName = organizationName;}

    public String getPosition(){ return position;}

    public void setPosition(String position){
        this.position = position;}

    public String getPhone(){ return phone;}

    public void setPhone(String phone){
        this.phone = phone;}

    public String getEmail(){ return email;}

    public void setEmail(String email){
        this.email = email;}

    public String getPhone2(){ return phone2;}

    public void setPhone2(String phone2){
        this.phone2 = phone2;}

    public String getSuboLeadId(){ return suboLeadId;}

    public void setSuboLeadId(String suboLeadId){
        this.suboLeadId = suboLeadId;}

    public String getServiceOfficeId(){ return serviceOfficeId;}

    public void setServiceOfficeId(String serviceOfficeId) {
        this.serviceOfficeId = serviceOfficeId;}

    public String getSource(){ return source;}

    public void setSource(String source){
        this.source = source;}

    public String getInn(){ return inn;}

    public void setInn(String inn){
        this.inn = inn;}

    public String getNeedCreatedFlag() {return needCreatedFlag;}

    public void setNeedCreatedFlag(String needCreatedFlag){
        this.needCreatedFlag = needCreatedFlag;
    }

/*    public String getLeadId(){ return leadId;}

    public void setLeadId(Long String) { this.leadId = leadId;}*/

}
