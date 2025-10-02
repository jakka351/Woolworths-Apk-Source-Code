package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.woolworths.R;

@RestrictTo
@Deprecated
/* loaded from: classes2.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {
    public final int d;
    public final int e;

    public BrowserActionsFallbackMenuView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
        this.e = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.d * 2), this.e), 1073741824), i2);
    }
}
