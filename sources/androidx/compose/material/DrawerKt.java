package androidx.compose.material;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
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
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "alpha", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DrawerKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1277a;
    public static final float b;
    public static final float c = 400;
    public static final TweenSpec d = new TweenSpec(256, (Easing) null, 6);

    static {
        float f = 56;
        f1277a = f;
        b = f;
    }

    public static final void a(final Function3 function3, final Modifier modifier, final DrawerState drawerState, final boolean z, final Shape shape, final float f, final long j, final long j2, final long j3, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        DrawerState drawerState2;
        boolean z2;
        Shape shape2;
        float f2;
        long j4;
        long j5;
        long j6;
        ComposerImpl composerImplV = composer.v(1305806945);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            drawerState2 = drawerState;
            i2 |= composerImplV.n(drawerState2) ? 256 : 128;
        } else {
            drawerState2 = drawerState;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= composerImplV.p(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            shape2 = shape;
            i2 |= composerImplV.n(shape2) ? 16384 : 8192;
        } else {
            shape2 = shape;
        }
        if ((196608 & i) == 0) {
            f2 = f;
            i2 |= composerImplV.q(f2) ? 131072 : 65536;
        } else {
            f2 = f;
        }
        if ((1572864 & i) == 0) {
            j4 = j;
            i2 |= composerImplV.s(j4) ? 1048576 : 524288;
        } else {
            j4 = j;
        }
        if ((12582912 & i) == 0) {
            j5 = j2;
            i2 |= composerImplV.s(j5) ? 8388608 : 4194304;
        } else {
            j5 = j2;
        }
        if ((100663296 & i) == 0) {
            j6 = j3;
            i2 |= composerImplV.s(j6) ? 67108864 : 33554432;
        } else {
            j6 = j3;
        }
        if ((805306368 & i) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 536870912 : 268435456;
        }
        int i3 = i2;
        if (composerImplV.z(i3 & 1, (i3 & 306783379) != 306783378)) {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = b.h(composerImplV.y(), composerImplV);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objG;
            final DrawerState drawerState3 = drawerState2;
            final boolean z3 = z2;
            final Shape shape3 = shape2;
            final float f3 = f2;
            final long j7 = j4;
            final long j8 = j5;
            final long j9 = j6;
            BoxWithConstraintsKt.a(modifier.x0(SizeKt.c), null, false, ComposableLambdaKt.c(816674999, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxWithConstraintsScope boxWithConstraintsScope = (BoxWithConstraintsScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(boxWithConstraintsScope) ? 4 : 2;
                    }
                    if (composer2.z(iIntValue & 1, (iIntValue & 19) != 18)) {
                        long b2 = boxWithConstraintsScope.getB();
                        if (!Constraints.d(b2)) {
                            throw new IllegalStateException("Drawer shouldn't have infinite width");
                        }
                        final float f4 = -Constraints.h(b2);
                        CompositionLocal compositionLocal = CompositionLocalsKt.h;
                        final Density density = (Density) composer2.x(compositionLocal);
                        final DrawerState drawerState4 = drawerState3;
                        boolean zN = composer2.n(drawerState4) | composer2.n(density) | composer2.q(f4);
                        Object objG2 = composer2.G();
                        Object obj4 = Composer.Companion.f1624a;
                        if (zN || objG2 == obj4) {
                            objG2 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Object d2;
                                    Density density2 = density;
                                    DrawerState drawerState5 = drawerState4;
                                    drawerState5.b = density2;
                                    final float f5 = f4;
                                    DraggableAnchors draggableAnchorsA = AnchoredDraggableKt.a(new Function1<DraggableAnchorsConfig<DrawerValue>, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$1$1$anchors$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj5;
                                            draggableAnchorsConfig.a(DrawerValue.d, f5);
                                            draggableAnchorsConfig.a(DrawerValue.e, BitmapDescriptorFactory.HUE_RED);
                                            return Unit.f24250a;
                                        }
                                    });
                                    AnchoredDraggableState anchoredDraggableState = drawerState5.f1278a;
                                    MutableFloatState mutableFloatState = anchoredDraggableState.j;
                                    State state = anchoredDraggableState.h;
                                    if (Float.isNaN(((SnapshotMutableFloatStateImpl) mutableFloatState).a())) {
                                        d2 = state.getD();
                                    } else {
                                        d2 = ((MapDraggableAnchors) draggableAnchorsA).b(((SnapshotMutableFloatStateImpl) anchoredDraggableState.j).a());
                                        if (d2 == null) {
                                            d2 = state.getD();
                                        }
                                    }
                                    anchoredDraggableState.l(draggableAnchorsA, d2);
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG2);
                        }
                        composer2.g((Function0) objG2);
                        boolean z4 = composer2.x(CompositionLocalsKt.n) == LayoutDirection.e;
                        AnchoredDraggableState anchoredDraggableState = drawerState4.f1278a;
                        Orientation orientation = Orientation.e;
                        boolean z5 = z3;
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierC = AnchoredDraggableKt.c(companion, anchoredDraggableState, orientation, z5, z4, 48);
                        BiasAlignment biasAlignment = Alignment.Companion.f1719a;
                        MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierC);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Function2 function2 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, measurePolicyD, function2);
                        Function2 function22 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function22);
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function24);
                        MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, companion);
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, measurePolicyD2, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD2, function24);
                        a.x(0, composer2, composableLambdaImpl);
                        boolean z6 = ((DrawerValue) ((SnapshotMutableStateImpl) drawerState4.f1278a.g).getD()) == DrawerValue.e;
                        final boolean z7 = z3;
                        boolean zP = composer2.p(z7) | composer2.n(drawerState4);
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        boolean zI = zP | composer2.I(coroutineScope2);
                        Object objG3 = composer2.G();
                        if (zI || objG3 == obj4) {
                            objG3 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1

                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1", f = "Drawer.kt", l = {506}, m = "invokeSuspend")
                                /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1, reason: invalid class name */
                                final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    public int p;
                                    public final /* synthetic */ DrawerState q;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(DrawerState drawerState, Continuation continuation) {
                                        super(2, continuation);
                                        this.q = drawerState;
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
                                        Unit unit = Unit.f24250a;
                                        if (i == 0) {
                                            ResultKt.b(obj);
                                            this.p = 1;
                                            Object objE = AnchoredDraggableKt.e(this.q.f1278a, DrawerValue.d, this);
                                            if (objE != coroutineSingletons) {
                                                objE = unit;
                                            }
                                            if (objE == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.b(obj);
                                        }
                                        return unit;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    if (z7) {
                                        DrawerState drawerState5 = drawerState4;
                                        if (((Boolean) drawerState5.f1278a.d.invoke(DrawerValue.d)).booleanValue()) {
                                            BuildersKt.c(coroutineScope2, null, null, new AnonymousClass1(drawerState5, null), 3);
                                        }
                                    }
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG3);
                        }
                        Function0 function02 = (Function0) objG3;
                        boolean zQ = composer2.q(f4) | composer2.n(drawerState4);
                        Object objG4 = composer2.G();
                        if (zQ || objG4 == obj4) {
                            objG4 = new Function0<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    float fG = drawerState4.f1278a.g();
                                    float f5 = DrawerKt.f1277a;
                                    float f6 = f4;
                                    float f7 = BitmapDescriptorFactory.HUE_RED;
                                    float f8 = (fG - f6) / (BitmapDescriptorFactory.HUE_RED - f6);
                                    if (f8 >= BitmapDescriptorFactory.HUE_RED) {
                                        f7 = f8;
                                    }
                                    if (f7 > 1.0f) {
                                        f7 = 1.0f;
                                    }
                                    return Float.valueOf(f7);
                                }
                            };
                            composer2.A(objG4);
                        }
                        DrawerKt.b(z6, function02, (Function0) objG4, j9, composer2, 0);
                        final String strA = Strings_androidKt.a(composer2, 0);
                        Density density2 = (Density) composer2.x(compositionLocal);
                        Modifier modifierS = SizeKt.s(companion, density2.B(Constraints.j(b2)), density2.B(Constraints.i(b2)), density2.B(Constraints.h(b2)), density2.B(Constraints.g(b2)));
                        boolean zN2 = composer2.n(drawerState4);
                        Object objG5 = composer2.G();
                        if (zN2 || objG5 == obj4) {
                            objG5 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    return new IntOffset(IntOffsetKt.a(MathKt.b(drawerState4.f1278a.g()), 0));
                                }
                            };
                            composer2.A(objG5);
                        }
                        Modifier modifierJ = PaddingKt.j(OffsetKt.a(modifierS, (Function1) objG5), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, DrawerKt.f1277a, BitmapDescriptorFactory.HUE_RED, 11);
                        boolean zN3 = composer2.n(strA) | composer2.n(drawerState4) | composer2.I(coroutineScope2);
                        Object objG6 = composer2.G();
                        if (zN3 || objG6 == obj4) {
                            objG6 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj5;
                                    SemanticsPropertiesKt.o(semanticsPropertyReceiver, strA);
                                    final DrawerState drawerState5 = drawerState4;
                                    if (((DrawerValue) ((SnapshotMutableStateImpl) drawerState5.f1278a.g).getD()) == DrawerValue.e) {
                                        final CoroutineScope coroutineScope3 = coroutineScope2;
                                        SemanticsPropertiesKt.d(semanticsPropertyReceiver, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1.1

                                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                            @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1", f = "Drawer.kt", l = {534}, m = "invokeSuspend")
                                            /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1, reason: invalid class name and collision with other inner class name */
                                            final class C00401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                public int p;
                                                public final /* synthetic */ DrawerState q;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C00401(DrawerState drawerState, Continuation continuation) {
                                                    super(2, continuation);
                                                    this.q = drawerState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Continuation create(Object obj, Continuation continuation) {
                                                    return new C00401(this.q, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    return ((C00401) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object invokeSuspend(Object obj) {
                                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                                                    int i = this.p;
                                                    Unit unit = Unit.f24250a;
                                                    if (i == 0) {
                                                        ResultKt.b(obj);
                                                        this.p = 1;
                                                        Object objE = AnchoredDraggableKt.e(this.q.f1278a, DrawerValue.d, this);
                                                        if (objE != coroutineSingletons) {
                                                            objE = unit;
                                                        }
                                                        if (objE == coroutineSingletons) {
                                                            return coroutineSingletons;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.b(obj);
                                                    }
                                                    return unit;
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                DrawerState drawerState6 = drawerState5;
                                                if (((Boolean) drawerState6.f1278a.d.invoke(DrawerValue.d)).booleanValue()) {
                                                    BuildersKt.c(coroutineScope3, null, null, new C00401(drawerState6, null), 3);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        });
                                    }
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG6);
                        }
                        Modifier modifierB = SemanticsModifierKt.b(modifierJ, false, (Function1) objG6);
                        final Function3 function32 = function3;
                        SurfaceKt.a(modifierB, shape3, j7, j8, null, f3, ComposableLambdaKt.c(-1941234439, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                Composer composer3 = (Composer) obj5;
                                int iIntValue2 = ((Number) obj6).intValue();
                                if (composer3.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    FillElement fillElement = SizeKt.c;
                                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer3, 0);
                                    int p3 = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer3.d();
                                    Modifier modifierD3 = ComposedModifierKt.d(composer3, fillElement);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function03 = ComposeUiNode.Companion.b;
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function03);
                                    } else {
                                        composer3.e();
                                    }
                                    Updater.b(composer3, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                                    Updater.b(composer3, persistentCompositionLocalMapD3, ComposeUiNode.Companion.f);
                                    Function2 function25 = ComposeUiNode.Companion.j;
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p3))) {
                                        b.z(p3, composer3, p3, function25);
                                    }
                                    Updater.b(composer3, modifierD3, ComposeUiNode.Companion.d);
                                    function32.invoke(ColumnScopeInstance.f948a, composer3, 6);
                                    composer3.f();
                                } else {
                                    composer3.j();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 1572864, 16);
                        composer2.f();
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 3072, 6);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    DrawerKt.a(function3, modifier, drawerState, z, shape, f, j, j2, j3, composableLambdaImpl, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final boolean z, final Function0 function0, final Function0 function02, final long j, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1983403750);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.s(j) ? 2048 : 1024;
        }
        if (composerImplV.z(i2 & 1, (i2 & 1171) != 1170)) {
            final String strA = Strings_androidKt.a(composerImplV, 1);
            Modifier modifierB = Modifier.Companion.d;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z) {
                composerImplV.o(487534424);
                int i3 = i2 & 112;
                boolean z2 = i3 == 32;
                Object objG = composerImplV.G();
                if (z2 || objG == composer$Companion$Empty$1) {
                    objG = new DrawerKt$Scrim$dismissDrawer$1$1(function0, null);
                    composerImplV.A(objG);
                }
                Modifier modifierX0 = modifierB.x0(new SuspendPointerInputElement(function0, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((Function2) objG), 6));
                boolean zN = (i3 == 32) | composerImplV.n(strA);
                Object objG2 = composerImplV.G();
                if (zN || objG2 == composer$Companion$Empty$1) {
                    objG2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                            SemanticsPropertiesKt.k(semanticsPropertyReceiver, strA);
                            final Function0 function03 = function0;
                            SemanticsPropertiesKt.h(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$2$1.1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function03.invoke();
                                    return Boolean.TRUE;
                                }
                            });
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG2);
                }
                modifierB = SemanticsModifierKt.b(modifierX0, true, (Function1) objG2);
                composerImplV.V(false);
            } else {
                composerImplV.o(487858498);
                composerImplV.V(false);
            }
            Modifier modifierX02 = SizeKt.c.x0(modifierB);
            boolean z3 = ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object objG3 = composerImplV.G();
            if (z3 || objG3 == composer$Companion$Empty$1) {
                objG3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.DrawerKt$Scrim$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        DrawScope.S((DrawScope) obj, j, 0L, 0L, ((Number) function02.invoke()).floatValue(), null, null, 118);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG3);
            }
            CanvasKt.a(modifierX02, (Function1) objG3, composerImplV, 0);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$Scrim$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    DrawerKt.b(z, function0, function02, j, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final DrawerState c(Composer composer) {
        DrawerValue drawerValue = DrawerValue.d;
        Object[] objArr = new Object[0];
        Function1<DrawerValue, DrawerState> function1 = new Function1<DrawerValue, DrawerState>() { // from class: androidx.compose.material.DrawerState$Companion$Saver$2
            public final /* synthetic */ Function1 h = DrawerKt$rememberDrawerState$1.h;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return new DrawerState((DrawerValue) obj);
            }
        };
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f1701a;
        SaverKt$Saver$1 saverKt$Saver$12 = new SaverKt$Saver$1(function1, DrawerState$Companion$Saver$1.h);
        boolean zN = composer.n(DrawerKt$rememberDrawerState$1.h);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = new Function0<DrawerState>() { // from class: androidx.compose.material.DrawerKt$rememberDrawerState$2$1
                public final /* synthetic */ Function1 h;

                {
                    DrawerValue drawerValue2 = DrawerValue.d;
                    this.h = DrawerKt$rememberDrawerState$1.h;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new DrawerState(DrawerValue.d);
                }
            };
            composer.A(objG);
        }
        return (DrawerState) RememberSaveableKt.c(objArr, saverKt$Saver$12, (Function0) objG, composer, 0, 4);
    }
}
