package androidx.compose.material;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/DefaultSliderColors;", "Landroidx/compose/material/SliderColors;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DefaultSliderColors implements SliderColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f1271a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    public DefaultSliderColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.f1271a = j;
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

    @Override // androidx.compose.material.SliderColors
    public final MutableState a(boolean z, boolean z2, Composer composer) {
        composer.o(1575395620);
        return a.h(z ? z2 ? this.c : this.d : z2 ? this.e : this.f, composer);
    }

    @Override // androidx.compose.material.SliderColors
    public final MutableState b(boolean z, Composer composer) {
        composer.o(-1733795637);
        return a.h(z ? this.f1271a : this.b, composer);
    }

    @Override // androidx.compose.material.SliderColors
    public final MutableState c(boolean z, boolean z2, Composer composer) {
        composer.o(-1491563694);
        return a.h(z ? z2 ? this.g : this.h : z2 ? this.i : this.j, composer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultSliderColors.class != obj.getClass()) {
            return false;
        }
        DefaultSliderColors defaultSliderColors = (DefaultSliderColors) obj;
        return Color.c(this.f1271a, defaultSliderColors.f1271a) && Color.c(this.b, defaultSliderColors.b) && Color.c(this.c, defaultSliderColors.c) && Color.c(this.d, defaultSliderColors.d) && Color.c(this.e, defaultSliderColors.e) && Color.c(this.f, defaultSliderColors.f) && Color.c(this.g, defaultSliderColors.g) && Color.c(this.h, defaultSliderColors.h) && Color.c(this.i, defaultSliderColors.i) && Color.c(this.j, defaultSliderColors.j);
    }

    public final int hashCode() {
        int i = Color.l;
        return Long.hashCode(this.j) + b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(Long.hashCode(this.f1271a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }
}
