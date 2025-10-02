package androidx.media3.ui;

import android.graphics.Color;
import androidx.media3.common.util.Util;
import java.util.Locale;

/* loaded from: classes2.dex */
final class HtmlUtils {
    public static String a(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(Color.alpha(i) / 255.0d)};
        int i2 = Util.f2928a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }
}
