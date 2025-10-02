package au.com.woolworths.feature.shop.more.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.common.RoundedBackgroundSpan;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.base.shopapp.customviews.BrandedInlineLabel;
import au.com.woolworths.base.shopapp.customviews.InlineLabel;
import au.com.woolworths.base.shopapp.customviews.InlineLabelType;
import au.com.woolworths.feature.shop.more.analytics.MoreActions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/data/MoreTileItem;", "Lau/com/woolworths/base/shopapp/customviews/InlineLabel;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MoreTileItem implements InlineLabel {
    public final Text d;
    public final Text e;
    public final Text f;
    public final Text g;
    public final BrandedInlineLabel h;
    public final RoundedBackgroundSpan.SpanPlacement i;
    public final MoreTileType j;
    public final MoreActions k;
    public final Integer l;

    public MoreTileItem(Text text, Text text2, ResWithArgText resWithArgText, ResText resText, MoreTileType tileType, MoreActions moreActions, Integer num, int i) {
        BrandedInlineLabel brandedInlineLabel = BrandedInlineLabel.d;
        RoundedBackgroundSpan.SpanPlacement spanPlacement = RoundedBackgroundSpan.SpanPlacement.e;
        text2 = (i & 2) != 0 ? null : text2;
        resWithArgText = (i & 4) != 0 ? null : resWithArgText;
        resText = (i & 8) != 0 ? null : resText;
        brandedInlineLabel = (i & 16) != 0 ? BrandedInlineLabel.e : brandedInlineLabel;
        spanPlacement = (i & 32) != 0 ? RoundedBackgroundSpan.SpanPlacement.d : spanPlacement;
        moreActions = (i & 128) != 0 ? null : moreActions;
        num = (i & 256) != 0 ? null : num;
        Intrinsics.h(tileType, "tileType");
        this.d = text;
        this.e = text2;
        this.f = resWithArgText;
        this.g = resText;
        this.h = brandedInlineLabel;
        this.i = spanPlacement;
        this.j = tileType;
        this.k = moreActions;
        this.l = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoreTileItem)) {
            return false;
        }
        MoreTileItem moreTileItem = (MoreTileItem) obj;
        return Intrinsics.c(this.d, moreTileItem.d) && Intrinsics.c(this.e, moreTileItem.e) && Intrinsics.c(this.f, moreTileItem.f) && Intrinsics.c(this.g, moreTileItem.g) && this.h == moreTileItem.h && this.i == moreTileItem.i && this.j == moreTileItem.j && this.k == moreTileItem.k && Intrinsics.c(this.l, moreTileItem.l);
    }

    @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
    /* renamed from: getPlainText, reason: from getter */
    public final Text getD() {
        return this.d;
    }

    @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
    /* renamed from: getSpanPlacement, reason: from getter */
    public final RoundedBackgroundSpan.SpanPlacement getI() {
        return this.i;
    }

    @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
    /* renamed from: getSpannedText, reason: from getter */
    public final Text getG() {
        return this.g;
    }

    @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
    public final InlineLabelType getType() {
        return this.h;
    }

    public final int hashCode() {
        Text text = this.d;
        int iHashCode = (text == null ? 0 : text.hashCode()) * 31;
        Text text2 = this.e;
        int iHashCode2 = (iHashCode + (text2 == null ? 0 : text2.hashCode())) * 31;
        Text text3 = this.f;
        int iHashCode3 = (iHashCode2 + (text3 == null ? 0 : text3.hashCode())) * 31;
        Text text4 = this.g;
        int iHashCode4 = (this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((iHashCode3 + (text4 == null ? 0 : text4.hashCode())) * 31)) * 31)) * 31)) * 31;
        MoreActions moreActions = this.k;
        int iHashCode5 = (iHashCode4 + (moreActions == null ? 0 : moreActions.hashCode())) * 31;
        Integer num = this.l;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoreTileItem(plainText=");
        sb.append(this.d);
        sb.append(", caption=");
        sb.append(this.e);
        sb.append(", contentDescription=");
        sb.append(this.f);
        sb.append(", spannedText=");
        sb.append(this.g);
        sb.append(", type=");
        sb.append(this.h);
        sb.append(", spanPlacement=");
        sb.append(this.i);
        sb.append(", tileType=");
        sb.append(this.j);
        sb.append(", analyticsAction=");
        sb.append(this.k);
        sb.append(", iconRes=");
        return a.p(sb, this.l, ")");
    }
}
