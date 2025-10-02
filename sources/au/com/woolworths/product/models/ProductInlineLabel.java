package au.com.woolworths.product.models;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.common.RoundedBackgroundSpan;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.base.shopapp.customviews.BrandedInlineLabel;
import au.com.woolworths.base.shopapp.customviews.InlineLabel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001a"}, d2 = {"Lau/com/woolworths/product/models/ProductInlineLabel;", "Lau/com/woolworths/base/shopapp/customviews/InlineLabel;", "type", "Lau/com/woolworths/base/shopapp/customviews/BrandedInlineLabel;", "plainText", "Lau/com/woolworths/android/onesite/models/text/Text;", "spannedText", "<init>", "(Lau/com/woolworths/base/shopapp/customviews/BrandedInlineLabel;Lau/com/woolworths/android/onesite/models/text/Text;Lau/com/woolworths/android/onesite/models/text/Text;)V", "getType", "()Lau/com/woolworths/base/shopapp/customviews/BrandedInlineLabel;", "getPlainText", "()Lau/com/woolworths/android/onesite/models/text/Text;", "getSpannedText", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductInlineLabel implements InlineLabel {
    public static final int $stable = 8;

    @Nullable
    private final Text plainText;

    @Nullable
    private final Text spannedText;

    @NotNull
    private final BrandedInlineLabel type;

    public ProductInlineLabel(@NotNull BrandedInlineLabel type, @Nullable Text text, @Nullable Text text2) {
        Intrinsics.h(type, "type");
        this.type = type;
        this.plainText = text;
        this.spannedText = text2;
    }

    public static /* synthetic */ ProductInlineLabel copy$default(ProductInlineLabel productInlineLabel, BrandedInlineLabel brandedInlineLabel, Text text, Text text2, int i, Object obj) {
        if ((i & 1) != 0) {
            brandedInlineLabel = productInlineLabel.type;
        }
        if ((i & 2) != 0) {
            text = productInlineLabel.plainText;
        }
        if ((i & 4) != 0) {
            text2 = productInlineLabel.spannedText;
        }
        return productInlineLabel.copy(brandedInlineLabel, text, text2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BrandedInlineLabel getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Text getPlainText() {
        return this.plainText;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Text getSpannedText() {
        return this.spannedText;
    }

    @NotNull
    public final ProductInlineLabel copy(@NotNull BrandedInlineLabel type, @Nullable Text plainText, @Nullable Text spannedText) {
        Intrinsics.h(type, "type");
        return new ProductInlineLabel(type, plainText, spannedText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductInlineLabel)) {
            return false;
        }
        ProductInlineLabel productInlineLabel = (ProductInlineLabel) other;
        return this.type == productInlineLabel.type && Intrinsics.c(this.plainText, productInlineLabel.plainText) && Intrinsics.c(this.spannedText, productInlineLabel.spannedText);
    }

    @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
    @Nullable
    public Text getPlainText() {
        return this.plainText;
    }

    @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
    @NotNull
    public RoundedBackgroundSpan.SpanPlacement getSpanPlacement() {
        return RoundedBackgroundSpan.SpanPlacement.d;
    }

    @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
    @Nullable
    public Text getSpannedText() {
        return this.spannedText;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Text text = this.plainText;
        int iHashCode2 = (iHashCode + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.spannedText;
        return iHashCode2 + (text2 != null ? text2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProductInlineLabel(type=" + this.type + ", plainText=" + this.plainText + ", spannedText=" + this.spannedText + ")";
    }

    @Override // au.com.woolworths.base.shopapp.customviews.InlineLabel
    @NotNull
    public BrandedInlineLabel getType() {
        return this.type;
    }
}
