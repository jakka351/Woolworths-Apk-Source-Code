package au.com.woolworths.dynamic.page.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/dynamic/page/data/ContentListItemData;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContentListItemData {

    /* renamed from: a, reason: collision with root package name */
    public final String f5182a;
    public final String b;
    public final String c;
    public final String d;
    public final DynamicPageActionData e;

    public /* synthetic */ ContentListItemData(String str, String str2, String str3, DynamicPageActionData dynamicPageActionData, int i) {
        this(str, str2, (String) null, str3, (i & 16) != 0 ? null : dynamicPageActionData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentListItemData)) {
            return false;
        }
        ContentListItemData contentListItemData = (ContentListItemData) obj;
        return Intrinsics.c(this.f5182a, contentListItemData.f5182a) && Intrinsics.c(this.b, contentListItemData.b) && Intrinsics.c(this.c, contentListItemData.c) && Intrinsics.c(this.d, contentListItemData.d) && Intrinsics.c(this.e, contentListItemData.e);
    }

    public final int hashCode() {
        int iC = b.c(this.f5182a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DynamicPageActionData dynamicPageActionData = this.e;
        return iHashCode2 + (dynamicPageActionData != null ? dynamicPageActionData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ContentListItemData(title=", this.f5182a, ", imageUrl=", this.b, ", imageAltText=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", subtitle=", this.d, ", cta=");
        sbV.append(this.e);
        sbV.append(")");
        return sbV.toString();
    }

    public ContentListItemData(String str, String str2, String str3, String str4, DynamicPageActionData dynamicPageActionData) {
        this.f5182a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = dynamicPageActionData;
    }
}
