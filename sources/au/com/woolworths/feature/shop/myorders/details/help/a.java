package au.com.woolworths.feature.shop.myorders.details.help;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpDataList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ OrderHelpDataList e;
    public final /* synthetic */ Function1 f;

    public /* synthetic */ a(OrderHelpDataList orderHelpDataList, Function1 function1, int i, int i2) {
        this.d = i2;
        this.e = orderHelpDataList;
        this.f = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                HelpAndSupportScreenKt.d(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
            default:
                OrderDetailsHelpScreenKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
