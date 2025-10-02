package me.oriient.internal.infra.utils.core.time;

import androidx.annotation.Keep;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0007\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006\u000b"}, d2 = {"ISO_8601_WITHOUT_TIMEZONE_FORMAT", "", "getISO_8601_WITHOUT_TIMEZONE_FORMAT$annotations", "()V", "formatMilli", "timeMilli", "", "fromIso8601WithoutTimezone", "timeZone", "Ljava/util/TimeZone;", "toIso8601WithoutTimezone", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TimeFormattingExtKt {

    @NotNull
    private static final String ISO_8601_WITHOUT_TIMEZONE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    @Keep
    @NotNull
    public static final String formatMilli(long j) {
        long j2 = 1000;
        long j3 = j % j2;
        long j4 = j / j2;
        long j5 = 60;
        long j6 = j4 % j5;
        long j7 = j4 / j5;
        long j8 = j7 % j5;
        long j9 = j7 / j5;
        long j10 = 24;
        long j11 = j9 % j10;
        long j12 = j9 / j10;
        long j13 = 365;
        long j14 = j12 % j13;
        long j15 = j12 / j13;
        StringBuilder sb = new StringBuilder();
        if (j15 > 0) {
            sb.append(j15);
            sb.append(" years ");
        }
        if (j14 > 0) {
            sb.append(j14);
            sb.append(" days ");
        }
        if (j11 > 0) {
            sb.append(j11);
            sb.append(" hours ");
        }
        if (j8 > 0) {
            sb.append(j8);
            sb.append(" min ");
        }
        if (j6 > 0) {
            sb.append(j6);
            sb.append(" sec ");
        }
        if (j3 > 0) {
            sb.append(j3);
            sb.append(" milli");
        }
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    @Keep
    public static final synchronized long fromIso8601WithoutTimezone(@NotNull String str, @NotNull TimeZone timeZone) {
        Date date;
        Intrinsics.h(str, "<this>");
        Intrinsics.h(timeZone, "timeZone");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ISO_8601_WITHOUT_TIMEZONE_FORMAT, Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        date = simpleDateFormat.parse(str);
        return date != null ? date.getTime() : 0L;
    }

    private static /* synthetic */ void getISO_8601_WITHOUT_TIMEZONE_FORMAT$annotations() {
    }

    @Keep
    @NotNull
    public static final synchronized String toIso8601WithoutTimezone(long j, @NotNull TimeZone timeZone) {
        String str;
        Intrinsics.h(timeZone, "timeZone");
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ISO_8601_WITHOUT_TIMEZONE_FORMAT, Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        str = simpleDateFormat.format(calendar.getTime());
        Intrinsics.g(str, "format(...)");
        return str;
    }
}
