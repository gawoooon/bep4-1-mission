# 프로그래머스 DDD 학습 프로젝트

> **bep4-1-mission** — DDD(도메인 주도 설계) 학습을 위한 미션 프로젝트

## 진행 현황
- 31강 : 글 조회를 위해서 PostApiClient 구현 ✅

---

## Project Structure


<summary><b>핵심 패키지 (src/main/java/com/back)</b></summary>

```text
src/main/java/com/back/
├── boundedContext/
│   ├── cash/
│   │   ├── app/
│   │   │   ├── CashCreateWalletUseCase.java
│   │   │   ├── CashFacade.java
│   │   │   ├── CashSupport.java
│   │   │   └── CashSyncMemberUseCase.java
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
│   ├── market/
│   │   ├── app/
│   │   │   ├── MarketFacade.java
│   │   │   └── MarketSyncMemberUseCase.java
│   │   ├── domain/
│   │   │   └── MarketMember.java
│   │   ├── in/
│   │   │   ├── MarketDataInit.java
│   │   │   └── MarketEventListener.java
│   │   ├── out/
│   │       └── MarketMemberRepository.java
│   ├── member/
│   │   ├── app/
│   │   │   ├── MemberFacade.java
│   │   │   ├── MemberGetRandomSecureTipUseCase.java
│   │   │   ├── MemberJoinUseCase.java
│   │   │   └── MemberSupport.java
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
│       │   ├── PostSupport.java
│       │   ├── PostSyncMemberUseCase.java
│       │   └── PostWriteUseCase.java
│       ├── domain/
│       │   ├── Post.java
│       │   ├── PostComment.java
│       │   └── PostMember.java
│       ├── in/
│       │   ├── ApiV1PostController.java
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
│   ├── cash/
│   │   ├── dto/
│   │   │   └── CashMemberDto.java
│   │   ├── event/
│   │       └── CashMemberCreatedEvent.java
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
│       │   ├── PostCommentCreatedEvent.java
│       │   └── PostCreatedEvent.java
│       ├── out/
│           └── PostApiClient.java
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

