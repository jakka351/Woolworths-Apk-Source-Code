package au.com.woolworths.shop.lists.data.prefs;

import YU.a;
import android.content.SharedPreferences;
import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt$boolean$$inlined$delegate$1;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt$long$$inlined$delegate$1;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt$string$$inlined$delegate$1;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/data/prefs/ShoppingListsRepository;", "", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ShoppingListsRepository {
    public static final /* synthetic */ KProperty[] j;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f12277a;
    public final SharedPreferenceExtKt$long$$inlined$delegate$1 b;
    public final SharedPreferenceExtKt$long$$inlined$delegate$1 c;
    public final SharedPreferenceExtKt$boolean$$inlined$delegate$1 d;
    public final SharedPreferenceExtKt$boolean$$inlined$delegate$1 e;
    public final SharedPreferenceExtKt$boolean$$inlined$delegate$1 f;
    public final SharedPreferenceExtKt$boolean$$inlined$delegate$1 g;
    public final SharedPreferenceExtKt$string$$inlined$delegate$1 h;
    public final SharedPreferenceExtKt$boolean$$inlined$delegate$1 i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/shop/lists/data/prefs/ShoppingListsRepository$Companion;", "", "", "SORT_BY", "Ljava/lang/String;", "SORT_DIRECTION", "LAST_SYNCED_TIME", "LAST_UNIQUE_WORK_SCHEDULED_RUN_TIME", "LIST_UPGRADE_PRODUCT_HINT", "WATCHLIST_UPGRADE_PRODUCT_HINT", "LIST_SORT_BY_CATEGORY_HINT_SHOWN", "LIST_VALUE_SWAPS_BANNER_HINT_CLOSED", "SNG_AUTO_CHECK_OFF_DIALOG_DISPLAY", "SNG_DEFAULT_LIST_LOCAL_ID", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ShoppingListsRepository.class, "lastListsSyncedTime", "getLastListsSyncedTime()J", 0);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        j = new KProperty[]{reflectionFactory.e(mutablePropertyReference1Impl), b.y(ShoppingListsRepository.class, "lastUniqueWorkScheduledRunTime", "getLastUniqueWorkScheduledRunTime()J", 0, reflectionFactory), b.y(ShoppingListsRepository.class, "wasListUpgradeProductHintShown", "getWasListUpgradeProductHintShown()Z", 0, reflectionFactory), b.y(ShoppingListsRepository.class, "wasWatchlistUpgradeProductHintShown", "getWasWatchlistUpgradeProductHintShown()Z", 0, reflectionFactory), b.y(ShoppingListsRepository.class, "wasSortByCategoryHintShown", "getWasSortByCategoryHintShown()Z", 0, reflectionFactory), b.y(ShoppingListsRepository.class, "wasSngCheckOffDialogShown", "getWasSngCheckOffDialogShown()Z", 0, reflectionFactory), b.y(ShoppingListsRepository.class, "sngDefaultListLocalId", "getSngDefaultListLocalId()Ljava/lang/String;", 0, reflectionFactory), b.y(ShoppingListsRepository.class, "wasListValueSwapsBannerHintClosed", "getWasListValueSwapsBannerHintClosed()Z", 0, reflectionFactory)};
    }

    public ShoppingListsRepository(SharedPreferences sharedPreferences) {
        this.f12277a = sharedPreferences;
        this.b = new SharedPreferenceExtKt$long$$inlined$delegate$1(sharedPreferences, "LAST_SYNCED_TIME", 0L);
        this.c = new SharedPreferenceExtKt$long$$inlined$delegate$1(sharedPreferences, "LAST_UNIQUE_WORK_SCHEDULED_RUN_TIME", 0L);
        this.d = SharedPreferenceExtKt.a(sharedPreferences, "LIST_UPGRADE_PRODUCT_HINT", false);
        this.e = SharedPreferenceExtKt.a(sharedPreferences, "WATCHLIST_UPGRADE_PRODUCT_HINT", false);
        this.f = SharedPreferenceExtKt.a(sharedPreferences, "LIST_SORT_BY_CATEGORY_HINT_SHOWN", false);
        this.g = SharedPreferenceExtKt.a(sharedPreferences, "SNG_AUTO_CHECK_OFF_DIALOG_DISPLAY", false);
        this.h = SharedPreferenceExtKt.c(sharedPreferences, "", "SNG_DEFAULT_LIST_LOCAL_ID");
        this.i = SharedPreferenceExtKt.a(sharedPreferences, "LIST_VALUE_SWAPS_BANNER_HINT_CLOSED", false);
    }

    public final void a(CollectionMode mode, SortBy value) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(value, "value");
        String strA = a.A("SORT_BY_", mode.getModeName());
        SharedPreferences.Editor editorEdit = this.f12277a.edit();
        editorEdit.putString(strA, value.name());
        editorEdit.apply();
    }

    public final void b(CollectionMode mode, SortDirection sortDirection) {
        Intrinsics.h(mode, "mode");
        String strA = a.A("SORT_DIRECTION_", mode.getModeName());
        SharedPreferences.Editor editorEdit = this.f12277a.edit();
        editorEdit.putString(strA, sortDirection.name());
        editorEdit.apply();
    }
}
