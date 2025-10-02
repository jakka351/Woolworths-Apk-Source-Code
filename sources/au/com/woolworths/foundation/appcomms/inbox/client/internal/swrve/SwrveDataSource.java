package au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/swrve/SwrveDataSource;", "", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SwrveDataSource {
    Object a(Continuation continuation);

    Object b(String str, Continuation continuation);

    Object c(ArrayList arrayList, Continuation continuation);

    SwrveDataSourceImpl$special$$inlined$map$1 getMessages();
}
