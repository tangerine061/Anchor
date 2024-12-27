# 사용자 요청 기반, 소셜미디어콘텐츠 분석서비스 (앵커 Anchor)
- 웹을 이용한 인물 또는 단체의 요약 정보 제공에 특화된 검색 엔진 서비스
- 팀 규모: 3명
- 
**만든 목적**
- 화제 인물 또는 사건에 대한 요약 정보를 한 눈에 제공

**일정**
- 24.09.10 ~ 24.12.17

**개인 역할 및 참여도**
- **백엔드 개발 (50% 기여)**
- Spring Boot 기반 서버 설계 및 개발.  
- 데이터베이스 설계 및 연동 (MySQL 사용).  
- 외부 Flask 서버와 통신하여 키워드 추출 데이터 처리 및 저장.  
- RESTful API 설계 및 구현.
- AWS EC2를 사용해 서버를 배포.

# 사용 기술 및 개발 환경
- 언어: Java, Python
- 프레임워크: Spring Boot, Flask
- 데이터베이스: MySQL 8.0
- 개발 환경: Ubuntu, IntelliJ IDEA, AWS EC2
- 빌드 도구: Gradle 8.2
- 기타: GitHub

# 내용
**실행 화면 예시**

![실행화면예시](https://github.com/user-attachments/assets/e15c2820-da1a-45f1-bdd1-09f37a6a076b)

![최종결과물](https://github.com/user-attachments/assets/a43d97d4-e35c-4faf-bda3-f119bc3e2efe)


**정보 제공 흐름도**

![image](https://github.com/user-attachments/assets/e694a617-a0b0-44b5-ac24-dce269cbea98)
![image](https://github.com/user-attachments/assets/db103286-9941-4b88-9069-5371dc308ae4)

*(해당 인물명으로 검색되는 유튜브 채널의 콘텐츠/코멘트 텍스트 데이터를 관련성, 최신순, 인기순 기준으로 선별)*
