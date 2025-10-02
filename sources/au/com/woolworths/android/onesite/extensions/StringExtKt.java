package au.com.woolworths.android.onesite.extensions;

import au.com.woolworths.android.onesite.utils.Locales;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class StringExtKt {
    public static Date a(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locales.a()).parse(str);
        } catch (ParseException e) {
            Timber.f27013a.p(e);
            return null;
        }
    }

    public static final String b(int i, int i2, String str) {
        try {
            return StringsKt.S(str, i, i2, StringsKt.P(i2 - i, String.valueOf('*'))).toString();
        } catch (IndexOutOfBoundsException e) {
            Timber.f27013a.o("Error toMaskedValue: " + e, new Object[0]);
            return null;
        }
    }
}
