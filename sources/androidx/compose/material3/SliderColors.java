package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/SliderColors;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SliderColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f1496a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    public SliderColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.f1496a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
    }

    public final long a(boolean z, boolean z2) {
        return z ? z2 ? this.c : this.e : z2 ? this.h : this.j;
    }

    public final long b(boolean z, boolean z2) {
        return z ? z2 ? this.b : this.d : z2 ? this.g : this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SliderColors)) {
            return false;
        }
        SliderColors sliderColors = (SliderColors) obj;
        return Color.c(this.f1496a, sliderColors.f1496a) && Color.c(this.b, sliderColors.b) && Color.c(this.c, sliderColors.c) && Color.c(this.d, sliderColors.d) && Color.c(this.e, sliderColors.e) && Color.c(this.f, sliderColors.f) && Color.c(this.g, sliderColors.g) && Color.c(this.h, sliderColors.h) && Color.c(this.i, sliderColors.i) && Color.c(this.j, sliderColors.j);
    }

    public final int hashCode() {
        int i = Color.l;
        return Long.hashCode(this.j) + androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(Long.hashCode(this.f1496a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }
}
