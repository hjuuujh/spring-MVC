1. 스프링 MVC 기본 HTTP 요청 매핑 
- Controller/RestController의 차이  
Controller : 응답갓 기본적으로 HTML을 줌  
RestController : 응닶값으로 Rest API 요청에 대한 응답을 주도록 되어있음
- 어노테이션 : @RequestMapping
- 축약형  
@GetMapping : 데이터를 가져옴    
@PostMapping : 데이터를 전송함   
@PutMapping : 전체 수정   
@PatchMapping : 일부 수정   
@DeleteMapping : 삭제    
2. 스프링 MVC HTTP 요청 파라미터 전송
- 파리미터 넘기는 방법
Get, Delete  
PathVariable : 요새는 id를 path에 넣는 것을 선호, @PathVariable("id") String id  
query-params : 추가적인 정보를 입력, 게시판의 검색 필터 페이지에 많이사용, @RequestParam  
@RequstBody : http body의 정보 편리하게 받을 수 있음 -> 자주 사용
