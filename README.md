# 프로그래머스 DDD 학습 프로젝트

> **bep4-1-mission** — DDD(도메인 주도 설계) 학습을 위한 미션 프로젝트

## 진행 현황
- **10강 : MemberPolicy 도입** ✅

---

## Project Structure


<summary><b>핵심 패키지 (src/main/java/com/back)</b></summary>

```text
src/main/java/com/back
├── BackApplication.java
├── boundedContext
│   ├── member
│   │   ├── app
│   │   │   ├── MemberFacade.java
│   │   │   └── MemberJoinUseCase.java
│   │   ├── domain
│   │   │   ├── Member.java
│   │   │   └── MemberPolicy.java
│   │   ├── in
│   │   │   └── MemberEventListener.java
│   │   └── out
│   │       └── MemberRepository.java
│   └── post
│       ├── app
│       │   ├── PostFacade.java
│       │   └── PostWriteUseCase.java
│       ├── domain
│       │   ├── Post.java
│       │   └── PostComment.java
│       └── out
│           └── PostRepository.java
└── global
    ├── event
    │   └── EventPublisher.java
    ├── exception
    │   └── DomainException.java
    ├── initData
    │   └── DataInit.java
    ├── jpa
    │   └── entity
    │       ├── BaseEntity.java
    │       └── BaseIdAndTime.java
    └── shared
        └── post
            ├── dto
            │   ├── PostCommentDto.java
            │   └── PostDto.java
            └── event
                ├── PostCommentCreatedEvent.java
                └── PostCreatedEvent.java
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

