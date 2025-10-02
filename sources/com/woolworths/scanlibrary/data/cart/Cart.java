package com.woolworths.scanlibrary.data.cart;

import com.woolworths.scanlibrary.models.cart.CartResponse;
import com.woolworths.scanlibrary.models.cart.CartStatus;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.models.store.StoreCheckoutInstruction;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/data/cart/Cart;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface Cart {
    Item A();

    List B();

    CartStatus C();

    void D(HashMap map);

    boolean E();

    void F(CartResponse cartResponse);

    List G();

    String H();

    void I(Item item, boolean z);

    boolean J();

    String K();

    ArrayList L();

    boolean M();

    HashMap N();

    StoreCheckoutInstruction O();

    Item P(String str);

    String Q();

    BigDecimal R();

    void a();

    ArrayList c();

    ArrayList getPromotions();

    ArrayList o();

    BigDecimal p();

    boolean s();

    BigDecimal u();

    void v(String str, String str2);

    String w();

    void x(String str);

    void y(List list);

    int z(boolean z);
}
