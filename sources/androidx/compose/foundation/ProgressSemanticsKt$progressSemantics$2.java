package androidx.compose.foundation;

import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class ProgressSemanticsKt$progressSemantics$2 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    public static final ProgressSemanticsKt$progressSemantics$2 h = new ProgressSemanticsKt$progressSemantics$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SemanticsPropertiesKt.q((SemanticsPropertyReceiver) obj, ProgressBarRangeInfo.d);
        return Unit.f24250a;
    }
}
