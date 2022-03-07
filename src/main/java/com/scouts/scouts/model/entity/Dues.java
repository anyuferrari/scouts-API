package com.scouts.scouts.model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DUES")
public class Dues {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Setter(AccessLevel.NONE)
  @Column(name = "ID")
  private Long id;

  @JoinColumn(name = "BENEFICIARY_ID")
  @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
  private Beneficiary beneficiary;

  @Column(name = "JAN")
  private long jan;

  @Column(name = "FEB")
  private long feb;

  @Column(name = "MAR")
  private long mar;

  @Column(name = "APR")
  private long apr;

  @Column(name = "MAY")
  private long may;

  @Column(name = "JUN")
  private long jun;

  @Column(name = "JUL")
  private long jul;

  @Column(name = "CANTONMENT")
  private long cant;

  @Column(name = "AUG")
  private long aug;

  @Column(name = "SEP")
  private long sep;

  @Column(name = "OCT")
  private long oct;

  @Column(name = "NOV")
  private long nov;

  @Column(name = "DECEMBER")
  private long dec;

  @Column(name = "CAMP")
  private long camp;

}
