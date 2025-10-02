package au.com.woolworths.foundation.appcomms.inbox.client;

import android.content.Context;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve.SwrveDataSource;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncConfig;
import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage;
import au.com.woolworths.foundation.appcomms.inbox.datasource.shop.ShopInboxDataFetcher;
import java.time.Clock;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/InboxClient;", "", "Builder", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface InboxClient {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/InboxClient$Builder;", "", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final InboxUserIdSource f8406a;
        public final InboxChatbotSessionIdSource b;
        public final long c;
        public boolean d;
        public final boolean e;
        public SwrveDataSource f;
        public final ContextScope g;
        public final Clock h;

        public Builder(Context context, InboxUserIdSource userIdSource, InboxChatbotSessionIdSource chatbotSessionIdSource, ShopInboxDataFetcher shopInboxDataFetcher) {
            Intrinsics.h(context, "context");
            Intrinsics.h(userIdSource, "userIdSource");
            Intrinsics.h(chatbotSessionIdSource, "chatbotSessionIdSource");
            this.f8406a = userIdSource;
            this.b = chatbotSessionIdSource;
            this.c = SyncConfig.b.f8435a;
            this.e = true;
            this.g = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) SupervisorKt.b(), Dispatchers.f24691a));
            this.h = Clock.systemDefaultZone();
        }
    }

    Object a(boolean z, Continuation continuation);

    Object b(ContinuationImpl continuationImpl);

    Object c(InboxMessage inboxMessage, Continuation continuation);

    ChannelFlowTransformLatest d(boolean z);

    /* renamed from: e */
    StateFlow getG();

    Object f(ArrayList arrayList, ContinuationImpl continuationImpl);
}
