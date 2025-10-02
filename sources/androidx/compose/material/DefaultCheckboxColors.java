package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/DefaultCheckboxColors;", "Landroidx/compose/material/CheckboxColors;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DefaultCheckboxColors implements CheckboxColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f1264a;
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
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

    public DefaultCheckboxColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.f1264a = j;
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
    }

    @Override // androidx.compose.material.CheckboxColors
    public final State a(boolean z, ToggleableState toggleableState, Composer composer) {
        long j;
        Composer composer2;
        State stateL;
        composer.o(840901029);
        if (z) {
            int iOrdinal = toggleableState.ordinal();
            if (iOrdinal == 0) {
                j = this.c;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                j = this.c;
            } else {
                j = this.d;
            }
        } else {
            int iOrdinal2 = toggleableState.ordinal();
            if (iOrdinal2 == 0) {
                j = this.e;
            } else if (iOrdinal2 == 1) {
                j = this.f;
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                j = this.g;
            }
        }
        long j2 = j;
        if (z) {
            composer.o(507535414);
            composer2 = composer;
            stateL = SingleValueAnimationKt.b(j2, AnimationSpecKt.e(toggleableState == ToggleableState.e ? 100 : 50, 0, null, 6), null, composer2, 0, 12);
            composer2.l();
        } else {
            composer2 = composer;
            composer2.o(507715958);
            stateL = SnapshotStateKt.l(new Color(j2), composer2);
            composer2.l();
        }
        composer2.l();
        return stateL;
    }

    @Override // androidx.compose.material.CheckboxColors
    public final State b(ToggleableState toggleableState, Composer composer) {
        composer.o(544656267);
        ToggleableState toggleableState2 = ToggleableState.e;
        State stateB = SingleValueAnimationKt.b(toggleableState == toggleableState2 ? this.b : this.f1264a, AnimationSpecKt.e(toggleableState == toggleableState2 ? 100 : 50, 0, null, 6), null, composer, 0, 12);
        composer.l();
        return stateB;
    }

    @Override // androidx.compose.material.CheckboxColors
    public final State c(boolean z, ToggleableState toggleableState, Composer composer) {
        long j;
        Composer composer2;
        State stateL;
        composer.o(-1568341342);
        if (z) {
            int iOrdinal = toggleableState.ordinal();
            if (iOrdinal == 0) {
                j = this.h;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                j = this.h;
            } else {
                j = this.i;
            }
        } else {
            int iOrdinal2 = toggleableState.ordinal();
            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                j = this.j;
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                j = this.k;
            }
        }
        long j2 = j;
        if (z) {
            composer.o(-840498473);
            composer2 = composer;
            stateL = SingleValueAnimationKt.b(j2, AnimationSpecKt.e(toggleableState == ToggleableState.e ? 100 : 50, 0, null, 6), null, composer2, 0, 12);
            composer2.l();
        } else {
            composer2 = composer;
            composer2.o(-840317929);
            stateL = SnapshotStateKt.l(new Color(j2), composer2);
            composer2.l();
        }
        composer2.l();
        return stateL;
    }
}
