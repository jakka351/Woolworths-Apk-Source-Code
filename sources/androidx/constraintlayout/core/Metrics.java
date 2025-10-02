package androidx.constraintlayout.core;

import android.support.v4.media.session.a;

/* loaded from: classes2.dex */
public class Metrics {

    /* renamed from: a, reason: collision with root package name */
    public long f2263a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n*** Metrics ***\nmeasures: ");
        sb.append(this.f2263a);
        sb.append("\nmeasuresWrap: 0\nmeasuresWrapInfeasible: 0\ndetermineGroups: 0\ninfeasibleDetermineGroups: 0\ngraphOptimizer: ");
        sb.append(this.c);
        sb.append("\nwidgets: ");
        sb.append(this.h);
        sb.append("\ngraphSolved: ");
        sb.append(this.d);
        sb.append("\nlinearSolved: ");
        return a.l(this.e, "\n", sb);
    }
}
