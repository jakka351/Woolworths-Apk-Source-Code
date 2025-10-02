package au.com.woolworths.shop.lists.ui.snapalist.main;

import au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProcessorContract.Listener e;

    public /* synthetic */ e(ProcessorContract.Listener listener, int i) {
        this.d = i;
        this.e = listener;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.Q2();
                break;
            case 1:
                this.e.g0();
                break;
            default:
                this.e.s();
                break;
        }
        return Unit.f24250a;
    }
}
