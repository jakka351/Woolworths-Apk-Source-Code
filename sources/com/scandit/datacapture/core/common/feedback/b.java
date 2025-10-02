package com.scandit.datacapture.core.common.feedback;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Feedback e;

    public /* synthetic */ b(Feedback feedback, int i) {
        this.d = i;
        this.e = feedback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                Feedback.a(this.e);
                break;
            case 1:
                Feedback.b(this.e);
                break;
            default:
                Feedback.c(this.e);
                break;
        }
    }
}
