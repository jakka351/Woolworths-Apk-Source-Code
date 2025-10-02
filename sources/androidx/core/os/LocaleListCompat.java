package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import java.util.Locale;

/* loaded from: classes.dex */
public final class LocaleListCompat {
    public static final LocaleListCompat b = f(new LocaleList(new Locale[0]));

    /* renamed from: a, reason: collision with root package name */
    public final LocaleListPlatformWrapper f2441a;

    @RequiresApi
    public static class Api21Impl {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f2442a = 0;

        static {
            new Locale("en", "XA");
            new Locale("ar", "XB");
        }
    }

    @RequiresApi
    public static class Api24Impl {
    }

    public LocaleListCompat(LocaleListPlatformWrapper localeListPlatformWrapper) {
        this.f2441a = localeListPlatformWrapper;
    }

    public static LocaleListCompat a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            int i2 = Api21Impl.f2442a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return f(new LocaleList(localeArr));
    }

    public static LocaleListCompat f(LocaleList localeList) {
        return new LocaleListCompat(new LocaleListPlatformWrapper(localeList));
    }

    public final Locale b(int i) {
        return this.f2441a.f2443a.get(i);
    }

    public final boolean c() {
        return this.f2441a.f2443a.isEmpty();
    }

    public final int d() {
        return this.f2441a.f2443a.size();
    }

    public final String e() {
        return this.f2441a.f2443a.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocaleListCompat) {
            return this.f2441a.equals(((LocaleListCompat) obj).f2441a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2441a.f2443a.hashCode();
    }

    public final String toString() {
        return this.f2441a.f2443a.toString();
    }
}
