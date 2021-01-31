# ddd_practice

## DDD 개념

### Bounded Context
* 의미적으로 동일한 컨텍스트의 범위를 표현하며 이 컨텍스트 안에서 문제를 정의하고 해결한다. 
* 부서 1개 당 최소 1개의 Bounded Context를 할당한다. (적을수록 핵심에 집중할 수 있어 좋다.)
* 각각의 부서는 핵심 과제(최소한 하나의 사업부문)를 핵심 컨텍스트/도메인으로 정의하며 모든 것을 잘하는 것이 중요한게 아닌 핵심 도메인을 잘 풀어내는 것이 더 중요하다.
* 소프트웨어 모델을 소유하는 팀은 Bounded Context 안에서 보편적 언어를 사용하여 의사소통한다.
* 각각의 Bounded Context는 독립적인 소스 코드 리파지토리가 있어야 한다.
* 보편언어를 나눈 것과 같은 방법으로 바운디드 컨텍스트마다 소스 코드와 데이터베이스 스키마도 명확히 분리한다.

#### 예시 - 쇼핑몰
주문, 배송, 정산은 서로 나눌 수 있다.<br>
나눈다는 것은 곧 작은 부서로 쪼갤 수도 있음을 의미한다. ex) 주문 팀, 배송 팀, 정산 팀

