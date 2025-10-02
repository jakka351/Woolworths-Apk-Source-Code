package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.ipssdk.api.listeners.IPSContentSearchListener;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl;

/* loaded from: classes8.dex */
public final class W extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26023a;
    public final /* synthetic */ ContentRestServiceImpl b;
    public final /* synthetic */ User c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;
    public final /* synthetic */ IPSContentSearchListener h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(ContentRestServiceImpl contentRestServiceImpl, User user, String str, String str2, int i, String str3, IPSContentSearchListener iPSContentSearchListener, Continuation continuation) {
        super(2, continuation);
        this.b = contentRestServiceImpl;
        this.c = user;
        this.d = str;
        this.e = str2;
        this.f = i;
        this.g = str3;
        this.h = iPSContentSearchListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new W(this.b, this.c, this.d, this.e, this.f, this.g, this.h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((W) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r12.f26023a
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.b(r13)     // Catch: java.lang.Throwable -> Le
            r11 = r12
            goto L4b
        Le:
            r0 = move-exception
            r13 = r0
            r11 = r12
            goto L62
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            kotlin.ResultKt.b(r13)
            me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl r3 = r12.b     // Catch: java.lang.Throwable -> L5f
            me.oriient.ipssdk.base.auth.User r13 = r12.c     // Catch: java.lang.Throwable -> L5f
            me.oriient.internal.services.auth.Space r13 = r13.getSpace()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r4 = r13.getId()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r13 = r12.d     // Catch: java.lang.Throwable -> L5f
            java.lang.String r5 = me.oriient.ipssdk.common.utils.runtimedata.UserSessionId.m452constructorimpl(r13)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r13 = r12.e     // Catch: java.lang.Throwable -> L5f
            java.lang.String r6 = me.oriient.ipssdk.common.utils.models.BuildingId.m441constructorimpl(r13)     // Catch: java.lang.Throwable -> L5f
            int r13 = r12.f     // Catch: java.lang.Throwable -> L5f
            java.lang.Integer r7 = new java.lang.Integer     // Catch: java.lang.Throwable -> L5f
            r7.<init>(r13)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r8 = "regions,location-tags"
            java.lang.String r9 = r12.g     // Catch: java.lang.Throwable -> L5f
            r12.f26023a = r2     // Catch: java.lang.Throwable -> L5f
            r10 = 0
            r11 = r12
            java.lang.Object r13 = me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl.m460access$searchSyncWlLixbM(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L5c
            if (r13 != r0) goto L4b
            return r0
        L4b:
            r4 = r13
            me.oriient.ipssdk.realtime.services.rest.responses.ContentContainer r4 = (me.oriient.ipssdk.realtime.services.rest.responses.ContentContainer) r4     // Catch: java.lang.Throwable -> L5c
            me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl r3 = r11.b     // Catch: java.lang.Throwable -> L5c
            me.oriient.ipssdk.api.listeners.IPSContentSearchListener r5 = r11.h     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = r11.e     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = r11.g     // Catch: java.lang.Throwable -> L5c
            int r8 = r11.f     // Catch: java.lang.Throwable -> L5c
            me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl.access$parseContent(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5c
            goto La0
        L5c:
            r0 = move-exception
        L5d:
            r13 = r0
            goto L62
        L5f:
            r0 = move-exception
            r11 = r12
            goto L5d
        L62:
            boolean r0 = r13 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto La0
            me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl r0 = r11.b
            me.oriient.internal.infra.utils.core.Logger r0 = me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl.access$getLogger(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "search: "
            r1.<init>(r3)
            java.lang.String r3 = r13.getMessage()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "ContentRestService"
            r0.e(r3, r1)
            me.oriient.ipssdk.api.listeners.IPSContentSearchListener r0 = r11.h
            me.oriient.ipssdk.common.utils.models.Error r1 = new me.oriient.ipssdk.common.utils.models.Error
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "failed to search: "
            r3.<init>(r4)
            java.lang.String r13 = r13.getMessage()
            r3.append(r13)
            java.lang.String r13 = r3.toString()
            r3 = 0
            r1.<init>(r13, r3, r2)
            r0.onError(r1)
        La0:
            kotlin.Unit r13 = kotlin.Unit.f24250a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ofs.W.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
