package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.lists.ui.lists.compose.AddListItemKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ int h;

    public /* synthetic */ q(boolean z, Function0 function0, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = z;
        this.f = function0;
        this.g = modifier;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                WatchlistIconKt.b(RecomposeScopeImplKt.a(this.h | 1), composer, this.g, this.f, this.e);
                break;
            default:
                AddListItemKt.a(RecomposeScopeImplKt.a(this.h | 1), composer, this.g, this.f, this.e);
                break;
        }
        return Unit.f24250a;
    }
}
