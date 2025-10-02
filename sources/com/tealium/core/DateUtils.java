package com.tealium.core;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/DateUtils;", "", "Companion", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DateUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f19122a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ROOT);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tealium/core/DateUtils$Companion;", "", "", "FORMAT_ISO_8601", "Ljava/lang/String;", "TIME_ZONE", "Ljava/text/SimpleDateFormat;", "formatIso8601", "Ljava/text/SimpleDateFormat;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static String a(Date date) {
            SimpleDateFormat simpleDateFormat = DateUtils.f19122a;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String str = simpleDateFormat.format(date);
            Intrinsics.g(str, "formatIso8601.format(date)");
            return str;
        }

        public static String b(Instant instant) {
            String string = instant.toString();
            Intrinsics.g(string, "date.toString()");
            return string;
        }

        public static String c(LocalDate localDate) {
            String str = localDate.atStartOfDay(ZoneOffset.UTC).format(DateTimeFormatter.ISO_INSTANT);
            Intrinsics.g(str, "date.atStartOfDay(ZoneOf…imeFormatter.ISO_INSTANT)");
            return str;
        }

        public static String d(LocalDateTime localDateTime) {
            String str = localDateTime.atOffset(ZoneOffset.UTC).format(DateTimeFormatter.ISO_INSTANT);
            Intrinsics.g(str, "date.atOffset(ZoneOffset…imeFormatter.ISO_INSTANT)");
            return str;
        }

        public static String e(LocalTime localTime) {
            String string = localTime.toString();
            Intrinsics.g(string, "date.toString()");
            return string;
        }

        public static String f(ZonedDateTime zonedDateTime) {
            String str = zonedDateTime.format(DateTimeFormatter.ISO_INSTANT);
            Intrinsics.g(str, "date.format(DateTimeFormatter.ISO_INSTANT)");
            return str;
        }
    }
}
