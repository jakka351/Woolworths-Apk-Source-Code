package au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.cart.ui.cart.CartMarketplaceTrackerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ String e;
    public final /* synthetic */ float f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    public /* synthetic */ c(String str, float f, String str2, boolean z, Function0 function0, int i, int i2) {
        this.e = str;
        this.f = f;
        this.k = str2;
        this.g = z;
        this.h = function0;
        this.i = i;
        this.j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ProductMarkerKt.b(this.g, this.e, this.h, (Modifier) this.k, this.f, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1), this.j);
                break;
            default:
                ((Integer) obj2).getClass();
                CartMarketplaceTrackerKt.a(this.e, this.f, (String) this.k, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1), this.j);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ c(boolean z, String str, Function0 function0, Modifier modifier, float f, int i, int i2) {
        this.g = z;
        this.e = str;
        this.h = function0;
        this.k = modifier;
        this.f = f;
        this.i = i;
        this.j = i2;
    }
}
