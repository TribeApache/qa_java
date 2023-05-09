import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("�����", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualResult = lion.getKittens();
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFoodReturnFelineList() throws Exception {
        List<String> felineFood = List.of("��������", "�����", "����");
        Feline feline = new Feline();
        String sex = "�����";
        Lion lion = new Lion(sex, feline);
        assertEquals(felineFood, lion.getFood());
    }
    @Test
    public void getFoodCallEatMeat() throws Exception {
        String sex = "�����";
        Lion lion = new Lion(sex, feline);
        lion.getFood();
        Mockito.verify(feline).eatMeat();
    }

    @Test
    public void lionCheckForSexOfAnimal() {
        String exceptionExpectedMessage = "����������� ���������� �������� ���� ��������� - ����� ��� �����";
        Exception trowException = Assert.assertThrows(Exception.class, () -> new Lion("����������", feline));
        Assert.assertEquals(trowException.getMessage(), exceptionExpectedMessage);
    }
}
