package au.com.woolworths.android.onesite.modules.customviews;

import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/modules/customviews/BrandLabel;", "", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BrandLabel {
    default Text getAccessibilityText() {
        return getText();
    }

    default int getPaddingHorizontal() {
        return R.dimen.half_default_padding;
    }

    default int getPaddingVertical() {
        return R.dimen.eighth_default_padding;
    }

    Text getText();

    default int getTextAppearance() {
        return R.style.TextAppearance_Overline_Fresh_Medium;
    }

    BrandLabelType getType();
}
