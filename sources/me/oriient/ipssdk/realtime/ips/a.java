package me.oriient.ipssdk.realtime.ips;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.auth.Space;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.base.auth.User;

/* loaded from: classes8.dex */
public final class a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Outcome.Failure f25865a;
    public int b;
    public final /* synthetic */ User c;
    public final /* synthetic */ User d;
    public final /* synthetic */ IPSCompletionListener e;
    public final /* synthetic */ Space f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(User user, User user2, IPSCompletionListener iPSCompletionListener, Space space, Continuation continuation) {
        super(2, continuation);
        this.c = user;
        this.d = user2;
        this.e = iPSCompletionListener;
        this.f = space;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.c, this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r9.b
            kotlin.Unit r2 = kotlin.Unit.f24250a
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2f
            if (r1 == r6) goto L2b
            if (r1 == r5) goto L27
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            kotlin.ResultKt.b(r10)
            goto L82
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            me.oriient.internal.infra.utils.core.Outcome$Failure r0 = r9.f25865a
            kotlin.ResultKt.b(r10)
            goto La6
        L27:
            kotlin.ResultKt.b(r10)
            goto L5c
        L2b:
            kotlin.ResultKt.b(r10)
            goto L4b
        L2f:
            kotlin.ResultKt.b(r10)
            me.oriient.ipssdk.realtime.ips.Core r10 = me.oriient.ipssdk.realtime.ips.Core.INSTANCE
            me.oriient.internal.services.auth.AuthManager r10 = me.oriient.ipssdk.realtime.ips.Core.access$getAuthManager(r10)
            me.oriient.ipssdk.base.auth.User r1 = r9.c
            me.oriient.internal.services.auth.Space r1 = r1.getSpace()
            java.lang.String r1 = r1.getId()
            r9.b = r6
            java.lang.Object r10 = r10.setSpaceId(r1, r9)
            if (r10 != r0) goto L4b
            goto La4
        L4b:
            me.oriient.ipssdk.realtime.ips.Core r10 = me.oriient.ipssdk.realtime.ips.Core.INSTANCE
            me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager r10 = me.oriient.ipssdk.realtime.ips.Core.access$getConfigManager(r10)
            me.oriient.ipssdk.base.auth.User r1 = r9.c
            r9.b = r5
            java.lang.Object r10 = r10.refresh(r1, r9)
            if (r10 != r0) goto L5c
            goto La4
        L5c:
            me.oriient.internal.infra.utils.core.Outcome r10 = (me.oriient.internal.infra.utils.core.Outcome) r10
            boolean r1 = r10 instanceof me.oriient.internal.infra.utils.core.Outcome.Success
            if (r1 == 0) goto L83
            me.oriient.internal.infra.utils.core.Outcome$Success r10 = (me.oriient.internal.infra.utils.core.Outcome.Success) r10
            java.lang.Object r10 = r10.getValue()
            me.oriient.internal.services.dataModel.engine.EngineConfig r10 = (me.oriient.internal.services.dataModel.engine.EngineConfig) r10
            me.oriient.ipssdk.realtime.ips.CoreLogic r1 = me.oriient.ipssdk.realtime.ips.CoreLogic.INSTANCE
            me.oriient.ipssdk.base.auth.User r4 = r9.c
            me.oriient.ipssdk.realtime.ips.Core$setSpaceId$1$1 r5 = new me.oriient.ipssdk.realtime.ips.Core$setSpaceId$1$1
            me.oriient.ipssdk.base.auth.User r6 = r9.d
            me.oriient.ipssdk.api.listeners.IPSCompletionListener r7 = r9.e
            me.oriient.internal.services.auth.Space r8 = r9.f
            r5.<init>()
            r9.b = r3
            java.lang.Object r10 = r1.handleSpaceChange(r4, r10, r5, r9)
            if (r10 != r0) goto L82
            goto La4
        L82:
            return r2
        L83:
            boolean r1 = r10 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r1 == 0) goto Lbc
            me.oriient.ipssdk.realtime.ips.Core r1 = me.oriient.ipssdk.realtime.ips.Core.INSTANCE
            me.oriient.internal.services.auth.AuthManager r1 = me.oriient.ipssdk.realtime.ips.Core.access$getAuthManager(r1)
            me.oriient.ipssdk.base.auth.User r3 = r9.d
            me.oriient.internal.services.auth.Space r3 = r3.getSpace()
            java.lang.String r3 = r3.getId()
            r5 = r10
            me.oriient.internal.infra.utils.core.Outcome$Failure r5 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r5
            r9.f25865a = r5
            r9.b = r4
            java.lang.Object r1 = r1.setSpaceId(r3, r9)
            if (r1 != r0) goto La5
        La4:
            return r0
        La5:
            r0 = r10
        La6:
            me.oriient.ipssdk.api.listeners.IPSCompletionListener r10 = r9.e
            me.oriient.internal.infra.utils.core.Outcome$Failure r0 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r0
            java.lang.Exception r0 = r0.getValue()
            java.lang.String r0 = r0.getMessage()
            me.oriient.ipssdk.common.utils.models.Error r1 = new me.oriient.ipssdk.common.utils.models.Error
            r3 = 7
            r1.<init>(r0, r3, r6)
            me.oriient.ipssdk.realtime.ips.ValidationService.safeFailListener(r10, r1)
            return r2
        Lbc:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ips.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
