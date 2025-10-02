package au.com.woolworths.feature.shop.contentpage.data.infotile;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.aem.components.model.GenericPageFeedItem;
import au.com.woolworths.shop.aem.components.model.verticallist.VerticalListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/data/infotile/InfoTileData;", "Lau/com/woolworths/shop/aem/components/model/GenericPageFeedItem;", "Lau/com/woolworths/shop/aem/components/model/verticallist/VerticalListItem;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InfoTileData implements GenericPageFeedItem, VerticalListItem {

    /* renamed from: a, reason: collision with root package name */
    public final InfoTileIconSlot f7026a;
    public final String b;
    public final String c;
    public final InfoTileCta d;
    public final InfoTileStyle e;

    public InfoTileData(InfoTileIconSlot infoTileIconSlot, String str, String str2, InfoTileCta infoTileCta, InfoTileStyle infoTileStyle) {
        this.f7026a = infoTileIconSlot;
        this.b = str;
        this.c = str2;
        this.d = infoTileCta;
        this.e = infoTileStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoTileData)) {
            return false;
        }
        InfoTileData infoTileData = (InfoTileData) obj;
        return Intrinsics.c(this.f7026a, infoTileData.f7026a) && Intrinsics.c(this.b, infoTileData.b) && Intrinsics.c(this.c, infoTileData.c) && Intrinsics.c(this.d, infoTileData.d) && this.e == infoTileData.e;
    }

    public final int hashCode() {
        InfoTileIconSlot infoTileIconSlot = this.f7026a;
        int iC = b.c((infoTileIconSlot == null ? 0 : infoTileIconSlot.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        InfoTileCta infoTileCta = this.d;
        return this.e.hashCode() + ((iHashCode + (infoTileCta != null ? infoTileCta.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "InfoTileData(iconSlotSpec=" + this.f7026a + ", title=" + this.b + ", bodyMarkdown=" + this.c + ", cta=" + this.d + ", style=" + this.e + ")";
    }
}
