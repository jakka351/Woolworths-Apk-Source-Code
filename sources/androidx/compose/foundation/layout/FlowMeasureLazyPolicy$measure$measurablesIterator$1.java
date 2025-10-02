package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.layout.Measurable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Measurable;", "index", "", "info", "Landroidx/compose/foundation/layout/FlowLineInfo;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FlowMeasureLazyPolicy$measure$measurablesIterator$1 extends Lambda implements Function2<Integer, FlowLineInfo, List<? extends Measurable>> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        final int iIntValue = ((Number) obj).intValue();
        final FlowLineInfo flowLineInfo = (FlowLineInfo) obj2;
        final FlowMeasureLazyPolicy flowMeasureLazyPolicy = null;
        new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$measurablesIterator$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj3, Object obj4) {
                Composer composer = (Composer) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if (composer.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    throw null;
                }
                composer.j();
                return Unit.f24250a;
            }
        }, true, -195060736);
        throw null;
    }
}
