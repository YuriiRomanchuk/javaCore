package core.task11;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AccessPointTest {


    @Mock
    private LinePeriodCalculator linePeriodCalculator;
    @Mock
    private MessageController messageController;

    @InjectMocks
    LinePeriodCalculator linePeriodCalculator1 = new LinePeriodCalculator();

    @Test
    public void startProgram() {

        String line = "absabsabs";

        when(messageController.receiveVerifiableLine()).thenReturn(line);

        AccessPoint accessPoint = new AccessPoint(messageController, linePeriodCalculator);
        accessPoint.startProgram();


        verify(messageController).receiveVerifiableLine();
        /* doReturn(6).when(linePeriodCalculator).receiveMinimumLinePeriod(line);*/
        verify(linePeriodCalculator).receiveMinimumLinePeriod(line);

        Assert.assertEquals(linePeriodCalculator1.receiveMinimumLinePeriod(line), 3, 0);
    }
}