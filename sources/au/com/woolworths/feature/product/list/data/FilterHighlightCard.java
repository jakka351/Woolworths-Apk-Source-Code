package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.common.RoundedBackgroundSpan;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.base.shopapp.customviews.BrandedInlineLabel;
import au.com.woolworths.base.shopapp.customviews.InlineLabel;
import au.com.woolworths.base.shopapp.customviews.InlineLabelType;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/product/list/data/FilterHighlightCard;", "Lau/com/woolworths/base/shopapp/customviews/InlineLabel;", "", "<init>", "(Ljava/lang/String;I)V", "TITLE", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class FilterHighlightCard implements InlineLabel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FilterHighlightCard[] $VALUES;
    public static final FilterHighlightCard TITLE = new FilterHighlightCard("TITLE", 0) { // from class: au.com.woolworths.feature.product.list.data.FilterHighlightCard.TITLE

        @NotNull
        private final ResText plainText = new ResText(R.string.filter_highlight_card_title);

        @NotNull
        private final ResText spannedText = new ResText(R.string.new_label);

        @NotNull
        private final BrandedInlineLabel type = BrandedInlineLabel.d;

        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // au.com.woolworths.feature.product.list.data.FilterHighlightCard, au.com.woolworths.base.shopapp.customviews.InlineLabel
        @NotNull
        /* renamed from: getSpanPlacement */
        public RoundedBackgroundSpan.SpanPlacement getI() {
            return RoundedBackgroundSpan.SpanPlacement.d;
        }

        @Override // au.com.woolworths.feature.product.list.data.FilterHighlightCard, au.com.woolworths.base.shopapp.customviews.InlineLabel
        @NotNull
        public ResText getPlainText() {
            return this.plainText;
        }

        @Override // au.com.woolworths.feature.product.list.data.FilterHighlightCard, au.com.woolworths.base.shopapp.customviews.InlineLabel
        @NotNull
        public ResText getSpannedText() {
            return this.spannedText;
        }

        @Override // au.com.woolworths.feature.product.list.data.FilterHighlightCard, au.com.woolworths.base.shopapp.customviews.InlineLabel
        @NotNull
        public BrandedInlineLabel getType() {
            return this.type;
        }
    };

    private static final /* synthetic */ FilterHighlightCard[] $values() {
        return new FilterHighlightCard[]{TITLE};
    }

    static {
        FilterHighlightCard[] filterHighlightCardArr$values = $values();
        $VALUES = filterHighlightCardArr$values;
        $ENTRIES = EnumEntriesKt.a(filterHighlightCardArr$values);
    }

    public /* synthetic */ FilterHighlightCard(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    @NotNull
    public static EnumEntries<FilterHighlightCard> getEntries() {
        return $ENTRIES;
    }

    public static FilterHighlightCard valueOf(String str) {
        return (FilterHighlightCard) Enum.valueOf(FilterHighlightCard.class, str);
    }

    public static FilterHighlightCard[] values() {
        return (FilterHighlightCard[]) $VALUES.clone();
    }

    @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
    @Nullable
    public abstract /* synthetic */ Text getPlainText();

    @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
    @NotNull
    /* renamed from: getSpanPlacement */
    public RoundedBackgroundSpan.SpanPlacement getI() {
        return RoundedBackgroundSpan.SpanPlacement.d;
    }

    @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
    @Nullable
    public abstract /* synthetic */ Text getSpannedText();

    @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
    @NotNull
    public abstract /* synthetic */ InlineLabelType getType();

    private FilterHighlightCard(String str, int i) {
    }
}
