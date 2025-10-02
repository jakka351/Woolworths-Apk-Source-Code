package au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.shop.cart.ui.CartOptionsBottomSheetKt;
import au.com.woolworths.shop.checkout.ui.components.compose.ShopperNoteKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ int h;

    public /* synthetic */ b(String str, Function0 function0, boolean z, int i, int i2) {
        this.d = 0;
        this.f = str;
        this.g = function0;
        this.e = z;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                YourGroceriesFulfilmentStatusKt.a(this.f, this.g, this.e, (Composer) obj, iA, this.h);
                break;
            case 1:
                ((Integer) obj2).getClass();
                CartOptionsBottomSheetKt.d(RecomposeScopeImplKt.a(this.h | 1), (Composer) obj, this.f, this.g, this.e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                CartOptionsBottomSheetKt.c(RecomposeScopeImplKt.a(this.h | 1), (Composer) obj, this.f, this.g, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                ShopperNoteKt.a(RecomposeScopeImplKt.a(this.h | 1), (Composer) obj, this.f, this.g, this.e);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(String str, boolean z, Function0 function0, int i) {
        this.d = 3;
        this.f = str;
        this.e = z;
        this.g = function0;
        this.h = i;
    }

    public /* synthetic */ b(boolean z, String str, Function0 function0, int i, int i2) {
        this.d = i2;
        this.e = z;
        this.f = str;
        this.g = function0;
        this.h = i;
    }
}
