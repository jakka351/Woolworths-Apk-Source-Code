package au.com.woolworths.feature.product.list.compose.productsearch;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ ComposableLambdaImpl h;
    public final /* synthetic */ ComposableLambdaImpl i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    public /* synthetic */ a(Function0 function0, String str, String str2, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, boolean z, int i, int i2, int i3) {
        this.d = i3;
        this.e = function0;
        this.f = str;
        this.g = str2;
        this.h = composableLambdaImpl;
        this.i = composableLambdaImpl2;
        this.j = z;
        this.k = i;
        this.l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                SearchRowSectionKt.b(this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, RecomposeScopeImplKt.a(this.k | 1), this.l);
                break;
            default:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchRowSectionKt.b(this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, RecomposeScopeImplKt.a(this.k | 1), this.l);
                break;
        }
        return Unit.f24250a;
    }
}
