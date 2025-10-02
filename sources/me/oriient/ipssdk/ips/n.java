package me.oriient.ipssdk.ips;

/* loaded from: classes4.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25801a;
    public final /* synthetic */ o b;

    public n(o oVar, String str) {
        this.b = oVar;
        this.f25801a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.calibrationCompletedMessage.setText(this.f25801a);
    }
}
