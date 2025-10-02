package me.oriient.ipssdk.ips;

/* loaded from: classes4.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Double f25793a;
    public final /* synthetic */ g b;

    public f(g gVar, Double d) {
        this.b = gVar;
        this.f25793a = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Double d = this.f25793a;
        boolean z = d != null && d.doubleValue() >= 100.0d;
        this.b.b.calibrationImage.setVisibility(!z ? 0 : 8);
        this.b.b.calibrationDoneImage.setVisibility(z ? 0 : 8);
        this.b.b.calibrationProgressMessage.setVisibility(!z ? 0 : 8);
        this.b.b.calibrationCompletedMessage.setVisibility(z ? 0 : 8);
        this.b.b.progressBar.setVisibility(z ? 8 : 0);
        Double d2 = this.f25793a;
        this.b.b.progressBar.setProgress(d2 != null ? (int) Math.round(d2.doubleValue()) : 0, true);
    }
}
