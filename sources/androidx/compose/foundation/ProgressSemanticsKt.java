package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressSemanticsKt {
    public static final Modifier a(Modifier modifier) {
        return SemanticsModifierKt.b(modifier, true, ProgressSemanticsKt$progressSemantics$2.h);
    }

    public static final Modifier b(Modifier modifier, final float f, final ClosedFloatingPointRange closedFloatingPointRange, final int i) {
        return SemanticsModifierKt.b(modifier, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.ProgressSemanticsKt$progressSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Float fValueOf = Float.valueOf(f);
                ClosedFloatingPointRange closedFloatingPointRange2 = closedFloatingPointRange;
                SemanticsPropertiesKt.q((SemanticsPropertyReceiver) obj, new ProgressBarRangeInfo(((Number) RangesKt.f(fValueOf, closedFloatingPointRange2)).floatValue(), closedFloatingPointRange2, i));
                return Unit.f24250a;
            }
        });
    }
}
