package net.engawapg.lib.zoomable;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.RememberedCoroutineScope;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"zoomable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ZoomableKt {
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        r10.invoke(r11);
        r11 = r11.f1851a;
        r2 = r11.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r5 >= r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (((androidx.compose.ui.input.pointer.PointerInputChange) r11.get(r5)).d == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069 A[EDGE_INSN: B:32:0x0069->B:24:0x0069 BREAK  A[LOOP:0: B:19:0x0057->B:23:0x0066], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004a -> B:18:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.AwaitPointerEventScope r9, kotlin.jvm.functions.Function1 r10, kotlin.coroutines.jvm.internal.BaseContinuationImpl r11) {
        /*
            boolean r0 = r11 instanceof net.engawapg.lib.zoomable.ZoomableKt$forEachPointerEventUntilReleased$1
            if (r0 == 0) goto L13
            r0 = r11
            net.engawapg.lib.zoomable.ZoomableKt$forEachPointerEventUntilReleased$1 r0 = (net.engawapg.lib.zoomable.ZoomableKt$forEachPointerEventUntilReleased$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            net.engawapg.lib.zoomable.ZoomableKt$forEachPointerEventUntilReleased$1 r0 = new net.engawapg.lib.zoomable.ZoomableKt$forEachPointerEventUntilReleased$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            kotlin.jvm.functions.Function1 r9 = r0.q
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = r0.p
            kotlin.ResultKt.b(r11)
            r8 = r10
            r10 = r9
            r9 = r8
            goto L4d
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            kotlin.ResultKt.b(r11)
        L3b:
            r0.p = r9
            r11 = r10
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            r0.q = r11
            r0.s = r3
            androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.e
            java.lang.Object r11 = r9.x1(r11, r0)
            if (r11 != r1) goto L4d
            return r1
        L4d:
            androidx.compose.ui.input.pointer.PointerEvent r11 = (androidx.compose.ui.input.pointer.PointerEvent) r11
            java.lang.Object r2 = r11.f1851a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L57:
            if (r6 >= r4) goto L69
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto L66
            goto L82
        L66:
            int r6 = r6 + 1
            goto L57
        L69:
            r10.invoke(r11)
            java.lang.Object r11 = r11.f1851a
            int r2 = r11.size()
        L72:
            if (r5 >= r2) goto L82
            java.lang.Object r4 = r11.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
            boolean r4 = r4.d
            if (r4 == 0) goto L7f
            goto L3b
        L7f:
            int r5 = r5 + 1
            goto L72
        L82:
            kotlin.Unit r9 = kotlin.Unit.f24250a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: net.engawapg.lib.zoomable.ZoomableKt.a(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    public static Modifier b(Modifier modifier, final ZoomState zoomState) {
        final ZoomableKt$zoomable$2 zoomableKt$zoomable$2 = new ZoomableKt$zoomable$2(zoomState, null);
        Intrinsics.h(modifier, "<this>");
        Intrinsics.h(zoomState, "zoomState");
        Function1 function1A = InspectableValueKt.a();
        final ZoomableKt$zoomable$1 zoomableKt$zoomable$1 = ZoomableKt$zoomable$1.h;
        return ComposedModifierKt.a(modifier, function1A, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: net.engawapg.lib.zoomable.ZoomableKt$zoomable$4

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "net.engawapg.lib.zoomable.ZoomableKt$zoomable$4$2", f = "Zoomable.kt", l = {240}, m = "invokeSuspend")
            /* renamed from: net.engawapg.lib.zoomable.ZoomableKt$zoomable$4$2, reason: invalid class name */
            final class AnonymousClass2 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                public int p;
                public /* synthetic */ Object q;
                public final /* synthetic */ Function1 r;
                public final /* synthetic */ ZoomState s;
                public final /* synthetic */ CoroutineScope t;
                public final /* synthetic */ Function2 u;

                @Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"<anonymous>", "", "centroid", "Landroidx/compose/ui/geometry/Offset;", "pan", "zoom", "", "timeMillis", "", "invoke-jyLRC_s", "(JJFJ)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: net.engawapg.lib.zoomable.ZoomableKt$zoomable$4$2$1, reason: invalid class name */
                final class AnonymousClass1 extends Lambda implements Function4<Offset, Offset, Float, Long, Boolean> {
                    public final /* synthetic */ ZoomState h;
                    public final /* synthetic */ CoroutineScope i;

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "net.engawapg.lib.zoomable.ZoomableKt$zoomable$4$2$1$1", f = "Zoomable.kt", l = {246}, m = "invokeSuspend")
                    /* renamed from: net.engawapg.lib.zoomable.ZoomableKt$zoomable$4$2$1$1, reason: invalid class name and collision with other inner class name */
                    final class C04211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public int p;
                        public final /* synthetic */ ZoomState q;
                        public final /* synthetic */ long r;
                        public final /* synthetic */ float s;
                        public final /* synthetic */ long t;
                        public final /* synthetic */ long u;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C04211(float f, long j, long j2, long j3, Continuation continuation, ZoomState zoomState) {
                            super(2, continuation);
                            this.q = zoomState;
                            this.r = j;
                            this.s = f;
                            this.t = j2;
                            this.u = j3;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            return new C04211(this.s, this.r, this.t, this.u, continuation, this.q);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ((C04211) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
                            ZoomState zoomState = this.q;
                            zoomState.getClass();
                            Object objC = CoroutineScopeKt.c(new ZoomState$applyGesture$2(this.s, this.t, this.r, this.u, null, zoomState), this);
                            if (objC != coroutineSingletons) {
                                objC = unit;
                            }
                            return objC == coroutineSingletons ? coroutineSingletons : unit;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(CoroutineScope coroutineScope, ZoomState zoomState) {
                        super(4);
                        this.h = zoomState;
                        this.i = coroutineScope;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:22:0x0092 A[PHI: r13
  0x0092: PHI (r13v1 boolean) = (r13v0 boolean), (r13v0 boolean), (r13v2 boolean), (r13v2 boolean), (r13v4 boolean), (r13v4 boolean) binds: [B:6:0x0033, B:24:0x009c, B:31:0x00c1, B:33:0x00d5, B:18:0x007b, B:20:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // kotlin.jvm.functions.Function4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke(java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
                        /*
                            Method dump skipped, instructions count: 244
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: net.engawapg.lib.zoomable.ZoomableKt$zoomable$4.AnonymousClass2.AnonymousClass1.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }

                @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: net.engawapg.lib.zoomable.ZoomableKt$zoomable$4$2$2, reason: invalid class name and collision with other inner class name */
                final class C04222 extends Lambda implements Function0<Unit> {
                    public final /* synthetic */ ZoomState h;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C04222(ZoomState zoomState) {
                        super(0);
                        this.h = zoomState;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ZoomState zoomState = this.h;
                        zoomState.h = null;
                        zoomState.i.d();
                        return Unit.f24250a;
                    }
                }

                @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: net.engawapg.lib.zoomable.ZoomableKt$zoomable$4$2$3, reason: invalid class name */
                final class AnonymousClass3 extends Lambda implements Function0<Unit> {
                    public final /* synthetic */ CoroutineScope h;
                    public final /* synthetic */ ZoomState i;

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "net.engawapg.lib.zoomable.ZoomableKt$zoomable$4$2$3$1", f = "Zoomable.kt", l = {258}, m = "invokeSuspend")
                    /* renamed from: net.engawapg.lib.zoomable.ZoomableKt$zoomable$4$2$3$1, reason: invalid class name */
                    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public int p;
                        public final /* synthetic */ ZoomState q;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(ZoomState zoomState, Continuation continuation) {
                            super(2, continuation);
                            this.q = zoomState;
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
                            if (i != 0) {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.b(obj);
                                return unit;
                            }
                            ResultKt.b(obj);
                            this.p = 1;
                            ZoomState zoomState = this.q;
                            zoomState.getClass();
                            Object objC = CoroutineScopeKt.c(new ZoomState$endGesture$2(zoomState, null), this);
                            if (objC != coroutineSingletons) {
                                objC = unit;
                            }
                            return objC == coroutineSingletons ? coroutineSingletons : unit;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass3(CoroutineScope coroutineScope, ZoomState zoomState) {
                        super(0);
                        this.h = coroutineScope;
                        this.i = zoomState;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        BuildersKt.c(this.h, null, null, new AnonymousClass1(this.i, null), 3);
                        return Unit.f24250a;
                    }
                }

                @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "position", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: net.engawapg.lib.zoomable.ZoomableKt$zoomable$4$2$4, reason: invalid class name */
                final class AnonymousClass4 extends Lambda implements Function1<Offset, Unit> {
                    public final /* synthetic */ CoroutineScope h;
                    public final /* synthetic */ Function2 i;

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "net.engawapg.lib.zoomable.ZoomableKt$zoomable$4$2$4$1", f = "Zoomable.kt", l = {264}, m = "invokeSuspend")
                    /* renamed from: net.engawapg.lib.zoomable.ZoomableKt$zoomable$4$2$4$1, reason: invalid class name */
                    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public int p;
                        public final /* synthetic */ Function2 q;
                        public final /* synthetic */ long r;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(long j, Function2 function2, Continuation continuation) {
                            super(2, continuation);
                            this.q = function2;
                            this.r = j;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            return new AnonymousClass1(this.r, this.q, continuation);
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
                                Offset offset = new Offset(this.r);
                                this.p = 1;
                                if (this.q.invoke(offset, this) == coroutineSingletons) {
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
                    public AnonymousClass4(Function2 function2, CoroutineScope coroutineScope) {
                        super(1);
                        this.h = coroutineScope;
                        this.i = function2;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        BuildersKt.c(this.h, null, null, new AnonymousClass1(((Offset) obj).f1751a, this.i, null), 3);
                        return Unit.f24250a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Function1 function1, ZoomState zoomState, CoroutineScope coroutineScope, Function2 function2, Continuation continuation) {
                    super(2, continuation);
                    this.r = function1;
                    this.s = zoomState;
                    this.t = coroutineScope;
                    this.u = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.r, this.s, this.t, this.u, continuation);
                    anonymousClass2.q = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass2) create((PointerInputScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
                    PointerInputScope pointerInputScope = (PointerInputScope) this.q;
                    CoroutineScope coroutineScope = this.t;
                    ZoomState zoomState = this.s;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineScope, zoomState);
                    C04222 c04222 = new C04222(zoomState);
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(coroutineScope, zoomState);
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.u, coroutineScope);
                    this.p = 1;
                    Object objC = ForEachGestureKt.c(pointerInputScope, new ZoomableKt$detectTransformGestures$6(c04222, this.r, anonymousClass4, anonymousClass3, anonymousClass1, null), this);
                    if (objC != coroutineSingletons) {
                        objC = unit;
                    }
                    return objC == coroutineSingletons ? coroutineSingletons : unit;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Modifier composed = (Modifier) obj;
                Composer composer = (Composer) obj2;
                ((Number) obj3).intValue();
                Intrinsics.h(composed, "$this$composed");
                composer.F(696724581);
                composer.F(773894976);
                composer.F(-492369756);
                Object objG = composer.G();
                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                if (objG == composer$Companion$Empty$1) {
                    objG = new CompositionScopedCoroutineScopeCanceller(new RememberedCoroutineScope(composer.y()));
                    composer.A(objG);
                }
                composer.N();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objG).d;
                composer.N();
                composer.F(1157296644);
                final ZoomState zoomState2 = zoomState;
                boolean zN = composer.n(zoomState2);
                Object objG2 = composer.G();
                if (zN || objG2 == composer$Companion$Empty$1) {
                    objG2 = new Function1<IntSize, Unit>() { // from class: net.engawapg.lib.zoomable.ZoomableKt$zoomable$4$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            long jD = IntSizeKt.d(((IntSize) obj4).f2202a);
                            ZoomState zoomState3 = zoomState2;
                            zoomState3.f = jD;
                            zoomState3.e();
                            return Unit.f24250a;
                        }
                    };
                    composer.A(objG2);
                }
                composer.N();
                Modifier modifierA = OnRemeasuredModifierKt.a(Modifier.Companion.d, (Function1) objG2);
                Function2 function2 = zoomableKt$zoomable$2;
                Function1 function1 = zoomableKt$zoomable$1;
                ZoomState zoomState3 = zoomState;
                Modifier modifierX0 = modifierA.x0(new SuspendPointerInputElement(zoomState3, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new AnonymousClass2(function1, zoomState3, coroutineScope, function2, null)), 6));
                composer.F(1157296644);
                boolean zN2 = composer.n(zoomState2);
                Object objG3 = composer.G();
                if (zN2 || objG3 == composer$Companion$Empty$1) {
                    objG3 = new Function1<GraphicsLayerScope, Unit>() { // from class: net.engawapg.lib.zoomable.ZoomableKt$zoomable$4$3$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            GraphicsLayerScope graphicsLayer = (GraphicsLayerScope) obj4;
                            Intrinsics.h(graphicsLayer, "$this$graphicsLayer");
                            ZoomState zoomState4 = zoomState2;
                            graphicsLayer.j(zoomState4.c());
                            graphicsLayer.l(zoomState4.c());
                            graphicsLayer.m(((Number) zoomState4.d.f()).floatValue());
                            graphicsLayer.c(((Number) zoomState4.e.f()).floatValue());
                            return Unit.f24250a;
                        }
                    };
                    composer.A(objG3);
                }
                composer.N();
                Modifier modifierA2 = GraphicsLayerModifierKt.a(modifierX0, (Function1) objG3);
                composer.N();
                return modifierA2;
            }
        });
    }
}
