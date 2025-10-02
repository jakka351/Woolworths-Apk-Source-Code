package com.scandit.datacapture.barcode;

import android.view.View;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountStatus;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class cf implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cf(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                He.a((Function1) this.e, (He) this.f);
                break;
            case 1:
                Ld.a((Ld) this.e, (BarcodeCountStatus) this.f);
                break;
            default:
                oe.a((oe) this.e, (View) this.f);
                break;
        }
    }
}
