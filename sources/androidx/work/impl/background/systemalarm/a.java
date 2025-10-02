package androidx.work.impl.background.systemalarm;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ DelayMetCommandHandler e;

    public /* synthetic */ a(DelayMetCommandHandler delayMetCommandHandler, int i) {
        this.d = i;
        this.e = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                DelayMetCommandHandler.b(this.e);
                break;
            default:
                DelayMetCommandHandler.c(this.e);
                break;
        }
    }
}
