package au.com.woolworths.product.details.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.InlineErrorCause;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ui/BannerInfoState;", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBanner;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BannerInfoState implements InsetBanner {
    public final PlainText d;
    public final InlineErrorType e;
    public final InlineErrorCause.IconConfig f;

    public BannerInfoState(PlainText plainText, InlineErrorType inlineErrorType, InlineErrorCause.IconConfig iconConfig) {
        this.d = plainText;
        this.e = inlineErrorType;
        this.f = iconConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerInfoState)) {
            return false;
        }
        BannerInfoState bannerInfoState = (BannerInfoState) obj;
        return this.d.equals(bannerInfoState.d) && this.e == bannerInfoState.e && this.f.equals(bannerInfoState.f);
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    /* renamed from: getErrorType, reason: from getter */
    public final InlineErrorType getE() {
        return this.e;
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    /* renamed from: getIconConfig, reason: from getter */
    public final InlineErrorCause.IconConfig getF() {
        return this.f;
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    public final Text getMessageText() {
        return this.d;
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    public final boolean getShowAction() {
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BannerInfoState(messageText=" + this.d + ", errorType=" + this.e + ", iconConfig=" + this.f + ", showAction=false)";
    }
}
