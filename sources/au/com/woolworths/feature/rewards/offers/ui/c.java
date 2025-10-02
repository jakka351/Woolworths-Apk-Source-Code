package au.com.woolworths.feature.rewards.offers.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderStoreDetailsItemKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    public /* synthetic */ c(String str, String str2, Modifier modifier, boolean z, Function0 function0, int i, int i2) {
        this.e = str;
        this.f = str2;
        this.g = modifier;
        this.h = z;
        this.i = function0;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                OffersSectionTitleKt.b(RecomposeScopeImplKt.a(this.j | 1), this.k, (Composer) obj, this.g, this.e, this.f, this.i, this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                OrderStoreDetailsItemKt.a(RecomposeScopeImplKt.a(this.j | 1), this.k, (Composer) obj, this.g, this.e, this.f, this.i, this.h);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ c(String str, Function0 function0, Modifier modifier, String str2, boolean z, int i, int i2) {
        this.e = str;
        this.i = function0;
        this.g = modifier;
        this.f = str2;
        this.h = z;
        this.j = i;
        this.k = i2;
    }
}
