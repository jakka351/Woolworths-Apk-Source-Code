package au.com.woolworths.dynamic.page.ui.content;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.foundation.shop.instore.navigation.productfinder.ProductFinderTitleKt;
import au.com.woolworths.shared.ui.compose.CoachmarkKt;
import au.com.woolworths.shop.aem.components.ui.product.ProductSectionHeaderKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ p(String str, float f, Modifier modifier, int i, int i2, int i3) {
        this.d = i3;
        this.e = str;
        this.f = f;
        this.g = modifier;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(this.h | 1);
                ScreenContentKt.d(this.f, iA, this.i, (Composer) obj, this.g, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(this.h | 1);
                ProductFinderTitleKt.a(this.f, iA2, this.i, (Composer) obj, this.g, this.e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iA3 = RecomposeScopeImplKt.a(this.h | 1);
                CoachmarkKt.b(this.f, iA3, this.i, (Composer) obj, this.g, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA4 = RecomposeScopeImplKt.a(this.h | 1);
                ProductSectionHeaderKt.a(this.f, iA4, this.i, (Composer) obj, this.g, this.e);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ p(String str, Modifier modifier, float f, int i, int i2, int i3) {
        this.d = i3;
        this.e = str;
        this.g = modifier;
        this.f = f;
        this.h = i;
        this.i = i2;
    }
}
