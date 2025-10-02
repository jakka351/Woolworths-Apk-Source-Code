package au.com.woolworths.compose.utils.modifier;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"compose-utils_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OptionalModifierKt {
    public static final Modifier a(Modifier modifier, boolean z, Function1 pass) {
        Intrinsics.h(modifier, "<this>");
        Intrinsics.h(pass, "pass");
        return z ? modifier.x0((Modifier) pass.invoke(modifier)) : modifier;
    }
}
