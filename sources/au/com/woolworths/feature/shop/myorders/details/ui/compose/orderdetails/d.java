package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.shop.myorders.details.models.OrderSubtitleIcon;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ OrderSubtitleIcon g;

    public /* synthetic */ d(String str, String str2, OrderSubtitleIcon orderSubtitleIcon, int i, int i2) {
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.g = orderSubtitleIcon;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                CurrentDeliveryOrderOverviewItemKt.h(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(1));
                break;
            default:
                CurrentPickupOrderOverviewItemKt.h(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
