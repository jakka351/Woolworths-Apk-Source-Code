package au.com.woolworths.android.onesite.modules.main;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/UnreadMessagesInfo;", "", "NotificationsOnly", "ChatbotMessagesOnly", "Both", "None", "Lau/com/woolworths/android/onesite/modules/main/UnreadMessagesInfo$Both;", "Lau/com/woolworths/android/onesite/modules/main/UnreadMessagesInfo$ChatbotMessagesOnly;", "Lau/com/woolworths/android/onesite/modules/main/UnreadMessagesInfo$None;", "Lau/com/woolworths/android/onesite/modules/main/UnreadMessagesInfo$NotificationsOnly;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
interface UnreadMessagesInfo {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/UnreadMessagesInfo$Both;", "Lau/com/woolworths/android/onesite/modules/main/UnreadMessagesInfo;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Both implements UnreadMessagesInfo {

        /* renamed from: a, reason: collision with root package name */
        public static final Both f4368a = new Both();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Both);
        }

        public final int hashCode() {
            return -1873180635;
        }

        public final String toString() {
            return "Both";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/UnreadMessagesInfo$ChatbotMessagesOnly;", "Lau/com/woolworths/android/onesite/modules/main/UnreadMessagesInfo;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChatbotMessagesOnly implements UnreadMessagesInfo {

        /* renamed from: a, reason: collision with root package name */
        public static final ChatbotMessagesOnly f4369a = new ChatbotMessagesOnly();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChatbotMessagesOnly);
        }

        public final int hashCode() {
            return -719907069;
        }

        public final String toString() {
            return "ChatbotMessagesOnly";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/UnreadMessagesInfo$None;", "Lau/com/woolworths/android/onesite/modules/main/UnreadMessagesInfo;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class None implements UnreadMessagesInfo {

        /* renamed from: a, reason: collision with root package name */
        public static final None f4370a = new None();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public final int hashCode() {
            return -1872823332;
        }

        public final String toString() {
            return "None";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/UnreadMessagesInfo$NotificationsOnly;", "Lau/com/woolworths/android/onesite/modules/main/UnreadMessagesInfo;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NotificationsOnly implements UnreadMessagesInfo {

        /* renamed from: a, reason: collision with root package name */
        public static final NotificationsOnly f4371a = new NotificationsOnly();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotificationsOnly);
        }

        public final int hashCode() {
            return 2063389328;
        }

        public final String toString() {
            return "NotificationsOnly";
        }
    }
}
