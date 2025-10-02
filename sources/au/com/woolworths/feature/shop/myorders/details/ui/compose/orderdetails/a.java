package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.shop.myorders.details.models.TooltipDeliveryMethodInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ TooltipDeliveryMethodInfo e;

    public /* synthetic */ a(TooltipDeliveryMethodInfo tooltipDeliveryMethodInfo, int i, int i2) {
        this.d = i2;
        this.e = tooltipDeliveryMethodInfo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ApplicableDeliveryMethodScreenKt.c(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            default:
                ApplicableDeliveryMethodScreenKt.b(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
