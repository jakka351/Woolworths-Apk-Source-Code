package com.tealium.core.messaging;

import android.app.Activity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/messaging/ActivityObserverListener;", "Lcom/tealium/core/messaging/ExternalListener;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ActivityObserverListener extends ExternalListener {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
    }

    void m(Activity activity, boolean z);

    void onActivityPaused(Activity activity);

    void onActivityResumed(Activity activity);
}
