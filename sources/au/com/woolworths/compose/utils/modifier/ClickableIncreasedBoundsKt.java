package au.com.woolworths.compose.utils.modifier;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"compose-utils_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClickableIncreasedBoundsKt {
    public static final Modifier a(Modifier clickableIncreasedBounds, float f, Function0 onClick) {
        Intrinsics.h(clickableIncreasedBounds, "$this$clickableIncreasedBounds");
        Intrinsics.h(onClick, "onClick");
        PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f, f, f, f);
        return PaddingKt.e(ClickableKt.d(LayoutModifierKt.a(clickableIncreasedBounds, new c(paddingValuesImpl, 0)), false, null, null, onClick, 7), paddingValuesImpl);
    }
}
