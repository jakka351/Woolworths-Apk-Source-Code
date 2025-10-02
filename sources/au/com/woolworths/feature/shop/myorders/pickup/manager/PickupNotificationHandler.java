package au.com.woolworths.feature.shop.myorders.pickup.manager;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.myorders.pickup.analytics.PickupNotificationAction;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/pickup/manager/PickupNotificationHandler;", "", "PickupRemoteMessage", "PickupServicePushNotificationType", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PickupNotificationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final PickupNotificationManagerImpl f7885a;
    public final AnalyticsManager b;
    public final ShopAccountInteractor c;
    public final Gson d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/pickup/manager/PickupNotificationHandler$Companion;", "", "", "PICKUP_ORIGINATING_SOURCE", "Ljava/lang/String;", "PICKUP_PUSH_MESSAGE_SOURCE", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/pickup/manager/PickupNotificationHandler$PickupRemoteMessage;", "", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PickupRemoteMessage {

        /* renamed from: a, reason: collision with root package name */
        public final String f7886a;
        public final Uri b;
        public final String c;
        public final String d;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/pickup/manager/PickupNotificationHandler$PickupRemoteMessage$Companion;", "", "", "NOTIFICATIOIN_TYPE", "Ljava/lang/String;", "ORDER_ID", "TITLE", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class Companion {
        }

        public PickupRemoteMessage(String str, Uri uri, String str2, String str3, String str4) {
            this.f7886a = str;
            this.b = uri;
            this.c = str2;
            this.d = str4;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/pickup/manager/PickupNotificationHandler$PickupServicePushNotificationType;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PickupServicePushNotificationType {
        public static final /* synthetic */ PickupServicePushNotificationType[] f;
        public static final /* synthetic */ EnumEntries g;
        public final String d;
        public final PickupNotificationAction e;

        static {
            PickupServicePushNotificationType[] pickupServicePushNotificationTypeArr = {new PickupServicePushNotificationType("ORDER_ACKNOWLEDGE", 0, "OrderAck", PickupNotificationAction.e), new PickupServicePushNotificationType("ORDER_DTB_ACKNOWLEDGE", 1, "OrderDtbAck", PickupNotificationAction.f), new PickupServicePushNotificationType("ORDER_READY", 2, "OrderReady", PickupNotificationAction.d)};
            f = pickupServicePushNotificationTypeArr;
            g = EnumEntriesKt.a(pickupServicePushNotificationTypeArr);
        }

        public PickupServicePushNotificationType(String str, int i, String str2, PickupNotificationAction pickupNotificationAction) {
            this.d = str2;
            this.e = pickupNotificationAction;
        }

        public static PickupServicePushNotificationType valueOf(String str) {
            return (PickupServicePushNotificationType) Enum.valueOf(PickupServicePushNotificationType.class, str);
        }

        public static PickupServicePushNotificationType[] values() {
            return (PickupServicePushNotificationType[]) f.clone();
        }
    }

    public PickupNotificationHandler(PickupNotificationManagerImpl pickupNotificationManagerImpl, AnalyticsManager analyticsManager, ShopAccountInteractor accountInteractor, Gson gson) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(gson, "gson");
        this.f7885a = pickupNotificationManagerImpl;
        this.b = analyticsManager;
        this.c = accountInteractor;
        this.d = gson;
    }
}
