package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewFormViewModel;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.SubmitReviewScreenKt;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ o(Object obj, Object obj2, boolean z, int i, int i2, int i3) {
        this.d = i3;
        this.h = obj;
        this.i = obj2;
        this.e = z;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ProductOfferMinimumSpendKt.a((RewardsOfferInfo) this.h, (Modifier) this.i, this.e, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                SubmitReviewScreenKt.b((SubmitReviewFormViewModel) this.h, (ArrayList) this.i, this.e, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1));
                break;
        }
        return Unit.f24250a;
    }
}
