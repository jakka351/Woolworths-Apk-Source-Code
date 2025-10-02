package au.com.woolworths.feature.shop.login;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.base.shopapp.guest.LogOutInteractor;
import au.com.woolworths.feature.shop.login.guest.GuestLoginInteractorImpl;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.shippingcalculator.data.ShippingCalculatorDataStore;
import au.com.woolworths.foundation.wxid.impl.WxidClientImpl;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.shop.lists.data.ListsDataStoreImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/login/LogOutInteractorImpl;", "Lau/com/woolworths/base/shopapp/guest/LogOutInteractor;", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class LogOutInteractorImpl implements LogOutInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final ShopAccountInteractor f7446a;
    public final RewardsAccountInteractor b;
    public final GuestLoginInteractorImpl c;
    public final CollectionModeInteractor d;
    public final CartUpdateInteractor e;
    public final WxidClientImpl f;
    public final SharedPreferences g;
    public final FeatureToggleManager h;
    public final ShippingCalculatorDataStore i;
    public final ListsDataStoreImpl j;

    public LogOutInteractorImpl(ShopAccountInteractor accountInteractor, RewardsAccountInteractor rewardsAccountInteractor, GuestLoginInteractorImpl guestLoginInteractorImpl, CollectionModeInteractor collectionModeInteractor, CartUpdateInteractor cartUpdateInteractor, WxidClientImpl wxidClientImpl, SharedPreferences sharedPreferences, FeatureToggleManager featureToggleManager, ShippingCalculatorDataStore shippingCalculatorDataStore, ListsDataStoreImpl listsDataStoreImpl) {
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(shippingCalculatorDataStore, "shippingCalculatorDataStore");
        this.f7446a = accountInteractor;
        this.b = rewardsAccountInteractor;
        this.c = guestLoginInteractorImpl;
        this.d = collectionModeInteractor;
        this.e = cartUpdateInteractor;
        this.f = wxidClientImpl;
        this.g = sharedPreferences;
        this.h = featureToggleManager;
        this.i = shippingCalculatorDataStore;
        this.j = listsDataStoreImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ef, code lost:
    
        if (r10.j.a(r0) == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.login.LogOutInteractorImpl.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
