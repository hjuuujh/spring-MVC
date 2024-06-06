1. 예외
- 프로그램이 예상치 못한 상황을 만났을 때 오류를 발생시키는 것
- @ExceptionHandler   
컨트롤러 기반 예외처리  
HTTP Status code 변경 : @ResponseStatus, ResponseEntity 활용  
예외처리 우선 순위 : 해당 Exception이 정확히 지정된 Handler -> 해당 Exception의 부모 예외 Handler -> Exception 모든 예외의 부모  
- @RestControllerAdvice
어플리케이션의 전역적인 예외 처리  
REST PAI용으로 객체 응답  
현업에서 가장 많이 사용
