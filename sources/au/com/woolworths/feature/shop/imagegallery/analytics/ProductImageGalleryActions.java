package au.com.woolworths.feature.shop.imagegallery.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/imagegallery/analytics/ProductImageGalleryActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "image-gallery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ProductImageGalleryActions implements Action {
    public static final ProductImageGalleryActions e;
    public static final ProductImageGalleryActions f;
    public static final /* synthetic */ ProductImageGalleryActions[] g;
    public static final /* synthetic */ EnumEntries h;
    public final Screens d = Screens.t;

    static {
        ProductImageGalleryActions productImageGalleryActions = new ProductImageGalleryActions() { // from class: au.com.woolworths.feature.shop.imagegallery.analytics.ProductImageGalleryActions.CLOSE_IMAGE_GALLERY
            public final Category i = Category.m;
            public final String j = "Close Image Gallery";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getI() {
                return this.i;
            }
        };
        e = productImageGalleryActions;
        ProductImageGalleryActions productImageGalleryActions2 = new ProductImageGalleryActions() { // from class: au.com.woolworths.feature.shop.imagegallery.analytics.ProductImageGalleryActions.SWIPE_IMAGE_CAROUSEL
            public final Category i = Category.l;
            public final String j = "Swipe Image Carousel";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getI() {
                return this.i;
            }
        };
        f = productImageGalleryActions2;
        ProductImageGalleryActions[] productImageGalleryActionsArr = {productImageGalleryActions, productImageGalleryActions2};
        g = productImageGalleryActionsArr;
        h = EnumEntriesKt.a(productImageGalleryActionsArr);
    }

    public ProductImageGalleryActions(String str, int i) {
    }

    public static ProductImageGalleryActions valueOf(String str) {
        return (ProductImageGalleryActions) Enum.valueOf(ProductImageGalleryActions.class, str);
    }

    public static ProductImageGalleryActions[] values() {
        return (ProductImageGalleryActions[]) g.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
