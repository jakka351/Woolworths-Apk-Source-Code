package au.com.woolworths.foundation.appcomms.inbox.client;

import androidx.datastore.core.DataStore;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve.SwrveDataSource;
import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/InboxClientImpl;", "Lau/com/woolworths/foundation/appcomms/inbox/client/InboxClient;", "MessagesEmissionBarrier", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class InboxClientImpl implements InboxClient {

    /* renamed from: a, reason: collision with root package name */
    public final StateFlow f8407a;
    public final BffDataSource b;
    public final SwrveDataSource c;
    public final DataStore d;
    public final boolean e;
    public final boolean f;
    public final StateFlow g;
    public volatile MessagesEmissionBarrier.DeleteAll h;
    public volatile MessagesEmissionBarrier.MarkAsSeen i;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/InboxClientImpl$MessagesEmissionBarrier;", "", "DeleteAll", "MarkAsSeen", "Lau/com/woolworths/foundation/appcomms/inbox/client/InboxClientImpl$MessagesEmissionBarrier$MarkAsSeen;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface MessagesEmissionBarrier {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/InboxClientImpl$MessagesEmissionBarrier$DeleteAll;", "", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DeleteAll {

            /* renamed from: a, reason: collision with root package name */
            public static final DeleteAll f8408a = new DeleteAll();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof DeleteAll);
            }

            public final int hashCode() {
                return -953376338;
            }

            public final String toString() {
                return "DeleteAll";
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/InboxClientImpl$MessagesEmissionBarrier$MarkAsSeen;", "Lau/com/woolworths/foundation/appcomms/inbox/client/InboxClientImpl$MessagesEmissionBarrier;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class MarkAsSeen implements MessagesEmissionBarrier {

            /* renamed from: a, reason: collision with root package name */
            public final List f8409a;

            public MarkAsSeen(List messages) {
                Intrinsics.h(messages, "messages");
                this.f8409a = messages;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MarkAsSeen) && Intrinsics.c(this.f8409a, ((MarkAsSeen) obj).f8409a);
            }

            public final int hashCode() {
                return this.f8409a.hashCode();
            }

            public final String toString() {
                return a.l("MarkAsSeen(messages=", ")", this.f8409a);
            }
        }
    }

    public InboxClientImpl(StateFlow stateFlow, BffDataSource bffDataSource, SwrveDataSource swrveDataSource, DataStore dataStore, boolean z, boolean z2) {
        this.f8407a = stateFlow;
        this.b = bffDataSource;
        this.c = swrveDataSource;
        this.d = dataStore;
        this.e = z;
        this.f = z2;
        this.g = bffDataSource.f8405a.g;
    }

    @Override // au.com.woolworths.foundation.appcomms.inbox.client.InboxClient
    public final Object a(boolean z, Continuation continuation) {
        Object objB = this.b.f8405a.b(!z, z, (SuspendLambda) continuation);
        return objB == CoroutineSingletons.d ? objB : Unit.f24250a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r6.a(r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.foundation.appcomms.inbox.client.InboxClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$deleteAll$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$deleteAll$1 r0 = (au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$deleteAll$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$deleteAll$1 r0 = new au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$deleteAll$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r6)
            goto L63
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            kotlin.ResultKt.b(r6)
            goto L58
        L36:
            kotlin.ResultKt.b(r6)
            kotlinx.coroutines.flow.StateFlow r6 = r5.f8407a
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L63
            boolean r2 = r5.f
            if (r2 == 0) goto L4b
            au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$MessagesEmissionBarrier$DeleteAll r2 = au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl.MessagesEmissionBarrier.DeleteAll.f8408a
            r5.h = r2
        L4b:
            au.com.woolworths.foundation.appcomms.inbox.client.BffDataSource r2 = r5.b
            au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao r2 = r2.b
            r0.r = r4
            java.lang.Object r6 = r2.d(r6, r0)
            if (r6 != r1) goto L58
            goto L62
        L58:
            au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve.SwrveDataSource r6 = r5.c
            r0.r = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L63
        L62:
            return r1
        L63:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.foundation.appcomms.inbox.client.InboxClient
    public final Object c(InboxMessage inboxMessage, Continuation continuation) {
        boolean z = inboxMessage.k;
        String str = inboxMessage.f8440a;
        if (z) {
            Object objB = this.c.b(str, continuation);
            if (objB == CoroutineSingletons.d) {
                return objB;
            }
        } else {
            Object objC = this.b.b.c(str, continuation);
            if (objC == CoroutineSingletons.d) {
                return objC;
            }
        }
        return Unit.f24250a;
    }

    @Override // au.com.woolworths.foundation.appcomms.inbox.client.InboxClient
    public final ChannelFlowTransformLatest d(boolean z) {
        return FlowKt.Q(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.f8407a), new InboxClientImpl$inboxFeed$$inlined$flatMapLatest$1(this, null, z));
    }

    @Override // au.com.woolworths.foundation.appcomms.inbox.client.InboxClient
    /* renamed from: e, reason: from getter */
    public final StateFlow getG() {
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // au.com.woolworths.foundation.appcomms.inbox.client.InboxClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.util.ArrayList r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl.f(java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
