package com.sportClub.common.pay;

import lombok.Data;

/**
 * @program: FmOpen
 * @description:
 * @author: Feri(邢朋辉)
 * @create: 2020-08-13 11:16
 */
@Data
public class PayDto {
    private String oid;//订单号
    private int price;//单位分
    private String orderdes;//订单的描述信息
}