package au.com.woolworths.shop.product.details.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.shop.product.details.ui.everydaymarket.AboutEverydayMarketKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;

    public /* synthetic */ f(int i, int i2, String str, String str2, String str3) {
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ProductDetailsScreenKt.a(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(1));
                break;
            case 1:
                AboutEverydayMarketKt.b(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(1));
                break;
            default:
                AboutEverydayMarketKt.a(this.e, this.f, this.g, composer, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
