package au.com.woolworths.feature.shop.notification.preferences.details;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.utils.NotificationManager;
import au.com.woolworths.feature.shop.notification.preferences.analytics.DisableNotificationPreferenceAction;
import au.com.woolworths.feature.shop.notification.preferences.analytics.EnableNotificationPreferenceAction;
import au.com.woolworths.feature.shop.notification.preferences.analytics.NotificationPreferencesActions;
import au.com.woolworths.feature.shop.notification.preferences.details.ShopNotificationPreferencesDetailsContract;
import au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor;
import au.com.woolworths.feature.shop.notification.preferences.models.PreferenceToggleData;
import com.woolworths.R;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/feature/shop/notification/preferences/details/ShopPreferenceDetailsClickHandler;", "Companion", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShopNotificationPreferencesDetailsViewModel extends ViewModel implements FullPageErrorStateClickHandler, ShopPreferenceDetailsClickHandler {
    public final AnalyticsManager e;
    public final PreferencesDetailsInteractor f;
    public final NotificationManager g;
    public final MutableLiveData h;
    public final SharedFlowImpl i;
    public final MutableLiveData j;
    public final Flow k;
    public String l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsViewModel$Companion;", "", "", "EMPTY_KEY", "Ljava/lang/String;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ShopNotificationPreferencesDetailsContract.NotificationsDetailsFullPageErrorState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ShopNotificationPreferencesDetailsContract.NotificationsDetailsFullPageErrorState notificationsDetailsFullPageErrorState = ShopNotificationPreferencesDetailsContract.NotificationsDetailsFullPageErrorState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ShopNotificationPreferencesDetailsContract.NotificationsDetailsFullPageErrorState notificationsDetailsFullPageErrorState2 = ShopNotificationPreferencesDetailsContract.NotificationsDetailsFullPageErrorState.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ShopNotificationPreferencesDetailsViewModel(AnalyticsManager analyticsManager, PreferencesDetailsInteractor preferencesDetailsInteractor, NotificationManager notificationManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(preferencesDetailsInteractor, "preferencesDetailsInteractor");
        Intrinsics.h(notificationManager, "notificationManager");
        this.e = analyticsManager;
        this.f = preferencesDetailsInteractor;
        this.g = notificationManager;
        MutableLiveData mutableLiveData = new MutableLiveData(new ShopNotificationPreferencesDetailsContract.ViewState(31));
        this.h = mutableLiveData;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.i = sharedFlowImplB;
        this.j = mutableLiveData;
        this.k = FlowKt.a(sharedFlowImplB);
        this.l = "";
    }

    public static final void p6(ShopNotificationPreferencesDetailsViewModel shopNotificationPreferencesDetailsViewModel) {
        shopNotificationPreferencesDetailsViewModel.e.c(NotificationPreferencesActions.k);
        r6(shopNotificationPreferencesDetailsViewModel.h, false, null, 23);
        shopNotificationPreferencesDetailsViewModel.i.f(new ShopNotificationPreferencesDetailsContract.Actions.ShowSnackBarMessage(new ResText(R.string.notifications_update_failure)));
    }

    public static void r6(MutableLiveData mutableLiveData, boolean z, ShopNotificationPreferencesDetailsContract.NotificationsDetailsFullPageErrorState notificationsDetailsFullPageErrorState, int i) {
        String str;
        List list;
        boolean z2;
        ShopNotificationPreferencesDetailsContract.ViewState viewState = (ShopNotificationPreferencesDetailsContract.ViewState) mutableLiveData.e();
        if (viewState == null || (str = viewState.f7936a) == null) {
            str = "";
        }
        String str2 = str;
        ShopNotificationPreferencesDetailsContract.ViewState viewState2 = (ShopNotificationPreferencesDetailsContract.ViewState) mutableLiveData.e();
        if (viewState2 == null || (list = viewState2.b) == null) {
            list = EmptyList.d;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            ShopNotificationPreferencesDetailsContract.ViewState viewState3 = (ShopNotificationPreferencesDetailsContract.ViewState) mutableLiveData.e();
            z2 = viewState3 != null ? viewState3.c : false;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            ShopNotificationPreferencesDetailsContract.ViewState viewState4 = (ShopNotificationPreferencesDetailsContract.ViewState) mutableLiveData.e();
            z = viewState4 != null ? viewState4.d : false;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            ShopNotificationPreferencesDetailsContract.ViewState viewState5 = (ShopNotificationPreferencesDetailsContract.ViewState) mutableLiveData.e();
            notificationsDetailsFullPageErrorState = viewState5 != null ? viewState5.e : null;
        }
        mutableLiveData.m(new ShopNotificationPreferencesDetailsContract.ViewState(str2, list2, z2, z3, notificationsDetailsFullPageErrorState));
    }

    @Override // au.com.woolworths.feature.shop.notification.preferences.details.ShopPreferenceDetailsClickHandler
    public final void B2(PreferenceToggleData toggleData, boolean z) {
        Intrinsics.h(toggleData, "toggleData");
        if (this.g.b(CollectionsKt.Q("swrve_notification_channel"))) {
            this.e.c(z ? new EnableNotificationPreferenceAction(toggleData) : new DisableNotificationPreferenceAction(toggleData));
            BuildersKt.c(ViewModelKt.a(this), null, null, new ShopNotificationPreferencesDetailsViewModel$onToggleClick$1(this, toggleData, z, null), 3);
        }
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        ShopNotificationPreferencesDetailsContract.NotificationsDetailsFullPageErrorState notificationsDetailsFullPageErrorState;
        NotificationPreferencesActions notificationPreferencesActions;
        ShopNotificationPreferencesDetailsContract.ViewState viewState = (ShopNotificationPreferencesDetailsContract.ViewState) this.j.e();
        if (viewState != null && (notificationsDetailsFullPageErrorState = viewState.e) != null) {
            int iOrdinal = notificationsDetailsFullPageErrorState.ordinal();
            if (iOrdinal == 0) {
                notificationPreferencesActions = NotificationPreferencesActions.h;
            } else if (iOrdinal == 1) {
                notificationPreferencesActions = NotificationPreferencesActions.j;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                notificationPreferencesActions = NotificationPreferencesActions.f;
            }
            this.e.c(notificationPreferencesActions);
        }
        List listQ = CollectionsKt.Q("swrve_notification_channel");
        NotificationManager notificationManager = this.g;
        if (!notificationManager.b(listQ)) {
            this.i.f(ShopNotificationPreferencesDetailsContract.Actions.OpenNotificationSettings.f7933a);
        } else if (notificationManager.b(CollectionsKt.Q("swrve_notification_channel"))) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new ShopNotificationPreferencesDetailsViewModel$fetchPreferencesDetails$1(this, null), 3);
        } else {
            q6(ShopNotificationPreferencesDetailsContract.NotificationsDetailsFullPageErrorState.f);
        }
    }

    public final void q6(ShopNotificationPreferencesDetailsContract.NotificationsDetailsFullPageErrorState notificationsDetailsFullPageErrorState) {
        NotificationPreferencesActions notificationPreferencesActions;
        int iOrdinal = notificationsDetailsFullPageErrorState.ordinal();
        if (iOrdinal == 0) {
            notificationPreferencesActions = NotificationPreferencesActions.g;
        } else if (iOrdinal == 1) {
            notificationPreferencesActions = NotificationPreferencesActions.i;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            notificationPreferencesActions = NotificationPreferencesActions.e;
        }
        this.e.c(notificationPreferencesActions);
        r6(this.h, false, notificationsDetailsFullPageErrorState, 11);
    }
}
