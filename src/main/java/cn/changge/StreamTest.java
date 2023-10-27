package cn.changge;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @BelongsProject: streamtest
 * @BelongsPackage: cn.changge.StreamTest
 * @Author: WangXi
 * @CreateTime: 2023-10-24  19:04
 * @Description: TODO
 * @Version: 1.0
 */
public class StreamTest {
    @Test
    public void test1(){
        List<Integer> list = Arrays.asList(1, 3, 2, 8, 11, 4);
        // 求和方式1
//        Optional<Integer> sum = list.stream().reduce((x, y) -> x + y);
//        System.out.println(sum.get());
        Optional<Integer> reduce = list.stream().reduce(Integer::sum);
        System.out.println(reduce.get());


    }
}
