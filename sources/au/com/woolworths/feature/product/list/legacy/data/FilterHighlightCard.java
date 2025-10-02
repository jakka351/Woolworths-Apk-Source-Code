package au.com.woolworths.feature.product.list.legacy.data;

import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.base.shopapp.customviews.BrandedInlineLabel;
import au.com.woolworths.base.shopapp.customviews.InlineLabel;
import au.com.woolworths.base.shopapp.customviews.InlineLabelType;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/FilterHighlightCard;", "Lau/com/woolworths/base/shopapp/customviews/InlineLabel;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class FilterHighlightCard implements InlineLabel {
    public static final FilterHighlightCard d;
    public static final /* synthetic */ FilterHighlightCard[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        FilterHighlightCard filterHighlightCard = new FilterHighlightCard() { // from class: au.com.woolworths.feature.product.list.legacy.data.FilterHighlightCard.TITLE
            public final ResText g = new ResText(R.string.filter_highlight_card_title);
            public final ResText h = new ResText(R.string.new_label);
            public final BrandedInlineLabel i = BrandedInlineLabel.d;

            @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
            public final Text getPlainText() {
                return this.g;
            }

            @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
            public final Text getSpannedText() {
                return this.h;
            }

            @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
            public final InlineLabelType getType() {
                return this.i;
            }
        };
        d = filterHighlightCard;
        FilterHighlightCard[] filterHighlightCardArr = {filterHighlightCard};
        e = filterHighlightCardArr;
        f = EnumEntriesKt.a(filterHighlightCardArr);
    }

    public static FilterHighlightCard valueOf(String str) {
        return (FilterHighlightCard) Enum.valueOf(FilterHighlightCard.class, str);
    }

    public static FilterHighlightCard[] values() {
        return (FilterHighlightCard[]) e.clone();
    }
}
