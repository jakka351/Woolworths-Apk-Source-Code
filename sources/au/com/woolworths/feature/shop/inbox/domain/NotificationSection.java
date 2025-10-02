package au.com.woolworths.feature.shop.inbox.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/domain/NotificationSection;", "", "New", "ThisWeek", "LastWeek", "Older", "Lau/com/woolworths/feature/shop/inbox/domain/NotificationSection$LastWeek;", "Lau/com/woolworths/feature/shop/inbox/domain/NotificationSection$New;", "Lau/com/woolworths/feature/shop/inbox/domain/NotificationSection$Older;", "Lau/com/woolworths/feature/shop/inbox/domain/NotificationSection$ThisWeek;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface NotificationSection {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/domain/NotificationSection$LastWeek;", "Lau/com/woolworths/feature/shop/inbox/domain/NotificationSection;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LastWeek implements NotificationSection {

        /* renamed from: a, reason: collision with root package name */
        public static final LastWeek f7289a = new LastWeek();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LastWeek);
        }

        public final int hashCode() {
            return 1197960909;
        }

        public final String toString() {
            return "LastWeek";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/domain/NotificationSection$New;", "Lau/com/woolworths/feature/shop/inbox/domain/NotificationSection;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class New implements NotificationSection {

        /* renamed from: a, reason: collision with root package name */
        public static final New f7290a = new New();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof New);
        }

        public final int hashCode() {
            return -889455459;
        }

        public final String toString() {
            return "New";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/domain/NotificationSection$Older;", "Lau/com/woolworths/feature/shop/inbox/domain/NotificationSection;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Older implements NotificationSection {

        /* renamed from: a, reason: collision with root package name */
        public static final Older f7291a = new Older();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Older);
        }

        public final int hashCode() {
            return -67087151;
        }

        public final String toString() {
            return "Older";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/domain/NotificationSection$ThisWeek;", "Lau/com/woolworths/feature/shop/inbox/domain/NotificationSection;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ThisWeek implements NotificationSection {

        /* renamed from: a, reason: collision with root package name */
        public static final ThisWeek f7292a = new ThisWeek();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ThisWeek);
        }

        public final int hashCode() {
            return -409082155;
        }

        public final String toString() {
            return "ThisWeek";
        }
    }
}
