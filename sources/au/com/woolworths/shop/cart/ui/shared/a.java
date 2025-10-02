package au.com.woolworths.shop.cart.ui.shared;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ String e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a(String str, Modifier modifier, Function0 function0, int i) {
        this.e = str;
        this.f = modifier;
        this.g = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(385);
                CartFooterKt.d(this.e, (String) this.g, this.f, (Composer) obj, iA);
                break;
            default:
                Function0 function0 = (Function0) this.g;
                ((Integer) obj2).getClass();
                LinkButtonKt.a(RecomposeScopeImplKt.a(49), (Composer) obj, this.f, this.e, function0);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(String str, String str2, Modifier modifier, int i) {
        this.e = str;
        this.g = str2;
        this.f = modifier;
    }
}
