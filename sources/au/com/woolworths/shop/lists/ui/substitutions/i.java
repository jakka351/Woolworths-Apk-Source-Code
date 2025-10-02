package au.com.woolworths.shop.lists.ui.substitutions;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.shop.lists.data.model.AlternativeProductCard;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsDisclaimer;
import au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewSimilarProductsActivity e;
    public final /* synthetic */ CoroutineScope f;
    public final /* synthetic */ ModalBottomSheetState g;
    public final /* synthetic */ Object h;

    public /* synthetic */ i(ViewSimilarProductsActivity viewSimilarProductsActivity, Object obj, CoroutineScope coroutineScope, ModalBottomSheetState modalBottomSheetState, int i, int i2) {
        this.d = i2;
        this.e = viewSimilarProductsActivity;
        this.h = obj;
        this.f = coroutineScope;
        this.g = modalBottomSheetState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int i2 = ViewSimilarProductsActivity.C;
                int iA = RecomposeScopeImplKt.a(513);
                this.e.R4((AlternativeProductCard) obj3, this.f, this.g, (Composer) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int i3 = ViewSimilarProductsActivity.C;
                int iA2 = RecomposeScopeImplKt.a(513);
                this.e.Q4((ViewSimilarProductsContract.ViewState) obj3, this.f, this.g, (Composer) obj, iA2);
                break;
            default:
                ((Integer) obj2).getClass();
                int i4 = ViewSimilarProductsActivity.C;
                int iA3 = RecomposeScopeImplKt.a(513);
                this.e.P4((AlternativeProductsDisclaimer) obj3, this.f, this.g, (Composer) obj, iA3);
                break;
        }
        return unit;
    }
}
