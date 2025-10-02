package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.realtime.services.tag.EventTaggingManagerImpl;
import me.oriient.ipssdk.realtime.services.tag.model.EventTag;
import me.oriient.ipssdk.realtime.services.tag.model.EventTagRecord;

/* loaded from: classes8.dex */
public final class O1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public EventTagRecord f25986a;
    public int b;
    public final /* synthetic */ EventTag c;
    public final /* synthetic */ User d;
    public final /* synthetic */ EventTaggingManagerImpl e;
    public final /* synthetic */ IPSCompletionListener f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O1(EventTag eventTag, User user, EventTaggingManagerImpl eventTaggingManagerImpl, IPSCompletionListener iPSCompletionListener, String str, Continuation continuation) {
        super(2, continuation);
        this.c = eventTag;
        this.d = user;
        this.e = eventTaggingManagerImpl;
        this.f = iPSCompletionListener;
        this.g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new O1(this.c, this.d, this.e, this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((O1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        if (me.oriient.ipssdk.realtime.services.tag.EventTaggingManagerImpl.m474access$sendTagWithCachingFallback9ntpYrY(r12, r1, r3, r4, r11) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r11.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r12)
            goto L61
        L10:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L18:
            me.oriient.ipssdk.realtime.services.tag.model.EventTagRecord r1 = r11.f25986a
            kotlin.ResultKt.b(r12)
            goto L4a
        L1e:
            kotlin.ResultKt.b(r12)
            me.oriient.ipssdk.realtime.services.tag.model.EventTagRecord r4 = new me.oriient.ipssdk.realtime.services.tag.model.EventTagRecord
            me.oriient.ipssdk.realtime.services.tag.model.EventTag r5 = r11.c
            me.oriient.ipssdk.base.auth.User r12 = r11.d
            me.oriient.internal.services.auth.Space r12 = r12.getSpace()
            java.lang.String r6 = r12.getId()
            me.oriient.ipssdk.realtime.services.tag.model.TagSendingStatus r7 = me.oriient.ipssdk.realtime.services.tag.model.TagSendingStatus.IN_PROGRESS
            r9 = 8
            r10 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            me.oriient.ipssdk.realtime.services.tag.EventTaggingManagerImpl r12 = r11.e
            me.oriient.ipssdk.realtime.services.tag.EventTaggingDatabase r12 = me.oriient.ipssdk.realtime.services.tag.EventTaggingManagerImpl.access$getDatabase$p(r12)
            r11.f25986a = r4
            r11.b = r3
            java.lang.Object r12 = r12.saveTag(r4, r11)
            if (r12 != r0) goto L49
            goto L60
        L49:
            r1 = r4
        L4a:
            me.oriient.ipssdk.api.listeners.IPSCompletionListener r12 = r11.f
            r12.onCompleted()
            me.oriient.ipssdk.realtime.services.tag.EventTaggingManagerImpl r12 = r11.e
            me.oriient.ipssdk.base.auth.User r3 = r11.d
            java.lang.String r4 = r11.g
            r5 = 0
            r11.f25986a = r5
            r11.b = r2
            java.lang.Object r12 = me.oriient.ipssdk.realtime.services.tag.EventTaggingManagerImpl.m474access$sendTagWithCachingFallback9ntpYrY(r12, r1, r3, r4, r11)
            if (r12 != r0) goto L61
        L60:
            return r0
        L61:
            kotlin.Unit r12 = kotlin.Unit.f24250a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ofs.O1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
