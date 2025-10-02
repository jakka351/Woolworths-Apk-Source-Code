package au.com.woolworths.foundation.appcomms.inbox.client;

import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class InboxClientImpl$inboxFeed$lambda$7$lambda$4$$inlined$sortedByDescending$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.a(((InboxMessage) obj2).i, ((InboxMessage) obj).i);
    }
}
