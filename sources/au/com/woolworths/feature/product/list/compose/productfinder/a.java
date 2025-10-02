package au.com.woolworths.feature.product.list.compose.productfinder;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ColumnScope e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ int g;

    public /* synthetic */ a(ColumnScope columnScope, Function0 function0, int i, int i2) {
        this.d = i2;
        this.e = columnScope;
        this.f = function0;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                FindInfoBottomSheetContentKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(this.g | 1));
                break;
            default:
                au.com.woolworths.feature.product.list.legacy.compose.productfinder.FindInfoBottomSheetContentKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(this.g | 1));
                break;
        }
        return Unit.f24250a;
    }
}
