package com.woolworths.scanlibrary.domain.cart;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.scanlibrary.data.ScanNGoRepository;
import com.woolworths.scanlibrary.data.authentication.AuthenticatedUser;
import com.woolworths.scanlibrary.data.authentication.DefaultLocalTokenProvider;
import com.woolworths.scanlibrary.data.cart.Cart;
import com.woolworths.scanlibrary.data.cart.CartImp;
import com.woolworths.scanlibrary.data.cart.SessionInfo;
import com.woolworths.scanlibrary.data.cart.SngShoppingSession;
import com.woolworths.scanlibrary.di.ComponentManager;
import com.woolworths.scanlibrary.di.session.CartSessionComponent;
import com.woolworths.scanlibrary.di.session.CartSessionModule;
import com.woolworths.scanlibrary.models.store.Store;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/cart/CartSessionManager;", "Lcom/woolworths/scanlibrary/di/ComponentManager;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CartSessionManager extends ComponentManager {
    public final ScanNGoRepository e;
    public final SessionInfo f;
    public final DefaultLocalTokenProvider g;
    public final CartSessionComponent.Builder h;
    public final SngShoppingSession i;
    public boolean j;
    public CartSessionComponent k;
    public Cart l;

    public CartSessionManager(ScanNGoRepository scanNGoRepository, AuthenticatedUser authenticatedUser, SessionInfo sessionInfo, DefaultLocalTokenProvider defaultLocalTokenProvider, CartSessionComponent.Builder builder, SngShoppingSession sngShoppingSession) {
        Intrinsics.h(sessionInfo, "sessionInfo");
        Intrinsics.h(sngShoppingSession, "sngShoppingSession");
        this.e = scanNGoRepository;
        this.f = sessionInfo;
        this.g = defaultLocalTokenProvider;
        this.h = builder;
        this.i = sngShoppingSession;
    }

    public static boolean e(CartSessionManager cartSessionManager, String str, int i) {
        CartImp cartImp = new CartImp();
        String str2 = (i & 2) != 0 ? "" : str;
        boolean zD = StringsKt.D(cartSessionManager.g.a());
        SessionInfo sessionInfo = cartSessionManager.f;
        if (zD || (sessionInfo.b() == -1)) {
            return false;
        }
        Timber.f27013a.h("Starting user shopping session", new Object[0]);
        Store store = new Store((String) sessionInfo.b.getValue(sessionInfo, SessionInfo.k[1]), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, sessionInfo.b(), null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, null, 0, null, false, -67108866, 31, null);
        cartImp.c = str2;
        cartSessionManager.d(store, cartImp);
        return true;
    }

    @Override // dagger.android.HasAndroidInjector
    public final AndroidInjector B() {
        if (!this.j && !e(this, null, 3)) {
            return null;
        }
        DispatchingAndroidInjector dispatchingAndroidInjector = this.d;
        if (dispatchingAndroidInjector != null) {
            return dispatchingAndroidInjector;
        }
        Intrinsics.p("androidInjector");
        throw null;
    }

    @Override // com.woolworths.scanlibrary.di.ComponentManager
    public final boolean a() {
        return this.k != null || e(this, null, 3);
    }

    public final void b() {
        this.f.a();
        this.k = null;
        this.j = false;
        this.l = null;
        this.i.s();
    }

    public final String c() {
        Cart cart;
        if (!a() || (cart = this.l) == null) {
            return null;
        }
        return cart.getC();
    }

    public final void d(Store store, Cart cart) {
        CartSessionModule cartSessionModule = new CartSessionModule(store, cart);
        CartSessionComponent.Builder builder = this.h;
        builder.a(cartSessionModule);
        CartSessionComponent cartSessionComponentBuild = builder.build();
        this.k = cartSessionComponentBuild;
        cartSessionComponentBuild.a(this);
        this.j = true;
        this.l = cart;
        this.i.t(store, cart);
    }
}
