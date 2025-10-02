package com.swrve.sdk;

import com.swrve.sdk.rest.IRESTResponseListener;
import com.swrve.sdk.rest.RESTResponse;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/swrve/sdk/SwrvePushInboxManager$executePushInboxRestRequest$1$retryWrapperCallback$1", "Lcom/swrve/sdk/rest/IRESTResponseListener;", "SwrveSDK_firebaseRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwrvePushInboxManager$executePushInboxRestRequest$1$retryWrapperCallback$1 implements IRESTResponseListener {
    @Override // com.swrve.sdk.rest.IRESTResponseListener
    public final void a(Exception exc) {
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        CoroutineScopeKt.a(MainDispatcherLoader.f24726a);
        throw null;
    }

    @Override // com.swrve.sdk.rest.IRESTResponseListener
    public final void b(RESTResponse rESTResponse) {
        int i = rESTResponse.f19107a;
        if (!SwrveHelper.v(i)) {
            throw null;
        }
        StringBuilder sb = new StringBuilder("SwrveSDK: Push Inbox REST Result ");
        sb.append(i);
        sb.append(" on attempt ");
        throw null;
    }
}
