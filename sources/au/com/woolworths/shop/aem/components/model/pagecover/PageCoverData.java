package au.com.woolworths.shop.aem.components.model.pagecover;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.corecolor.CoreColorThemeData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/pagecover/PageCoverData;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PageCoverData {

    /* renamed from: a, reason: collision with root package name */
    public final String f10177a;
    public final String b;
    public final ImageWithAltText c;
    public final Object d;
    public final CoreColorThemeData e;
    public final PageCoverContentFormat f;
    public final PageCoverContentAlignment g;
    public final PageCoverImagePosition h;
    public final PageCoverTitleTextSize i;

    public PageCoverData(String str, String str2, ImageWithAltText imageWithAltText, List list, CoreColorThemeData coreColorThemeData, PageCoverContentFormat pageCoverContentFormat, PageCoverContentAlignment pageCoverContentAlignment, PageCoverImagePosition pageCoverImagePosition, PageCoverTitleTextSize pageCoverTitleTextSize) {
        this.f10177a = str;
        this.b = str2;
        this.c = imageWithAltText;
        this.d = list;
        this.e = coreColorThemeData;
        this.f = pageCoverContentFormat;
        this.g = pageCoverContentAlignment;
        this.h = pageCoverImagePosition;
        this.i = pageCoverTitleTextSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageCoverData)) {
            return false;
        }
        PageCoverData pageCoverData = (PageCoverData) obj;
        return Intrinsics.c(this.f10177a, pageCoverData.f10177a) && Intrinsics.c(this.b, pageCoverData.b) && Intrinsics.c(this.c, pageCoverData.c) && this.d.equals(pageCoverData.d) && this.e.equals(pageCoverData.e) && this.f == pageCoverData.f && this.g == pageCoverData.g && this.h == pageCoverData.h && this.i == pageCoverData.i;
    }

    public final int hashCode() {
        String str = this.f10177a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ImageWithAltText imageWithAltText = this.c;
        int iHashCode3 = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + a.e((iHashCode2 + (imageWithAltText == null ? 0 : imageWithAltText.hashCode())) * 31, 31, this.d)) * 31)) * 31)) * 31;
        PageCoverImagePosition pageCoverImagePosition = this.h;
        int iHashCode4 = (iHashCode3 + (pageCoverImagePosition == null ? 0 : pageCoverImagePosition.hashCode())) * 31;
        PageCoverTitleTextSize pageCoverTitleTextSize = this.i;
        return iHashCode4 + (pageCoverTitleTextSize != null ? pageCoverTitleTextSize.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("PageCoverData(pageCoverTitle=", this.f10177a, ", pageCoverSubTitle=", this.b, ", pageCoverPrimaryImage=");
        sbV.append(this.c);
        sbV.append(", pageCoverLogos=");
        sbV.append(this.d);
        sbV.append(", pageCoverContentTheme=");
        sbV.append(this.e);
        sbV.append(", pageCoverContentFormat=");
        sbV.append(this.f);
        sbV.append(", pageCoverContentAlignment=");
        sbV.append(this.g);
        sbV.append(", pageCoverPrimaryImagePosition=");
        sbV.append(this.h);
        sbV.append(", pageCoverTitleSize=");
        sbV.append(this.i);
        sbV.append(")");
        return sbV.toString();
    }
}
