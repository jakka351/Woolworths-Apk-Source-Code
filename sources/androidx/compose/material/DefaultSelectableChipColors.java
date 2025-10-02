package androidx.compose.material;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/DefaultSelectableChipColors;", "Landroidx/compose/material/SelectableChipColors;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalMaterialApi
/* loaded from: classes2.dex */
final class DefaultSelectableChipColors implements SelectableChipColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f1270a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;

    public DefaultSelectableChipColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.f1270a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
    }

    @Override // androidx.compose.material.SelectableChipColors
    public final MutableState a(boolean z, boolean z2, Composer composer) {
        composer.o(189838188);
        return a.h(!z ? this.f : !z2 ? this.c : this.i, composer);
    }

    @Override // androidx.compose.material.SelectableChipColors
    public final MutableState b(boolean z, boolean z2, Composer composer) {
        composer.o(-403836585);
        return a.h(!z ? this.d : !z2 ? this.f1270a : this.g, composer);
    }

    @Override // androidx.compose.material.SelectableChipColors
    public final MutableState c(boolean z, boolean z2, Composer composer) {
        composer.o(2025240134);
        return a.h(!z ? this.e : !z2 ? this.b : this.h, composer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultSelectableChipColors.class != obj.getClass()) {
            return false;
        }
        DefaultSelectableChipColors defaultSelectableChipColors = (DefaultSelectableChipColors) obj;
        return Color.c(this.f1270a, defaultSelectableChipColors.f1270a) && Color.c(this.b, defaultSelectableChipColors.b) && Color.c(this.c, defaultSelectableChipColors.c) && Color.c(this.d, defaultSelectableChipColors.d) && Color.c(this.e, defaultSelectableChipColors.e) && Color.c(this.f, defaultSelectableChipColors.f) && Color.c(this.g, defaultSelectableChipColors.g) && Color.c(this.h, defaultSelectableChipColors.h) && Color.c(this.i, defaultSelectableChipColors.i);
    }

    public final int hashCode() {
        int i = Color.l;
        return Long.hashCode(this.i) + b.b(b.b(b.b(b.b(b.b(b.b(b.b(Long.hashCode(this.f1270a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }
}
