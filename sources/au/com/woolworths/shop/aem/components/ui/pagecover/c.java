package au.com.woolworths.shop.aem.components.ui.pagecover;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.aem.components.model.pagecover.PageCoverData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ PageCoverData e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ int h;

    public /* synthetic */ c(PageCoverData pageCoverData, long j, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = pageCoverData;
        this.f = j;
        this.g = modifier;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                PageCoverKt.e(this.e, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                PageCoverKt.d(this.e, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                PageCoverKt.g(this.e, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
        }
        return Unit.f24250a;
    }
}
