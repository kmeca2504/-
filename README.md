# 맛집 리뷰서비스 제작
맛집을 관리하며, 사용자들이 맛집에 방문한 이후에 리뷰를 작성해 다른 사용자들이 맛집을 방문하기전 리뷰와 평균별점을 확인할 수 있도록 하는 서비스이다. 위 서비스에서는 맛집을 등록하고 수정하고 삭제할 수 있으며, 맛집마다 리뷰를 작성하거나 삭제할 수 있다. 맛집은 이름, 주소, 메뉴를 가지고 있으며 메뉴는 이름과 가격으로 구성된다. 리뷰는 본문과 별점을 갖고 있다. 맛집은 여러개의 메뉴와 리뷰를 가질 수 있으며, 리뷰는 메뉴별로는 작성이 불가능하다.
## 요구사항 분석
User Flow 
* 맛집을 등록할 수 있다.
* 맛집을 수정할 수 있다.
* 맛집을 삭제할 수 있다.
* 맛집에 리뷰를 작성할 수 있다.
* 맛집에 작성한 리뷰를 삭제할 수 있다.
* 맛집에 작성된 리뷰와 평균 별점을 확인할 수 있다.

DATA
* 맛집
 * 이름(String)
 * 주소(String)
 * N개의 메뉴
   * 이름(Stirng)
   * 가격(Number)
 * N개의 리뷰
   * 본문(String)
   * 별점(Number)


## API SPEC (API 스펙 확인하기)
* 맛집 리스트 가져오기 API

```javaScript

GET /restaurants

// response
[
  {
    "id": Long,
    "name": string,
    "address": string,
    "createdAt": string,
    "updatedAt": string
  },
  ...
}

```


  
