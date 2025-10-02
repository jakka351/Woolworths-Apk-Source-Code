package androidx.compose.material3.carousel;

import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/pager/PagerScope;", "page", "", "invoke", "(Landroidx/compose/foundation/pager/PagerScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class CarouselKt$Carousel$1 extends Lambda implements Function4<PagerScope, Integer, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        ((Number) obj4).intValue();
        Object objG = composer.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (objG == composer$Companion$Empty$1) {
            objG = new CarouselItemInfoImpl();
            composer.A(objG);
        }
        final CarouselItemInfoImpl carouselItemInfoImpl = (CarouselItemInfoImpl) objG;
        Object objG2 = composer.G();
        if (objG2 == composer$Companion$Empty$1) {
            objG2 = new CarouselItemScopeImpl(carouselItemInfoImpl);
            composer.A(objG2);
        }
        Object objG3 = composer.G();
        if (objG3 == composer$Companion$Empty$1) {
            objG3 = new Shape() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$1$clipShape$1$1
                @Override // androidx.compose.ui.graphics.Shape
                public final Outline a(long j, LayoutDirection layoutDirection, Density density) {
                    return new Outline.Rectangle((Rect) ((SnapshotMutableStateImpl) carouselItemInfoImpl.d).getD());
                }
            };
            composer.A(objG3);
        }
        throw null;
    }
}
