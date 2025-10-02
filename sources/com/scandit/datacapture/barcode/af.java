package com.scandit.datacapture.barcode;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class af implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ af(int i, Function0 function0) {
        this.d = i;
        this.e = function0;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        switch (this.d) {
            case 0:
                C.b(this.e);
                break;
            case 1:
                Ld.b(this.e);
                break;
            case 2:
                Ld.a(this.e);
                break;
            case 3:
                Qd.a(this.e);
                break;
            default:
                C0540bc.e(this.e);
                break;
        }
    }
}
