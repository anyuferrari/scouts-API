package com.scouts.scouts.model.entity;

import java.sql.Timestamp;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BENEFICIARIES")
public class Beneficiary {

  @Id
  @Setter(AccessLevel.NONE)
  @Column(name = "DOCUMENT_ID", unique = true)
  private long id;

  @Column(name = "NAME", nullable = false)
  private String name;

  @Column(name = "LAST_NAME", nullable = false)
  private String lastName;

  @Column(name = "BIRTHDATE", nullable = false)
  private Timestamp birthdate;

  @JoinColumn(name = "FAMILY_ID")
  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
  private Family family;


}
