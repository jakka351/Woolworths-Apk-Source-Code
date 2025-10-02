package au.com.woolworths.shop.aem.components.ui.morecard;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.SubmitReviewScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Modifier g;

    public /* synthetic */ a(String str, Function0 function0, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = str;
        this.f = function0;
        this.g = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                MoreCardKt.c(RecomposeScopeImplKt.a(1), composer, this.g, this.e, this.f);
                break;
            case 1:
                MoreCardKt.b(RecomposeScopeImplKt.a(1), composer, this.g, this.e, this.f);
                break;
            default:
                SubmitReviewScreenKt.e(RecomposeScopeImplKt.a(1), composer, this.g, this.e, this.f);
                break;
        }
        return Unit.f24250a;
    }
}
