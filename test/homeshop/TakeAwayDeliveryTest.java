package homeshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TakeAwayDeliveryTest {
    @Test
    public void Given_FreeRelay_WhenGettingDeliveryPrice_ThenGet0e() {
        Delivery delivery = new RelayDelivery();
    }

}