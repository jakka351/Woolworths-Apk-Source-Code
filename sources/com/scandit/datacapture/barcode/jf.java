package com.scandit.datacapture.barcode;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class jf implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ C0540bc e;
    public final /* synthetic */ Function0 f;

    public /* synthetic */ jf(C0540bc c0540bc, Function0 function0, int i) {
        this.d = i;
        this.e = c0540bc;
        this.f = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                Ob.a(this.e, this.f);
                break;
            default:
                Qb.a(this.e, this.f);
                break;
        }
    }
}
