package ovh.plrapps.mapcompose.ui.state.markers;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import ovh.plrapps.mapcompose.ui.gestures.model.HitType;
import ovh.plrapps.mapcompose.ui.state.markers.model.MarkerData;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/state/markers/MarkerState;", "", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarkerState {

    /* renamed from: a, reason: collision with root package name */
    public final MarkerRenderState f26962a;
    public final MutableStateFlow b = StateFlowKt.a(EmptyList.d);

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.state.markers.MarkerState$1", f = "MarkerState.kt", l = {34}, m = "invokeSuspend")
    /* renamed from: ovh.plrapps.mapcompose.ui.state.markers.MarkerState$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MarkerState.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return Unit.f24250a;
            }
            ResultKt.b(obj);
            this.p = 1;
            MarkerState.a(MarkerState.this, this);
            return coroutineSingletons;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[HitType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                HitType hitType = HitType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MarkerState(ContextScope contextScope, MarkerRenderState markerRenderState) {
        this.f26962a = markerRenderState;
        new LinkedHashMap();
        new LinkedHashMap();
        BuildersKt.c(contextScope, null, null, new AnonymousClass1(null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final ovh.plrapps.mapcompose.ui.state.markers.MarkerState r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof ovh.plrapps.mapcompose.ui.state.markers.MarkerState$renderRegularMarkers$1
            if (r0 == 0) goto L13
            r0 = r5
            ovh.plrapps.mapcompose.ui.state.markers.MarkerState$renderRegularMarkers$1 r0 = (ovh.plrapps.mapcompose.ui.state.markers.MarkerState$renderRegularMarkers$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            ovh.plrapps.mapcompose.ui.state.markers.MarkerState$renderRegularMarkers$1 r0 = new ovh.plrapps.mapcompose.ui.state.markers.MarkerState$renderRegularMarkers$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r0.r
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 == r2) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            kotlin.KotlinNothingValueException r4 = android.support.v4.media.session.a.v(r5)
            throw r4
        L30:
            kotlin.ResultKt.b(r5)
            kotlinx.coroutines.flow.MutableStateFlow r5 = r4.b
            ovh.plrapps.mapcompose.ui.state.markers.MarkerState$renderRegularMarkers$2 r1 = new ovh.plrapps.mapcompose.ui.state.markers.MarkerState$renderRegularMarkers$2
            r1.<init>()
            r0.r = r2
            r5.collect(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.ui.state.markers.MarkerState.a(ovh.plrapps.mapcompose.ui.state.markers.MarkerState, kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }

    public final MarkerData b(String id) {
        Object next;
        Intrinsics.h(id, "id");
        Iterator it = ((Iterable) this.b.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.c(((MarkerData) next).f26963a, id)) {
                break;
            }
        }
        return (MarkerData) next;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(final int r22, final int r23, ovh.plrapps.mapcompose.ui.gestures.model.HitType r24) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.ui.state.markers.MarkerState.c(int, int, ovh.plrapps.mapcompose.ui.gestures.model.HitType):boolean");
    }
}
