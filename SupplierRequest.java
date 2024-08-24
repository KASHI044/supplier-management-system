package com.makersharks.dto;

public class SupplierRequest 
{
    private String location;
    private String natureOfBusiness;
    private String process;

    // Default constructor
    public SupplierRequest() {
    }

    // Parameterized constructor
    public SupplierRequest(String location, String natureOfBusiness, String process) 
    {
        this.location = location;
        this.natureOfBusiness = natureOfBusiness;
        this.process = process;
    }

    // Getters and Setters
    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getNatureOfBusiness()
    {
        return natureOfBusiness;
    }

    public void setNatureOfBusiness(String natureOfBusiness)
    {
        this.natureOfBusiness = natureOfBusiness;
    }

    public String getProcess()
    {
        return process;
    }

    public void setProcess(String process)
    {
        this.process = process;
    }
}
