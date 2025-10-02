package au.com.woolworths.compose.utils.extensions;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"compose-utils_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ColorExtKt {
    public static final long a(long j, String str) {
        int i = Color.l;
        if (str == null || str.length() == 0) {
            return j;
        }
        try {
            return ColorKt.b(android.graphics.Color.parseColor(str));
        } catch (IllegalArgumentException unused) {
            return j;
        }
    }
}
