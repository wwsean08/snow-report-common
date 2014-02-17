package com.wwsean08.snow.common;

import com.google.gson.Gson;

public class ReportPOJO
{
    private String lastUpdateTime;
    private String openStatus;
    private String phoneNumber;
    private String resortLocation;
    private String resortName;
    private String surfaceType;
    private int id;
    private int liftsOpen;
    private int snowInLast24Hours;
    private int snowInLast48Hours;
    private int trailsOpen;
    private long creationTime;
    
    public final String getLastUpdateTime()
    {
        return lastUpdateTime;
    }
    
    public final void setLastUpdateTime(String lastUpdateTime)
    {
        this.lastUpdateTime = lastUpdateTime;
    }
    
    public final String getOpenStatus()
    {
        return openStatus;
    }
    
    public final void setOpenStatus(String openStatus)
    {
        this.openStatus = openStatus;
    }
    
    public final String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    public final void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    public final String getResortLocation()
    {
        return resortLocation;
    }
    
    public final void setResortLocation(String resortLocation)
    {
        this.resortLocation = resortLocation;
    }
    
    public final String getResortName()
    {
        return resortName;
    }
    
    public final void setResortName(String resortName)
    {
        this.resortName = resortName;
    }
    
    public final String getSurfaceType()
    {
        return surfaceType;
    }
    
    public final void setSurfaceType(String surfaceType)
    {
        this.surfaceType = surfaceType;
    }
    
    public final int getId()
    {
        return id;
    }
    
    public final void setId(int id)
    {
        this.id = id;
    }
    
    public final int getLiftsOpen()
    {
        return liftsOpen;
    }
    
    public final void setLiftsOpen(int liftsOpen)
    {
        this.liftsOpen = liftsOpen;
    }
    
    public final int getSnowInLast24Hours()
    {
        return snowInLast24Hours;
    }
    
    public final void setSnowInLast24Hours(int snowInLast24Hours)
    {
        this.snowInLast24Hours = snowInLast24Hours;
    }
    
    public final int getSnowInLast48Hours()
    {
        return snowInLast48Hours;
    }
    
    public final void setSnowInLast48Hours(int snowInLast48Hours)
    {
        this.snowInLast48Hours = snowInLast48Hours;
    }
    
    public final int getTrailsOpen()
    {
        return trailsOpen;
    }
    
    public final void setTrailsOpen(int trailsOpen)
    {
        this.trailsOpen = trailsOpen;
    }
    
    public final long getCreationTime()
    {
        return creationTime;
    }
    
    public final void setCreationTime(long creationTime)
    {
        this.creationTime = creationTime;
    }
    
    /**
     * Used to generate a JSON representation of the object
     */
    @Override
    public String toString()
    {
        Gson GSON = new Gson();
        return GSON.toJson(this);
    }
}
