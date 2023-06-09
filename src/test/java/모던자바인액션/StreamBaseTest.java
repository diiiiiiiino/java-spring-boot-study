package 모던자바인액션;

import 모던자바인액션.model.Dish;
import 모던자바인액션.model.Trader;
import 모던자바인액션.model.Transaction;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;

public abstract class StreamBaseTest {
    protected List<Dish> menu;
    protected TestMock testMock;

    StreamBaseTest() {
        menu = getDishes();
        testMock = mock(TestMock.class);
    }

    List<Dish> getDishes() {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 801, Dish.Type.MEAT),
                new Dish("pork", false, 802, Dish.Type.MEAT),
                new Dish("pork", false, 803, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 550, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 530, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH));

        return menu;
    }

    List<Transaction> getTransaction() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        return transactions;
    }

    class TestMock{
        void print(String str){
            System.out.println(str);
        }
    }
}
