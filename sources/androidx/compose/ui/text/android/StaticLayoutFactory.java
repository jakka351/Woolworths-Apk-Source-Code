package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.appcompat.app.c;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@StabilityInferred
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StaticLayoutFactory {
    public static StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            InlineClassHelperKt.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            InlineClassHelperKt.a("invalid end value");
        }
        if (i3 < 0) {
            InlineClassHelperKt.a("invalid maxLines value");
        }
        if (i < 0) {
            InlineClassHelperKt.a("invalid width value");
        }
        if (i4 < 0) {
            InlineClassHelperKt.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(BitmapDescriptorFactory.HUE_RED, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        int i10 = Build.VERSION.SDK_INT;
        builderObtain.setJustificationMode(i5);
        builderObtain.setUseLineSpacingFromFallbacks(true);
        if (i10 >= 33) {
            builderObtain.setLineBreakConfig(c.e().setLineBreakStyle(i7).setLineBreakWordStyle(i8).build());
        }
        if (i10 >= 35) {
            StaticLayoutFactory35.a(builderObtain);
        }
        return builderObtain.build();
    }
}
