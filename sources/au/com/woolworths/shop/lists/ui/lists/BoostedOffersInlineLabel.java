package au.com.woolworths.shop.lists.ui.lists;

import au.com.woolworths.android.onesite.models.text.PlainText;
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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/BoostedOffersInlineLabel;", "Lau/com/woolworths/base/shopapp/customviews/InlineLabel;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BoostedOffersInlineLabel implements InlineLabel {
    public static final /* synthetic */ BoostedOffersInlineLabel[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        BoostedOffersInlineLabel[] boostedOffersInlineLabelArr = {new BoostedOffersInlineLabel() { // from class: au.com.woolworths.shop.lists.ui.lists.BoostedOffersInlineLabel.NEW
            public final PlainText f = new PlainText("");
            public final ResText g = new ResText(R.string.new_label);
            public final BrandedInlineLabel h = BrandedInlineLabel.d;

            @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
            /* renamed from: getPlainText */
            public final Text getD() {
                return this.f;
            }

            @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
            /* renamed from: getSpannedText */
            public final Text getG() {
                return this.g;
            }

            @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
            public final InlineLabelType getType() {
                return this.h;
            }
        }};
        d = boostedOffersInlineLabelArr;
        e = EnumEntriesKt.a(boostedOffersInlineLabelArr);
    }

    public static BoostedOffersInlineLabel valueOf(String str) {
        return (BoostedOffersInlineLabel) Enum.valueOf(BoostedOffersInlineLabel.class, str);
    }

    public static BoostedOffersInlineLabel[] values() {
        return (BoostedOffersInlineLabel[]) d.clone();
    }
}
