package au.com.woolworths.feature.shop.notification.preferences.details;

import androidx.camera.core.impl.b;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsContract;", "", "ViewState", "Actions", "NotificationsDetailsFullPageErrorState", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ShopNotificationPreferencesDetailsContract {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsContract$Actions;", "", "ShowSnackBarMessage", "OpenNotificationSettings", "ToggleUpdatedForAccessibilityAnnouncement", "Lau/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsContract$Actions$OpenNotificationSettings;", "Lau/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsContract$Actions$ShowSnackBarMessage;", "Lau/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsContract$Actions$ToggleUpdatedForAccessibilityAnnouncement;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsContract$Actions$OpenNotificationSettings;", "Lau/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsContract$Actions;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class OpenNotificationSettings extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final OpenNotificationSettings f7933a = new OpenNotificationSettings();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsContract$Actions$ShowSnackBarMessage;", "Lau/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsContract$Actions;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackBarMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ResText f7934a;

            public ShowSnackBarMessage(ResText resText) {
                this.f7934a = resText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackBarMessage) && Intrinsics.c(this.f7934a, ((ShowSnackBarMessage) obj).f7934a);
            }

            public final int hashCode() {
                return this.f7934a.hashCode();
            }

            public final String toString() {
                return "ShowSnackBarMessage(message=" + this.f7934a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsContract$Actions$ToggleUpdatedForAccessibilityAnnouncement;", "Lau/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsContract$Actions;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ToggleUpdatedForAccessibilityAnnouncement extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f7935a;

            public ToggleUpdatedForAccessibilityAnnouncement(boolean z) {
                this.f7935a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ToggleUpdatedForAccessibilityAnnouncement) && this.f7935a == ((ToggleUpdatedForAccessibilityAnnouncement) obj).f7935a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f7935a);
            }

            public final String toString() {
                return a.n("ToggleUpdatedForAccessibilityAnnouncement(status=", ")", this.f7935a);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsContract$NotificationsDetailsFullPageErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NotificationsDetailsFullPageErrorState implements FullPageErrorCause {
        public static final NotificationsDetailsFullPageErrorState d;
        public static final NotificationsDetailsFullPageErrorState e;
        public static final NotificationsDetailsFullPageErrorState f;
        public static final /* synthetic */ NotificationsDetailsFullPageErrorState[] g;
        public static final /* synthetic */ EnumEntries h;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsContract.NotificationsDetailsFullPageErrorState.NETWORK_ERROR", "Lau/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsContract$NotificationsDetailsFullPageErrorState;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class NETWORK_ERROR extends NotificationsDetailsFullPageErrorState {
            public NETWORK_ERROR() {
                super("NETWORK_ERROR", 0);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getDrawableRes */
            public final int getG() {
                return R.drawable.ic_order_network_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getMessage */
            public final Text getE() {
                return new ResText(R.string.notifications_details_network_error_subtitle);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getSecondaryActionRes */
            public final int getF() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getTitle */
            public final Text getD() {
                return new ResText(R.string.no_network_heading);
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsContract.NotificationsDetailsFullPageErrorState.NOTIFICATION_OFF", "Lau/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsContract$NotificationsDetailsFullPageErrorState;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class NOTIFICATION_OFF extends NotificationsDetailsFullPageErrorState {
            public NOTIFICATION_OFF() {
                super("NOTIFICATION_OFF", 2);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getDrawableRes */
            public final int getG() {
                return R.drawable.ic_notification_off;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getMessage */
            public final Text getE() {
                return new ResText(R.string.notifications_details_off_subtitle);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getSecondaryActionRes */
            public final int getF() {
                return R.string.notifications_turn_on_in_settings;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getTitle */
            public final Text getD() {
                return new ResText(R.string.notifications_details_off_title);
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsContract.NotificationsDetailsFullPageErrorState.SERVER_ERROR", "Lau/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsContract$NotificationsDetailsFullPageErrorState;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SERVER_ERROR extends NotificationsDetailsFullPageErrorState {
            public SERVER_ERROR() {
                super("SERVER_ERROR", 1);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getDrawableRes */
            public final int getG() {
                return R.drawable.ic_order_server_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getMessage */
            public final Text getE() {
                return new ResText(R.string.notifications_details_server_error_subtitle);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getSecondaryActionRes */
            public final int getF() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            /* renamed from: getTitle */
            public final Text getD() {
                return new ResText(R.string.server_error_heading);
            }
        }

        static {
            NETWORK_ERROR network_error = new NETWORK_ERROR();
            d = network_error;
            SERVER_ERROR server_error = new SERVER_ERROR();
            e = server_error;
            NOTIFICATION_OFF notification_off = new NOTIFICATION_OFF();
            f = notification_off;
            NotificationsDetailsFullPageErrorState[] notificationsDetailsFullPageErrorStateArr = {network_error, server_error, notification_off};
            g = notificationsDetailsFullPageErrorStateArr;
            h = EnumEntriesKt.a(notificationsDetailsFullPageErrorStateArr);
        }

        public static NotificationsDetailsFullPageErrorState valueOf(String str) {
            return (NotificationsDetailsFullPageErrorState) Enum.valueOf(NotificationsDetailsFullPageErrorState.class, str);
        }

        public static NotificationsDetailsFullPageErrorState[] values() {
            return (NotificationsDetailsFullPageErrorState[]) g.clone();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsContract$ViewState;", "", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final String f7936a;
        public final List b;
        public final boolean c;
        public final boolean d;
        public final NotificationsDetailsFullPageErrorState e;

        public /* synthetic */ ViewState(int i) {
            this(null, EmptyList.d, (i & 4) == 0, false, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f7936a, viewState.f7936a) && Intrinsics.c(this.b, viewState.b) && this.c == viewState.c && this.d == viewState.d && this.e == viewState.e;
        }

        public final int hashCode() {
            String str = this.f7936a;
            int iE = b.e(b.e(b.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
            NotificationsDetailsFullPageErrorState notificationsDetailsFullPageErrorState = this.e;
            return iE + (notificationsDetailsFullPageErrorState != null ? notificationsDetailsFullPageErrorState.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbS = au.com.woolworths.android.onesite.a.s("ViewState(title=", this.f7936a, ", items=", ", isLoading=", this.b);
            au.com.woolworths.android.onesite.a.D(sbS, this.c, ", isToggleInProgress=", this.d, ", errorState=");
            sbS.append(this.e);
            sbS.append(")");
            return sbS.toString();
        }

        public ViewState(String str, List items, boolean z, boolean z2, NotificationsDetailsFullPageErrorState notificationsDetailsFullPageErrorState) {
            Intrinsics.h(items, "items");
            this.f7936a = str;
            this.b = items;
            this.c = z;
            this.d = z2;
            this.e = notificationsDetailsFullPageErrorState;
        }
    }
}
