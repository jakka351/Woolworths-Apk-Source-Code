package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ SparkScanViewMiniPreview e;

    public /* synthetic */ a(SparkScanViewMiniPreview sparkScanViewMiniPreview, int i) {
        this.d = i;
        this.e = sparkScanViewMiniPreview;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                SparkScanViewMiniPreview.b(this.e);
                break;
            case 1:
                SparkScanViewMiniPreview.c(this.e);
                break;
            default:
                SparkScanViewMiniPreview.a(this.e);
                break;
        }
    }
}
