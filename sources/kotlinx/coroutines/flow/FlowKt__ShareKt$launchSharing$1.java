package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.internal.Symbol;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {210, 214, 215, 221}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SharingStarted q;
    public final /* synthetic */ Flow r;
    public final /* synthetic */ AbstractSharedFlow s;
    public final /* synthetic */ Object t;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1, reason: invalid class name */
    /* loaded from: classes7.dex */
    final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Boolean>, Object> {
        public /* synthetic */ int p;

        public AnonymousClass1() {
            super(2, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
            anonymousClass1.p = ((Number) obj).intValue();
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            return Boolean.valueOf(this.p > 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lkotlinx/coroutines/flow/SharingCommand;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {223}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<SharingCommand, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ Object q;
        public final /* synthetic */ Flow r;
        public final /* synthetic */ AbstractSharedFlow s;
        public final /* synthetic */ Object t;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[SharingCommand.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    SharingCommand sharingCommand = SharingCommand.d;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    SharingCommand sharingCommand2 = SharingCommand.d;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Flow flow, MutableSharedFlow mutableSharedFlow, Object obj, Continuation continuation) {
            super(2, continuation);
            this.r = flow;
            this.s = (AbstractSharedFlow) mutableSharedFlow;
            this.t = obj;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.internal.AbstractSharedFlow] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.r, this.s, this.t, continuation);
            anonymousClass2.q = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((SharingCommand) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.FlowCollector, kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.internal.AbstractSharedFlow] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                int iOrdinal = ((SharingCommand) this.q).ordinal();
                ?? r1 = this.s;
                if (iOrdinal == 0) {
                    this.p = 1;
                    if (this.r.collect(r1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Symbol symbol = SharedFlowKt.f24708a;
                    Object obj2 = this.t;
                    if (obj2 == symbol) {
                        r1.e();
                    } else {
                        r1.f(obj2);
                    }
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
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ShareKt$launchSharing$1(SharingStarted sharingStarted, Flow flow, MutableSharedFlow mutableSharedFlow, Object obj, Continuation continuation) {
        super(2, continuation);
        this.q = sharingStarted;
        this.r = flow;
        this.s = (AbstractSharedFlow) mutableSharedFlow;
        this.t = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.internal.AbstractSharedFlow] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FlowKt__ShareKt$launchSharing$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__ShareKt$launchSharing$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r6.collect(r7, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r6.collect(r7, r8) != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.h(r9, r1, r8) == r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.flow.FlowCollector, kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.internal.AbstractSharedFlow] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r8.p
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            kotlinx.coroutines.flow.Flow r6 = r8.r
            kotlinx.coroutines.flow.internal.AbstractSharedFlow r7 = r8.s
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L23
            if (r1 != r2) goto L17
            goto L23
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            kotlin.ResultKt.b(r9)
            goto L4f
        L23:
            kotlin.ResultKt.b(r9)
            goto L75
        L27:
            kotlin.ResultKt.b(r9)
            kotlinx.coroutines.flow.SharingStarted r9 = kotlinx.coroutines.flow.SharingStarted.Companion.f24711a
            kotlinx.coroutines.flow.SharingStarted r1 = r8.q
            if (r1 != r9) goto L39
            r8.p = r5
            java.lang.Object r9 = r6.collect(r7, r8)
            if (r9 != r0) goto L75
            goto L74
        L39:
            kotlinx.coroutines.flow.SharingStarted r9 = kotlinx.coroutines.flow.SharingStarted.Companion.b
            if (r1 != r9) goto L58
            kotlinx.coroutines.flow.StateFlow r9 = r7.g()
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1
            r1.<init>()
            r8.p = r4
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.x(r9, r1, r8)
            if (r9 != r0) goto L4f
            goto L74
        L4f:
            r8.p = r3
            java.lang.Object r9 = r6.collect(r7, r8)
            if (r9 != r0) goto L75
            goto L74
        L58:
            kotlinx.coroutines.flow.StateFlow r9 = r7.g()
            kotlinx.coroutines.flow.Flow r9 = r1.a(r9)
            kotlinx.coroutines.flow.Flow r9 = kotlinx.coroutines.flow.FlowKt.r(r9)
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2
            java.lang.Object r3 = r8.t
            r4 = 0
            r1.<init>(r6, r7, r3, r4)
            r8.p = r2
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.h(r9, r1, r8)
            if (r9 != r0) goto L75
        L74:
            return r0
        L75:
            kotlin.Unit r9 = kotlin.Unit.f24250a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
