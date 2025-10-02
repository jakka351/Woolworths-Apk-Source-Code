package au.com.woolworths.shop.lists.ui.substitutions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(Object obj, int i, int i2, Object obj2) {
        this.d = i2;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                HeaderBannerKt.a((HeaderBannerState) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                int i2 = ViewSimilarProductsActivity.C;
                ((ViewSimilarProductsActivity) obj4).O4((ViewSimilarProductsContract.ViewState) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
        }
        return unit;
    }
}
