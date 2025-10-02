package au.com.woolworths.android.onesite.extensions;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntExtKt {
    public static final String a(int i) {
        return String.format(Locale.getDefault(), "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i % 100)}, 1));
    }

    public static final String b(int i) {
        return String.valueOf(i / 100);
    }

    public static final String c(int i) {
        return FloatExtKt.a(i / 100);
    }
}
