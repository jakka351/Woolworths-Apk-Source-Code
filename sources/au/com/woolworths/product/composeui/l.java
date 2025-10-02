package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.product.details.ui.PorductMemberPriceLabelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ String h;
    public final /* synthetic */ ProductMemberPriceLabelStyle i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    public /* synthetic */ l(String str, String str2, Modifier modifier, String str3, ProductMemberPriceLabelStyle productMemberPriceLabelStyle, int i, int i2, int i3) {
        this.d = i3;
        this.e = str;
        this.f = str2;
        this.g = modifier;
        this.h = str3;
        this.i = productMemberPriceLabelStyle;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ProductMemberPriceLabelKt.b(this.e, this.f, this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1), this.k);
                break;
            case 1:
                ((Integer) obj2).getClass();
                PorductMemberPriceLabelKt.a(this.e, this.f, this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1), this.k);
                break;
            default:
                ((Integer) obj2).getClass();
                com.woolworths.shop.product.ui.ProductMemberPriceLabelKt.b(this.e, this.f, this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1), this.k);
                break;
        }
        return Unit.f24250a;
    }
}
