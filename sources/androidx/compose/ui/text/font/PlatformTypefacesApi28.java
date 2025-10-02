package androidx.compose.ui.text.font;

import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/PlatformTypefacesApi28;", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@VisibleForTesting
/* loaded from: classes.dex */
final class PlatformTypefacesApi28 implements PlatformTypefaces {
    public static android.graphics.Typeface a(String str, FontWeight fontWeight, int i) {
        if (i == 0 && Intrinsics.c(fontWeight, FontWeight.j) && (str == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        return android.graphics.Typeface.create(str == null ? android.graphics.Typeface.DEFAULT : android.graphics.Typeface.create(str, 0), fontWeight.d, i == 1);
    }
}
