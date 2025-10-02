package com.scandit.datacapture.barcode;

/* loaded from: classes6.dex */
public final /* synthetic */ class kf implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kf(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                T.a((T) this.e);
                break;
            case 1:
                Ke.a((Ke) this.e);
                break;
            case 2:
                C0519a7.a((C0519a7) this.e);
                break;
            case 3:
                C0544c0.r((C0544c0) this.e);
                break;
            case 4:
                C0710l2.c((C0710l2) this.e);
                break;
            case 5:
                ViewOnTouchListenerC0829sa.a((ViewOnTouchListenerC0829sa) this.e);
                break;
            default:
                C0892vd.a((C0892vd) this.e);
                break;
        }
    }
}
