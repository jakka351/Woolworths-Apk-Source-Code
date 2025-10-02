package au.com.woolworths.shop.aem.components.model.contentcard;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.shop.aem.components.model.GenericPageFeedItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/contentcard/FullWidthImageCardData;", "Lau/com/woolworths/shop/aem/components/model/GenericPageFeedItem;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FullWidthImageCardData implements GenericPageFeedItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f10150a;
    public final String b;
    public final String c;
    public final String d;

    public FullWidthImageCardData(String str, String str2, String str3, String str4) {
        this.f10150a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FullWidthImageCardData)) {
            return false;
        }
        FullWidthImageCardData fullWidthImageCardData = (FullWidthImageCardData) obj;
        return Intrinsics.c(this.f10150a, fullWidthImageCardData.f10150a) && Intrinsics.c(this.b, fullWidthImageCardData.b) && Intrinsics.c(this.c, fullWidthImageCardData.c) && Intrinsics.c(this.d, fullWidthImageCardData.d);
    }

    public final int hashCode() {
        String str = this.f10150a;
        int iC = b.c(b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        String str2 = this.d;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return a.l(YU.a.v("FullWidthImageCardData(id=", this.f10150a, ", imageUrl=", this.b, ", imageAltText="), this.c, ", title=", this.d, ")");
    }
}
