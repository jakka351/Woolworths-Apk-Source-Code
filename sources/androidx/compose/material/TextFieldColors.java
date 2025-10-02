package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import kotlin.Metadata;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/material/TextFieldColors;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface TextFieldColors {
    MutableState a(boolean z, boolean z2, Composer composer);

    /* renamed from: a */
    default State mo1a(boolean z, boolean z2, Composer composer) {
        composer.o(-1036335134);
        MutableState mutableStateA = a(z, z2, composer);
        composer.l();
        return mutableStateA;
    }

    MutableState b(boolean z, boolean z2, InteractionSource interactionSource, Composer composer);

    State c(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i);

    MutableState d(boolean z, Composer composer);

    MutableState e(boolean z, Composer composer);

    default State f(boolean z, boolean z2, InteractionSource interactionSource, Composer composer) {
        composer.o(454310320);
        MutableState mutableStateH = h(z, z2, composer);
        composer.l();
        return mutableStateH;
    }

    MutableState g(Composer composer);

    MutableState h(boolean z, boolean z2, Composer composer);

    MutableState i(boolean z, Composer composer);
}
