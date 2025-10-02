package au.com.woolworths.shop.cart.ui.productreview;

import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;
import au.com.woolworths.base.shopapp.modules.badge.BadgeApiData;
import au.com.woolworths.base.shopapp.modules.badge.BadgeApiDataKt;
import au.com.woolworths.base.shopapp.modules.badge.BadgeTypeApiData;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/cart/ui/productreview/BadgeApiDataExtKt$toBrandLabel$1", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabel;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BadgeApiDataExtKt$toBrandLabel$1 implements BrandLabel {
    public final PlainText d;
    public final BrandLabelType e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10508a;

        static {
            int[] iArr = new int[BadgeTypeApiData.values().length];
            try {
                iArr[BadgeTypeApiData.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f10508a = iArr;
        }
    }

    public BadgeApiDataExtKt$toBrandLabel$1(BadgeApiData badgeApiData) {
        this.d = badgeApiData.d;
        this.e = WhenMappings.f10508a[badgeApiData.getBadgeType().ordinal()] == 1 ? new UnavailableBrandLabelType() : BadgeApiDataKt.a(badgeApiData.getBadgeType());
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final Text getText() {
        return this.d;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    /* renamed from: getType, reason: from getter */
    public final BrandLabelType getE() {
        return this.e;
    }
}
