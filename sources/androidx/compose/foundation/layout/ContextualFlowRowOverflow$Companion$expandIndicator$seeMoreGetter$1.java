package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\r\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "state", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "invoke", "(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;)Lkotlin/jvm/functions/Function2;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ContextualFlowRowOverflow$Companion$expandIndicator$seeMoreGetter$1 extends Lambda implements Function1<FlowLayoutOverflowState, Function2<? super Composer, ? super Integer, ? extends Unit>> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        final FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) obj;
        return new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowRowOverflow$Companion$expandIndicator$seeMoreGetter$1.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (composer.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                    new ContextualFlowRowOverflowScopeImpl(flowLayoutOverflowState);
                    throw null;
                }
                composer.j();
                return Unit.f24250a;
            }
        }, true, 1850548683);
    }
}
