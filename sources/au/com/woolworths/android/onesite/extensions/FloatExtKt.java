package au.com.woolworths.android.onesite.extensions;

import au.com.woolworths.android.onesite.utils.Locales;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FloatExtKt {
    public static final String a(float f) {
        return "$".concat(String.format(Locales.a(), "%,.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)));
    }
}
