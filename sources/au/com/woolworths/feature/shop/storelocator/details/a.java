package au.com.woolworths.feature.shop.storelocator.details;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Modifier h;
    public final /* synthetic */ Function0 i;

    public /* synthetic */ a(int i, int i2, int i3, Modifier modifier, String str, String str2, Function0 function0) {
        this.d = i3;
        this.e = str;
        this.f = str2;
        this.g = i;
        this.h = modifier;
        this.i = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(3073);
                StoreDetailsScreenKt.a(this.g, iA, (Composer) obj, this.h, this.e, this.f, this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(3073);
                au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsScreenKt.a(this.g, iA2, (Composer) obj, this.h, this.e, this.f, this.i);
                break;
        }
        return Unit.f24250a;
    }
}
