package com.memberorderapi.enumeration;

import lombok.Getter;

@Getter
public enum OrderStatus {
    ORDER_COMPLETED("주문완료"),      // 주문이 완료되었을 때의 상태
    CANCELED("취소완료"),             // 주문이 취소되었을 때의 상태
    DELIVERY_READY("배송준비중"),      // 배송이 준비되었지만 아직 출발하지 않은 상태
    DELIVERING("배송중"),             // 상품이 배송 중인 상태
    DELIVERY_COMPLETED("배송완료");   // 배송이 완료되었을 때의 상태

    public final String desc;  // 주문 상태에 대한 설명을 저장하는 변수

    // 생성자 메소드
    OrderStatus(String desc) {
        this.desc = desc;  // 주문 상태에 대한 설명을 초기화
    }
}
