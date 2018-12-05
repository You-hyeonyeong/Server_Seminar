# POKEMON 도감

## 도감 등록

| 메소드 | 경로      | 설명     |
| ------ | --------- | -------- |
| POST   | /pokemons | 도감등록 |

### 요청헤더

```
Content-Type : multipart/form-data

```
### 요청바디
```
{
    "name" : "피카츄",
    "type" : "메인",
    "icon" : "피카츄사진"
}
```

* 등록성공

```
{
    "status" : 201,
    "message" : "등록성공",
    "data" : null
}
```

* 등록실패

```
{
    "status" : 400,
    "message" : "등록실패",
    "data" : null
}
```

* DB에러

```
{
    "status" : 600,
    "message" : "DB에러",
    "data" : null
}
```

## 도감 조회

| 메소드 | 경로                    | 설명      |
| ------ | ----------------------- | --------- |
| GET    | /pokemons/{pokemon_idx} | 도감 조회 |

### 요청헤더

```
Content-Type : multipart/form-data
Authorization : token
```

### 응답바디

* 도감 조회
```json
{
    "status" : 201,
    "message" : "도감 조회 성공",
    "data" : {
        "id" : 1,
        "name" : "치코리타",
        "icon" : "치코리타 아이콘",
        "type" : "풀"
    }
}
```

* DB에러

```json
{
    "status" : 500,
    "message" : "도감 조회 실패",
    "data" : null
}
```

## 도감 수정

| 메소드 | 경로                    | 설명      |
| ------ | ----------------------- | --------- |
| PUT    | /pokemons/{pokemon_idx} | 도감 수정 |

### 요청헤더

```
Content-Type : multipart/form-data
Authorization : token
```

### 요청 바디

```
{
    "name" : "피카츄",
    "type" : "메인",
    "icon" : "피카츄사진"
}
```

### 응답 바디

* 도감 수정 성공

```
{
    "status" : 201,
    "message" : "도감 수정 성공",
    "data" : null
}
```

* 도감 수정 실패

```
{
    "status" : 401,
    "message" : "도감 수정 실패",
    "data" : null
}
```

* 서버 내부 오류

```
{
    "status" : 500,
    "message" : "서버 내부 오류",
    "data" : null
}
```

## 도감 삭제

| 메소드 | 경로                   | 설명      |
| ------ | ---------------------- | --------- |
| DELETE | /pokemon/{pokemon_idx} | 도감 삭제 |

### 요청헤더

```
Content-Type : application/json
```

### 응답바디

* 도감 삭제 성공

```
{
    "status" : 201,
    "message" : "도감 삭제 성공",
    "data" : null
}
```

* 없는 도감 삭제

```
{
    "status": 404,
    "message": "도감이 존재하지 않습니다.",
    "data": null
}
```

* 서버 내부 오류

```
{
    "status": 500,
    "message": "서버 내부 에러",
    "data": null
}
```

