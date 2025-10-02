package au.com.woolworths.feature.shared.instore.wifi.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiContract;
import au.com.woolworths.feature.shared.instore.wifi.ui.content.AppSpecificContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ InstoreWifiContract.ViewState e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ AppSpecificContent i;

    public /* synthetic */ o(InstoreWifiContract.ViewState viewState, String str, Function2 function2, Function2 function22, AppSpecificContent appSpecificContent, int i, int i2) {
        this.d = i2;
        this.e = viewState;
        this.f = str;
        this.g = function2;
        this.h = function22;
        this.i = appSpecificContent;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(3073);
                InstoreWifiScreenKt.j(this.e, this.f, this.g, this.h, this.i, (Composer) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(3073);
                InstoreWifiScreenKt.a(this.e, this.f, this.g, this.h, this.i, (Composer) obj, iA2);
                break;
        }
        return Unit.f24250a;
    }
}
