package au.com.woolworths.feature.shop.more;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.shop.contentpage.ContentPageViewModel;
import au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ContentPageViewModel e;
    public final /* synthetic */ Function0 f;

    public /* synthetic */ h(ContentPageViewModel contentPageViewModel, Function0 function0, int i, int i2) {
        this.d = i2;
        this.e = contentPageViewModel;
        this.f = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                MoreMenuScreenKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(9));
                break;
            default:
                ProductCategoryScreenKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(9));
                break;
        }
        return Unit.f24250a;
    }
}
