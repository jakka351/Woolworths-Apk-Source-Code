package au.com.woolworths.shop.lists.ui.substitutions;

import androidx.compose.material.ModalBottomSheetState;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shop.lists.data.model.AlternativeProductCard;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsCtaSection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                int i2 = ViewSimilarProductsActivity.C;
                BuildersKt.c((CoroutineScope) obj2, null, null, new ViewSimilarProductsActivity$DisclaimerBottomSheetContent$1$1$1((ModalBottomSheetState) obj, null), 3);
                break;
            case 1:
                ((ProductClickListener) obj2).J1((ProductCard) obj, "");
                break;
            case 2:
                ((Function1) obj2).invoke((AlternativeProductsCtaSection) obj);
                break;
            case 3:
                ((Function1) obj2).invoke((String) obj);
                break;
            default:
                ((Function1) obj2).invoke((AlternativeProductCard) obj);
                break;
        }
        return unit;
    }
}
