package au.com.woolworths.feature.shop.recipes.freshmag.home.domain;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/home/domain/PageVersion;", "Lau/com/woolworths/feature/shop/recipes/freshmag/home/domain/BasePageVersion;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PageVersion implements BasePageVersion {
    public static final PageVersion d;
    public static final PageVersion e;
    public static final PageVersion f;
    public static final PageVersion g;
    public static final /* synthetic */ PageVersion[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        PageVersion pageVersion = new PageVersion() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.domain.PageVersion.HAS_RECIPE_USER_INTERACTION_ENABLED
            @Override // au.com.woolworths.feature.shop.recipes.freshmag.home.domain.BasePageVersion
            public final String getValue() {
                return "HasRecipe|UserInteractionEnabled";
            }
        };
        d = pageVersion;
        PageVersion pageVersion2 = new PageVersion() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.domain.PageVersion.HAS_RECIPE_USER_INTERACTION_DISABLED
            @Override // au.com.woolworths.feature.shop.recipes.freshmag.home.domain.BasePageVersion
            public final String getValue() {
                return "HasRecipe|UserInteractionDisabled";
            }
        };
        e = pageVersion2;
        PageVersion pageVersion3 = new PageVersion() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.domain.PageVersion.NO_RECIPE_USER_INTERACTION_ENABLED
            @Override // au.com.woolworths.feature.shop.recipes.freshmag.home.domain.BasePageVersion
            public final String getValue() {
                return "NoRecipe|UserInteractionEnabled";
            }
        };
        f = pageVersion3;
        PageVersion pageVersion4 = new PageVersion() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.domain.PageVersion.NO_RECIPE_USER_INTERACTION_DISABLED
            @Override // au.com.woolworths.feature.shop.recipes.freshmag.home.domain.BasePageVersion
            public final String getValue() {
                return "NoRecipe|UserInteractionDisabled";
            }
        };
        g = pageVersion4;
        PageVersion[] pageVersionArr = {pageVersion, pageVersion2, pageVersion3, pageVersion4};
        h = pageVersionArr;
        i = EnumEntriesKt.a(pageVersionArr);
    }

    public static PageVersion valueOf(String str) {
        return (PageVersion) Enum.valueOf(PageVersion.class, str);
    }

    public static PageVersion[] values() {
        return (PageVersion[]) h.clone();
    }
}
