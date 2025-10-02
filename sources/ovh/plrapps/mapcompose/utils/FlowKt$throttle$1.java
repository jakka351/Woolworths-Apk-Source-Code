package ovh.plrapps.mapcompose.utils;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.utils.FlowKt$throttle$1", f = "Flow.kt", l = {13}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class FlowKt$throttle$1 extends SuspendLambda implements Function2<ProducerScope<Object>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ long r;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "ovh.plrapps.mapcompose.utils.FlowKt$throttle$1$1", f = "Flow.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ovh.plrapps.mapcompose.utils.FlowKt$throttle$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ BufferedChannel q;
        public final /* synthetic */ ProducerScope r;
        public final /* synthetic */ long s;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "ovh.plrapps.mapcompose.utils.FlowKt$throttle$1$1$1", f = "Flow.kt", l = {15}, m = "invokeSuspend")
        /* renamed from: ovh.plrapps.mapcompose.utils.FlowKt$throttle$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C04331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int p;
            public final /* synthetic */ BufferedChannel q;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: ovh.plrapps.mapcompose.utils.FlowKt$throttle$1$1$1$1, reason: invalid class name and collision with other inner class name */
            final class C04341<T> implements FlowCollector {
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04331(BufferedChannel bufferedChannel, Continuation continuation) {
                super(2, continuation);
                this.q = bufferedChannel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C04331(this.q, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C04331 c04331 = (C04331) create((CoroutineScope) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                c04331.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                int i = this.p;
                if (i == 0) {
                    ResultKt.b(obj);
                    this.p = 1;
                    throw null;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return Unit.f24250a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "ovh.plrapps.mapcompose.utils.FlowKt$throttle$1$1$2", f = "Flow.kt", l = {20, 21, 22}, m = "invokeSuspend")
        /* renamed from: ovh.plrapps.mapcompose.utils.FlowKt$throttle$1$1$2, reason: invalid class name */
        final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public ChannelIterator p;
            public int q;
            public final /* synthetic */ BufferedChannel r;
            public final /* synthetic */ ProducerScope s;
            public final /* synthetic */ long t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(BufferedChannel bufferedChannel, ProducerScope producerScope, long j, Continuation continuation) {
                super(2, continuation);
                this.r = bufferedChannel;
                this.s = producerScope;
                this.t = j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.r, this.s, this.t, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0061 -> B:13:0x0033). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                    int r1 = r7.q
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L29
                    if (r1 == r4) goto L23
                    if (r1 == r3) goto L1d
                    if (r1 != r2) goto L15
                    kotlinx.coroutines.channels.ChannelIterator r1 = r7.p
                    kotlin.ResultKt.b(r8)
                    goto L33
                L15:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1d:
                    kotlinx.coroutines.channels.ChannelIterator r1 = r7.p
                    kotlin.ResultKt.b(r8)
                    goto L57
                L23:
                    kotlinx.coroutines.channels.ChannelIterator r1 = r7.p
                    kotlin.ResultKt.b(r8)
                    goto L3e
                L29:
                    kotlin.ResultKt.b(r8)
                    kotlinx.coroutines.channels.BufferedChannel r8 = r7.r
                    kotlinx.coroutines.channels.ChannelIterator r8 = r8.iterator()
                    r1 = r8
                L33:
                    r7.p = r1
                    r7.q = r4
                    java.lang.Object r8 = r1.b(r7)
                    if (r8 != r0) goto L3e
                    goto L63
                L3e:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 == 0) goto L64
                    java.lang.Object r8 = r1.next()
                    r7.p = r1
                    r7.q = r3
                    kotlinx.coroutines.channels.ProducerScope r5 = r7.s
                    java.lang.Object r8 = r5.z(r8, r7)
                    if (r8 != r0) goto L57
                    goto L63
                L57:
                    r7.p = r1
                    r7.q = r2
                    long r5 = r7.t
                    java.lang.Object r8 = kotlinx.coroutines.DelayKt.b(r5, r7)
                    if (r8 != r0) goto L33
                L63:
                    return r0
                L64:
                    kotlin.Unit r8 = kotlin.Unit.f24250a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.utils.FlowKt$throttle$1.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BufferedChannel bufferedChannel, ProducerScope producerScope, long j, Continuation continuation) {
            super(2, continuation);
            this.q = bufferedChannel;
            this.r = producerScope;
            this.s = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, this.r, this.s, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.p;
            BufferedChannel bufferedChannel = this.q;
            BuildersKt.c(coroutineScope, null, null, new C04331(bufferedChannel, null), 3);
            BuildersKt.c(coroutineScope, null, null, new AnonymousClass2(bufferedChannel, this.r, this.s, null), 3);
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt$throttle$1(long j, Continuation continuation) {
        super(2, continuation);
        this.r = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowKt$throttle$1 flowKt$throttle$1 = new FlowKt$throttle$1(this.r, continuation);
        flowKt$throttle$1.q = obj;
        return flowKt$throttle$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt$throttle$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ChannelKt.a(-1, 6, null), (ProducerScope) this.q, this.r, null);
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
