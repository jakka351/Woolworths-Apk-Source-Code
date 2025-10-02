package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material/ModalBottomSheetState;", "", "Companion", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ModalBottomSheetState {

    /* renamed from: a, reason: collision with root package name */
    public final AnimationSpec f1301a;
    public final boolean b;
    public final AnchoredDraggableState c;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/ModalBottomSheetValue;", "invoke", "(Landroidx/compose/material/ModalBottomSheetValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.ModalBottomSheetState$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<ModalBottomSheetValue, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ModalBottomSheetState$Companion;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1302a;

        static {
            int[] iArr = new int[ModalBottomSheetValue.values().length];
            try {
                ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f1302a = iArr;
        }
    }

    public ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, final Density density, Function1 function1, AnimationSpec animationSpec, boolean z) {
        this.f1301a = animationSpec;
        this.b = z;
        this.c = new AnchoredDraggableState(modalBottomSheetValue, new Function1<Float, Float>() { // from class: androidx.compose.material.ModalBottomSheetState$anchoredDraggableState$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((Number) obj).floatValue();
                return Float.valueOf(density.T1(ModalBottomSheetKt.f1300a));
            }
        }, new Function0<Float>() { // from class: androidx.compose.material.ModalBottomSheetState$anchoredDraggableState$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(density.T1(ModalBottomSheetKt.b));
            }
        }, animationSpec, function1);
        if (z && modalBottomSheetValue == ModalBottomSheetValue.f) {
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.");
        }
    }

    public static Object a(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, Continuation continuation) {
        Object objD = AnchoredDraggableKt.d(modalBottomSheetState.c, modalBottomSheetValue, ((SnapshotMutableFloatStateImpl) modalBottomSheetState.c.l).a(), continuation);
        return objD == CoroutineSingletons.d ? objD : Unit.f24250a;
    }

    public final ModalBottomSheetValue b() {
        return (ModalBottomSheetValue) ((SnapshotMutableStateImpl) this.c.g).getD();
    }

    public final Object c(Continuation continuation) {
        Object objA = a(this, ModalBottomSheetValue.d, continuation);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }

    public final boolean d() {
        return ((SnapshotMutableStateImpl) this.c.g).getD() != ModalBottomSheetValue.d;
    }

    public final Object e(Continuation continuation) {
        AnchoredDraggableState anchoredDraggableState = this.c;
        DraggableAnchors draggableAnchorsE = anchoredDraggableState.e();
        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.e;
        boolean zD = draggableAnchorsE.d(modalBottomSheetValue);
        if (WhenMappings.f1302a[b().ordinal()] == 1) {
            DraggableAnchors draggableAnchorsE2 = anchoredDraggableState.e();
            ModalBottomSheetValue modalBottomSheetValue2 = ModalBottomSheetValue.f;
            if (draggableAnchorsE2.d(modalBottomSheetValue2)) {
                modalBottomSheetValue = modalBottomSheetValue2;
            }
        } else if (!zD) {
            modalBottomSheetValue = ModalBottomSheetValue.d;
        }
        Object objA = a(this, modalBottomSheetValue, continuation);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }
}
