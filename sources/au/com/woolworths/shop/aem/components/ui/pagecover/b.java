package au.com.woolworths.shop.aem.components.ui.pagecover;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.aem.components.model.pagecover.PageCoverData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ PageCoverData e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ Modifier i;
    public final /* synthetic */ int j;

    public /* synthetic */ b(PageCoverData pageCoverData, long j, long j2, long j3, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = pageCoverData;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = modifier;
        this.j = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                PageCoverKt.b(this.e, this.f, this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                PageCoverKt.c(this.e, this.f, this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1));
                break;
        }
        return Unit.f24250a;
    }
}
