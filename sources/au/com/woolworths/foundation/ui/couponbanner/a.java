package au.com.woolworths.foundation.ui.couponbanner;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;

    public /* synthetic */ a(Function2 function2, String str, String str2, int i) {
        this.d = i;
        this.e = function2;
        this.f = str;
        this.g = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.invoke(this.f, this.g);
                break;
            default:
                this.e.invoke(this.f, this.g);
                break;
        }
        return Unit.f24250a;
    }
}
