package com.woolworths.scanlibrary.data.cart;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.models.store.Store;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/data/cart/SngShoppingSessionImpl;", "Lcom/woolworths/scanlibrary/data/cart/SngShoppingSession;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SngShoppingSessionImpl implements SngShoppingSession {

    /* renamed from: a, reason: collision with root package name */
    public Cart f21156a;
    public Store b;

    @Override // com.woolworths.scanlibrary.data.cart.SngShoppingSession
    public final Integer a() throws NumberFormatException {
        String strW;
        int no;
        Store store = this.b;
        if (store != null) {
            no = store.getNo();
        } else {
            Cart cart = this.f21156a;
            if (cart == null || (strW = cart.w()) == null) {
                return null;
            }
            no = Integer.parseInt(strW);
        }
        return Integer.valueOf(no);
    }

    @Override // com.woolworths.scanlibrary.data.cart.SngShoppingSession
    /* renamed from: r, reason: from getter */
    public final Cart getF21156a() {
        return this.f21156a;
    }

    @Override // com.woolworths.scanlibrary.data.cart.SngShoppingSession
    public final void s() {
        this.f21156a = null;
        this.b = null;
    }

    @Override // com.woolworths.scanlibrary.data.cart.SngShoppingSession
    public final void t(Store store, Cart cart) {
        Intrinsics.h(store, "store");
        this.f21156a = cart;
        this.b = store;
    }
}
