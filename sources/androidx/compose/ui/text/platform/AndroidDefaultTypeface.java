package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontWeight;
import kotlin.Deprecated;
import kotlin.Metadata;

@StabilityInferred
@Deprecated
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidDefaultTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AndroidDefaultTypeface implements AndroidTypeface {
    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    public final Typeface a(int i, FontWeight fontWeight) {
        return Typeface.create(Typeface.DEFAULT, fontWeight.d, i == 1);
    }
}
