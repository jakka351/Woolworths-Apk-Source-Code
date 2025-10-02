package au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.woolworths.shop.product.ui.ProductWasPriceLabelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;

    public /* synthetic */ a(String str, int i, int i2, boolean z) {
        this.e = str;
        this.f = z;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                YourGroceriesCategoryItemKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(1), this.g);
                break;
            default:
                ProductWasPriceLabelKt.b(this.e, this.f, composer, RecomposeScopeImplKt.a(this.g | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(String str, boolean z, int i) {
        this.e = str;
        this.f = z;
        this.g = i;
    }
}
