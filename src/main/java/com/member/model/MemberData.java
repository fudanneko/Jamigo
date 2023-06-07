package com.member.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * ADD CONSTRAINT `fk_levelNo`
 * FOREIGN KEY (`levelNo`)
 * REFERENCES `jamigo`.`member_level_detail` (`levelNo`)
 */
@Data
@Entity
@Table(name = "member_data")
public class MemberData implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "memberNo", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer memberNo;

    @Column(name = "memberAccount", nullable = false)
    private String memberAccount;

    @Column(name = "memberName", nullable = false)
    private String memberName;

    /**
     * 1: male 2: female
     */
    @Column(name = "memberGender", nullable = false)
    private Integer memberGender;

    @Column(name = "memberPassword", nullable = false)
    private String memberPassword;

    @Column(name = "memberPhone", nullable = false)
    private String memberPhone;

    @Column(name = "memberEmail", nullable = false)
    private String memberEmail;

    @Column(name = "memberAddress")
    private String memberAddress;

    @Column(name = "memberJoinTime", nullable = false)
    private Date memberJoinTime;

    @Column(name = "levelNo", nullable = false)
    private Integer levelNo;

    @Column(name = "memberBirthday")
    private Date memberBirthday;

    @Column(name = "memberNation")
    private String memberNation;

    @Column(name = "memberPic")
    private byte[] memberPic;

    /**
     * 信用卡卡號有15~19碼
     */
    @Column(name = "memberCard")
    private String memberCard;

    @Column(name = "memberPoints", nullable = false)
    private Integer memberPoints;

    /**
     * 0: 帳號未驗證 1: 帳號已驗證  2: 帳號停權
     */
    @Column(name = "memberStat", nullable = false)
    private Integer memberStat;

}
