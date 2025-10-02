package au.com.woolworths.feature.shop.marketplace.data.models;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/data/models/InfoHeader;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InfoHeader {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7467a;
    public final String b;
    public final InfoSection c;

    public InfoHeader(ArrayList arrayList, String str, InfoSection infoSection) {
        this.f7467a = arrayList;
        this.b = str;
        this.c = infoSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoHeader)) {
            return false;
        }
        InfoHeader infoHeader = (InfoHeader) obj;
        return this.f7467a.equals(infoHeader.f7467a) && Intrinsics.c(this.b, infoHeader.b) && Intrinsics.c(this.c, infoHeader.c);
    }

    public final int hashCode() {
        int iHashCode = this.f7467a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        InfoSection infoSection = this.c;
        return iHashCode2 + (infoSection != null ? infoSection.hashCode() : 0);
    }

    public final String toString() {
        return "InfoHeader(tabs=" + this.f7467a + ", buttonTitle=" + this.b + ", infoSection=" + this.c + ")";
    }
}
