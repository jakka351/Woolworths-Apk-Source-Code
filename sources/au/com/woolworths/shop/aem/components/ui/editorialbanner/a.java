package au.com.woolworths.shop.aem.components.ui.editorialbanner;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialBannerData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ EditorialBannerData f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ Modifier h;
    public final /* synthetic */ int i;

    public /* synthetic */ a(boolean z, EditorialBannerData editorialBannerData, Function1 function1, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = z;
        this.f = editorialBannerData;
        this.g = function1;
        this.h = modifier;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                EditorialBannerKt.a(this.e, this.f, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                EditorialBannerKt.e(this.e, this.f, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1));
                break;
        }
        return Unit.f24250a;
    }
}
