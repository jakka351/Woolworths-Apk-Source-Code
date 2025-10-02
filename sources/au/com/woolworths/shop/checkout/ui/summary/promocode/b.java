package au.com.woolworths.shop.checkout.ui.summary.promocode;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetData;
import au.com.woolworths.shop.lists.ui.substitutions.SimilarProductsScreenKt;
import au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ b(ViewSimilarProductsContract.ViewState viewState, boolean z, String str, String str2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, ProductClickListener productClickListener, int i) {
        this.j = viewState;
        this.e = z;
        this.k = str;
        this.l = str2;
        this.f = function1;
        this.g = function12;
        this.h = function13;
        this.m = function14;
        this.i = function0;
        this.n = productClickListener;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                PromoCodeModalKt.a(this.e, (ModalBottomSheetData.PromoCode) this.j, this.f, this.i, this.g, (Function0) this.k, (Function0) this.l, this.h, (Modifier) this.m, (SheetState) this.n, (Composer) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1);
                SimilarProductsScreenKt.m((ViewSimilarProductsContract.ViewState) this.j, this.e, (String) this.k, (String) this.l, this.f, this.g, this.h, (Function1) this.m, this.i, (ProductClickListener) this.n, (Composer) obj, iA2);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(boolean z, ModalBottomSheetData.PromoCode promoCode, Function1 function1, Function0 function0, Function1 function12, Function0 function02, Function0 function03, Function1 function13, Modifier modifier, SheetState sheetState, int i) {
        this.e = z;
        this.j = promoCode;
        this.f = function1;
        this.i = function0;
        this.g = function12;
        this.k = function02;
        this.l = function03;
        this.h = function13;
        this.m = modifier;
        this.n = sheetState;
    }
}
