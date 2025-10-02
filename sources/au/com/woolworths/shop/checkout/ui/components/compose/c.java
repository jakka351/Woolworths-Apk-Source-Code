package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ int j;

    public /* synthetic */ c(String str, String str2, String str3, String str4, Function0 function0, int i, int i2) {
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = function0;
        this.j = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                CollectionMethodAddressKt.a(this.e, this.f, this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                FulfilmentWindowsSelectedUiKt.a(this.e, this.f, this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ItemCheckoutProductKt.a(this.e, this.f, this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1));
                break;
        }
        return Unit.f24250a;
    }
}
