package au.com.woolworths.feature.shared.instore.wifi.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function2 e;

    public /* synthetic */ n(int i, Function2 function2) {
        this.d = i;
        this.e = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        switch (i) {
            case 0:
                this.e.invoke(bool, Boolean.FALSE);
                break;
            default:
                this.e.invoke(bool, Boolean.TRUE);
                break;
        }
        return Unit.f24250a;
    }
}
