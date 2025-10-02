package com.woolworths.scanlibrary.di.session;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.data.cart.Cart;
import com.woolworths.scanlibrary.models.store.Store;
import dagger.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/di/session/CartSessionModule;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes7.dex */
public final class CartSessionModule {

    /* renamed from: a, reason: collision with root package name */
    public final Store f21167a;
    public final Cart b;

    public CartSessionModule(Store currentStore, Cart cart) {
        Intrinsics.h(currentStore, "currentStore");
        this.f21167a = currentStore;
        this.b = cart;
    }
}
