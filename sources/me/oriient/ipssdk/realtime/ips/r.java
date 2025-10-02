package me.oriient.ipssdk.realtime.ips;

/* loaded from: classes8.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ r(long j, int i) {
        this.d = i;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                Positioning.a(this.e);
                break;
            default:
                Positioning.b(this.e);
                break;
        }
    }
}
