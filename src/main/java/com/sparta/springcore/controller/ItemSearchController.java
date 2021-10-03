package com.sparta.springcore.controller;

import com.sparta.springcore.dto.ItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;
import com.sparta.springcore.service.ItemSearchService;
import org.springframework.beans.factory.annotation.Autowired;

// 빈 등록을 위한 @Component 설정이 이미 포함된 @Controller 어노테이션 설정
@Controller
// 옆에 커피콩 모양은 스프링 IoC 컨테이너에 의해 관리되는 클래스라는 뜻
// 이 클래스들에서만 Autowired를 적용할 수 있다.
public class ItemSearchController {

    // ItemSearchController의 필수적인 멤버변수로 ItemSearchService를 선언
    private final ItemSearchService itemSearchService;

    // 스프링에 의해 자동으로 의존성이 주입될(DI) @Autowired 어노테이션 설정
    // 스프링에 의해 IoC에서 관리되는 bean이 된다는 것
    // ItemSearchService의 객체를 매개변수(파라미터)로 받는 ItemSearchController의 객체를 생성하는 생성자
    @Autowired
    public ItemSearchController(ItemSearchService itemSearchService) {
        this.itemSearchService = itemSearchService;
    }

    @GetMapping("/api/search")
    @ResponseBody
    public List<ItemDto> getItems(@RequestParam String query) throws IOException {
        List<ItemDto> itemDtoList = itemSearchService.getItems(query);

        return itemDtoList;
    }
}
