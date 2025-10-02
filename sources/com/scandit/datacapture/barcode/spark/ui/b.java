package com.scandit.datacapture.barcode.spark.ui;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ SparkScanView e;

    public /* synthetic */ b(SparkScanView sparkScanView, int i) {
        this.d = i;
        this.e = sparkScanView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                SparkScanView.a(this.e);
                break;
            case 1:
                SparkScanView$sparkScanCameraStartListener$1.b(this.e);
                break;
            default:
                SparkScanView$sparkScanCameraStartListener$1.a(this.e);
                break;
        }
    }
}
