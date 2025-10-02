package au.com.woolworths.product.models;

import androidx.annotation.DimenRes;
import androidx.annotation.StyleRes;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/product/models/ProductUnavailableLabel;", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabel;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ProductUnavailableLabel implements BrandLabel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProductUnavailableLabel[] $VALUES;
    public static final ProductUnavailableLabel DEFAULT = new ProductUnavailableLabel("DEFAULT", 0) { // from class: au.com.woolworths.product.models.ProductUnavailableLabel.DEFAULT

        @NotNull
        private Text text = new ResText(R.string.unavailable);

        @NotNull
        private final BrandLabelType type = new ProductUnavailableBrandLabelType();

        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // au.com.woolworths.product.models.ProductUnavailableLabel, au.com.woolworths.android.onesite.modules.customviews.BrandLabel
        @Nullable
        public Text getAccessibilityText() {
            return getText();
        }

        @Override // au.com.woolworths.product.models.ProductUnavailableLabel, au.com.woolworths.android.onesite.modules.customviews.BrandLabel
        @DimenRes
        public /* bridge */ /* synthetic */ int getPaddingHorizontal() {
            return R.dimen.half_default_padding;
        }

        @Override // au.com.woolworths.product.models.ProductUnavailableLabel, au.com.woolworths.android.onesite.modules.customviews.BrandLabel
        @DimenRes
        public /* bridge */ /* synthetic */ int getPaddingVertical() {
            return R.dimen.eighth_default_padding;
        }

        @Override // au.com.woolworths.product.models.ProductUnavailableLabel, au.com.woolworths.android.onesite.modules.customviews.BrandLabel
        @NotNull
        public Text getText() {
            return this.text;
        }

        @Override // au.com.woolworths.product.models.ProductUnavailableLabel, au.com.woolworths.android.onesite.modules.customviews.BrandLabel
        @StyleRes
        public int getTextAppearance() {
            return R.style.TextAppearance_Overline_Fresh_Medium;
        }

        @Override // au.com.woolworths.product.models.ProductUnavailableLabel, au.com.woolworths.android.onesite.modules.customviews.BrandLabel
        @NotNull
        public BrandLabelType getType() {
            return this.type;
        }

        public void setText(@NotNull Text text) {
            Intrinsics.h(text, "<set-?>");
            this.text = text;
        }
    };

    private static final /* synthetic */ ProductUnavailableLabel[] $values() {
        return new ProductUnavailableLabel[]{DEFAULT};
    }

    static {
        ProductUnavailableLabel[] productUnavailableLabelArr$values = $values();
        $VALUES = productUnavailableLabelArr$values;
        $ENTRIES = EnumEntriesKt.a(productUnavailableLabelArr$values);
    }

    public /* synthetic */ ProductUnavailableLabel(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    @NotNull
    public static EnumEntries<ProductUnavailableLabel> getEntries() {
        return $ENTRIES;
    }

    public static ProductUnavailableLabel valueOf(String str) {
        return (ProductUnavailableLabel) Enum.valueOf(ProductUnavailableLabel.class, str);
    }

    public static ProductUnavailableLabel[] values() {
        return (ProductUnavailableLabel[]) $VALUES.clone();
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
    @Nullable
    public abstract /* synthetic */ Text getText();

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    @StyleRes
    public /* bridge */ /* synthetic */ int getTextAppearance() {
        return R.style.TextAppearance_Overline_Fresh_Medium;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    @NotNull
    public abstract /* synthetic */ BrandLabelType getType();

    private ProductUnavailableLabel(String str, int i) {
    }
}
