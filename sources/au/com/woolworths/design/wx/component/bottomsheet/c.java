package au.com.woolworths.design.wx.component.bottomsheet;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ c(boolean z, int i) {
        this.d = i;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        switch (this.d) {
            case 0:
                z = this.e;
                break;
            default:
                z = !this.e;
                break;
        }
        return Boolean.valueOf(z);
    }
}
