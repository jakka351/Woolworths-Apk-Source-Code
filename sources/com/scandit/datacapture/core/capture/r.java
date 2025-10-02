package com.scandit.datacapture.core.capture;

/* loaded from: classes6.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ DataCaptureMode e;
    public final /* synthetic */ DataCaptureContext f;

    public /* synthetic */ r(DataCaptureMode dataCaptureMode, DataCaptureContext dataCaptureContext, int i) {
        this.d = i;
        this.e = dataCaptureMode;
        this.f = dataCaptureContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                DataCaptureContext.a(this.e, this.f);
                break;
            default:
                DataCaptureContext.b(this.e, this.f);
                break;
        }
    }
}
