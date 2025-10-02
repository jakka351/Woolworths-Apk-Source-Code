package androidx.compose.ui.text.font;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FontWeightKt {
    public static final FontWeight a(FontWeight fontWeight, FontWeight fontWeight2, float f) {
        return new FontWeight(RangesKt.c(MathHelpersKt.c(f, fontWeight.d, fontWeight2.d), 1, 1000));
    }
}
