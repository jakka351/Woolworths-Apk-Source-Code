package au.com.woolworths.feature.shop.contentpage;

import au.com.woolworths.analytics.supers.dynamicpage.ContentPageAnalytics;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ContentPageViewModel e;
    public final /* synthetic */ String f;
    public final /* synthetic */ ProductCard g;

    public /* synthetic */ d(ContentPageViewModel contentPageViewModel, String str, ProductCard productCard, int i) {
        this.d = i;
        this.e = contentPageViewModel;
        this.f = str;
        this.g = productCard;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String label = (String) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(label, "label");
                ContentPageViewModel contentPageViewModel = this.e;
                ContentPageAnalytics.ContentPage contentPageS6 = contentPageViewModel.s6();
                if (contentPageS6 != null) {
                    contentPageViewModel.j.i(contentPageS6.h.a(label, this.f), ProductAnalyticsExtKt.h(this.g, null, null, 7));
                }
                break;
            case 1:
                Intrinsics.h(label, "label");
                ContentPageViewModel contentPageViewModel2 = this.e;
                ContentPageAnalytics.ContentPage contentPageS62 = contentPageViewModel2.s6();
                if (contentPageS62 != null) {
                    contentPageViewModel2.j.i(contentPageS62.h.a(label, this.f), ProductAnalyticsExtKt.h(this.g, null, null, 7));
                }
                break;
            case 2:
                Intrinsics.h(label, "label");
                ContentPageViewModel contentPageViewModel3 = this.e;
                ContentPageAnalytics.ContentPage contentPageS63 = contentPageViewModel3.s6();
                if (contentPageS63 != null) {
                    contentPageViewModel3.j.i(contentPageS63.h.a(label, this.f), ProductAnalyticsExtKt.h(this.g, null, null, 7));
                }
                break;
            default:
                Intrinsics.h(label, "label");
                ContentPageViewModel contentPageViewModel4 = this.e;
                ContentPageAnalytics.ContentPage contentPageS64 = contentPageViewModel4.s6();
                if (contentPageS64 != null) {
                    contentPageViewModel4.j.i(contentPageS64.h.a(label, this.f), ProductAnalyticsExtKt.h(this.g, null, null, 7));
                }
                break;
        }
        return Unit.f24250a;
    }
}
