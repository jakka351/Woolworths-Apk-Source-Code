package au.com.woolworths.product.models;

import androidx.annotation.DimenRes;
import androidx.annotation.StyleRes;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0017J\t\u0010\u0010\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lau/com/woolworths/product/models/ProductTaggedLabel;", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabel;", "tagLabel", "Lau/com/woolworths/product/models/TagLabel;", "<init>", "(Lau/com/woolworths/product/models/TagLabel;)V", TextBundle.TEXT_ENTRY, "Lau/com/woolworths/android/onesite/models/text/Text;", "getText", "()Lau/com/woolworths/android/onesite/models/text/Text;", "type", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabelType;", "getType", "()Lau/com/woolworths/android/onesite/modules/customviews/BrandLabelType;", "getTextAppearance", "", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductTaggedLabel implements BrandLabel {
    public static final int $stable = 8;

    @NotNull
    private final TagLabel tagLabel;

    @NotNull
    private final Text text;

    @NotNull
    private final BrandLabelType type;

    public ProductTaggedLabel(@NotNull TagLabel tagLabel) {
        Intrinsics.h(tagLabel, "tagLabel");
        this.tagLabel = tagLabel;
        this.text = new PlainText(tagLabel.getText());
        this.type = new ProductUnavailableBrandLabelType();
    }

    /* renamed from: component1, reason: from getter */
    private final TagLabel getTagLabel() {
        return this.tagLabel;
    }

    public static /* synthetic */ ProductTaggedLabel copy$default(ProductTaggedLabel productTaggedLabel, TagLabel tagLabel, int i, Object obj) {
        if ((i & 1) != 0) {
            tagLabel = productTaggedLabel.tagLabel;
        }
        return productTaggedLabel.copy(tagLabel);
    }

    @NotNull
    public final ProductTaggedLabel copy(@NotNull TagLabel tagLabel) {
        Intrinsics.h(tagLabel, "tagLabel");
        return new ProductTaggedLabel(tagLabel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProductTaggedLabel) && Intrinsics.c(this.tagLabel, ((ProductTaggedLabel) other).tagLabel);
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    @Nullable
    public Text getAccessibilityText() {
        return getText();
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    @DimenRes
    public /* bridge */ /* synthetic */ int getPaddingHorizontal() {
        return R.dimen.half_default_padding;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    @DimenRes
    public /* bridge */ /* synthetic */ int getPaddingVertical() {
        return R.dimen.eighth_default_padding;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    @NotNull
    public Text getText() {
        return this.text;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    @StyleRes
    public int getTextAppearance() {
        return R.style.TextAppearance_Overline_Fresh_Medium;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    @NotNull
    public BrandLabelType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.tagLabel.hashCode();
    }

    @NotNull
    public String toString() {
        return "ProductTaggedLabel(tagLabel=" + this.tagLabel + ")";
    }
}
