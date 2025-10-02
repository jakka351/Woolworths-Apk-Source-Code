package au.com.woolworths.feature.shop.storelocator.details;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ StatefulButtonState f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Modifier h;

    public /* synthetic */ d(String str, StatefulButtonState statefulButtonState, Function0 function0, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = str;
        this.f = statefulButtonState;
        this.g = function0;
        this.h = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                StoreDetailsScreenKt.j(this.e, this.f, this.g, this.h, (Composer) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1);
                au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsScreenKt.j(this.e, this.f, this.g, this.h, (Composer) obj, iA2);
                break;
        }
        return Unit.f24250a;
    }
}
