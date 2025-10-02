package au.com.woolworths.feature.product.list.compose.productsearch;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ ComposableLambdaImpl g;
    public final /* synthetic */ ComposableLambdaImpl h;
    public final /* synthetic */ Modifier i;
    public final /* synthetic */ int j;

    public /* synthetic */ d(Function0 function0, String str, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = function0;
        this.f = str;
        this.g = composableLambdaImpl;
        this.h = composableLambdaImpl2;
        this.i = modifier;
        this.j = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                SearchTilesSectionKt.e(this.e, this.f, this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTilesSectionKt.e(this.e, this.f, this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1));
                break;
        }
        return Unit.f24250a;
    }
}
