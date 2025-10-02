package au.com.woolworths.feature.shop.inbox.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.product.composeui.WatchlistIconKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ c(Modifier modifier, boolean z, Function0 function0, int i, int i2) {
        this.g = modifier;
        this.e = z;
        this.f = function0;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                NotificationsTitleHeaderKt.a(RecomposeScopeImplKt.a(this.h | 1), this.i, (Composer) obj, this.g, this.f, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                WatchlistIconKt.a(RecomposeScopeImplKt.a(this.h | 1), this.i, (Composer) obj, this.g, this.f, this.e);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ c(boolean z, Function0 function0, Modifier modifier, int i, int i2) {
        this.e = z;
        this.f = function0;
        this.g = modifier;
        this.h = i;
        this.i = i2;
    }
}
