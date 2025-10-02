package me.oriient.ipssdk.ips;

import android.widget.ProgressBar;

/* loaded from: classes4.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Boolean f25803a;
    public final /* synthetic */ q b;

    public p(q qVar, Boolean bool) {
        this.b = qVar;
        this.f25803a = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ProgressBar progressBar = this.b.b.progressBar;
        Boolean bool = this.f25803a;
        progressBar.setIndeterminate(bool == null || !bool.booleanValue());
    }
}
