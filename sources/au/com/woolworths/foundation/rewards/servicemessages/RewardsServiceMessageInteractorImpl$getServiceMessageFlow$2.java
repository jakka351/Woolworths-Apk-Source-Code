package au.com.woolworths.foundation.rewards.servicemessages;

import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageInteractorImpl$getServiceMessageFlow$2", f = "RewardsServiceMessageInteractor.kt", l = {83, 84}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RewardsServiceMessageInteractorImpl$getServiceMessageFlow$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RewardsServiceMessageInteractorImpl q;
    public final /* synthetic */ MutableStateFlow r;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "alerts", "", "Lau/com/woolworths/foundation/rewards/servicemessages/RewardsServiceMessage;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageInteractorImpl$getServiceMessageFlow$2$1", f = "RewardsServiceMessageInteractor.kt", l = {93}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageInteractorImpl$getServiceMessageFlow$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends RewardsServiceMessage>, Continuation<? super Unit>, Object> {
        public RewardsServiceMessageInteractorImpl p;
        public RewardsServiceMessage.ScreenType q;
        public Iterator r;
        public int s;
        public /* synthetic */ Object t;
        public final /* synthetic */ MutableStateFlow u;
        public final /* synthetic */ RewardsServiceMessageInteractorImpl v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RewardsServiceMessageInteractorImpl rewardsServiceMessageInteractorImpl, Continuation continuation, MutableStateFlow mutableStateFlow) {
            super(2, continuation);
            RewardsServiceMessage.ScreenType screenType = RewardsServiceMessage.ScreenType.d;
            this.u = mutableStateFlow;
            this.v = rewardsServiceMessageInteractorImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            RewardsServiceMessage.ScreenType screenType = RewardsServiceMessage.ScreenType.d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.v, continuation, this.u);
            anonymousClass1.t = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00a8 -> B:28:0x00bd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00bb -> B:27:0x00bc). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage$ScreenType r0 = au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage.ScreenType.e
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r2 = r10.s
                r3 = 1
                if (r2 == 0) goto L22
                if (r2 != r3) goto L1a
                java.util.Iterator r0 = r10.r
                au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage$ScreenType r2 = r10.q
                au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageInteractorImpl r4 = r10.p
                java.lang.Object r5 = r10.t
                kotlinx.coroutines.flow.MutableStateFlow r5 = (kotlinx.coroutines.flow.MutableStateFlow) r5
                kotlin.ResultKt.b(r11)
                goto Lbc
            L1a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L22:
                kotlin.ResultKt.b(r11)
                java.lang.Object r11 = r10.t
                java.util.List r11 = (java.util.List) r11
                java.time.ZonedDateTime r2 = java.time.ZonedDateTime.now()
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r11 = r11.iterator()
            L38:
                boolean r5 = r11.hasNext()
                if (r5 == 0) goto L54
                java.lang.Object r5 = r11.next()
                au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage r5 = (au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage) r5
                java.time.ZonedDateTime r6 = r5.g
                java.time.ZonedDateTime r5 = r5.h
                java.time.ZonedDateTime[] r5 = new java.time.ZonedDateTime[]{r6, r5}
                kotlin.sequences.Sequence r5 = kotlin.collections.ArraysKt.g(r5)
                kotlin.collections.CollectionsKt.i(r4, r5)
                goto L38
            L54:
                java.util.List r11 = kotlin.collections.CollectionsKt.t0(r4)
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r11 = r11.iterator()
            L63:
                boolean r5 = r11.hasNext()
                if (r5 == 0) goto L7a
                java.lang.Object r5 = r11.next()
                r6 = r5
                java.time.ZonedDateTime r6 = (java.time.ZonedDateTime) r6
                int r6 = r6.compareTo(r2)
                if (r6 < 0) goto L63
                r4.add(r5)
                goto L63
            L7a:
                au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageInteractorImpl r11 = r10.v
                au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage r2 = r11.a(r0)
                kotlinx.coroutines.flow.MutableStateFlow r5 = r10.u
                r5.setValue(r2)
                java.util.Iterator r2 = r4.iterator()
                r4 = r11
                r11 = r0
                r0 = r2
            L8c:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto Lc5
                java.lang.Object r2 = r0.next()
                java.time.ZonedDateTime r2 = (java.time.ZonedDateTime) r2
                java.time.ZonedDateTime r6 = java.time.ZonedDateTime.now()
                java.time.Duration r2 = java.time.Duration.between(r6, r2)
                long r6 = r2.toMillis()
                r8 = 0
                int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r2 <= 0) goto Lbd
                r10.t = r5
                r10.p = r4
                r10.q = r11
                r10.r = r0
                r10.s = r3
                java.lang.Object r2 = kotlinx.coroutines.DelayKt.b(r6, r10)
                if (r2 != r1) goto Lbb
                return r1
            Lbb:
                r2 = r11
            Lbc:
                r11 = r2
            Lbd:
                au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage r2 = r4.a(r11)
                r5.setValue(r2)
                goto L8c
            Lc5:
                kotlin.Unit r11 = kotlin.Unit.f24250a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageInteractorImpl$getServiceMessageFlow$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsServiceMessageInteractorImpl$getServiceMessageFlow$2(RewardsServiceMessageInteractorImpl rewardsServiceMessageInteractorImpl, Continuation continuation, MutableStateFlow mutableStateFlow) {
        super(2, continuation);
        RewardsServiceMessage.ScreenType screenType = RewardsServiceMessage.ScreenType.d;
        this.q = rewardsServiceMessageInteractorImpl;
        this.r = mutableStateFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RewardsServiceMessage.ScreenType screenType = RewardsServiceMessage.ScreenType.d;
        return new RewardsServiceMessageInteractorImpl$getServiceMessageFlow$2(this.q, continuation, this.r);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsServiceMessageInteractorImpl$getServiceMessageFlow$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.h((kotlinx.coroutines.flow.Flow) r7, r1, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage$ScreenType r0 = au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage.ScreenType.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.p
            au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageInteractorImpl r2 = r6.q
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            kotlin.ResultKt.b(r7)
            goto L5d
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            kotlin.ResultKt.b(r7)
            goto L4a
        L20:
            kotlin.ResultKt.b(r7)
            r6.p = r4
            kotlin.Lazy r7 = r2.d
            java.lang.Object r7 = r7.getD()
            kotlinx.coroutines.flow.StateFlow r7 = (kotlinx.coroutines.flow.StateFlow) r7
            au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageInteractorImpl$alertFlow$$inlined$map$1 r1 = new au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageInteractorImpl$alertFlow$$inlined$map$1
            r1.<init>(r7, r2)
            au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageInteractorImpl$alertFlow$$inlined$map$2 r7 = new au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageInteractorImpl$alertFlow$$inlined$map$2
            r7.<init>()
            kotlinx.coroutines.flow.Flow r7 = kotlinx.coroutines.flow.FlowKt.r(r7)
            kotlin.coroutines.CoroutineContext r1 = r6.getE()
            kotlinx.coroutines.internal.ContextScope r1 = kotlinx.coroutines.CoroutineScopeKt.a(r1)
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.N(r7, r1, r6)
            if (r7 != r0) goto L4a
            goto L5c
        L4a:
            kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
            au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageInteractorImpl$getServiceMessageFlow$2$1 r1 = new au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageInteractorImpl$getServiceMessageFlow$2$1
            kotlinx.coroutines.flow.MutableStateFlow r4 = r6.r
            r5 = 0
            r1.<init>(r2, r5, r4)
            r6.p = r3
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.h(r7, r1, r6)
            if (r7 != r0) goto L5d
        L5c:
            return r0
        L5d:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageInteractorImpl$getServiceMessageFlow$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
