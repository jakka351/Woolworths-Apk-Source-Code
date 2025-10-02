package au.com.woolworths.design.core.ui.foundation.icon;

import androidx.compose.foundation.layout.FlowColumnScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class CoreIconsPreviewKt$PreviewCoreIcons$1$1$1 implements Function3<FlowColumnScope, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowColumnScope FlowColumn = (FlowColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(FlowColumn, "$this$FlowColumn");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        composer.o(876467717);
        throw null;
    }
}
