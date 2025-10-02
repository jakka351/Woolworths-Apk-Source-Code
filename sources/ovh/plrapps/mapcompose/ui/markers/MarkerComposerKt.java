package ovh.plrapps.mapcompose.ui.markers;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableDoubleState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableDoubleStateImpl;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import ovh.plrapps.mapcompose.ui.state.MapState;
import ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState;
import ovh.plrapps.mapcompose.ui.state.markers.CalloutData;
import ovh.plrapps.mapcompose.ui.state.markers.DragEndListener;
import ovh.plrapps.mapcompose.ui.state.markers.DragInterceptor;
import ovh.plrapps.mapcompose.ui.state.markers.DragStartListener;
import ovh.plrapps.mapcompose.ui.state.markers.MarkerRenderState;
import ovh.plrapps.mapcompose.ui.state.markers.MarkerState;
import ovh.plrapps.mapcompose.ui.state.markers.model.MarkerData;
import ovh.plrapps.mapcompose.utils.RotationUtilsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"mapcompose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MarkerComposerKt {
    public static final void a(final Modifier modifier, final ZoomPanRotateState zoomPRState, final MarkerRenderState markerRenderState, final MapState mapState, Composer composer, final int i) {
        Intrinsics.h(modifier, "modifier");
        Intrinsics.h(zoomPRState, "zoomPRState");
        Intrinsics.h(markerRenderState, "markerRenderState");
        ComposerImpl composerImplV = composer.v(228130597);
        MarkerLayoutKt.a(modifier, zoomPRState, ComposableLambdaKt.c(-2075769928, new Function2<Composer, Integer, Unit>() { // from class: ovh.plrapps.mapcompose.ui.markers.MarkerComposerKt$MarkerComposer$1

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.markers.MarkerComposerKt$MarkerComposer$1$1", f = "MarkerComposer.kt", l = {41}, m = "invokeSuspend")
            /* renamed from: ovh.plrapps.mapcompose.ui.markers.MarkerComposerKt$MarkerComposer$1$1, reason: invalid class name */
            final class AnonymousClass1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                public int p;
                public /* synthetic */ Object q;
                public final /* synthetic */ MarkerData r;
                public final /* synthetic */ ZoomPanRotateState s;
                public final /* synthetic */ MapState t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(MarkerData markerData, ZoomPanRotateState zoomPanRotateState, MapState mapState, Continuation continuation) {
                    super(2, continuation);
                    this.r = markerData;
                    this.s = zoomPanRotateState;
                    this.t = mapState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, this.t, continuation);
                    anonymousClass1.q = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass1) create((PointerInputScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                    int i = this.p;
                    if (i == 0) {
                        ResultKt.b(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.q;
                        final MarkerData markerData = this.r;
                        Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: ovh.plrapps.mapcompose.ui.markers.MarkerComposerKt.MarkerComposer.1.1.1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                long j = ((Offset) obj2).f1751a;
                                MarkerData markerData2 = markerData;
                                DragStartListener dragStartListener = (DragStartListener) ((SnapshotMutableStateImpl) markerData2.i).getD();
                                if (dragStartListener != null) {
                                    ((SnapshotMutableDoubleStateImpl) markerData2.d).f();
                                    ((SnapshotMutableDoubleStateImpl) markerData2.e).f();
                                    dragStartListener.a();
                                }
                                return Unit.f24250a;
                            }
                        };
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: ovh.plrapps.mapcompose.ui.markers.MarkerComposerKt.MarkerComposer.1.1.2
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                MarkerData markerData2 = markerData;
                                DragEndListener dragEndListener = (DragEndListener) ((SnapshotMutableStateImpl) markerData2.j).getD();
                                if (dragEndListener != null) {
                                    ((SnapshotMutableDoubleStateImpl) markerData2.d).f();
                                    ((SnapshotMutableDoubleStateImpl) markerData2.e).f();
                                    dragEndListener.a();
                                }
                                return Unit.f24250a;
                            }
                        };
                        final ZoomPanRotateState zoomPanRotateState = this.s;
                        final MapState mapState = this.t;
                        Function2<PointerInputChange, Offset, Unit> function2 = new Function2<PointerInputChange, Offset, Unit>() { // from class: ovh.plrapps.mapcompose.ui.markers.MarkerComposerKt.MarkerComposer.1.1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                PointerInputChange change = (PointerInputChange) obj2;
                                long j = ((Offset) obj3).f1751a;
                                Intrinsics.h(change, "change");
                                change.a();
                                MarkerData markerData2 = markerData;
                                MutableState mutableState = markerData2.k;
                                DragInterceptor dragInterceptor = (DragInterceptor) ((SnapshotMutableStateImpl) mutableState).getD();
                                MutableDoubleState mutableDoubleState = markerData2.d;
                                if (dragInterceptor != null) {
                                    long j2 = change.c;
                                    ZoomPanRotateState zoomPanRotateState2 = zoomPanRotateState;
                                    float f = -(((SnapshotMutableFloatStateImpl) zoomPanRotateState2.m).a() * 0.017453292f);
                                    double dC = RotationUtilsKt.c(Offset.e(j), Offset.f(j), f);
                                    double d = RotationUtilsKt.d(Offset.e(j), Offset.f(j), f);
                                    SnapshotMutableDoubleStateImpl snapshotMutableDoubleStateImpl = (SnapshotMutableDoubleStateImpl) mutableDoubleState;
                                    double dF = snapshotMutableDoubleStateImpl.f();
                                    double d2 = zoomPanRotateState2.f26960a;
                                    SnapshotMutableDoubleStateImpl snapshotMutableDoubleStateImpl2 = (SnapshotMutableDoubleStateImpl) zoomPanRotateState2.l;
                                    RangesKt.a((dC / (snapshotMutableDoubleStateImpl2.f() * d2)) + dF, 0.0d, 1.0d);
                                    snapshotMutableDoubleStateImpl.f();
                                    SnapshotMutableDoubleStateImpl snapshotMutableDoubleStateImpl3 = (SnapshotMutableDoubleStateImpl) markerData2.e;
                                    double dF2 = snapshotMutableDoubleStateImpl3.f();
                                    double d3 = zoomPanRotateState2.b;
                                    RangesKt.a((d / (snapshotMutableDoubleStateImpl2.f() * d3)) + dF2, 0.0d, 1.0d);
                                    snapshotMutableDoubleStateImpl3.f();
                                    long jG = Offset.g(j2, OffsetKt.a(Offset.e(markerData2.b()) * (-markerData2.q), Offset.f(markerData2.b()) * (-markerData2.r)));
                                    long jA = OffsetKt.a((float) RotationUtilsKt.c(Offset.e(jG), Offset.f(jG), f), (float) RotationUtilsKt.d(Offset.e(jG), Offset.f(jG), f));
                                    double dE = (Offset.e(jA) / (snapshotMutableDoubleStateImpl2.f() * d2)) + snapshotMutableDoubleStateImpl.f();
                                    double dF3 = (Offset.f(jA) / (snapshotMutableDoubleStateImpl2.f() * d3)) + snapshotMutableDoubleStateImpl3.f();
                                    DragInterceptor dragInterceptor2 = (DragInterceptor) ((SnapshotMutableStateImpl) mutableState).getD();
                                    if (dragInterceptor2 != null) {
                                        snapshotMutableDoubleStateImpl.f();
                                        snapshotMutableDoubleStateImpl3.f();
                                        if (markerData2.c()) {
                                            RangesKt.a(dE, 0.0d, 1.0d);
                                        }
                                        if (markerData2.c()) {
                                            RangesKt.a(dF3, 0.0d, 1.0d);
                                        }
                                        dragInterceptor2.a();
                                    }
                                } else {
                                    String str = markerData2.f26963a;
                                    MapState mapState2 = mapState;
                                    ZoomPanRotateState zoomPanRotateState3 = mapState2.b;
                                    MutableFloatState mutableFloatState = zoomPanRotateState3.m;
                                    MutableDoubleState mutableDoubleState2 = zoomPanRotateState3.l;
                                    float f2 = -(((SnapshotMutableFloatStateImpl) mutableFloatState).a() * 0.017453292f);
                                    double dC2 = RotationUtilsKt.c(Offset.e(j), Offset.f(j), f2);
                                    double d4 = RotationUtilsKt.d(Offset.e(j), Offset.f(j), f2);
                                    MarkerState markerState = mapState2.d;
                                    SnapshotMutableDoubleStateImpl snapshotMutableDoubleStateImpl4 = (SnapshotMutableDoubleStateImpl) mutableDoubleState2;
                                    double dF4 = dC2 / (snapshotMutableDoubleStateImpl4.f() * zoomPanRotateState3.f26960a);
                                    double dF5 = d4 / (snapshotMutableDoubleStateImpl4.f() * zoomPanRotateState3.b);
                                    markerState.getClass();
                                    MarkerData markerDataB = markerState.b(str);
                                    if (markerDataB != null) {
                                        MutableDoubleState mutableDoubleState3 = markerDataB.e;
                                        MutableDoubleState mutableDoubleState4 = markerDataB.d;
                                        double dF6 = ((SnapshotMutableDoubleStateImpl) mutableDoubleState4).f() + dF4;
                                        if (markerDataB.c()) {
                                            dF6 = RangesKt.a(dF6, 0.0d, 1.0d);
                                        }
                                        ((SnapshotMutableDoubleStateImpl) mutableDoubleState4).s(dF6);
                                        double dF7 = ((SnapshotMutableDoubleStateImpl) mutableDoubleState3).f() + dF5;
                                        if (markerDataB.c()) {
                                            dF7 = RangesKt.a(dF7, 0.0d, 1.0d);
                                        }
                                        ((SnapshotMutableDoubleStateImpl) mutableDoubleState3).s(dF7);
                                    }
                                }
                                return Unit.f24250a;
                            }
                        };
                        this.p = 1;
                        if (DragGestureDetectorKt.f(pointerInputScope, function1, function0, function2, this, 4) == coroutineSingletons) {
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

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.markers.MarkerComposerKt$MarkerComposer$1$3", f = "MarkerComposer.kt", l = {84}, m = "invokeSuspend")
            /* renamed from: ovh.plrapps.mapcompose.ui.markers.MarkerComposerKt$MarkerComposer$1$3, reason: invalid class name */
            final class AnonymousClass3 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

                @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: ovh.plrapps.mapcompose.ui.markers.MarkerComposerKt$MarkerComposer$1$3$1, reason: invalid class name */
                final class AnonymousClass1 extends Lambda implements Function1<Offset, Unit> {
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        long j = ((Offset) obj).f1751a;
                        throw null;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    throw null;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    throw null;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                    ResultKt.b(obj);
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer2 = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue() & 11;
                Unit unit = Unit.f24250a;
                if (iIntValue == 2 && composer2.c()) {
                    composer2.j();
                    return unit;
                }
                composer2.o(1500469330);
                MarkerRenderState markerRenderState2 = markerRenderState;
                for (MarkerData markerData : (List) markerRenderState2.f26961a.getD()) {
                    composer2.J(1500472513, markerData.u);
                    Modifier modifierX0 = Modifier.Companion.d;
                    Modifier modifierB = LayoutIdKt.b(modifierX0, markerData);
                    if (((Boolean) ((SnapshotMutableStateImpl) markerData.h).getD()).booleanValue()) {
                        modifierX0 = modifierX0.x0(new SuspendPointerInputElement(unit, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new AnonymousClass1(markerData, zoomPRState, mapState, null)), 6));
                    }
                    Modifier modifierX02 = modifierB.x0(modifierX0);
                    MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                    int p = composer2.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                    Modifier modifierD = ComposedModifierKt.d(composer2, modifierX02);
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
                    Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                    Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                    Function2 function2 = ComposeUiNode.Companion.j;
                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                        b.z(p, composer2, p, function2);
                    }
                    Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                    markerData.c.invoke(composer2, 0);
                    composer2.f();
                    composer2.M();
                }
                composer2.l();
                Iterator it = markerRenderState2.f.g.iterator();
                if (!it.hasNext()) {
                    return unit;
                }
                ((CalloutData) it.next()).getClass();
                throw null;
            }
        }, composerImplV), composerImplV, 454);
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(zoomPRState, markerRenderState, mapState, i) { // from class: ovh.plrapps.mapcompose.ui.markers.MarkerComposerKt$MarkerComposer$2
                public final /* synthetic */ ZoomPanRotateState i;
                public final /* synthetic */ MarkerRenderState j;
                public final /* synthetic */ MapState k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(4679);
                    MarkerComposerKt.a(this.h, this.i, this.j, this.k, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
