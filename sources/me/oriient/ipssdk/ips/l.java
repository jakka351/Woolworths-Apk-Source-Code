package me.oriient.ipssdk.ips;

/* loaded from: classes4.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25799a;
    public final /* synthetic */ m b;

    public l(m mVar, String str) {
        this.b = mVar;
        this.f25799a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.calibrationInstructions.setText(this.f25799a);
    }
}
