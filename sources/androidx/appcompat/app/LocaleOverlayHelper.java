package androidx.appcompat.app;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import androidx.core.os.LocaleListCompat;
import java.util.LinkedHashSet;
import java.util.Locale;

@RequiresApi
/* loaded from: classes2.dex */
final class LocaleOverlayHelper {
    public static LocaleListCompat a(LocaleListCompat localeListCompat, LocaleListCompat localeListCompat2) {
        if (localeListCompat == null || localeListCompat.c()) {
            return LocaleListCompat.b;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < localeListCompat2.d() + localeListCompat.d()) {
            Locale localeB = i < localeListCompat.d() ? localeListCompat.b(i) : localeListCompat2.b(i - localeListCompat.d());
            if (localeB != null) {
                linkedHashSet.add(localeB);
            }
            i++;
        }
        return LocaleListCompat.f(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()])));
    }
}
