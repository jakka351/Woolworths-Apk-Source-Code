package me.oriient.ipssdk.ips;

/* loaded from: classes4.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25795a;
    public final /* synthetic */ i b;

    public h(i iVar, String str) {
        this.b = iVar;
        this.f25795a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.calibrationProgressMessage.setText(this.f25795a);
    }
}
