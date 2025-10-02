package au.com.woolworths.feature.product.list.compose.productsearch;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ List e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ e(List list, Modifier modifier, boolean z, int i, int i2, int i3) {
        this.d = i3;
        this.e = list;
        this.f = modifier;
        this.g = z;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                SearchTilesSectionKt.a(this.e, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTilesSectionKt.a(this.e, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
        }
        return Unit.f24250a;
    }
}
