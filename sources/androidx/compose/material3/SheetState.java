package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Stable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/SheetState;", "", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SheetState {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1495a;
    public final boolean b;
    public final AnchoredDraggableState c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material3/SheetValue;", "invoke", "(Landroidx/compose/material3/SheetValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.SheetState$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements Function1<SheetValue, Boolean> {
        public static final AnonymousClass1 h = new AnonymousClass1(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/SheetState$Companion;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public SheetState(boolean z, final Density density, SheetValue sheetValue, Function1 function1, boolean z2) {
        this.f1495a = z;
        this.b = z2;
        if (z && sheetValue == SheetValue.f) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        if (z2 && sheetValue == SheetValue.d) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
        this.c = new AnchoredDraggableState(sheetValue, new Function1<Float, Float>() { // from class: androidx.compose.material3.SheetState$anchoredDraggableState$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((Number) obj).floatValue();
                return Float.valueOf(density.T1(56));
            }
        }, new Function0<Float>() { // from class: androidx.compose.material3.SheetState$anchoredDraggableState$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(density.T1(125));
            }
        }, SheetDefaultsKt.b, function1);
    }

    public static Object a(SheetState sheetState, SheetValue sheetValue, Continuation continuation) {
        Object objC = AnchoredDraggableKt.c(sheetState.c, sheetValue, ((SnapshotMutableFloatStateImpl) sheetState.c.l).a(), continuation);
        return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
    }

    public final SheetValue b() {
        return (SheetValue) ((SnapshotMutableStateImpl) this.c.g).getD();
    }

    public final Object c(Continuation continuation) {
        if (this.b) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        }
        Object objA = a(this, SheetValue.d, continuation);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }

    public final boolean d() {
        return ((SnapshotMutableStateImpl) this.c.g).getD() != SheetValue.d;
    }

    public final Object e(SuspendLambda suspendLambda) {
        if (this.f1495a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        Object objA = a(this, SheetValue.f, suspendLambda);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }

    public /* synthetic */ SheetState(Density density) {
        this(true, density, SheetValue.e, AnonymousClass1.h, false);
    }
}
