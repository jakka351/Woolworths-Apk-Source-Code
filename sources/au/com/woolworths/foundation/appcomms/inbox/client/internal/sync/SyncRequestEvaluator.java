package au.com.woolworths.foundation.appcomms.inbox.client.internal.sync;

import androidx.datastore.core.DataStore;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataDao;
import java.time.Clock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/sync/SyncRequestEvaluator;", "", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SyncRequestEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final SyncConfig f8437a;
    public final SyncMetadataDao b;
    public final boolean c;
    public final DataStore d;
    public final Clock e;

    public SyncRequestEvaluator(SyncConfig syncConfig, SyncMetadataDao syncMetadataDao, boolean z, DataStore dataStore, Clock clock) {
        Intrinsics.h(syncMetadataDao, "syncMetadataDao");
        Intrinsics.h(clock, "clock");
        this.f8437a = syncConfig;
        this.b = syncMetadataDao;
        this.c = z;
        this.d = dataStore;
        this.e = clock;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Enum a(java.lang.String r7, au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequest r8, boolean r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequestEvaluator$evaluate$1
            if (r0 == 0) goto L13
            r0 = r10
            au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequestEvaluator$evaluate$1 r0 = (au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequestEvaluator$evaluate$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequestEvaluator$evaluate$1 r0 = new au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequestEvaluator$evaluate$1
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            boolean r3 = r6.c
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            boolean r7 = r0.q
            kotlin.ResultKt.b(r10)
            goto L71
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequest r8 = r0.p
            kotlin.ResultKt.b(r10)
            goto L51
        L3c:
            kotlin.ResultKt.b(r10)
            boolean r10 = r8.f8436a
            if (r10 != 0) goto L8b
            if (r9 == 0) goto L46
            goto L8b
        L46:
            r0.p = r8
            r0.t = r5
            java.lang.Object r10 = r6.c(r7, r0)
            if (r10 != r1) goto L51
            goto L70
        L51:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r7 = r10.booleanValue()
            if (r3 != 0) goto L61
            if (r7 == 0) goto L5e
            au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncDecision r7 = au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncDecision.d
            return r7
        L5e:
            au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncDecision r7 = au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncDecision.g
            return r7
        L61:
            boolean r8 = r8.b
            r9 = 0
            r0.p = r9
            r0.q = r7
            r0.t = r4
            java.lang.Object r10 = r6.b(r8, r0)
            if (r10 != r1) goto L71
        L70:
            return r1
        L71:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r8 = r10.booleanValue()
            if (r7 == 0) goto L7e
            if (r8 == 0) goto L7e
            au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncDecision r7 = au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncDecision.f
            return r7
        L7e:
            if (r7 == 0) goto L83
            au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncDecision r7 = au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncDecision.d
            return r7
        L83:
            if (r8 == 0) goto L88
            au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncDecision r7 = au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncDecision.e
            return r7
        L88:
            au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncDecision r7 = au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncDecision.g
            return r7
        L8b:
            if (r3 == 0) goto L90
            au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncDecision r7 = au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncDecision.f
            return r7
        L90:
            au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncDecision r7 = au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncDecision.d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequestEvaluator.a(java.lang.String, au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequest, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(boolean r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequestEvaluator$shouldSyncLastChatbotMessage$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequestEvaluator$shouldSyncLastChatbotMessage$1 r0 = (au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequestEvaluator$shouldSyncLastChatbotMessage$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequestEvaluator$shouldSyncLastChatbotMessage$1 r0 = new au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequestEvaluator$shouldSyncLastChatbotMessage$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            if (r5 == 0) goto L37
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L37:
            androidx.datastore.core.DataStore r5 = r4.d
            kotlinx.coroutines.flow.Flow r5 = r5.getData()
            r0.r = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.y(r5, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            if (r6 != 0) goto L49
            goto L4a
        L49:
            r3 = 0
        L4a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequestEvaluator.b(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequestEvaluator$shouldSyncNotifications$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequestEvaluator$shouldSyncNotifications$1 r0 = (au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequestEvaluator$shouldSyncNotifications$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequestEvaluator$shouldSyncNotifications$1 r0 = new au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequestEvaluator$shouldSyncNotifications$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataEntity$ResourceType r6 = au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataEntity.ResourceType.d
            r0.r = r3
            au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataDao r6 = r4.b
            java.lang.Object r6 = r6.c(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataEntity r6 = (au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataEntity) r6
            if (r6 != 0) goto L44
            goto L79
        L44:
            java.time.Instant r5 = r6.b
            java.time.Clock r6 = r4.e
            java.time.Instant r6 = r6.instant()
            java.time.Duration r5 = java.time.Duration.between(r5, r6)
            java.lang.String r6 = "between(...)"
            kotlin.jvm.internal.Intrinsics.g(r5, r6)
            long r0 = r5.getSeconds()
            kotlin.time.DurationUnit r6 = kotlin.time.DurationUnit.h
            long r0 = kotlin.time.DurationKt.h(r0, r6)
            int r5 = r5.getNano()
            kotlin.time.DurationUnit r6 = kotlin.time.DurationUnit.e
            long r5 = kotlin.time.DurationKt.g(r5, r6)
            long r5 = kotlin.time.Duration.l(r0, r5)
            au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncConfig r0 = r4.f8437a
            long r0 = r0.f8435a
            int r5 = kotlin.time.Duration.c(r5, r0)
            if (r5 <= 0) goto L78
            goto L79
        L78:
            r3 = 0
        L79:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequestEvaluator.c(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
