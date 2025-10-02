package au.com.woolworths.android.onesite.deeplink;

import android.os.Bundle;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Function0 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    public /* synthetic */ i(Bundle bundle, String str, String str2, boolean z) {
        this.e = str;
        this.h = bundle;
        this.g = z;
        this.f = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        int i = this.d;
        boolean z2 = this.g;
        String str = this.f;
        String str2 = this.e;
        Object obj = this.h;
        switch (i) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (str2 == null) {
                    return ActivityNavigatorKt.a(Activities.MyOrders.f4491a, ApplicationType.e);
                }
                DeepLinkConfig deepLinkConfig = (DeepLinkConfig) bundle.getParcelable("ShopAppDeepLink.Extras.config");
                if (deepLinkConfig != null) {
                    z = deepLinkConfig.v;
                } else {
                    BaseShopAppFeature baseShopAppFeature = BaseShopAppFeature.d;
                    z = false;
                }
                return (z && z2) ? Activities.AskOliveActivity.b(3, null, null, str) : Activities.OrderDetails.f4496a.b(str2, false);
            default:
                ((Function1) obj).invoke(new WPayForOrderContract.UiEvent.GiftCard.Check(str2, str, !z2));
                return Unit.f24250a;
        }
    }

    public /* synthetic */ i(Function1 function1, String str, String str2, boolean z) {
        this.h = function1;
        this.e = str;
        this.f = str2;
        this.g = z;
    }
}
