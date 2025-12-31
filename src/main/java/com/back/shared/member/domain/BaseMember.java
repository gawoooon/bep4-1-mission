package com.back.shared.member.domain;

import static lombok.AccessLevel.PROTECTED;

import com.back.global.jpa.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass // ✅ 이 클래스는 "테이블"로 만들지 않고, 필드만 자식 엔티티 컬럼으로 상속시켜 포함시킴(JPA 공통 베이스)
@Getter
@Setter(value = PROTECTED) // ✅ Lombok: setter를 protected로만 생성(외부에서 막고 상속/패키지 내부에서만 수정 허용)
@NoArgsConstructor        // ✅ Lombok: JPA가 리플렉션으로 엔티티 생성할 때 필요한 기본 생성자 자동 생성
public abstract class BaseMember extends BaseEntity {
    //BaseMember : Member의 공통 로직

    @Column(unique = true)
    private String username;
    private String password;
    private String nickname;
    private int activityScore;

    public BaseMember(String username, String password, String nickname, int activityScore) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.activityScore = activityScore;
    }

    public boolean isSystem() {
        return "system".equals(username);
    }
}