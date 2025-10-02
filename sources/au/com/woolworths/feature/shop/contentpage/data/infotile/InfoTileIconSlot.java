package au.com.woolworths.feature.shop.contentpage.data.infotile;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/data/infotile/InfoTileIconSlot;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InfoTileIconSlot {

    /* renamed from: a, reason: collision with root package name */
    public final InfoTileIcon f7029a;
    public final InfoTileIconSlotSize b;

    public InfoTileIconSlot(InfoTileIcon infoTileIcon, InfoTileIconSlotSize infoTileIconSlotSize) {
        this.f7029a = infoTileIcon;
        this.b = infoTileIconSlotSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoTileIconSlot)) {
            return false;
        }
        InfoTileIconSlot infoTileIconSlot = (InfoTileIconSlot) obj;
        return Intrinsics.c(this.f7029a, infoTileIconSlot.f7029a) && this.b == infoTileIconSlot.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7029a.hashCode() * 31);
    }

    public final String toString() {
        return "InfoTileIconSlot(icon=" + this.f7029a + ", size=" + this.b + ")";
    }
}
