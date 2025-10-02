package au.com.woolworths.feature.product.list.compose.filter;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.product.productmessagebottomsheet.ProductMessageTitleRowKt;
import au.com.woolworths.shop.aem.components.ui.recipe.RecipeCardKt;
import au.com.woolworths.shop.receipts.ui.ReceiptListItemUIKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int f;

    public /* synthetic */ g(String str, int i, int i2) {
        this.d = 3;
        this.e = str;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                HeadingKt.a(this.e, composer, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 1:
                au.com.woolworths.feature.product.list.legacy.compose.filter.HeadingKt.a(this.e, composer, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 2:
                ProductMessageTitleRowKt.a(this.e, composer, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 3:
                RecipeCardKt.d(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
            default:
                ReceiptListItemUIKt.a(this.e, composer, RecomposeScopeImplKt.a(this.f | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ g(String str, int i, int i2, byte b) {
        this.d = i2;
        this.e = str;
        this.f = i;
    }
}
