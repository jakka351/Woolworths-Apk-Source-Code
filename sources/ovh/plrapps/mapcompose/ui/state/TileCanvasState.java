package ovh.plrapps.mapcompose.ui.state;

import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import ovh.plrapps.mapcompose.core.DebounceKt;
import ovh.plrapps.mapcompose.core.Layer;
import ovh.plrapps.mapcompose.core.ThrottleKt;
import ovh.plrapps.mapcompose.core.Tile;
import ovh.plrapps.mapcompose.core.TileCollector;
import ovh.plrapps.mapcompose.core.VisibleTiles;
import ovh.plrapps.mapcompose.core.VisibleTilesResolver;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lovh/plrapps/mapcompose/ui/state/TileCanvasState;", "", "VisibleState", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class TileCanvasState {

    /* renamed from: a, reason: collision with root package name */
    public final VisibleTilesResolver f26957a;
    public final ContextScope b;
    public final MutableState c;
    public Object d;
    public final MutableStateFlow e;
    public final StateFlow f;
    public final BufferedChannel g;
    public final BufferedChannel h;
    public final MutableStateFlow i;
    public final float j;
    public final MutableState k;
    public final BufferedChannel l;
    public final BufferedChannel m;
    public final BufferedChannel n;
    public final LinkedHashSet o;
    public final TileCollector p;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.state.TileCanvasState$1", f = "TileCanvasState.kt", l = {88}, m = "invokeSuspend")
    /* renamed from: ovh.plrapps.mapcompose.ui.state.TileCanvasState$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return TileCanvasState.this.new AnonymousClass1(continuation);
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
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            ResultKt.b(obj);
            this.p = 1;
            TileCanvasState tileCanvasState = TileCanvasState.this;
            Object objH = FlowKt.h(tileCanvasState.i, new TileCanvasState$collectNewTiles$2(tileCanvasState, null), this);
            if (objH != coroutineSingletons) {
                objH = unit;
            }
            return objH == coroutineSingletons ? coroutineSingletons : unit;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.state.TileCanvasState$2", f = "TileCanvasState.kt", l = {98}, m = "invokeSuspend")
    /* renamed from: ovh.plrapps.mapcompose.ui.state.TileCanvasState$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "layers", "", "Lovh/plrapps/mapcompose/core/Layer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.state.TileCanvasState$2$1", f = "TileCanvasState.kt", l = {99}, m = "invokeSuspend")
        /* renamed from: ovh.plrapps.mapcompose.ui.state.TileCanvasState$2$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends Layer>, Continuation<? super Unit>, Object> {
            public int p;
            public /* synthetic */ Object q;
            public final /* synthetic */ TileCanvasState r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TileCanvasState tileCanvasState, Continuation continuation) {
                super(2, continuation);
                this.r = tileCanvasState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, continuation);
                anonymousClass1.q = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                int i = this.p;
                if (i == 0) {
                    ResultKt.b(obj);
                    List list = (List) this.q;
                    TileCanvasState tileCanvasState = this.r;
                    TileCollector tileCollector = tileCanvasState.p;
                    BufferedChannel bufferedChannel = tileCanvasState.g;
                    BufferedChannel bufferedChannel2 = tileCanvasState.h;
                    this.p = 1;
                    if (tileCollector.a(bufferedChannel, bufferedChannel2, list, this) == coroutineSingletons) {
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

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return TileCanvasState.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                TileCanvasState tileCanvasState = TileCanvasState.this;
                MutableStateFlow mutableStateFlow = tileCanvasState.e;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(tileCanvasState, null);
                this.p = 1;
                if (FlowKt.h(mutableStateFlow, anonymousClass1, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.state.TileCanvasState$3", f = "TileCanvasState.kt", l = {109}, m = "invokeSuspend")
    /* renamed from: ovh.plrapps.mapcompose.ui.state.TileCanvasState$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return TileCanvasState.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                TileCanvasState tileCanvasState = TileCanvasState.this;
                BufferedChannel bufferedChannel = tileCanvasState.h;
                this.p = 1;
                if (TileCanvasState.a(tileCanvasState, bufferedChannel, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.state.TileCanvasState$4", f = "TileCanvasState.kt", l = {118}, m = "invokeSuspend")
    /* renamed from: ovh.plrapps.mapcompose.ui.state.TileCanvasState$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public ChannelIterator p;
        public int q;

        public AnonymousClass4(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return TileCanvasState.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:12:0x002e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r1 = r5.q
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlinx.coroutines.channels.ChannelIterator r1 = r5.p
                kotlin.ResultKt.b(r6)
                goto L2e
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.ResultKt.b(r6)
                ovh.plrapps.mapcompose.ui.state.TileCanvasState r6 = ovh.plrapps.mapcompose.ui.state.TileCanvasState.this
                kotlinx.coroutines.channels.BufferedChannel r6 = r6.l
                kotlinx.coroutines.channels.ChannelIterator r6 = r6.iterator()
                r1 = r6
            L23:
                r5.p = r1
                r5.q = r2
                java.lang.Object r6 = r1.b(r5)
                if (r6 != r0) goto L2e
                return r0
            L2e:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L47
                java.lang.Object r6 = r1.next()
                ovh.plrapps.mapcompose.core.Tile r6 = (ovh.plrapps.mapcompose.core.Tile) r6
                android.graphics.Bitmap r3 = r6.g
                r4 = 0
                r6.g = r4
                if (r3 == 0) goto L23
                r3.recycle()
                goto L23
            L47:
                kotlin.Unit r6 = kotlin.Unit.f24250a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.ui.state.TileCanvasState.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/state/TileCanvasState$VisibleState;", "", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VisibleState {

        /* renamed from: a, reason: collision with root package name */
        public final VisibleTiles f26958a;
        public final ArrayList b;
        public final ArrayList c;

        public VisibleState(VisibleTiles visibleTiles, ArrayList arrayList, ArrayList arrayList2) {
            Intrinsics.h(visibleTiles, "visibleTiles");
            this.f26958a = visibleTiles;
            this.b = arrayList;
            this.c = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VisibleState)) {
                return false;
            }
            VisibleState visibleState = (VisibleState) obj;
            return Intrinsics.c(this.f26958a, visibleState.f26958a) && this.b.equals(visibleState.b) && this.c.equals(visibleState.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + a.b(this.f26958a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VisibleState(visibleTiles=");
            sb.append(this.f26958a);
            sb.append(", layerIds=");
            sb.append(this.b);
            sb.append(", opacities=");
            return android.support.v4.media.session.a.q(")", sb, this.c);
        }
    }

    public TileCanvasState(ContextScope contextScope, int i, VisibleTilesResolver visibleTilesResolver, int i2) {
        this.f26957a = visibleTilesResolver;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.g(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        ContextScope contextScopeA = CoroutineScopeKt.a(contextScope.d.plus(new ExecutorCoroutineDispatcherImpl(executorServiceNewSingleThreadExecutor)));
        this.b = contextScopeA;
        EmptyList emptyList = EmptyList.d;
        this.c = SnapshotStateKt.f(emptyList);
        this.d = EmptyMap.d;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(emptyList);
        this.e = mutableStateFlowA;
        this.f = FlowKt.b(mutableStateFlowA);
        this.g = ChannelKt.a(0, 6, null);
        this.h = ChannelKt.a(0, 6, null);
        this.i = StateFlowKt.a(null);
        this.j = 0.07f;
        this.k = SnapshotStateKt.f(null);
        this.l = ChannelKt.a(Integer.MAX_VALUE, 6, null);
        this.m = DebounceKt.a(contextScopeA, new TileCanvasState$idleDebounced$1(this, null));
        this.n = ThrottleKt.a(contextScopeA, 34L, new TileCanvasState$renderTask$1(this, null));
        this.o = new LinkedHashSet();
        BuildersKt.c(contextScopeA, null, null, new AnonymousClass1(null), 3);
        this.p = new TileCollector(i2 < 1 ? 1 : i2, false, i);
        BuildersKt.c(contextScopeA, null, null, new AnonymousClass2(null), 3);
        BuildersKt.c(contextScopeA, null, null, new AnonymousClass3(null), 3);
        BuildersKt.c(contextScopeA, MainDispatcherLoader.f24726a, null, new AnonymousClass4(null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0049 -> B:18:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ovh.plrapps.mapcompose.ui.state.TileCanvasState r8, kotlinx.coroutines.channels.BufferedChannel r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            kotlin.Unit r0 = kotlin.Unit.f24250a
            boolean r1 = r10 instanceof ovh.plrapps.mapcompose.ui.state.TileCanvasState$consumeTiles$1
            if (r1 == 0) goto L15
            r1 = r10
            ovh.plrapps.mapcompose.ui.state.TileCanvasState$consumeTiles$1 r1 = (ovh.plrapps.mapcompose.ui.state.TileCanvasState$consumeTiles$1) r1
            int r2 = r1.t
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.t = r2
            goto L1a
        L15:
            ovh.plrapps.mapcompose.ui.state.TileCanvasState$consumeTiles$1 r1 = new ovh.plrapps.mapcompose.ui.state.TileCanvasState$consumeTiles$1
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.t
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            kotlinx.coroutines.channels.ChannelIterator r8 = r1.q
            ovh.plrapps.mapcompose.ui.state.TileCanvasState r9 = r1.p
            kotlin.ResultKt.b(r10)
            goto L4c
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.ResultKt.b(r10)
            kotlinx.coroutines.channels.ChannelIterator r9 = r9.iterator()
            r7 = r9
            r9 = r8
            r8 = r7
        L3f:
            r1.p = r9
            r1.q = r8
            r1.t = r4
            java.lang.Object r10 = r8.b(r1)
            if (r10 != r2) goto L4c
            return r2
        L4c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lda
            java.lang.Object r10 = r8.next()
            ovh.plrapps.mapcompose.core.Tile r10 = (ovh.plrapps.mapcompose.core.Tile) r10
            kotlinx.coroutines.flow.MutableStateFlow r3 = r9.i
            java.lang.Object r3 = r3.getValue()
            ovh.plrapps.mapcompose.ui.state.TileCanvasState$VisibleState r3 = (ovh.plrapps.mapcompose.ui.state.TileCanvasState.VisibleState) r3
            if (r3 != 0) goto L65
            goto L3f
        L65:
            ovh.plrapps.mapcompose.core.VisibleTiles r5 = r3.f26958a
            java.util.ArrayList r6 = r3.b
            java.util.ArrayList r3 = r3.c
            boolean r5 = b(r5, r10)
            if (r5 == 0) goto Ld0
            java.util.LinkedHashSet r5 = r9.o
            boolean r5 = r5.contains(r10)
            if (r5 != 0) goto Ld0
            java.util.List r5 = r10.e
            boolean r5 = kotlin.jvm.internal.Intrinsics.c(r5, r6)
            if (r5 == 0) goto Ld0
            java.util.ArrayList r5 = r10.f
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto Ld0
            java.lang.Object r3 = r9.d
            int r5 = ovh.plrapps.mapcompose.core.TileKt.a(r10)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            java.lang.Object r3 = r3.get(r6)
            ovh.plrapps.mapcompose.core.Tile r3 = (ovh.plrapps.mapcompose.core.Tile) r3
            if (r3 == 0) goto Lbc
            java.util.List r5 = r3.e
            java.util.List r6 = r10.e
            boolean r5 = kotlin.jvm.internal.Intrinsics.c(r5, r6)
            if (r5 == 0) goto Lb0
            java.util.ArrayList r5 = r3.f
            java.util.ArrayList r6 = r10.f
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto Lbc
        Lb0:
            r10.i = r3
            androidx.compose.runtime.MutableFloatState r3 = r10.h
            androidx.compose.runtime.SnapshotMutableFloatStateImpl r3 = (androidx.compose.runtime.SnapshotMutableFloatStateImpl) r3
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.p(r5)
            goto Lc5
        Lbc:
            float r3 = r9.j
            androidx.compose.runtime.MutableFloatState r5 = r10.h
            androidx.compose.runtime.SnapshotMutableFloatStateImpl r5 = (androidx.compose.runtime.SnapshotMutableFloatStateImpl) r5
            r5.p(r3)
        Lc5:
            java.util.LinkedHashSet r3 = r9.o
            r3.add(r10)
            kotlinx.coroutines.channels.BufferedChannel r10 = r9.n
            r10.k(r0)
            goto Ld3
        Ld0:
            r9.e(r10)
        Ld3:
            kotlinx.coroutines.channels.BufferedChannel r10 = r9.m
            r10.k(r0)
            goto L3f
        Lda:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.ui.state.TileCanvasState.a(ovh.plrapps.mapcompose.ui.state.TileCanvasState, kotlinx.coroutines.channels.BufferedChannel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static boolean b(VisibleTiles visibleTiles, Tile tile) {
        IntRange intRange;
        if (visibleTiles.f26939a != tile.f26935a || (intRange = (IntRange) visibleTiles.b.get(Integer.valueOf(tile.b))) == null || visibleTiles.d != tile.d) {
            return false;
        }
        int i = intRange.d;
        int i2 = intRange.e;
        int i3 = tile.c;
        return i <= i3 && i3 <= i2;
    }

    public static int d(int i, int i2) {
        return ((i + 1) * ((int) Math.pow(2.0d, i2))) - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (r12 <= r9) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0110, code lost:
    
        if (r5 <= r10) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(ovh.plrapps.mapcompose.core.VisibleTiles r19, java.util.ArrayList r20, java.util.ArrayList r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.ui.state.TileCanvasState.c(ovh.plrapps.mapcompose.core.VisibleTiles, java.util.ArrayList, java.util.ArrayList, boolean):void");
    }

    public final void e(Tile tile) {
        Bitmap bitmap = tile.g;
        if (bitmap == null) {
            return;
        }
        if (!bitmap.isMutable()) {
            this.l.k(tile);
        }
        ((SnapshotMutableFloatStateImpl) tile.h).p(BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (kotlinx.coroutines.BuildersKt.f(r2, r4, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(ovh.plrapps.mapcompose.core.Viewport r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ovh.plrapps.mapcompose.ui.state.TileCanvasState$setViewport$1
            if (r0 == 0) goto L13
            r0 = r8
            ovh.plrapps.mapcompose.ui.state.TileCanvasState$setViewport$1 r0 = (ovh.plrapps.mapcompose.ui.state.TileCanvasState$setViewport$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            ovh.plrapps.mapcompose.ui.state.TileCanvasState$setViewport$1 r0 = new ovh.plrapps.mapcompose.ui.state.TileCanvasState$setViewport$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r8)
            goto L67
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            ovh.plrapps.mapcompose.ui.state.TileCanvasState r7 = r0.p
            kotlin.ResultKt.b(r8)
            goto L51
        L39:
            kotlin.ResultKt.b(r8)
            kotlinx.coroutines.scheduling.DefaultScheduler r8 = kotlinx.coroutines.Dispatchers.f24691a
            kotlinx.coroutines.MainCoroutineDispatcher r8 = kotlinx.coroutines.internal.MainDispatcherLoader.f24726a
            ovh.plrapps.mapcompose.ui.state.TileCanvasState$setViewport$visibleTiles$1 r2 = new ovh.plrapps.mapcompose.ui.state.TileCanvasState$setViewport$visibleTiles$1
            r2.<init>(r6, r7, r5)
            r0.p = r6
            r0.s = r4
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.f(r8, r2, r0)
            if (r8 != r1) goto L50
            goto L66
        L50:
            r7 = r6
        L51:
            ovh.plrapps.mapcompose.core.VisibleTiles r8 = (ovh.plrapps.mapcompose.core.VisibleTiles) r8
            kotlinx.coroutines.internal.ContextScope r2 = r7.b
            kotlin.coroutines.CoroutineContext r2 = r2.d
            ovh.plrapps.mapcompose.ui.state.TileCanvasState$setViewport$2 r4 = new ovh.plrapps.mapcompose.ui.state.TileCanvasState$setViewport$2
            r4.<init>(r7, r8, r5)
            r0.p = r5
            r0.s = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.f(r2, r4, r0)
            if (r7 != r1) goto L67
        L66:
            return r1
        L67:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.ui.state.TileCanvasState.f(ovh.plrapps.mapcompose.core.Viewport, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
