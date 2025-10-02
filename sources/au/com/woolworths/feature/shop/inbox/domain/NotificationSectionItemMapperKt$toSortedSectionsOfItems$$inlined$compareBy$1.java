package au.com.woolworths.feature.shop.inbox.domain;

import au.com.woolworths.feature.shop.inbox.domain.NotificationSection;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class NotificationSectionItemMapperKt$toSortedSectionsOfItems$$inlined$compareBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num;
        Integer num2 = 3;
        NotificationSection notificationSection = (NotificationSection) obj;
        NotificationSection.New r4 = NotificationSection.New.f7290a;
        boolean zC = Intrinsics.c(notificationSection, r4);
        NotificationSection.Older older = NotificationSection.Older.f7291a;
        NotificationSection.LastWeek lastWeek = NotificationSection.LastWeek.f7289a;
        NotificationSection.ThisWeek thisWeek = NotificationSection.ThisWeek.f7292a;
        if (zC) {
            num = 0;
        } else if (Intrinsics.c(notificationSection, thisWeek)) {
            num = 1;
        } else if (Intrinsics.c(notificationSection, lastWeek)) {
            num = 2;
        } else {
            if (!Intrinsics.c(notificationSection, older)) {
                throw new NoWhenBranchMatchedException();
            }
            num = num2;
        }
        NotificationSection notificationSection2 = (NotificationSection) obj2;
        if (Intrinsics.c(notificationSection2, r4)) {
            num2 = 0;
        } else if (Intrinsics.c(notificationSection2, thisWeek)) {
            num2 = 1;
        } else if (Intrinsics.c(notificationSection2, lastWeek)) {
            num2 = 2;
        } else if (!Intrinsics.c(notificationSection2, older)) {
            throw new NoWhenBranchMatchedException();
        }
        return ComparisonsKt.a(num, num2);
    }
}
