package au.com.woolworths.feature.shared.instore.wifi.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.product.composeui.ProductPromotionLabelKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ i(ProductCard productCard, Modifier modifier, boolean z, boolean z2, boolean z3, int i, int i2) {
        this.d = 1;
        this.j = productCard;
        this.k = modifier;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                InstoreWifiScreenKt.n((String) this.j, this.e, this.f, (Function1) this.k, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ProductPromotionLabelKt.a((ProductCard) this.j, (Modifier) this.k, this.e, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                BrandLabelKt.a((BrandLabel) this.j, this.e, this.f, (Modifier) this.k, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ i(Object obj, boolean z, boolean z2, Object obj2, boolean z3, int i, int i2, int i3) {
        this.d = i3;
        this.j = obj;
        this.e = z;
        this.f = z2;
        this.k = obj2;
        this.g = z3;
        this.h = i;
        this.i = i2;
    }
}
