package com.scandit.datacapture.barcode.count.ui.view;

/* loaded from: classes6.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ BarcodeCountView e;

    public /* synthetic */ j(BarcodeCountView barcodeCountView, int i) {
        this.d = i;
        this.e = barcodeCountView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                BarcodeCountView.b(this.e);
                break;
            default:
                BarcodeCountView.a(this.e);
                break;
        }
    }
}
