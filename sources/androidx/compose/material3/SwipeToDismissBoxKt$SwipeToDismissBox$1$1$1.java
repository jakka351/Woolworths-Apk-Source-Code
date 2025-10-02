package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroidx/compose/material3/internal/DraggableAnchors;", "Landroidx/compose/material3/SwipeToDismissBoxValue;", "size", "Landroidx/compose/ui/unit/IntSize;", "<anonymous parameter 1>", "Landroidx/compose/ui/unit/Constraints;", "invoke-GpV2Q24", "(JJ)Lkotlin/Pair;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SwipeToDismissBoxKt$SwipeToDismissBox$1$1$1 extends Lambda implements Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<SwipeToDismissBoxValue>, ? extends SwipeToDismissBoxValue>> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((IntSize) obj).f2202a;
        long j2 = ((Constraints) obj2).f2197a;
        final float f = (int) (j >> 32);
        final boolean z = false;
        AnchoredDraggableKt.a(new Function1<DraggableAnchorsConfig<SwipeToDismissBoxValue>, Unit>() { // from class: androidx.compose.material3.SwipeToDismissBoxKt$SwipeToDismissBox$1$1$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj3;
                draggableAnchorsConfig.a(SwipeToDismissBoxValue.f, BitmapDescriptorFactory.HUE_RED);
                boolean z2 = z;
                boolean z3 = z;
                float f2 = f;
                if (z2) {
                    draggableAnchorsConfig.a(SwipeToDismissBoxValue.d, z3 ? -f2 : f2);
                }
                if (z) {
                    if (!z3) {
                        f2 = -f2;
                    }
                    draggableAnchorsConfig.a(SwipeToDismissBoxValue.e, f2);
                }
                return Unit.f24250a;
            }
        });
        throw null;
    }
}
