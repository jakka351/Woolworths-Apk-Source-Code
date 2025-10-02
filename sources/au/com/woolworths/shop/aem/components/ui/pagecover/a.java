package au.com.woolworths.shop.aem.components.ui.pagecover;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.aem.components.model.pagecover.PageCoverData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ PageCoverData e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ int g;

    public /* synthetic */ a(PageCoverData pageCoverData, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = pageCoverData;
        this.f = modifier;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                PageCoverKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(this.g | 1));
                break;
            default:
                PageCoverTopBarSectionKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(this.g | 1));
                break;
        }
        return Unit.f24250a;
    }
}
