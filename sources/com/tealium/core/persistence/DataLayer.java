package com.tealium.core.persistence;

import com.tealium.core.Collector;
import com.tealium.core.messaging.Listener;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/persistence/DataLayer;", "Lcom/tealium/core/Collector;", "DataLayerUpdatedListener", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DataLayer extends Collector {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/persistence/DataLayer$DataLayerUpdatedListener;", "Lcom/tealium/core/messaging/Listener;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface DataLayerUpdatedListener extends Listener {
        void e(Object obj, String str);

        void q(Set set);
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
    }
}
