package au.com.woolworths.shop.aem.components.model.paragraph;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.aem.components.model.GenericPageFeedItem;
import au.com.woolworths.shop.aem.components.model.bottomsheet.StaticBottomSheetFeedItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/paragraph/ParagraphTextItemData;", "Lau/com/woolworths/shop/aem/components/model/bottomsheet/StaticBottomSheetFeedItem;", "Lau/com/woolworths/shop/aem/components/model/GenericPageFeedItem;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ParagraphTextItemData implements StaticBottomSheetFeedItem, GenericPageFeedItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f10178a;
    public final String b;
    public final ParagraphTextItemType c;

    public ParagraphTextItemData(String str, String content, ParagraphTextItemType paragraphTextItemType) {
        Intrinsics.h(content, "content");
        this.f10178a = str;
        this.b = content;
        this.c = paragraphTextItemType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphTextItemData)) {
            return false;
        }
        ParagraphTextItemData paragraphTextItemData = (ParagraphTextItemData) obj;
        return Intrinsics.c(this.f10178a, paragraphTextItemData.f10178a) && Intrinsics.c(this.b, paragraphTextItemData.b) && this.c == paragraphTextItemData.c;
    }

    public final int hashCode() {
        String str = this.f10178a;
        return this.c.hashCode() + b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ParagraphTextItemData(id=", this.f10178a, ", content=", this.b, ", type=");
        sbV.append(this.c);
        sbV.append(")");
        return sbV.toString();
    }
}
