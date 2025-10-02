package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDraggableDefaults;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/SwipeToDismissBoxState;", "", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SwipeToDismissBoxState {

    /* renamed from: a, reason: collision with root package name */
    public final AnchoredDraggableState f1506a;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material3/SwipeToDismissBoxValue;", "invoke", "(Landroidx/compose/material3/SwipeToDismissBoxValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.SwipeToDismissBoxState$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<SwipeToDismissBoxValue, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/SwipeToDismissBoxState$Companion;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public SwipeToDismissBoxState(SwipeToDismissBoxValue swipeToDismissBoxValue) {
        this.f1506a = new AnchoredDraggableState(swipeToDismissBoxValue, null, new SwipeToDismissBoxState$anchoredDraggableState$1(0), AnchoredDraggableDefaults.f1544a, null);
    }
}
