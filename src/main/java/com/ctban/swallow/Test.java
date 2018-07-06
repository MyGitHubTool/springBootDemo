package com.ctban.swallow;

import com.ctban.swallow.dto.UserDTO;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author GuoJie 2018/7/5 10:39
 */
public class Test {

    public static void main(String[] args) {
        UserDTO userDTO1 = new UserDTO();
        userDTO1.setUserName("张三");
        userDTO1.setAge(20);

        UserDTO userDTO2 = new UserDTO();
        userDTO2.setUserName("李四");
        userDTO2.setAge(25);

        UserDTO userDTO3 = new UserDTO();
        userDTO3.setUserName("王五");
        userDTO3.setAge(26);

        UserDTO userDTO4 = new UserDTO();
        userDTO4.setUserName("赵六");
        userDTO4.setAge(30);

//        List<UserDTO> userDTOList = Arrays.asList(userDTO1, userDTO2, userDTO3, userDTO4);
//        userDTOList.stream().filter(u -> (u.getAge() > 25)).map(UserDTO::getUserName).sorted(String::compareTo).limit(1).collect(Collectors.toList()).forEach(System.out::println);

        //java中的 时间的用法
        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();
        System.out.println(millis);

        LocalTime localTime = LocalTime.now().withNano(0);
        System.out.println(localTime.withNano(0));

        LocalDate localDate = LocalDate.now();

        LocalDateTime localDateTime = LocalDateTime.now().withNano(0);
        System.out.println(localDate);
        System.out.println(localDateTime);


    }


}
