# coding-test

코딩테스트 연습용 Java 프로젝트 (빌드 도구 없이 IntelliJ 단일 모듈 실행).

## 폴더 구조

프로그래머스 문제를 알고리즘 유형별 → 문제별로 분리해서 관리. 푼 문제는 지우지 않고 계속 기록으로 남김.

```
src/
├── programmers/
│   ├── hash/
│   │   ├── incomplete_runner/        # 완주하지 못한 선수 (문제 하나 = 폴더 하나: Solution.java + Main.java)
│   │   ├── ponkemon/                 # 폰켓몬
│   │   ├── phone_book/               # 전화번호 목록
│   │   ├── clothes/                  # 의상
│   │   └── best_album/               # 베스트앨범
│   ├── sort/
│   │   ├── kth_number/               # K번째수
│   │   └── biggest_number/           # 가장 큰 수
│   └── dfsbfs/
│       ├── target_number/            # 타겟 넘버
│       ├── game_map_shortest_path/   # 게임 맵 최단거리
│       └── word_conversion/          # 단어 변환
└── practice/       # 문법 테스트 등 자유 연습용 sandbox (Scratch.java)
```

## 규칙

- 새 문제를 풀 때: `programmers/<유형>/<문제이름>/` 폴더 생성 → `Solution.java`(제출용 풀이) + `Main.java`(예제 검증용 실행 파일) 작성
  - 폴더명은 문제 번호 없이, 무슨 문제인지 바로 알 수 있는 영문 snake_case 이름 (예: `phone_book`, `game_map_shortest_path`)
  - 기존 문제 폴더는 덮어쓰거나 지우지 않음
- 새 유형이면 `programmers/` 밑에 유형 폴더(`stack`, `dp`, `greedy` 등)를 먼저 생성
- 각 파일 맨 위에 폴더 경로와 일치하는 `package` 선언 필수 (예: `programmers/hash/phone_book/Main.java` → `package programmers.hash.phone_book;`)
  - 이유: package가 다르지 않으면 다른 폴더의 `Main`/`Solution`과 클래스명이 겹쳐 IntelliJ가 "중복된 클래스" 에러를 냄
  - package는 로컬 실행에만 쓰이고 프로그래머스 제출 시 복붙 안 하는 부분이라 제출에는 영향 없음
- `practice/Scratch.java`는 패키지 선언이 불가능한 IntelliJ 축약 소스 파일(JEP 445) 문법이라 예외적으로 package 없이 유지 (그래서 파일명도 `Main`이 아닌 `Scratch`로 구분)
