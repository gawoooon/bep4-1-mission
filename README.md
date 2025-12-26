# 프로그래머스 DDD 학습 프로젝트

> **bep4-1-mission** — DDD(도메인 주도 설계) 학습을 위한 미션 프로젝트

## 진행 현황
- 25강 : user1 회원의 지갑에 15만원, 10만원, 5만원 입금, user2 회원의 지갑에 15만원 입금 ✅

---

## Project Structure


<summary><b>핵심 패키지 (src/main/java/com/back)</b></summary>

```text
src/main/java/com/back/
├── boundedContext/
│   ├── cash/
│   │   ├── app/
│   │   │   └── CashFacade.java
│   │   ├── domain/
│   │   │   ├── CashLog.java
│   │   │   ├── CashMember.java
│   │   │   └── Wallet.java
│   │   ├── in/
│   │   │   ├── CashDataInit.java
│   │   │   └── CashEventListener.java
│   │   ├── out/
│   │       ├── CashMemberRepository.java
│   │       └── WalletRepository.java
│   ├── member/
│   │   ├── app/
│   │   │   ├── MemberFacade.java
│   │   │   └── MemberJoinUseCase.java
│   │   ├── domain/
│   │   │   ├── Member.java
│   │   │   └── MemberPolicy.java
│   │   ├── in/
│   │   │   ├── ApiV1MemberController.java
│   │   │   ├── MemberDataInit.java
│   │   │   └── MemberEventListener.java
│   │   ├── out/
│   │       └── MemberRepository.java
│   ├── post/
│       ├── app/
│       │   ├── PostFacade.java
│       │   └── PostWriteUseCase.java
│       ├── domain/
│       │   ├── Post.java
│       │   ├── PostComment.java
│       │   └── PostMember.java
│       ├── in/
│       │   ├── PostDataInit.java
│       │   └── PostEventListener.java
│       ├── out/
│           ├── PostMemberRepository.java
│           └── PostRepository.java
├── global/
│   ├── event/
│   │   └── EventPublisher.java
│   ├── exception/
│   │   └── DomainException.java
│   ├── global/
│   │   └── GlobalConfig.java
│   ├── jpa/
│   │   ├── entity/
│   │       ├── BaseEntity.java
│   │       ├── BaseIdAndTime.java
│   │       ├── BaseIdAndTimeManual.java
│   │       └── BaseManualIdAndTime.java
│   ├── rsData/
│       └── RsData.java
├── shared/
│   ├── member/
│   │   ├── domain/
│   │   │   ├── BaseMember.java
│   │   │   ├── ReplicaMember.java
│   │   │   └── SourceMember.java
│   │   ├── dto/
│   │   │   └── MemberDto.java
│   │   ├── event/
│   │   │   ├── MemberJoinedEvent.java
│   │   │   └── MemberModifiedEvent.java
│   │   ├── out/
│   │       └── MemberApiClient.java
│   ├── post/
│       ├── dto/
│       │   ├── PostCommentDto.java
│       │   └── PostDto.java
│       ├── event/
│           ├── PostCommentCreatedEvent.java
│           └── PostCreatedEvent.java
└── BackApplication.java



```




<summary><b>기타 (설정/리소스 등)</b></summary>

```text
bep4-1-mission
├── build.gradle
├── settings.gradle
├── gradle/wrapper/...
├── gradlew*
├── src/main/resources
│   ├── application.yml
│   ├── application-dev.yml
│   └── application.properties
└── src/test/...
```

