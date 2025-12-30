package com.back.boundedContext.payout.app;


import com.back.boundedContext.payout.domain.PayoutMember;
import com.back.boundedContext.payout.out.PayoutMemberRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PayoutSupport {
    private final PayoutMemberRepository payoutMemberRepository;

    public Optional<PayoutMember> findHolingMember() {
        return payoutMemberRepository.findByUsername("holding");
    }

    public Optional<PayoutMember> findMemberById(int id) {
        return payoutMemberRepository.findById(id);
    }
}
