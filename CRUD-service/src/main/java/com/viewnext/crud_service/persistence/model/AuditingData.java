package com.viewnext.crud_service.persistence.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Builder
@Table(name = "Auditoria")
public class AuditingData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "Created_by")
    private User createdBy;

    @Column(name = "Created_Date")
    @CreationTimestamp
    private Date createdDate;

    @Column(name = "typeRequest")
    private String typeRequest;

    public AuditingData(User createdBy, String typeRequest) {
        this.createdBy = createdBy;
        this.typeRequest = typeRequest;
    }
}
