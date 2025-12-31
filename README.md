# 프로그래머스 DDD 학습 프로젝트

> **bep4-1-mission** — DDD(도메인 주도 설계) 학습을 위한 미션 프로젝트

## 진행 현황
- 49강 : Payout 집행 후 결과 저장하는 작업을 배치 잡의 스텝으로 추가 ✅

---

## Project Structure


<summary><b>핵심 패키지 (src/main/java/com/back)</b></summary>

```text
src/main/java/com/back/
├── boundedContext/
│   ├── cash/
│   │   ├── app/
│   │   │   ├── CashCompleteOrderPaymentUseCase.java
│   │   │   ├── CashCompletePayoutUseCase.java
│   │   │   ├── CashCreateWalletUseCase.java
│   │   │   ├── CashFacade.java
│   │   │   ├── CashSupport.java
│   │   │   └── CashSyncMemberUseCase.java
│   │   ├── domain/
│   │   │   ├── CashLog.java
│   │   │   ├── CashMember.java
│   │   │   ├── CashPolicy.java
│   │   │   └── Wallet.java
│   │   ├── in/
│   │   │   ├── ApiV1WalletController.java
│   │   │   ├── CashDataInit.java
│   │   │   └── CashEventListener.java
│   │   ├── out/
│   │       ├── CashMemberRepository.java
│   │       └── WalletRepository.java
│   ├── market/
│   │   ├── app/
│   │   │   ├── MarketCancelOrderRequestPaymentUseCase.java
│   │   │   ├── MarketCompleteOrderPaymentUseCase.java
│   │   │   ├── MarketCreateCartUseCase.java
│   │   │   ├── MarketCreateOrderUseCase.java
│   │   │   ├── MarketCreateProductUseCase.java
│   │   │   ├── MarketFacade.java
│   │   │   ├── MarketSupport.java
│   │   │   └── MarketSyncMemberUseCase.java
│   │   ├── domain/
│   │   │   ├── Cart.java
│   │   │   ├── CartItem.java
│   │   │   ├── MarketMember.java
│   │   │   ├── MarketPolicy.java
│   │   │   ├── Order.java
│   │   │   ├── OrderItem.java
│   │   │   └── Product.java
│   │   ├── in/
│   │   │   ├── ApiV1OrderController.java
│   │   │   ├── MarketDataInit.java
│   │   │   └── MarketEventListener.java
│   │   ├── out/
│   │       ├── CartRepository.java
│   │       ├── MarketMemberRepository.java
│   │       ├── OrderRepository.java
│   │       └── ProductRepository.java
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
│   ├── payout/
│   │   ├── app/
│   │   │   ├── PayoutAddPayoutCandidateItemsUseCase.java
│   │   │   ├── PayoutCollectPayoutItemsMoreUseCase.java
│   │   │   ├── PayoutCompletePayoutsMoreUseCase.java
│   │   │   ├── PayoutCreatePayoutUseCase.java
│   │   │   ├── PayoutFacade.java
│   │   │   ├── PayoutSupport.java
│   │   │   └── PayoutSyncMemberUseCase.java
│   │   ├── domain/
│   │   │   ├── Payout.java
│   │   │   ├── PayoutCandidateItem.java
│   │   │   ├── PayoutEventType.java
│   │   │   ├── PayoutItem.java
│   │   │   ├── PayoutMember.java
│   │   │   └── PayoutPolicy.java
│   │   ├── in/
│   │   │   ├── PayoutCollectItemsAndCompletePayoutsBatchJobConfig.java
│   │   │   ├── PayoutDataInit.java
│   │   │   └── PayoutEventListener.java
│   │   ├── out/
│   │       ├── PayoutCandidateItemRepository.java
│   │       ├── PayoutMemberRepository.java
│   │       └── PayoutRepository.java
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
│   ├── batch/
│   │   └── BatchConfig.java
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
│   │   │   ├── CashMemberDto.java
│   │   │   └── WalletDto.java
│   │   ├── event/
│   │   │   ├── CashMemberCreatedEvent.java
│   │   │   ├── CashOrderPaymentFailedEvent.java
│   │   │   └── CashOrderPaymentSucceededEvent.java
│   │   ├── out/
│   │       └── CashApiClient.java
│   ├── market/
│   │   ├── dto/
│   │   │   ├── MarketMemberDto.java
│   │   │   ├── OrderDto.java
│   │   │   └── OrderItemDto.java
│   │   ├── event/
│   │   │   ├── MarketMemberCreatedEvent.java
│   │   │   ├── MarketOrderPaymentCompletedEvent.java
│   │   │   └── MarketOrderPaymentRequestedEvent.java
│   │   ├── out/
│   │       ├── MarketApiClient.java
│   │       └── TossPaymentsService.java
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
│   ├── payout/
│   │   ├── dto/
│   │   │   ├── PayoutDto.java
│   │   │   └── PayoutMemberDto.java
│   │   ├── event/
│   │       ├── PayoutCompletedEvent.java
│   │       └── PayoutMemberCreatedEvent.java
│   ├── post/
│       ├── dto/
│       │   ├── PostCommentDto.java
│       │   └── PostDto.java
│       ├── event/
│       │   ├── PostCommentCreatedEvent.java
│       │   └── PostCreatedEvent.java
│       ├── out/
│           └── PostApiClient.java
├── standard/
│   ├── modelType/
│   │   └── HasModelTypeCode.java
│   ├── resultType/
│   │   └── ResultType.java
│   ├── util/
│       └── Util.java
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

