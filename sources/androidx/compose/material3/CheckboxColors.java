package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/CheckboxColors;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CheckboxColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f1409a;
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

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ToggleableState toggleableState = ToggleableState.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ToggleableState toggleableState2 = ToggleableState.d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public CheckboxColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.f1409a = j;
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
        if (obj == null || !(obj instanceof CheckboxColors)) {
            return false;
        }
        CheckboxColors checkboxColors = (CheckboxColors) obj;
        return Color.c(this.f1409a, checkboxColors.f1409a) && Color.c(this.b, checkboxColors.b) && Color.c(this.c, checkboxColors.c) && Color.c(this.d, checkboxColors.d) && Color.c(this.e, checkboxColors.e) && Color.c(this.f, checkboxColors.f) && Color.c(this.g, checkboxColors.g) && Color.c(this.h, checkboxColors.h) && Color.c(this.i, checkboxColors.i) && Color.c(this.j, checkboxColors.j) && Color.c(this.k, checkboxColors.k) && Color.c(this.l, checkboxColors.l);
    }

    public final int hashCode() {
        int i = Color.l;
        return Long.hashCode(this.l) + androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(Long.hashCode(this.f1409a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
