package au.com.woolworths.feature.shop.catalogue.listing.category.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.focus.FocusRequester;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.PromotionListingScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Integer g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ FocusRequester i;

    public /* synthetic */ b(Function0 function0, Function0 function02, Integer num, boolean z, FocusRequester focusRequester, int i, int i2) {
        this.d = i2;
        this.e = function0;
        this.f = function02;
        this.g = num;
        this.h = z;
        this.i = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(24577);
                CategoryListingScreenKt.i(this.e, this.f, this.g, this.h, this.i, (Composer) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(24577);
                PromotionListingScreenKt.i(this.e, this.f, this.g, this.h, this.i, (Composer) obj, iA2);
                break;
        }
        return Unit.f24250a;
    }
}
