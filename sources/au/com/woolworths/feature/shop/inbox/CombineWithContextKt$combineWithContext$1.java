package au.com.woolworths.feature.shop.inbox;

import au.com.woolworths.feature.shop.inbox.InboxViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.inbox.CombineWithContextKt$combineWithContext$1", f = "CombineWithContext.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CombineWithContextKt$combineWithContext$1 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ StateFlow r;
    public final /* synthetic */ Flow s;
    public final /* synthetic */ Function4 t;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, d2 = {"<anonymous>", "", "T1", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.inbox.CombineWithContextKt$combineWithContext$1$1", f = "CombineWithContext.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.inbox.CombineWithContextKt$combineWithContext$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Ref.IntRef p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.IntRef intRef, Continuation continuation) {
            super(2, continuation);
            this.p = intRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            this.p.d = 0;
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, d2 = {"<anonymous>", "", "T2", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.inbox.CombineWithContextKt$combineWithContext$1$2", f = "CombineWithContext.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.inbox.CombineWithContextKt$combineWithContext$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Ref.IntRef p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Ref.IntRef intRef, Continuation continuation) {
            super(2, continuation);
            this.p = intRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            this.p.d = 1;
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u0003H\n"}, d2 = {"<anonymous>", "R", "T1", "T2", "value1", "value2"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.inbox.CombineWithContextKt$combineWithContext$1$3", f = "CombineWithContext.kt", l = {25}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.inbox.CombineWithContextKt$combineWithContext$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function3<Object, Object, Continuation<Object>, Object> {
        public int p;
        public /* synthetic */ Object q;
        public /* synthetic */ Object r;
        public final /* synthetic */ Function4 s;
        public final /* synthetic */ Ref.BooleanRef t;
        public final /* synthetic */ Ref.IntRef u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Function4 function4, Ref.BooleanRef booleanRef, Ref.IntRef intRef, Continuation continuation) {
            super(3, continuation);
            this.s = function4;
            this.t = booleanRef;
            this.u = intRef;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Ref.BooleanRef booleanRef = this.t;
            Ref.IntRef intRef = this.u;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.s, booleanRef, intRef, (Continuation) obj3);
            anonymousClass3.q = obj;
            anonymousClass3.r = obj2;
            return anonymousClass3.invokeSuspend(Unit.f24250a);
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
                return obj;
            }
            ResultKt.b(obj);
            Object obj2 = this.q;
            Object obj3 = this.r;
            TransformContext transformContext = new TransformContext(this.t.d, this.u.d);
            this.q = null;
            this.p = 1;
            Object objInvoke = ((InboxViewModel.AnonymousClass1) this.s).invoke(obj2, obj3, transformContext, this);
            return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.shop.inbox.CombineWithContextKt$combineWithContext$1$4, reason: invalid class name */
    final class AnonymousClass4<T> implements FlowCollector {
        public final /* synthetic */ FlowCollector d;
        public final /* synthetic */ Ref.BooleanRef e;

        public AnonymousClass4(Ref.BooleanRef booleanRef, FlowCollector flowCollector) {
            this.d = flowCollector;
            this.e = booleanRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof au.com.woolworths.feature.shop.inbox.CombineWithContextKt$combineWithContext$1$4$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                au.com.woolworths.feature.shop.inbox.CombineWithContextKt$combineWithContext$1$4$emit$1 r0 = (au.com.woolworths.feature.shop.inbox.CombineWithContextKt$combineWithContext$1$4$emit$1) r0
                int r1 = r0.r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.r = r1
                goto L18
            L13:
                au.com.woolworths.feature.shop.inbox.CombineWithContextKt$combineWithContext$1$4$emit$1 r0 = new au.com.woolworths.feature.shop.inbox.CombineWithContextKt$combineWithContext$1$4$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.p
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r2 = r0.r
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                kotlin.ResultKt.b(r6)
                goto L3d
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                kotlin.ResultKt.b(r6)
                r0.r = r3
                kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L3d
                return r1
            L3d:
                kotlin.jvm.internal.Ref$BooleanRef r5 = r4.e
                r6 = 0
                r5.d = r6
                kotlin.Unit r5 = kotlin.Unit.f24250a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.inbox.CombineWithContextKt$combineWithContext$1.AnonymousClass4.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineWithContextKt$combineWithContext$1(StateFlow stateFlow, Flow flow, Function4 function4, Continuation continuation) {
        super(2, continuation);
        this.r = stateFlow;
        this.s = flow;
        this.t = function4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CombineWithContextKt$combineWithContext$1 combineWithContextKt$combineWithContext$1 = new CombineWithContextKt$combineWithContext$1(this.r, this.s, this.t, continuation);
        combineWithContextKt$combineWithContext$1.q = obj;
        return combineWithContextKt$combineWithContext$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CombineWithContextKt$combineWithContext$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.q;
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.d = true;
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.d = -1;
            FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1L = FlowKt.l(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(intRef, null), this.r), new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(intRef, null), this.s), new AnonymousClass3(this.t, booleanRef, intRef, null));
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(booleanRef, flowCollector);
            this.p = 1;
            if (flowKt__ZipKt$combine$$inlined$unsafeFlow$1L.collect(anonymousClass4, this) == coroutineSingletons) {
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
