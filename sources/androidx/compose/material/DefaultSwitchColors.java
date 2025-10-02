package androidx.compose.material;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/DefaultSwitchColors;", "Landroidx/compose/material/SwitchColors;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DefaultSwitchColors implements SwitchColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f1272a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public DefaultSwitchColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.f1272a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultSwitchColors.class != obj.getClass()) {
            return false;
        }
        DefaultSwitchColors defaultSwitchColors = (DefaultSwitchColors) obj;
        return Color.c(this.f1272a, defaultSwitchColors.f1272a) && Color.c(this.b, defaultSwitchColors.b) && Color.c(this.c, defaultSwitchColors.c) && Color.c(this.d, defaultSwitchColors.d) && Color.c(this.e, defaultSwitchColors.e) && Color.c(this.f, defaultSwitchColors.f) && Color.c(this.g, defaultSwitchColors.g) && Color.c(this.h, defaultSwitchColors.h);
    }

    public final int hashCode() {
        int i = Color.l;
        return Long.hashCode(this.h) + b.b(b.b(b.b(b.b(b.b(b.b(Long.hashCode(this.f1272a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
