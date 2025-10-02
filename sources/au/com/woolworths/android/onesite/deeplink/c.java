package au.com.woolworths.android.onesite.deeplink;

import android.content.Intent;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import kotlin.jvm.functions.Function0;
import me.oriient.ipssdk.ips.IPSContent;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    public /* synthetic */ c(String str, String str2, int i) {
        this.d = i;
        this.e = str;
        this.f = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return ShopAppDeepLinkDispatchDefinition.c(Activities.ContentPage.ContentPageType.j, this.e, this.f);
            case 1:
                return Activities.ProductList.f4505a.b(new Activities.ProductList.Extras(new Activities.ProductList.ExtrasPageData(this.e, null), new Activities.ProductList.ExtrasByPastShop(this.f, Activities.ProductList.ProductListType.s), (Activities.ProductList.ExtrasConfig) null, 4), false);
            case 2:
                Intent intentA = ActivityNavigatorKt.a(Activities.CopyToClipboardActionActivity.f4462a, ApplicationType.e);
                intentA.putExtra("EXTRA_DATA", new Activities.CopyToClipboardActionActivity.Extras(this.e, this.f));
                return intentA;
            case 3:
                return IPSContent.lambda$getProductLocation$0(this.e, this.f);
            default:
                return IPSContent.lambda$getCategoryLocation$1(this.e, this.f);
        }
    }
}
