package au.com.woolworths.feature.shop.recipes.freshmag;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/FreshMagScreen;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class FreshMagScreen implements Screen {
    public static final FreshMagScreen d;
    public static final FreshMagScreen e;
    public static final /* synthetic */ FreshMagScreen[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        FreshMagScreen freshMagScreen = new FreshMagScreen() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.FreshMagScreen.FRESHMAG_CONTENT
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Recipes";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "freshideasmagazinecontent_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Fresh Ideas Magazine Content screen";
            }
        };
        d = freshMagScreen;
        FreshMagScreen freshMagScreen2 = new FreshMagScreen() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.FreshMagScreen.FRESHMAG_HOME
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Recipes";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "freshideasmagazinehome_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Fresh Ideas Magazine Home screen";
            }
        };
        e = freshMagScreen2;
        FreshMagScreen[] freshMagScreenArr = {freshMagScreen, freshMagScreen2};
        f = freshMagScreenArr;
        g = EnumEntriesKt.a(freshMagScreenArr);
    }

    public static FreshMagScreen valueOf(String str) {
        return (FreshMagScreen) Enum.valueOf(FreshMagScreen.class, str);
    }

    public static FreshMagScreen[] values() {
        return (FreshMagScreen[]) f.clone();
    }
}
