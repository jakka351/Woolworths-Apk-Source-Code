package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/SegmentedButtonColors;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SegmentedButtonColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f1486a;
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

    public SegmentedButtonColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.f1486a = j;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SegmentedButtonColors.class != obj.getClass()) {
            return false;
        }
        SegmentedButtonColors segmentedButtonColors = (SegmentedButtonColors) obj;
        return Color.c(this.c, segmentedButtonColors.c) && Color.c(this.b, segmentedButtonColors.b) && Color.c(this.f1486a, segmentedButtonColors.f1486a) && Color.c(this.f, segmentedButtonColors.f) && Color.c(this.e, segmentedButtonColors.e) && Color.c(this.d, segmentedButtonColors.d) && Color.c(this.i, segmentedButtonColors.i) && Color.c(this.h, segmentedButtonColors.h) && Color.c(this.g, segmentedButtonColors.g) && Color.c(this.l, segmentedButtonColors.l) && Color.c(this.k, segmentedButtonColors.k) && Color.c(this.j, segmentedButtonColors.j);
    }

    public final int hashCode() {
        int i = Color.l;
        return Long.hashCode(this.j) + androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(Long.hashCode(this.c) * 31, 31, this.b), 31, this.f1486a), 31, this.f), 31, this.e), 31, this.d), 31, this.i), 31, this.h), 31, this.g), 31, this.l), 31, this.k);
    }
}
