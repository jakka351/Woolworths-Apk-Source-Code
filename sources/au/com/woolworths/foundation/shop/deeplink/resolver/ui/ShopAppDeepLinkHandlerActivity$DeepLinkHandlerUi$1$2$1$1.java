package au.com.woolworths.foundation.shop.deeplink.resolver.ui;

import android.content.Intent;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.foundation.shop.deeplink.resolver.Screens;
import au.com.woolworths.foundation.shop.deeplink.resolver.ShopAppDeepLinkContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class ShopAppDeepLinkHandlerActivity$DeepLinkHandlerUi$1$2$1$1 extends AdaptedFunctionReference implements Function2<ShopAppDeepLinkContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ShopAppDeepLinkContract.Actions actions = (ShopAppDeepLinkContract.Actions) obj;
        ShopAppDeepLinkHandlerActivity shopAppDeepLinkHandlerActivity = (ShopAppDeepLinkHandlerActivity) this.d;
        int i = ShopAppDeepLinkHandlerActivity.G;
        shopAppDeepLinkHandlerActivity.getClass();
        if (actions instanceof ShopAppDeepLinkContract.Actions.LaunchDeepLink) {
            Intent intentA = ShopAppDeepLink.a(Screens.d, ((ShopAppDeepLinkContract.Actions.LaunchDeepLink) actions).f8707a);
            shopAppDeepLinkHandlerActivity.finish();
            shopAppDeepLinkHandlerActivity.startActivity(intentA);
        } else if (actions instanceof ShopAppDeepLinkContract.Actions.LaunchFallbackDeepLinkIntent) {
            Intent intent = ((ShopAppDeepLinkContract.Actions.LaunchFallbackDeepLinkIntent) actions).f8708a;
            shopAppDeepLinkHandlerActivity.finish();
            shopAppDeepLinkHandlerActivity.startActivity(intent);
        } else if (actions instanceof ShopAppDeepLinkContract.Actions.LaunchSplashScreen) {
            if (shopAppDeepLinkHandlerActivity.isTaskRoot()) {
                shopAppDeepLinkHandlerActivity.startActivity(ActivityNavigatorKt.a(Activities.ShopAppSplash.f4530a, ApplicationType.e));
            }
            shopAppDeepLinkHandlerActivity.finish();
        } else {
            if (!(actions instanceof ShopAppDeepLinkContract.Actions.FinishActivity)) {
                throw new NoWhenBranchMatchedException();
            }
            shopAppDeepLinkHandlerActivity.finish();
        }
        return Unit.f24250a;
    }
}
