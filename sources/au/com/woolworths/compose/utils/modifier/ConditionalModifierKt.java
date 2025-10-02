package au.com.woolworths.compose.utils.modifier;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"compose-utils_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ConditionalModifierKt {
    public static final Modifier a(Modifier modifier, boolean z, Function1 function1, Function1 function12) {
        Modifier modifierX0;
        Modifier modifierX02;
        Intrinsics.h(modifier, "<this>");
        Modifier.Companion companion = Modifier.Companion.d;
        if (z) {
            if (function1 != null && (modifierX02 = modifier.x0((Modifier) function1.invoke(companion))) != null) {
                return modifierX02;
            }
        } else if (function12 != null && (modifierX0 = modifier.x0((Modifier) function12.invoke(companion))) != null) {
            return modifierX0;
        }
        return modifier;
    }

    public static /* synthetic */ Modifier b(Modifier modifier, boolean z, Function1 function1, Function1 function12, int i) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = null;
        }
        return a(modifier, z, function1, function12);
    }
}
