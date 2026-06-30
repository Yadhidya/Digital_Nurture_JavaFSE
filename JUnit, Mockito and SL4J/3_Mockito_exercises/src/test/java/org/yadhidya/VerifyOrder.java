package org.yadhidya;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;
public class VerifyOrder {

    @Test
    void verifyOrder(){

        ExternalApi api =
                mock(ExternalApi.class);

        api.login();

        api.fetch();

        api.logout();

        InOrder order =
                inOrder(api);

        order.verify(api).login();

        order.verify(api).fetch();

        order.verify(api).logout();

    }
}
