package au.com.woolworths.feature.shop.wpay.ui.wpay;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.ratingsandreviews.ui.RatingsAndReviewsPreviewHeadingKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ a(String str, String str2, Modifier modifier, int i, int i2, int i3) {
        this.d = i3;
        this.e = str;
        this.f = str2;
        this.g = modifier;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                PayingAmountKt.a(this.e, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                RatingsAndReviewsPreviewHeadingKt.a(this.e, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
        }
        return Unit.f24250a;
    }
}
