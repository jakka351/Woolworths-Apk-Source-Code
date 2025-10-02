package me.oriient.ipssdk.ips;

/* loaded from: classes4.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25797a;
    public final /* synthetic */ k b;

    public j(k kVar, String str) {
        this.b = kVar;
        this.f25797a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.calibrationTitle.setText(this.f25797a);
    }
}
