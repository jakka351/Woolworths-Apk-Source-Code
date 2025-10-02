package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.aem.components.model.title.TitleSectionData;
import au.com.woolworths.shop.aem.components.ui.TitleSectionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ h(Object obj, Modifier modifier, int i, int i2, int i3, int i4) {
        this.d = i4;
        this.i = obj;
        this.e = modifier;
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ProductDisclaimerKt.a((String) this.i, this.e, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                TitleSectionKt.a((TitleSectionData) this.i, this.e, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.g | 1), this.h);
                break;
        }
        return Unit.f24250a;
    }
}
