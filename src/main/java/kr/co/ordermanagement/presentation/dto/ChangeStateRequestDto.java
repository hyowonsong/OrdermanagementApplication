package kr.co.ordermanagement.presentation.dto;


import kr.co.ordermanagement.domain.order.State;

public class ChangeStateRequestDto {
    private State state;

    public kr.co.ordermanagement.domain.order.State getState() {
        return state;
    }
}
