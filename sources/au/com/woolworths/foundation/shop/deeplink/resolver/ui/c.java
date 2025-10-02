package au.com.woolworths.foundation.shop.deeplink.resolver.ui;

import android.content.Intent;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.foundation.shop.deeplink.resolver.ShopAppDeepLinkHandlerViewModel;
import com.airbnb.deeplinkdispatch.DeepLinkResult;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj = this.e;
        switch (i) {
            case 0:
                ShopAppDeepLinkHandlerActivity shopAppDeepLinkHandlerActivity = (ShopAppDeepLinkHandlerActivity) obj;
                int i2 = ShopAppDeepLinkHandlerActivity.G;
                if (shopAppDeepLinkHandlerActivity.isTaskRoot()) {
                    shopAppDeepLinkHandlerActivity.startActivity(ActivityNavigatorKt.a(Activities.ShopAppSplash.f4530a, ApplicationType.e));
                }
                shopAppDeepLinkHandlerActivity.finish();
                return unit;
            case 1:
                ShopAppDeepLinkHandlerActivity shopAppDeepLinkHandlerActivity2 = (ShopAppDeepLinkHandlerActivity) obj;
                int i3 = ShopAppDeepLinkHandlerActivity.G;
                ShopAppDeepLinkHandlerViewModel shopAppDeepLinkHandlerViewModel = (ShopAppDeepLinkHandlerViewModel) shopAppDeepLinkHandlerActivity2.D.getD();
                DeepLinkResult deepLinkResult = shopAppDeepLinkHandlerActivity2.F;
                if (deepLinkResult == null) {
                    Intrinsics.p(lqlqqlq.m006Dm006Dm006Dm);
                    throw null;
                }
                Intent intent = shopAppDeepLinkHandlerActivity2.getIntent();
                shopAppDeepLinkHandlerViewModel.p6(deepLinkResult, intent != null ? intent.getData() : null, null);
                return unit;
            default:
                return Float.valueOf(((Number) ((LottieAnimationState) obj).getD()).floatValue());
        }
    }
}
