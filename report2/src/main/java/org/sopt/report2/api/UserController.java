package org.sopt.report2.api;

import org.sopt.report2.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@RestController
//@RequestMapping("post")
public class UserController {
    private final static List<User> userList = new LinkedList<>();

    //현재시간 반환
    @GetMapping("/")
    public Date getCurrentTime() {
        Date today = new Date();
        return today;
        //return new Date().toString();
    }

    /**
     * 모든 회원 리스트 조회
     *
     * @return 회원 리스트
     */

    @GetMapping("/users")
    public String getSearch(@RequestParam(value = "name", defaultValue = "이름") final String name,
                            @RequestParam(value = "part", defaultValue = "파트") final String part) {

        if (name.equals("") && part.equals("")) {
            String list = "";
            for (User u : userList) {
                list += u.toString() + "\n";
            }
            return list;
        } else if (name.equals("")) {
            //같은 파트트의 회원이 있는지 검색, 있으면 회원 데이터 반환, 없으면 없습니다 반환
            for (User u : userList) {
                if (u.getPart().equals(part)) return u.toString();
                else return "없습니다.";
            }
        } else {
            //같은 이름의 회원이 있는지 검색, 있으면 회원 데이터 반환, 없으면 없습니다 반환
            for (User u : userList) {
                if (u.getName().equals(name)) return u.toString();
                else return "없습니다.";
            }
        }
        return name;
    }

    @GetMapping("/users/{userIdx}")
    public String getUserSearch(@PathVariable(value = "user_idx") final int user_idx) {
        for (User u : userList) {
            if (u.getUser_idx() == user_idx) return u.toString();
        }
        return "없습니다.";
    }

    //회원 저장
    @PostMapping("/users")
    public String postUser(@RequestBody final User user) {
        userList.add(user);
        return user.getName();
    }

    //회원 정보 수정
    @PutMapping("/users/{user_idx}")
    public String putUser(@PathVariable(value = "user_idx") final int user_idx,
                          @RequestBody final User user) {
        for (User u : userList) {
            if (u.getUser_idx() == user_idx) {
                userList.remove(u);
                userList.add(user);
            }
        }
        return "fail update";
    }

    //회원 삭제
    @DeleteMapping("/users/{user_idx}")
    public String deleteUser(@PathVariable(value = "user_idx") final int user_idx,
                             @RequestBody final User user) {

        for (User u : userList) {
            if (u.getUser_idx() == user_idx) {
                userList.remove(u);
            }
        }
        return "delete Success";
    }


}
