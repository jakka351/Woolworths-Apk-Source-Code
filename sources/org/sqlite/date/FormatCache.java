package org.sqlite.date;

import java.text.Format;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
abstract class FormatCache<F extends Format> {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f26901a = new ConcurrentHashMap(7);

    public static class MultipartKey {

        /* renamed from: a, reason: collision with root package name */
        public final Object[] f26902a;
        public int b;

        public MultipartKey(Object... objArr) {
            this.f26902a = objArr;
        }

        public final boolean equals(Object obj) {
            return Arrays.equals(this.f26902a, ((MultipartKey) obj).f26902a);
        }

        public final int hashCode() {
            if (this.b == 0) {
                int iHashCode = 0;
                for (Object obj : this.f26902a) {
                    if (obj != null) {
                        iHashCode = obj.hashCode() + (iHashCode * 7);
                    }
                }
                this.b = iHashCode;
            }
            return this.b;
        }
    }

    static {
        new ConcurrentHashMap(7);
    }

    public abstract FastDateFormat a(String str, Locale locale, TimeZone timeZone);

    public final Format b(String str, Locale locale, TimeZone timeZone) {
        if (str == null) {
            throw new NullPointerException("pattern must not be null");
        }
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        MultipartKey multipartKey = new MultipartKey(str, timeZone, locale);
        ConcurrentHashMap concurrentHashMap = this.f26901a;
        Format format = (Format) concurrentHashMap.get(multipartKey);
        if (format != null) {
            return format;
        }
        FastDateFormat fastDateFormatA = a(str, locale, timeZone);
        Format format2 = (Format) concurrentHashMap.putIfAbsent(multipartKey, fastDateFormatA);
        return format2 != null ? format2 : fastDateFormatA;
    }
}
