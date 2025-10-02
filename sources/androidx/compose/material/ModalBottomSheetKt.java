package androidx.compose.material;

import androidx.camera.core.impl.b;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.wallet.WalletConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "alpha", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ModalBottomSheetKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1300a = 56;
    public static final float b = 125;
    public static final float c = 640;

    public static final void a(final ComposableLambdaImpl composableLambdaImpl, final Modifier modifier, final ModalBottomSheetState modalBottomSheetState, boolean z, final Shape shape, final float f, final long j, final long j2, final long j3, final Function2 function2, Composer composer, final int i) {
        int i2;
        boolean z2;
        Modifier modifierA;
        ComposerImpl composerImplV = composer.v(-92970288);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(modalBottomSheetState) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= composerImplV.n(shape) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerImplV.q(f) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerImplV.s(j) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerImplV.s(j2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= composerImplV.s(j3) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= composerImplV.I(function2) ? 536870912 : 268435456;
        }
        int i4 = i3;
        if (composerImplV.z(i4 & 1, (306783379 & i3) != 306783378)) {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                z2 = true;
            } else {
                composerImplV.j();
                z2 = z;
            }
            composerImplV.W();
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = b.h(composerImplV.y(), composerImplV);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objG;
            Orientation orientation = Orientation.d;
            z = z2;
            BiasAlignment biasAlignment = Alignment.Companion.f1719a;
            MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function22 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicyD, function22);
            Function2 function23 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function23);
            Function2 function24 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                b.B(i5, composerImplV, i5, function24);
            }
            Function2 function25 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function25);
            FillElement fillElement = SizeKt.c;
            MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, fillElement);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD2, function22);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function23);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                b.B(i6, composerImplV, i6, function24);
            }
            Updater.b(composerImplV, modifierD2, function25);
            function2.invoke(composerImplV, Integer.valueOf((i4 >> 27) & 14));
            boolean zI = composerImplV.I(modalBottomSheetState) | composerImplV.I(coroutineScope);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == obj) {
                objG2 = new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1", f = "ModalBottomSheet.kt", l = {363}, m = "invokeSuspend")
                    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1, reason: invalid class name */
                    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public int p;
                        public final /* synthetic */ ModalBottomSheetState q;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                            super(2, continuation);
                            this.q = modalBottomSheetState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            return new AnonymousClass1(this.q, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                            int i = this.p;
                            if (i == 0) {
                                ResultKt.b(obj);
                                this.p = 1;
                                if (this.q.c(this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.b(obj);
                            }
                            return Unit.f24250a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ModalBottomSheetState modalBottomSheetState2 = modalBottomSheetState;
                        if (((Boolean) modalBottomSheetState2.c.d.invoke(ModalBottomSheetValue.d)).booleanValue()) {
                            BuildersKt.c(coroutineScope, null, null, new AnonymousClass1(modalBottomSheetState2, null), 3);
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG2);
            }
            Function0 function02 = (Function0) objG2;
            AnchoredDraggableState anchoredDraggableState = modalBottomSheetState.c;
            Object d = anchoredDraggableState.h.getD();
            ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.d;
            b(j3, function02, d != modalBottomSheetValue, composerImplV, (i4 >> 24) & 14);
            composerImplV.V(true);
            BiasAlignment biasAlignment2 = Alignment.Companion.b;
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f944a;
            Modifier modifierB = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(SizeKt.w(boxScopeInstance.g(modifierB, biasAlignment2), BitmapDescriptorFactory.HUE_RED, c, 1), 1.0f);
            if (z) {
                composerImplV.o(-892908339);
                boolean zN = composerImplV.n(anchoredDraggableState);
                Object objG3 = composerImplV.G();
                if (zN || objG3 == obj) {
                    objG3 = new ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState);
                    composerImplV.A(objG3);
                }
                modifierA = NestedScrollModifierKt.a(modifierB, (NestedScrollConnection) objG3, null);
                composerImplV.V(false);
            } else {
                composerImplV.o(-167335778);
                composerImplV.V(false);
                modifierA = modifierB;
            }
            Modifier modifierX0 = modifierE.x0(modifierA).x0(new DraggableAnchorsElement(anchoredDraggableState, new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<ModalBottomSheetValue>, ? extends ModalBottomSheetValue>>() { // from class: androidx.compose.material.ModalBottomSheetKt$modalBottomSheetAnchors$1

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    static {
                        int[] iArr = new int[ModalBottomSheetValue.values().length];
                        try {
                            iArr[0] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.d;
                            iArr[2] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            ModalBottomSheetValue modalBottomSheetValue2 = ModalBottomSheetValue.d;
                            iArr[1] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                    }
                }

                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    final long j4 = ((IntSize) obj2).f2202a;
                    final float fG = Constraints.g(((Constraints) obj3).f2197a);
                    final ModalBottomSheetState modalBottomSheetState2 = modalBottomSheetState;
                    DraggableAnchors draggableAnchorsA = AnchoredDraggableKt.a(new Function1<DraggableAnchorsConfig<ModalBottomSheetValue>, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$modalBottomSheetAnchors$1$newAnchors$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj4;
                            ModalBottomSheetValue modalBottomSheetValue2 = ModalBottomSheetValue.d;
                            float f2 = fG;
                            draggableAnchorsConfig.a(modalBottomSheetValue2, f2);
                            float f3 = f2 / 2.0f;
                            boolean z3 = modalBottomSheetState2.b;
                            long j5 = j4;
                            if (!z3 && ((int) (j5 & 4294967295L)) > f3) {
                                draggableAnchorsConfig.a(ModalBottomSheetValue.f, f3);
                            }
                            int i7 = (int) (j5 & 4294967295L);
                            if (i7 != 0) {
                                draggableAnchorsConfig.a(ModalBottomSheetValue.e, Math.max(BitmapDescriptorFactory.HUE_RED, f2 - i7));
                            }
                            return Unit.f24250a;
                        }
                    });
                    AnchoredDraggableState anchoredDraggableState2 = modalBottomSheetState2.c;
                    boolean z3 = anchoredDraggableState2.e().getSize() > 0;
                    ModalBottomSheetValue modalBottomSheetValueB = modalBottomSheetState2.b();
                    if (z3 || !((MapDraggableAnchors) draggableAnchorsA).f1296a.containsKey(modalBottomSheetValueB)) {
                        int iOrdinal = ((ModalBottomSheetValue) anchoredDraggableState2.h.getD()).ordinal();
                        if (iOrdinal == 0) {
                            modalBottomSheetValueB = ModalBottomSheetValue.d;
                        } else {
                            if (iOrdinal != 1 && iOrdinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ModalBottomSheetValue modalBottomSheetValue2 = ModalBottomSheetValue.f;
                            Map map = ((MapDraggableAnchors) draggableAnchorsA).f1296a;
                            if (!map.containsKey(modalBottomSheetValue2)) {
                                modalBottomSheetValue2 = ModalBottomSheetValue.e;
                                if (!map.containsKey(modalBottomSheetValue2)) {
                                    modalBottomSheetValue2 = ModalBottomSheetValue.d;
                                }
                            }
                            modalBottomSheetValueB = modalBottomSheetValue2;
                        }
                    }
                    return new Pair(draggableAnchorsA, modalBottomSheetValueB);
                }
            }));
            AnchoredDraggableState anchoredDraggableState2 = modalBottomSheetState.c;
            Modifier modifierC = AnchoredDraggableKt.c(modifierX0, anchoredDraggableState2, orientation, z && ((SnapshotMutableStateImpl) anchoredDraggableState2.g).getD() != modalBottomSheetValue, false, 56);
            if (z) {
                composerImplV.o(-891907876);
                boolean zI2 = composerImplV.I(modalBottomSheetState) | composerImplV.I(coroutineScope);
                Object objG4 = composerImplV.G();
                if (zI2 || objG4 == obj) {
                    objG4 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj2;
                            final ModalBottomSheetState modalBottomSheetState2 = modalBottomSheetState;
                            AnchoredDraggableState anchoredDraggableState3 = modalBottomSheetState2.c;
                            if (modalBottomSheetState2.d()) {
                                final CoroutineScope coroutineScope2 = coroutineScope;
                                SemanticsPropertiesKt.d(semanticsPropertyReceiver, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1.1

                                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$1$1", f = "ModalBottomSheet.kt", l = {401}, m = "invokeSuspend")
                                    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$1$1, reason: invalid class name and collision with other inner class name */
                                    final class C00421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        public int p;
                                        public final /* synthetic */ ModalBottomSheetState q;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public C00421(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                                            super(2, continuation);
                                            this.q = modalBottomSheetState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation create(Object obj, Continuation continuation) {
                                            return new C00421(this.q, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return ((C00421) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) {
                                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                                            int i = this.p;
                                            if (i == 0) {
                                                ResultKt.b(obj);
                                                this.p = 1;
                                                if (this.q.c(this) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                            } else {
                                                if (i != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                ResultKt.b(obj);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        ModalBottomSheetState modalBottomSheetState3 = modalBottomSheetState2;
                                        if (((Boolean) modalBottomSheetState3.c.d.invoke(ModalBottomSheetValue.d)).booleanValue()) {
                                            BuildersKt.c(coroutineScope2, null, null, new C00421(modalBottomSheetState3, null), 3);
                                        }
                                        return Boolean.TRUE;
                                    }
                                });
                                Object d2 = ((SnapshotMutableStateImpl) anchoredDraggableState3.g).getD();
                                ModalBottomSheetValue modalBottomSheetValue2 = ModalBottomSheetValue.f;
                                if (d2 == modalBottomSheetValue2) {
                                    semanticsPropertyReceiver.b(SemanticsActions.s, new AccessibilityAction(null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1.2

                                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$2$1", f = "ModalBottomSheet.kt", l = {WalletConstants.ERROR_CODE_ILLEGAL_CALLER}, m = "invokeSuspend")
                                        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$2$1, reason: invalid class name */
                                        final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            public int p;
                                            public final /* synthetic */ ModalBottomSheetState q;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                                                super(2, continuation);
                                                this.q = modalBottomSheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Continuation create(Object obj, Continuation continuation) {
                                                return new AnonymousClass1(this.q, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Object invokeSuspend(Object obj) {
                                                Object objA;
                                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                                                int i = this.p;
                                                Unit unit = Unit.f24250a;
                                                if (i != 0) {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.b(obj);
                                                    return unit;
                                                }
                                                ResultKt.b(obj);
                                                this.p = 1;
                                                ModalBottomSheetState modalBottomSheetState = this.q;
                                                DraggableAnchors draggableAnchorsE = modalBottomSheetState.c.e();
                                                ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.e;
                                                if (!draggableAnchorsE.d(modalBottomSheetValue) || (objA = ModalBottomSheetState.a(modalBottomSheetState, modalBottomSheetValue, this)) != coroutineSingletons) {
                                                    objA = unit;
                                                }
                                                return objA == coroutineSingletons ? coroutineSingletons : unit;
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            ModalBottomSheetState modalBottomSheetState3 = modalBottomSheetState2;
                                            if (((Boolean) modalBottomSheetState3.c.d.invoke(ModalBottomSheetValue.e)).booleanValue()) {
                                                BuildersKt.c(coroutineScope2, null, null, new AnonymousClass1(modalBottomSheetState3, null), 3);
                                            }
                                            return Boolean.TRUE;
                                        }
                                    }));
                                } else if (anchoredDraggableState3.e().d(modalBottomSheetValue2)) {
                                    semanticsPropertyReceiver.b(SemanticsActions.t, new AccessibilityAction(null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1.3

                                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$3$1", f = "ModalBottomSheet.kt", l = {425}, m = "invokeSuspend")
                                        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$3$1, reason: invalid class name */
                                        final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            public int p;
                                            public final /* synthetic */ ModalBottomSheetState q;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                                                super(2, continuation);
                                                this.q = modalBottomSheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Continuation create(Object obj, Continuation continuation) {
                                                return new AnonymousClass1(this.q, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Object invokeSuspend(Object obj) {
                                                Object objA;
                                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                                                int i = this.p;
                                                Unit unit = Unit.f24250a;
                                                if (i != 0) {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.b(obj);
                                                    return unit;
                                                }
                                                ResultKt.b(obj);
                                                this.p = 1;
                                                ModalBottomSheetState modalBottomSheetState = this.q;
                                                DraggableAnchors draggableAnchorsE = modalBottomSheetState.c.e();
                                                ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.f;
                                                if (!draggableAnchorsE.d(modalBottomSheetValue) || (objA = ModalBottomSheetState.a(modalBottomSheetState, modalBottomSheetValue, this)) != coroutineSingletons) {
                                                    objA = unit;
                                                }
                                                return objA == coroutineSingletons ? coroutineSingletons : unit;
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            ModalBottomSheetState modalBottomSheetState3 = modalBottomSheetState2;
                                            if (((Boolean) modalBottomSheetState3.c.d.invoke(ModalBottomSheetValue.f)).booleanValue()) {
                                                BuildersKt.c(coroutineScope2, null, null, new AnonymousClass1(modalBottomSheetState3, null), 3);
                                            }
                                            return Boolean.TRUE;
                                        }
                                    }));
                                }
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG4);
                }
                modifierB = SemanticsModifierKt.b(modifierB, false, (Function1) objG4);
                composerImplV.V(false);
            } else {
                composerImplV.o(-167257346);
                composerImplV.V(false);
            }
            int i7 = i4 >> 12;
            SurfaceKt.a(modifierC.x0(modifierB), shape, j, j2, null, f, ComposableLambdaKt.c(17396558, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD3 = ComposedModifierKt.d(composer2, Modifier.Companion.d);
                        ComposeUiNode.e3.getClass();
                        Function0 function03 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function03);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function26 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function26);
                        }
                        Updater.b(composer2, modifierD3, ComposeUiNode.Companion.d);
                        composableLambdaImpl.invoke(ColumnScopeInstance.f948a, composer2, 6);
                        composer2.f();
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i4 >> 9) & 112) | 1572864 | (i7 & 896) | (i7 & 7168) | (i4 & 458752), 16);
            composerImplV.V(true);
        } else {
            composerImplV.j();
        }
        final boolean z3 = z;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    ModalBottomSheetKt.a(composableLambdaImpl, modifier, modalBottomSheetState, z3, shape, f, j, j2, j3, function2, (Composer) obj2, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final long j, final Function0 function0, final boolean z, Composer composer, final int i) {
        int i2;
        boolean z2;
        ComposerImpl composerImplV = composer.v(-526532668);
        if ((i & 6) == 0) {
            i2 = (composerImplV.s(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z) ? 256 : 128;
        }
        if (!composerImplV.z(i2 & 1, (i2 & 147) != 146)) {
            composerImplV.j();
        } else if (j != 16) {
            composerImplV.o(477792612);
            final State stateB = AnimateAsStateKt.b(z ? 1.0f : BitmapDescriptorFactory.HUE_RED, new TweenSpec(0, (Easing) null, 7), null, null, composerImplV, 48, 28);
            final String strA = Strings_androidKt.a(composerImplV, 2);
            Modifier modifierB = Modifier.Companion.d;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z) {
                composerImplV.o(478010511);
                int i3 = i2 & 112;
                boolean z3 = i3 == 32;
                Object objG = composerImplV.G();
                if (z3 || objG == composer$Companion$Empty$1) {
                    objG = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(function0, null);
                    composerImplV.A(objG);
                }
                Modifier modifierX0 = modifierB.x0(new SuspendPointerInputElement(function0, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((Function2) objG), 6));
                boolean zN = (i3 == 32) | composerImplV.n(strA);
                Object objG2 = composerImplV.G();
                if (zN || objG2 == composer$Companion$Empty$1) {
                    objG2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                            SemanticsPropertiesKt.k(semanticsPropertyReceiver, strA);
                            final Function0 function02 = function0;
                            SemanticsPropertiesKt.h(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$2$1.1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function02.invoke();
                                    return Boolean.TRUE;
                                }
                            });
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG2);
                }
                z2 = true;
                modifierB = SemanticsModifierKt.b(modifierX0, true, (Function1) objG2);
                composerImplV.V(false);
            } else {
                z2 = true;
                composerImplV.o(478374234);
                composerImplV.V(false);
            }
            Modifier modifierX02 = SizeKt.c.x0(modifierB);
            if ((i2 & 14) != 4) {
                z2 = false;
            }
            boolean zN2 = composerImplV.n(stateB) | z2;
            Object objG3 = composerImplV.G();
            if (zN2 || objG3 == composer$Companion$Empty$1) {
                objG3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        DrawScope drawScope = (DrawScope) obj;
                        float f = ModalBottomSheetKt.f1300a;
                        DrawScope.S(drawScope, j, 0L, 0L, RangesKt.b(((Number) stateB.getD()).floatValue(), BitmapDescriptorFactory.HUE_RED, 1.0f), null, null, 118);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG3);
            }
            CanvasKt.a(modifierX02, (Function1) objG3, composerImplV, 0);
            composerImplV.V(false);
        } else {
            composerImplV.o(478559490);
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    ModalBottomSheetKt.b(j, function0, z, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final ModalBottomSheetState c(final ModalBottomSheetValue modalBottomSheetValue, Function1 function1, Composer composer, int i, int i2) {
        final TweenSpec tweenSpec = ModalBottomSheetDefaults.b;
        if ((i2 & 4) != 0) {
            function1 = ModalBottomSheetKt$rememberModalBottomSheetState$1.h;
        }
        final Function1 function12 = function1;
        final boolean z = (i2 & 8) == 0;
        final Density density = (Density) composer.x(CompositionLocalsKt.h);
        composer.J(976451635, modalBottomSheetValue);
        Object[] objArr = {modalBottomSheetValue, tweenSpec, Boolean.valueOf(z), function12, density};
        Function1<ModalBottomSheetValue, ModalBottomSheetState> function13 = new Function1<ModalBottomSheetValue, ModalBottomSheetState>() { // from class: androidx.compose.material.ModalBottomSheetState$Companion$Saver$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return new ModalBottomSheetState((ModalBottomSheetValue) obj, density, function12, tweenSpec, z);
            }
        };
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f1701a;
        SaverKt$Saver$1 saverKt$Saver$12 = new SaverKt$Saver$1(function13, ModalBottomSheetState$Companion$Saver$1.h);
        boolean zN = composer.n(density) | ((((i & 896) ^ KyberEngine.KyberPolyBytes) > 256 && composer.n(function12)) || (i & KyberEngine.KyberPolyBytes) == 256) | composer.I(tweenSpec) | ((((i & 7168) ^ 3072) > 2048 && composer.p(z)) || (i & 3072) == 2048);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            Object obj = new Function0<ModalBottomSheetState>() { // from class: androidx.compose.material.ModalBottomSheetKt$rememberModalBottomSheetState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new ModalBottomSheetState(modalBottomSheetValue, density, function12, tweenSpec, z);
                }
            };
            composer.A(obj);
            objG = obj;
        }
        ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) RememberSaveableKt.c(objArr, saverKt$Saver$12, (Function0) objG, composer, 0, 4);
        composer.M();
        return modalBottomSheetState;
    }
}
