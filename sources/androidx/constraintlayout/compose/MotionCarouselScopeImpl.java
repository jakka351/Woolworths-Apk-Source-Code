package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/constraintlayout/compose/MotionCarouselScopeImpl;", "Landroidx/constraintlayout/compose/MotionCarouselScope;", "Landroidx/constraintlayout/compose/MotionItemsProvider;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MotionCarouselScopeImpl implements MotionCarouselScope, MotionItemsProvider {
    @Override // androidx.constraintlayout.compose.MotionItemsProvider
    public final ComposableLambdaImpl a(final int i) {
        return new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>(i) { // from class: androidx.constraintlayout.compose.MotionCarouselScopeImpl$getContent$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    this.h.getClass();
                }
                return Unit.f24250a;
            }
        }, true, 752436001);
    }
}
