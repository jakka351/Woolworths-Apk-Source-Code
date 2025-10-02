package au.com.woolworths.feature.shop.inbox.domain;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class NotificationSectionItemMapperKt$toSortedSectionsOfItems$lambda$2$$inlined$sortedByDescending$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.a(Long.valueOf(((NotificationItem) obj2).f7288a.i.toEpochMilli()), Long.valueOf(((NotificationItem) obj).f7288a.i.toEpochMilli()));
    }
}
