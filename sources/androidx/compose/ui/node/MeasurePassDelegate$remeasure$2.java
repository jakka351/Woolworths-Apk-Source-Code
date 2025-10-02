package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class MeasurePassDelegate$remeasure$2 extends Lambda implements Function1<AlignmentLinesOwner, Unit> {
    public static final MeasurePassDelegate$remeasure$2 h = new MeasurePassDelegate$remeasure$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((AlignmentLinesOwner) obj).o().c = false;
        return Unit.f24250a;
    }
}
