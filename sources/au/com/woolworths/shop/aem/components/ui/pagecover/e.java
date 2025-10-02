package au.com.woolworths.shop.aem.components.ui.pagecover;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.aem.components.model.pagecover.PageCoverData;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.RatingSubmissionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ e(long j, int i, Function0 function0, long j2, String str, int i2) {
        this.e = j;
        this.f = i;
        this.h = function0;
        this.g = j2;
        this.i = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                PageCoverKt.h((PageCoverData) this.h, this.e, this.g, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                RatingSubmissionKt.a(this.e, this.f, (Function0) this.h, this.g, (String) this.i, (Composer) obj, iA);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ e(PageCoverData pageCoverData, long j, long j2, Modifier modifier, int i) {
        this.h = pageCoverData;
        this.e = j;
        this.g = j2;
        this.i = modifier;
        this.f = i;
    }
}
