package au.com.woolworths.foundation.shop.instore.presence.presentation;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a e;
    public final /* synthetic */ Function0 f;

    public /* synthetic */ f(a aVar, Function0 function0, int i) {
        this.d = i;
        this.e = aVar;
        this.f = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.invoke();
                this.f.invoke();
                break;
            default:
                this.e.invoke();
                this.f.invoke();
                break;
        }
        return Unit.f24250a;
    }
}
