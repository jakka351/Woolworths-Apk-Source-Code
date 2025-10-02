package au.com.woolworths.shop.lists.ui.utils;

import android.app.Activity;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.android.onesite.utils.NotificationManager;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import au.com.woolworths.shop.lists.data.prefs.ShoppingListsRepository;
import au.com.woolworths.shop.lists.data.prefs.SortBy;
import au.com.woolworths.shop.lists.data.prefs.SortDirection;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import java.net.URI;
import java.net.URISyntaxException;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/ui/utils/ListsUtils;", "", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Singleton
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ListsUtils {

    /* renamed from: a, reason: collision with root package name */
    public final ListsInMemoryRepository f12487a;
    public final FeatureToggleManager b;
    public final ShoppingListsRepository c;
    public final PreferencesDetailsInteractor d;
    public final NotificationManager e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/lists/ui/utils/ListsUtils$Companion;", "", "", "SuggestedListsDeeplinkPath", "Ljava/lang/String;", "WatchlistsDeeplinkPath", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static boolean a(String str, String str2) {
            try {
                String path = new URI(str).getPath();
                Intrinsics.g(path, "getPath(...)");
                return StringsKt.o(path, str2, false);
            } catch (URISyntaxException e) {
                Timber.f27013a.n("Failed to parse Uri: ".concat(str), e, new Object[0]);
                return false;
            }
        }
    }

    public ListsUtils(ListsInMemoryRepository listsInMemoryRepository, FeatureToggleManager featureToggleManager, ShoppingListsRepository shoppingListsRepository, PreferencesDetailsInteractor preferencesDetailsInteractor, NotificationManager notificationManager) {
        Intrinsics.h(listsInMemoryRepository, "listsInMemoryRepository");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(shoppingListsRepository, "shoppingListsRepository");
        Intrinsics.h(preferencesDetailsInteractor, "preferencesDetailsInteractor");
        Intrinsics.h(notificationManager, "notificationManager");
        this.f12487a = listsInMemoryRepository;
        this.b = featureToggleManager;
        this.c = shoppingListsRepository;
        this.d = preferencesDetailsInteractor;
        this.e = notificationManager;
    }

    public static void c(ListsUtils listsUtils, Activity activity, CollectionMode collectionMode, int i) {
        Intent intentPutExtra;
        if ((i & 2) != 0) {
            collectionMode = null;
        }
        listsUtils.getClass();
        Intrinsics.h(activity, "activity");
        Activities.ModeSelectorActivity modeSelectorActivity = Activities.ModeSelectorActivity.f4490a;
        if (collectionMode == null) {
            intentPutExtra = ActivityNavigatorKt.a(modeSelectorActivity, ApplicationType.e);
        } else {
            intentPutExtra = ActivityNavigatorKt.a(modeSelectorActivity, ApplicationType.e).putExtra("EXTRA_IS_HOME_BUTTON_VISIBLE", new Activities.ModeSelectorActivity.ExtraCollectionModeSelector(false, false, collectionMode));
            Intrinsics.g(intentPutExtra, "putExtra(...)");
        }
        activity.startActivity(intentPutExtra);
    }

    public final boolean a() {
        return !this.f12487a.e();
    }

    public final boolean b(ShoppingList list) {
        Intrinsics.h(list, "list");
        return this.b.c(BaseShopAppFeature.v) && Intrinsics.c(list.isWatchlist(), Boolean.TRUE);
    }

    public final SortBy d() {
        SortBy sortBy;
        ListsInMemoryRepository listsInMemoryRepository = this.f12487a;
        CollectionMode mode = listsInMemoryRepository.b();
        ShoppingListsRepository shoppingListsRepository = this.c;
        shoppingListsRepository.getClass();
        Intrinsics.h(mode, "mode");
        SortBy sortByValueOf = null;
        String string = shoppingListsRepository.f12277a.getString("SORT_BY_" + mode.getModeName(), null);
        if (string != null) {
            try {
                sortByValueOf = SortBy.valueOf(string);
            } catch (IllegalArgumentException unused) {
            }
        }
        if (sortByValueOf == null) {
            if (mode instanceof CollectionMode.InStore) {
                sortBy = SortBy.h;
            } else {
                if (!(mode instanceof CollectionMode.Delivery) && !(mode instanceof CollectionMode.PickUp)) {
                    throw new IllegalStateException("ShoppingMode cannot be NOT_SET");
                }
                sortBy = SortBy.f;
            }
            sortByValueOf = sortBy;
        }
        if (sortByValueOf != SortBy.h || listsInMemoryRepository.g()) {
            return sortByValueOf;
        }
        SortBy sortBy2 = SortBy.f;
        shoppingListsRepository.a(mode, sortBy2);
        return sortBy2;
    }

    public final SortDirection e() {
        CollectionMode mode = this.f12487a.b();
        ShoppingListsRepository shoppingListsRepository = this.c;
        shoppingListsRepository.getClass();
        Intrinsics.h(mode, "mode");
        String string = shoppingListsRepository.f12277a.getString("SORT_DIRECTION_" + mode.getModeName(), null);
        SortDirection sortDirectionValueOf = string != null ? SortDirection.valueOf(string) : null;
        if (sortDirectionValueOf != null) {
            return sortDirectionValueOf;
        }
        if (mode instanceof CollectionMode.InStore) {
            return SortDirection.d;
        }
        if ((mode instanceof CollectionMode.Delivery) || (mode instanceof CollectionMode.PickUp)) {
            return SortDirection.e;
        }
        throw new IllegalStateException("ShoppingMode cannot be NOT_SET");
    }
}
