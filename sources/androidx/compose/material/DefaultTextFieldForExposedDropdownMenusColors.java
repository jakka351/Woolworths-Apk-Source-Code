package androidx.compose.material;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0004²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/DefaultTextFieldForExposedDropdownMenusColors;", "Landroidx/compose/material/TextFieldColors;", "", "focused", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class DefaultTextFieldForExposedDropdownMenusColors implements TextFieldColors {
    @Override // androidx.compose.material.TextFieldColors
    public final MutableState a(boolean z, boolean z2, Composer composer) {
        composer.o(-776179197);
        MutableState mutableStateL = SnapshotStateKt.l(new Color(0L), composer);
        composer.l();
        return mutableStateL;
    }

    @Override // androidx.compose.material.TextFieldColors
    public final MutableState b(boolean z, boolean z2, InteractionSource interactionSource, Composer composer) {
        composer.o(-1749156593);
        MutableState mutableStateA = FocusInteractionKt.a(interactionSource, composer, 0);
        if (z && !z2) {
            ((Boolean) mutableStateA.getD()).getClass();
        }
        return a.h(0L, composer);
    }

    @Override // androidx.compose.material.TextFieldColors
    public final State c(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        Composer composer2;
        State stateL;
        composer.o(476110356);
        MutableState mutableStateA = FocusInteractionKt.a(interactionSource, composer, (i >> 6) & 14);
        if (z && !z2) {
            ((Boolean) mutableStateA.getD()).getClass();
        }
        if (z) {
            composer.o(-889472281);
            composer2 = composer;
            stateL = SingleValueAnimationKt.b(0L, AnimationSpecKt.e(150, 0, null, 6), null, composer2, 48, 12);
            composer2.l();
        } else {
            composer2 = composer;
            composer2.o(-889369423);
            stateL = SnapshotStateKt.l(new Color(0L), composer2);
            composer2.l();
        }
        composer2.l();
        return stateL;
    }

    @Override // androidx.compose.material.TextFieldColors
    public final MutableState d(boolean z, Composer composer) {
        composer.o(394526077);
        MutableState mutableStateL = SnapshotStateKt.l(new Color(0L), composer);
        composer.l();
        return mutableStateL;
    }

    @Override // androidx.compose.material.TextFieldColors
    public final MutableState e(boolean z, Composer composer) {
        composer.o(1742462291);
        MutableState mutableStateL = SnapshotStateKt.l(new Color(0L), composer);
        composer.l();
        return mutableStateL;
    }

    public final boolean equals(Object obj) {
        boolean zC = Color.c(0L, 0L);
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultTextFieldForExposedDropdownMenusColors.class != obj.getClass()) {
            return false;
        }
        return zC && zC && zC && zC && zC && zC && zC && zC && zC && zC && zC && zC && zC && zC && zC && zC && zC && zC && zC && zC && zC && zC;
    }

    @Override // androidx.compose.material.TextFieldColors
    public final State f(boolean z, boolean z2, InteractionSource interactionSource, Composer composer) {
        composer.o(79259602);
        MutableState mutableStateA = FocusInteractionKt.a(interactionSource, composer, 0);
        if (z && !z2) {
            ((Boolean) mutableStateA.getD()).getClass();
        }
        return a.h(0L, composer);
    }

    @Override // androidx.compose.material.TextFieldColors
    public final MutableState g(Composer composer) {
        composer.o(-28962788);
        MutableState mutableStateL = SnapshotStateKt.l(new Color(0L), composer);
        composer.l();
        return mutableStateL;
    }

    @Override // androidx.compose.material.TextFieldColors
    public final MutableState h(boolean z, boolean z2, Composer composer) {
        composer.o(1665901393);
        MutableState mutableStateL = SnapshotStateKt.l(new Color(0L), composer);
        composer.l();
        return mutableStateL;
    }

    public final int hashCode() {
        int i = Color.l;
        return Long.hashCode(0L) + b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(Long.hashCode(0L) * 31, 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L), 31, 0L);
    }

    @Override // androidx.compose.material.TextFieldColors
    public final MutableState i(boolean z, Composer composer) {
        composer.o(-930693132);
        MutableState mutableStateL = SnapshotStateKt.l(new Color(0L), composer);
        composer.l();
        return mutableStateL;
    }
}
