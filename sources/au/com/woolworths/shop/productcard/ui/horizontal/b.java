package au.com.woolworths.shop.productcard.ui.horizontal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.productcard.ui.vertical.ImageContainerVerticalUiKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    public /* synthetic */ b(String str, String str2, Modifier modifier, float f, float f2, int i, int i2, int i3) {
        this.d = i3;
        this.e = str;
        this.f = str2;
        this.g = modifier;
        this.h = f;
        this.i = f2;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ImageContainerHorizontalUiKt.a(this.e, this.f, this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1), this.k);
                break;
            default:
                ((Integer) obj2).getClass();
                ImageContainerVerticalUiKt.a(this.e, this.f, this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1), this.k);
                break;
        }
        return Unit.f24250a;
    }
}
