package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptBottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ int i;

    public /* synthetic */ n(String str, String str2, Function0 function0, Function0 function02, int i, int i2) {
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.g = function0;
        this.h = function02;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                OrderProofOfDeliveryDetailsItemKt.b(this.e, this.f, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                InstorePresencePromptBottomSheetKt.c(this.e, this.f, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1));
                break;
        }
        return Unit.f24250a;
    }
}
