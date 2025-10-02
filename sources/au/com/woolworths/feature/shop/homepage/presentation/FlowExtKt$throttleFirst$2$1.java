package au.com.woolworths.feature.shop.homepage.presentation;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.presentation.FlowExtKt$throttleFirst$2$1", f = "FlowExt.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowExtKt$throttleFirst$2$1 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 r;
    public final /* synthetic */ Ref.ObjectRef s;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.presentation.FlowExtKt$throttleFirst$2$1$1", f = "FlowExt.kt", l = {24}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.homepage.presentation.FlowExtKt$throttleFirst$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ Object q;
        public final /* synthetic */ FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 r;
        public final /* synthetic */ Ref.ObjectRef s;
        public final /* synthetic */ FlowCollector t;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.homepage.presentation.FlowExtKt$throttleFirst$2$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C01671<T> implements FlowCollector {
            public final /* synthetic */ Ref.ObjectRef d;
            public final /* synthetic */ FlowCollector e;
            public final /* synthetic */ CoroutineScope f;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.presentation.FlowExtKt$throttleFirst$2$1$1$1$1", f = "FlowExt.kt", l = {27}, m = "invokeSuspend")
            /* renamed from: au.com.woolworths.feature.shop.homepage.presentation.FlowExtKt$throttleFirst$2$1$1$1$1, reason: invalid class name and collision with other inner class name */
            final class C01681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int p;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C01681(2, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((C01681) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                    int i = this.p;
                    if (i == 0) {
                        ResultKt.b(obj);
                        this.p = 1;
                        if (DelayKt.b(500L, this) == coroutineSingletons) {
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

            public C01671(Ref.ObjectRef objectRef, FlowCollector flowCollector, CoroutineScope coroutineScope) {
                this.d = objectRef;
                this.e = flowCollector;
                this.f = coroutineScope;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof au.com.woolworths.feature.shop.homepage.presentation.FlowExtKt$throttleFirst$2$1$1$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r7
                    au.com.woolworths.feature.shop.homepage.presentation.FlowExtKt$throttleFirst$2$1$1$1$emit$1 r0 = (au.com.woolworths.feature.shop.homepage.presentation.FlowExtKt$throttleFirst$2$1$1$1$emit$1) r0
                    int r1 = r0.r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.r = r1
                    goto L18
                L13:
                    au.com.woolworths.feature.shop.homepage.presentation.FlowExtKt$throttleFirst$2$1$1$1$emit$1 r0 = new au.com.woolworths.feature.shop.homepage.presentation.FlowExtKt$throttleFirst$2$1$1$1$emit$1
                    r0.<init>(r5, r7)
                L18:
                    java.lang.Object r7 = r0.p
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                    int r2 = r0.r
                    kotlin.jvm.internal.Ref$ObjectRef r3 = r5.d
                    r4 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r4) goto L29
                    kotlin.ResultKt.b(r7)
                    goto L49
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.ResultKt.b(r7)
                    java.lang.Object r7 = r3.d
                    kotlinx.coroutines.Job r7 = (kotlinx.coroutines.Job) r7
                    boolean r7 = r7.isActive()
                    if (r7 != 0) goto L59
                    r0.r = r4
                    kotlinx.coroutines.flow.FlowCollector r7 = r5.e
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L49
                    return r1
                L49:
                    au.com.woolworths.feature.shop.homepage.presentation.FlowExtKt$throttleFirst$2$1$1$1$1 r6 = new au.com.woolworths.feature.shop.homepage.presentation.FlowExtKt$throttleFirst$2$1$1$1$1
                    r7 = 2
                    r0 = 0
                    r6.<init>(r7, r0)
                    r7 = 3
                    kotlinx.coroutines.CoroutineScope r1 = r5.f
                    kotlinx.coroutines.Job r6 = kotlinx.coroutines.BuildersKt.c(r1, r0, r0, r6, r7)
                    r3.d = r6
                L59:
                    kotlin.Unit r6 = kotlin.Unit.f24250a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.homepage.presentation.FlowExtKt$throttleFirst$2$1.AnonymousClass1.C01671.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1, Ref.ObjectRef objectRef, FlowCollector flowCollector, Continuation continuation) {
            super(2, continuation);
            this.r = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
            this.s = objectRef;
            this.t = flowCollector;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, this.t, continuation);
            anonymousClass1.q = obj;
            return anonymousClass1;
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
                C01671 c01671 = new C01671(this.s, this.t, (CoroutineScope) this.q);
                this.p = 1;
                if (this.r.collect(c01671, this) == coroutineSingletons) {
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
    public FlowExtKt$throttleFirst$2$1(FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1, Ref.ObjectRef objectRef, Continuation continuation) {
        super(2, continuation);
        this.r = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
        this.s = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowExtKt$throttleFirst$2$1 flowExtKt$throttleFirst$2$1 = new FlowExtKt$throttleFirst$2$1(this.r, this.s, continuation);
        flowExtKt$throttleFirst$2$1.q = obj;
        return flowExtKt$throttleFirst$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtKt$throttleFirst$2$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.q;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, flowCollector, null);
            this.p = 1;
            if (CoroutineScopeKt.c(anonymousClass1, this) == coroutineSingletons) {
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
