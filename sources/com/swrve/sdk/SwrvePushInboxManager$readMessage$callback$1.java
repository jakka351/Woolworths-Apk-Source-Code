package com.swrve.sdk;

import com.swrve.sdk.SwrvePushInboxListenerResult;
import com.swrve.sdk.rest.IRESTResponseListener;
import com.swrve.sdk.rest.RESTResponse;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/swrve/sdk/SwrvePushInboxManager$readMessage$callback$1", "Lcom/swrve/sdk/rest/IRESTResponseListener;", "SwrveSDK_firebaseRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwrvePushInboxManager$readMessage$callback$1 implements IRESTResponseListener {
    @Override // com.swrve.sdk.rest.IRESTResponseListener
    public final void a(Exception exc) {
        SwrveLogger.d("SwrveSDK: Error marking Push Inbox Message %s as read.", 0L, exc);
    }

    @Override // com.swrve.sdk.rest.IRESTResponseListener
    public final void b(RESTResponse rESTResponse) {
        int i = rESTResponse.f19107a;
        if (SwrveHelper.v(i)) {
            SwrvePushInboxMessageState swrvePushInboxMessageState = SwrvePushInboxMessageState.d;
            throw null;
        }
        String strD = YU.a.d(i, "Push Inbox Message 0 failed to mark as read. Server response code:");
        SwrvePushInboxListenerResult.ResultCode[] resultCodeArr = SwrvePushInboxListenerResult.ResultCode.d;
        new SwrvePushInboxListenerResult(strD);
    }
}
