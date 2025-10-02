package au.com.woolworths.shop.aem.components.model.editorialbanner;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/editorialbanner/EditorialBannerData;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EditorialBannerData {

    /* renamed from: a, reason: collision with root package name */
    public final String f10155a;
    public final String b;
    public final ImageWithAltText c;
    public final EditorialBannerImageFormat d;
    public final EditorialBannerTextPosition e;
    public final String f;
    public final String g;
    public final EditorialBannerFooter h;
    public final ActionData i;
    public final AnalyticsData j;

    public EditorialBannerData(String str, String backgroundColour, ImageWithAltText imageWithAltText, EditorialBannerImageFormat imageFormat, EditorialBannerTextPosition editorialBannerTextPosition, String str2, String str3, EditorialBannerFooter editorialBannerFooter, ActionData actionData, AnalyticsData analyticsData) {
        Intrinsics.h(backgroundColour, "backgroundColour");
        Intrinsics.h(imageFormat, "imageFormat");
        this.f10155a = str;
        this.b = backgroundColour;
        this.c = imageWithAltText;
        this.d = imageFormat;
        this.e = editorialBannerTextPosition;
        this.f = str2;
        this.g = str3;
        this.h = editorialBannerFooter;
        this.i = actionData;
        this.j = analyticsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditorialBannerData)) {
            return false;
        }
        EditorialBannerData editorialBannerData = (EditorialBannerData) obj;
        return Intrinsics.c(this.f10155a, editorialBannerData.f10155a) && Intrinsics.c(this.b, editorialBannerData.b) && Intrinsics.c(this.c, editorialBannerData.c) && this.d == editorialBannerData.d && this.e == editorialBannerData.e && Intrinsics.c(this.f, editorialBannerData.f) && Intrinsics.c(this.g, editorialBannerData.g) && Intrinsics.c(this.h, editorialBannerData.h) && Intrinsics.c(this.i, editorialBannerData.i) && Intrinsics.c(this.j, editorialBannerData.j);
    }

    public final int hashCode() {
        int iC = b.c(this.f10155a.hashCode() * 31, 31, this.b);
        ImageWithAltText imageWithAltText = this.c;
        int iHashCode = (this.d.hashCode() + ((iC + (imageWithAltText == null ? 0 : imageWithAltText.hashCode())) * 31)) * 31;
        EditorialBannerTextPosition editorialBannerTextPosition = this.e;
        int iHashCode2 = (iHashCode + (editorialBannerTextPosition == null ? 0 : editorialBannerTextPosition.hashCode())) * 31;
        String str = this.f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        EditorialBannerFooter editorialBannerFooter = this.h;
        int iHashCode5 = (iHashCode4 + (editorialBannerFooter == null ? 0 : editorialBannerFooter.hashCode())) * 31;
        ActionData actionData = this.i;
        int iHashCode6 = (iHashCode5 + (actionData == null ? 0 : actionData.hashCode())) * 31;
        AnalyticsData analyticsData = this.j;
        return iHashCode6 + (analyticsData != null ? analyticsData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("EditorialBannerData(id=", this.f10155a, ", backgroundColour=", this.b, ", image=");
        sbV.append(this.c);
        sbV.append(", imageFormat=");
        sbV.append(this.d);
        sbV.append(", textPosition=");
        sbV.append(this.e);
        sbV.append(", title=");
        sbV.append(this.f);
        sbV.append(", subtitle=");
        sbV.append(this.g);
        sbV.append(", footer=");
        sbV.append(this.h);
        sbV.append(", action=");
        sbV.append(this.i);
        sbV.append(", analytics=");
        sbV.append(this.j);
        sbV.append(")");
        return sbV.toString();
    }
}
