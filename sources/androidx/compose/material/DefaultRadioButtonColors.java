package androidx.compose.material;

import androidx.camera.core.impl.b;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/DefaultRadioButtonColors;", "Landroidx/compose/material/RadioButtonColors;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DefaultRadioButtonColors implements RadioButtonColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f1269a;
    public final long b;
    public final long c;

    public DefaultRadioButtonColors(long j, long j2, long j3) {
        this.f1269a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // androidx.compose.material.RadioButtonColors
    public final State a(boolean z, boolean z2, Composer composer) {
        Composer composer2;
        State stateL;
        composer.o(1243421834);
        long j = !z ? this.c : !z2 ? this.b : this.f1269a;
        if (z) {
            composer.o(1872435883);
            composer2 = composer;
            stateL = SingleValueAnimationKt.b(j, AnimationSpecKt.e(100, 0, null, 6), null, composer2, 48, 12);
            composer2.l();
        } else {
            composer2 = composer;
            composer2.o(1872538586);
            stateL = SnapshotStateKt.l(new Color(j), composer2);
            composer2.l();
        }
        composer2.l();
        return stateL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultRadioButtonColors.class != obj.getClass()) {
            return false;
        }
        DefaultRadioButtonColors defaultRadioButtonColors = (DefaultRadioButtonColors) obj;
        return Color.c(this.f1269a, defaultRadioButtonColors.f1269a) && Color.c(this.b, defaultRadioButtonColors.b) && Color.c(this.c, defaultRadioButtonColors.c);
    }

    public final int hashCode() {
        int i = Color.l;
        return Long.hashCode(this.c) + b.b(Long.hashCode(this.f1269a) * 31, 31, this.b);
    }
}
