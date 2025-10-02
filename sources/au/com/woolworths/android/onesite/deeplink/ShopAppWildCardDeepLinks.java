package au.com.woolworths.android.onesite.deeplink;

import com.medallia.digital.mobilesdk.q2;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/deeplink/ShopAppWildCardDeepLinks;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShopAppWildCardDeepLinks {
    public static final /* synthetic */ ShopAppWildCardDeepLinks[] f;
    public static final /* synthetic */ EnumEntries g;
    public final String d;
    public final String e;

    static {
        ShopAppWildCardDeepLinks[] shopAppWildCardDeepLinksArr = {new ShopAppWildCardDeepLinks("RECIPE_COLLECTIONS_APP_LINK_PATH", 0, "/shop/recipes/collections/", ","), new ShopAppWildCardDeepLinks("ARTICLES_PAGE_APP_LINK_PATH", 1, "/shop/articles/", q2.c), new ShopAppWildCardDeepLinks("IDEAS_PAGE_APP_LINK_PATH", 2, "/shop/ideas/", q2.c), new ShopAppWildCardDeepLinks("BRANDED_SHOP_APP_LINK_PATH", 3, "/shop/brands/", q2.c), new ShopAppWildCardDeepLinks("GUIDES_PAGE_SHOP_APP_LINK_PATH", 4, "/shop/guides/", q2.c), new ShopAppWildCardDeepLinks("VIDEOS_PAGE_SHOP_APP_LINK_PATH", 5, "/shop/videos/", q2.c), new ShopAppWildCardDeepLinks("SERVICES_PAGE_SHOP_APP_LINK_PATH", 6, "/shop/services/", q2.c), new ShopAppWildCardDeepLinks("HELP_PAGE_SHOP_APP_LINK_PATH", 7, "/shop/help/", q2.c), new ShopAppWildCardDeepLinks("ABOUT_PAGE_SHOP_APP_LINK_PATH", 8, "/shop/about/", q2.c), new ShopAppWildCardDeepLinks("EVERYDAY_PAGE_SHOP_APP_LINK_PATH", 9, "/shop/everyday/", q2.c), new ShopAppWildCardDeepLinks("EVENTS_PAGE_SHOP_APP_LINK_PATH", 10, "/shop/events/", q2.c), new ShopAppWildCardDeepLinks("CONTENT_PLAYBOOK_SHOP_APP_LINK_PATH", 11, "/shop/content-playbook/", q2.c)};
        f = shopAppWildCardDeepLinksArr;
        g = EnumEntriesKt.a(shopAppWildCardDeepLinksArr);
    }

    public ShopAppWildCardDeepLinks(String str, int i, String str2, String str3) {
        this.d = str2;
        this.e = str3;
    }

    public static ShopAppWildCardDeepLinks valueOf(String str) {
        return (ShopAppWildCardDeepLinks) Enum.valueOf(ShopAppWildCardDeepLinks.class, str);
    }

    public static ShopAppWildCardDeepLinks[] values() {
        return (ShopAppWildCardDeepLinks[]) f.clone();
    }
}
