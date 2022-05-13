package com.app.ecotiya.domain.model;

import java.time.LocalDateTime;

public class AppBaseEntity {
    
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    public LocalDateTime getCreatedAt () {
        return createdAt;
    }
    
    public void setCreatedAt (LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    
    public LocalDateTime getUpdatedAt () {
        return updatedAt;
    }
    
    public void setUpdatedAt (LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    
}