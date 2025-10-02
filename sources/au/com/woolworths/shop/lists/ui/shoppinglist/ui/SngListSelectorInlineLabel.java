package au.com.woolworths.shop.lists.ui.shoppinglist.ui;

import au.com.woolworths.android.onesite.common.RoundedBackgroundSpan;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.base.shopapp.customviews.InlineLabel;
import au.com.woolworths.base.shopapp.customviews.InlineLabelType;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/ui/SngListSelectorInlineLabel;", "Lau/com/woolworths/base/shopapp/customviews/InlineLabel;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class SngListSelectorInlineLabel implements InlineLabel {
    public static final SngListSelectorInlineLabel d;
    public static final /* synthetic */ SngListSelectorInlineLabel[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        SngListSelectorInlineLabel sngListSelectorInlineLabel = new SngListSelectorInlineLabel() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.ui.SngListSelectorInlineLabel.CHANGE
            public final RoundedBackgroundSpan.SpanPlacement g = RoundedBackgroundSpan.SpanPlacement.e;
            public final PlainText h = new PlainText("");
            public final ResText i = new ResText(R.string.shop_lists_change_label);
            public final SngListSelectorInlineLabel$CHANGE$type$1 j = new SngListSelectorInlineLabel$CHANGE$type$1();

            @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
            public final Text getPlainText() {
                return this.h;
            }

            @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
            /* renamed from: getSpanPlacement, reason: from getter */
            public final RoundedBackgroundSpan.SpanPlacement getG() {
                return this.g;
            }

            @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
            public final Text getSpannedText() {
                return this.i;
            }

            @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
            public final InlineLabelType getType() {
                return this.j;
            }
        };
        d = sngListSelectorInlineLabel;
        SngListSelectorInlineLabel[] sngListSelectorInlineLabelArr = {sngListSelectorInlineLabel};
        e = sngListSelectorInlineLabelArr;
        f = EnumEntriesKt.a(sngListSelectorInlineLabelArr);
    }

    public static SngListSelectorInlineLabel valueOf(String str) {
        return (SngListSelectorInlineLabel) Enum.valueOf(SngListSelectorInlineLabel.class, str);
    }

    public static SngListSelectorInlineLabel[] values() {
        return (SngListSelectorInlineLabel[]) e.clone();
    }
}
