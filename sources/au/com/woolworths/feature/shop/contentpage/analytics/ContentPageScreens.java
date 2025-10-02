package au.com.woolworths.feature.shop.contentpage.analytics;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/analytics/ContentPageScreens;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "Companion", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ContentPageScreens implements Screen {
    public static final ContentPageScreens d;
    public static final ContentPageScreens e;
    public static final /* synthetic */ ContentPageScreens[] f;
    public static final /* synthetic */ EnumEntries g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/analytics/ContentPageScreens$Companion;", "", "", "SAVED_RECIPES_ANALYTICS_TITLE", "Ljava/lang/String;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        ContentPageScreens contentPageScreens = new ContentPageScreens() { // from class: au.com.woolworths.feature.shop.contentpage.analytics.ContentPageScreens.CATEGORY_EVENT_HOMEPAGE
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Products";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "category_event_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Category and Event screen";
            }
        };
        d = contentPageScreens;
        ContentPageScreens contentPageScreens2 = new ContentPageScreens() { // from class: au.com.woolworths.feature.shop.contentpage.analytics.ContentPageScreens.SAVED_RECIPES_LOGIN
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Recipes";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "savedrecipeslogin_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Login";
            }
        };
        e = contentPageScreens2;
        ContentPageScreens[] contentPageScreensArr = {contentPageScreens, contentPageScreens2};
        f = contentPageScreensArr;
        g = EnumEntriesKt.a(contentPageScreensArr);
    }

    public static ContentPageScreens valueOf(String str) {
        return (ContentPageScreens) Enum.valueOf(ContentPageScreens.class, str);
    }

    public static ContentPageScreens[] values() {
        return (ContentPageScreens[]) f.clone();
    }
}
