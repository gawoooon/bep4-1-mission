package com.back.boundedContext.member.app;

import com.back.boundedContext.member.domain.Member;
import com.back.global.rsData.RsData;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class MemberFacade {

    private final MemberJoinUseCase memberJoinUsecase;
    private final MemberSupport memberSupport;
    private final MemberGetRandomSecureTipUseCase memberGetRandomSecureTipUseCase;

    @Transactional(readOnly = true)
    public long count() {
        return memberSupport.count();
    }

    @Transactional
    public RsData<Member> join(String username, String password, String nickname) {
        return memberJoinUsecase.join(username, password, nickname);
    }

    @Transactional(readOnly = true)
    public Optional<Member> findByUsername(String username) {
        return memberSupport.findByUsername(username);
    }

    @Transactional(readOnly = true)
    public Optional<Member> findById(int id){
        return memberSupport.findById(id);
    }

    public String getRandomSecureTip() {
        return memberGetRandomSecureTipUseCase.getRandomSecureTip();
    }
}