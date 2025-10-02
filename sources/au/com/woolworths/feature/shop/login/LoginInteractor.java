package au.com.woolworths.feature.shop.login;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.appdata.AppConfigurationInteractor;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.feature.shop.modeselector.ShoppingModeInteractor;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.wxid.impl.WxidClientImpl;
import au.com.woolworths.shop.auth.AuthInteractor;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/login/LoginInteractor;", "", "Companion", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LoginInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final DispatcherProvider f7452a;
    public final AuthInteractor b;
    public final RewardsAccountInteractor c;
    public final ShopAccountInteractor d;
    public final AppConfigurationInteractor e;
    public final TrolleyInteractor f;
    public final CollectionModeInteractor g;
    public final ShoppingModeInteractor h;
    public final WxidClientImpl i;
    public final FeatureToggleManager j;
    public final ShopAppRegionInteractor k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/login/LoginInteractor$Companion;", "", "", "ADOBE_SHOPPER_ID_TYPE", "Ljava/lang/String;", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Region.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Region.Companion companion = Region.h;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public LoginInteractor(DispatcherProvider dispatcherProvider, AuthInteractor shopAuthInteractor, RewardsAccountInteractor rewardsAccountInteractor, ShopAccountInteractor accountInteractor, AppConfigurationInteractor appConfigurationInteractor, TrolleyInteractor trolleyInteractor, CollectionModeInteractor collectionModeInteractor, ShoppingModeInteractor shoppingModeInteractor, WxidClientImpl wxidClientImpl, FeatureToggleManager featureToggleManager, ShopAppRegionInteractor shopAppRegionInteractor) {
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(shopAuthInteractor, "shopAuthInteractor");
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(appConfigurationInteractor, "appConfigurationInteractor");
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(shoppingModeInteractor, "shoppingModeInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        this.f7452a = dispatcherProvider;
        this.b = shopAuthInteractor;
        this.c = rewardsAccountInteractor;
        this.d = accountInteractor;
        this.e = appConfigurationInteractor;
        this.f = trolleyInteractor;
        this.g = collectionModeInteractor;
        this.h = shoppingModeInteractor;
        this.i = wxidClientImpl;
        this.j = featureToggleManager;
        this.k = shopAppRegionInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r1 == r3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c0, code lost:
    
        if (kotlinx.coroutines.BuildersKt.f(r4, r7, r2) != r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.login.LoginInteractor.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
