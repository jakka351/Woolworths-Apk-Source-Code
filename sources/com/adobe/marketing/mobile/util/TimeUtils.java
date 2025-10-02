package com.adobe.marketing.mobile.util;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/util/TimeUtils;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TimeUtils {
    public static String a(Date date, String str, TimeZone timeZone) {
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, new Locale(locale.getLanguage(), locale.getCountry(), "POSIX"));
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        return simpleDateFormat.format(date);
    }

    public static final String b(long j, TimeZone timeZone) {
        Locale locale = Locale.US;
        Intrinsics.h(timeZone, "timeZone");
        Intrinsics.h(locale, "locale");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", locale);
        simpleDateFormat.setTimeZone(timeZone);
        String str = simpleDateFormat.format(Long.valueOf(j));
        Intrinsics.g(str, "rfc2822formatter.format(epoch)");
        return str;
    }

    public static final Date c(String str, TimeZone timeZone) throws ParseException {
        Locale locale = Locale.US;
        Intrinsics.h(timeZone, "timeZone");
        Intrinsics.h(locale, "locale");
        if (str == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", locale);
        simpleDateFormat.setTimeZone(timeZone);
        try {
            Date date = simpleDateFormat.parse(str);
            return date == null ? new Date() : date;
        } catch (Exception unused) {
            return null;
        }
    }
}
