package au.com.woolworths.feature.shared.instore.wifi.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ int g;

    public /* synthetic */ j(String str, Function2 function2, int i) {
        this.e = str;
        this.f = function2;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.d) {
            case 0:
                num.getClass();
                InstoreWifiScreenKt.k(RecomposeScopeImplKt.a(this.g | 1), composer, this.e, this.f);
                break;
            default:
                num.intValue();
                JoinInStoreWifiScreenKt.b(RecomposeScopeImplKt.a(this.g | 1), composer, this.e, this.f);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ j(Function2 function2, String str, int i) {
        this.f = function2;
        this.e = str;
        this.g = i;
    }
}
