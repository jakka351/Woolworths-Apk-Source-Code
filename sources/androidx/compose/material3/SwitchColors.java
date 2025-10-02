package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/SwitchColors;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SwitchColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f1507a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final long p;

    public SwitchColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f1507a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
        this.n = j14;
        this.o = j15;
        this.p = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SwitchColors)) {
            return false;
        }
        SwitchColors switchColors = (SwitchColors) obj;
        return Color.c(this.f1507a, switchColors.f1507a) && Color.c(this.b, switchColors.b) && Color.c(this.c, switchColors.c) && Color.c(this.d, switchColors.d) && Color.c(this.e, switchColors.e) && Color.c(this.f, switchColors.f) && Color.c(this.g, switchColors.g) && Color.c(this.h, switchColors.h) && Color.c(this.i, switchColors.i) && Color.c(this.j, switchColors.j) && Color.c(this.k, switchColors.k) && Color.c(this.l, switchColors.l) && Color.c(this.m, switchColors.m) && Color.c(this.n, switchColors.n) && Color.c(this.o, switchColors.o) && Color.c(this.p, switchColors.p);
    }

    public final int hashCode() {
        int i = Color.l;
        return Long.hashCode(this.p) + androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(Long.hashCode(this.f1507a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }
}
