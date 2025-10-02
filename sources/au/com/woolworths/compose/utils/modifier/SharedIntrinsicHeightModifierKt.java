package au.com.woolworths.compose.utils.modifier;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"compose-utils_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SharedIntrinsicHeightModifierKt {
    public static final Modifier a(Modifier modifier, SharedIntrinsicHeightState state) {
        Intrinsics.h(modifier, "<this>");
        Intrinsics.h(state, "state");
        return LayoutModifierKt.a(OnRemeasuredModifierKt.a(modifier, new androidx.navigation.fragment.e(state, 10)), new c(state, 1));
    }
}
