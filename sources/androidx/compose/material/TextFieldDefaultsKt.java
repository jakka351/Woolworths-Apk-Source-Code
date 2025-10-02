package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "focused", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextFieldDefaultsKt {
    public static final MutableState a(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f, float f2, Composer composer, int i) {
        State stateL;
        MutableState mutableStateA = FocusInteractionKt.a(interactionSource, composer, (i >> 6) & 14);
        State stateC = textFieldColors.c(z, z2, interactionSource, composer, i & 8190);
        float f3 = ((Boolean) mutableStateA.getD()).booleanValue() ? f : f2;
        if (z) {
            composer.o(773088894);
            stateL = AnimateAsStateKt.a(f3, AnimationSpecKt.e(150, 0, null, 6), null, null, composer, 48, 12);
            composer.l();
        } else {
            composer.o(773193116);
            stateL = SnapshotStateKt.l(new Dp(f2), composer);
            composer.l();
        }
        return SnapshotStateKt.l(new BorderStroke(((Dp) stateL.getD()).d, new SolidColor(((Color) stateC.getD()).f1766a)), composer);
    }
}
