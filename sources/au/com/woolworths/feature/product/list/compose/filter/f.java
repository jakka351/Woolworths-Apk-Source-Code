package au.com.woolworths.feature.product.list.compose.filter;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.design.core.ui.component.experimental.ratingbar.StarRatingBarKt;
import au.com.woolworths.feature.shop.inbox.ui.component.CategoryTagKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    public /* synthetic */ f(ImageVector imageVector, long j, int i) {
        this.d = 3;
        this.e = imageVector;
        this.g = j;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(7);
                FilterTextWithCountKt.a((String) this.e, this.f, this.g, (Composer) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(7);
                au.com.woolworths.feature.product.list.legacy.compose.filter.FilterTextWithCountKt.a((String) this.e, this.f, this.g, (Composer) obj, iA2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iA3 = RecomposeScopeImplKt.a(this.f | 1);
                CategoryTagKt.b((String) this.e, this.g, (Composer) obj, iA3);
                break;
            default:
                ((Integer) obj2).intValue();
                int iA4 = RecomposeScopeImplKt.a(this.f | 1);
                StarRatingBarKt.a((ImageVector) this.e, this.g, (Composer) obj, iA4);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ f(String str, int i, int i2, long j, int i3) {
        this.d = i3;
        this.e = str;
        this.f = i;
        this.g = j;
    }

    public /* synthetic */ f(String str, long j, int i) {
        this.d = 2;
        this.e = str;
        this.g = j;
        this.f = i;
    }
}
