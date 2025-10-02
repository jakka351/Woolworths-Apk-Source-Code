package com.fasterxml.jackson.databind.util;

import YU.a;
import io.jsonwebtoken.JwtParser;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class StdDateFormat extends DateFormat {
    public static final Pattern j = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d");
    public static final Pattern k;
    public static final String[] l;
    public static final TimeZone m;
    public static final Locale n;
    public static final SimpleDateFormat o;
    public static final StdDateFormat p;
    public static final GregorianCalendar q;
    public transient TimeZone d;
    public final Locale e;
    public Boolean f;
    public transient Calendar g;
    public transient DateFormat h;
    public final boolean i;

    static {
        try {
            k = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
            l = new String[]{"yyyy-MM-dd'T'HH:mm:ss.SSSX", "yyyy-MM-dd'T'HH:mm:ss.SSS", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"};
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            m = timeZone;
            Locale locale = Locale.US;
            n = locale;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", locale);
            o = simpleDateFormat;
            simpleDateFormat.setTimeZone(timeZone);
            p = new StdDateFormat();
            q = new GregorianCalendar(timeZone, locale);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public StdDateFormat() {
        this.i = true;
        this.e = n;
    }

    public static int b(int i, String str) {
        return (str.charAt(i + 1) - '0') + ((str.charAt(i) - '0') * 10);
    }

    public static int c(String str) {
        return (str.charAt(3) - '0') + ((str.charAt(2) - '0') * 10) + ((str.charAt(1) - '0') * 100) + ((str.charAt(0) - '0') * 1000);
    }

    public static void f(StringBuffer stringBuffer, int i) {
        int i2 = i / 10;
        if (i2 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i2 + 48));
            i -= i2 * 10;
        }
        stringBuffer.append((char) (i + 48));
    }

    public static void g(StringBuffer stringBuffer, int i) {
        int i2 = i / 100;
        if (i2 == 0) {
            stringBuffer.append('0');
            stringBuffer.append('0');
        } else {
            if (i2 > 99) {
                stringBuffer.append(i2);
            } else {
                f(stringBuffer, i2);
            }
            i -= i2 * 100;
        }
        f(stringBuffer, i);
    }

    public final Calendar a(TimeZone timeZone) {
        Calendar calendar = this.g;
        if (calendar == null) {
            calendar = (Calendar) q.clone();
            this.g = calendar;
        }
        if (!calendar.getTimeZone().equals(timeZone)) {
            calendar.setTimeZone(timeZone);
        }
        calendar.setLenient(isLenient());
        return calendar;
    }

    @Override // java.text.DateFormat, java.text.Format
    public final Object clone() {
        return new StdDateFormat(this.d, this.e, this.f, this.i);
    }

    public final Date d(String str) throws ParseException {
        String str2;
        int i;
        int iB;
        int length = str.length();
        Calendar calendarA = a((this.d == null || 'Z' == str.charAt(length + (-1))) ? m : this.d);
        calendarA.clear();
        int iCharAt = 0;
        if (length > 10) {
            Matcher matcher = k.matcher(str);
            if (matcher.matches()) {
                int iStart = matcher.start(2);
                int iEnd = matcher.end(2);
                int i2 = iEnd - iStart;
                if (i2 > 1) {
                    int iB2 = b(iStart + 1, str) * 3600;
                    if (i2 >= 5) {
                        iB2 += b(iEnd - 2, str) * 60;
                    }
                    calendarA.set(15, str.charAt(iStart) == '-' ? iB2 * (-1000) : iB2 * 1000);
                    calendarA.set(16, 0);
                }
                int iC = c(str);
                int iB3 = b(5, str) - 1;
                int iB4 = b(8, str);
                int iB5 = b(11, str);
                int iB6 = b(14, str);
                if (length <= 16 || str.charAt(16) != ':') {
                    i = iB4;
                    iB = 0;
                } else {
                    i = iB4;
                    iB = b(17, str);
                }
                calendarA.set(iC, iB3, i, iB5, iB6, iB);
                int iStart2 = matcher.start(1);
                int i3 = iStart2 + 1;
                int iEnd2 = matcher.end(1);
                if (i3 >= iEnd2) {
                    calendarA.set(14, 0);
                } else {
                    int i4 = iEnd2 - i3;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 != 3 && i4 > 9) {
                                    throw new ParseException(a.j("Cannot parse date \"", str, "\": invalid fractional seconds '", matcher.group(1).substring(1), "'; can use at most 9 digits"), i3);
                                }
                                iCharAt = str.charAt(iStart2 + 3) - '0';
                            }
                            iCharAt += (str.charAt(iStart2 + 2) - '0') * 10;
                        }
                        iCharAt += (str.charAt(i3) - '0') * 100;
                    }
                    calendarA.set(14, iCharAt);
                }
                return calendarA.getTime();
            }
            str2 = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
        } else {
            if (j.matcher(str).matches()) {
                calendarA.set(c(str), b(5, str) - 1, b(8, str), 0, 0, 0);
                calendarA.set(14, 0);
                return calendarA.getTime();
            }
            str2 = "yyyy-MM-dd";
        }
        throw new ParseException(au.com.woolworths.android.onesite.a.o(a.v("Cannot parse date \"", str, "\": while it seems to fit format '", str2, "', parsing fails (leniency? "), this.f, ")"), 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        if (r2 < 0) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Date e(java.lang.String r6, java.text.ParsePosition r7) throws java.text.ParseException {
        /*
            r5 = this;
            int r0 = r6.length()
            r1 = 7
            r2 = 45
            r3 = 0
            if (r0 < r1) goto L4d
            char r0 = r6.charAt(r3)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L4d
            r0 = 3
            char r0 = r6.charAt(r0)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L4d
            r0 = 4
            char r0 = r6.charAt(r0)
            if (r0 != r2) goto L4d
            r0 = 5
            char r0 = r6.charAt(r0)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L4d
            java.util.Date r6 = r5.d(r6)     // Catch: java.lang.IllegalArgumentException -> L36
            return r6
        L36:
            r0 = move-exception
            java.text.ParseException r1 = new java.text.ParseException
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "Cannot parse date \""
            java.lang.String r3 = "\", problem: "
            java.lang.String r6 = YU.a.i(r2, r6, r3, r0)
            int r7 = r7.getErrorIndex()
            r1.<init>(r6, r7)
            throw r1
        L4d:
            int r0 = r6.length()
        L51:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L65
            char r1 = r6.charAt(r0)
            r4 = 48
            if (r1 < r4) goto L61
            r4 = 57
            if (r1 <= r4) goto L51
        L61:
            if (r0 > 0) goto L65
            if (r1 == r2) goto L51
        L65:
            if (r0 >= 0) goto Lac
            char r0 = r6.charAt(r3)
            if (r0 == r2) goto L90
            java.lang.String r0 = com.fasterxml.jackson.core.io.NumberInput.b
            int r1 = r0.length()
            int r2 = r6.length()
            if (r2 >= r1) goto L7a
            goto L90
        L7a:
            if (r2 <= r1) goto L7d
            goto Lac
        L7d:
            if (r3 >= r1) goto L90
            char r2 = r6.charAt(r3)
            char r4 = r0.charAt(r3)
            int r2 = r2 - r4
            if (r2 == 0) goto L8d
            if (r2 >= 0) goto Lac
            goto L90
        L8d:
            int r3 = r3 + 1
            goto L7d
        L90:
            long r6 = com.fasterxml.jackson.core.io.NumberInput.f(r6)     // Catch: java.lang.NumberFormatException -> L9a
            java.util.Date r0 = new java.util.Date
            r0.<init>(r6)
            return r0
        L9a:
            java.text.ParseException r0 = new java.text.ParseException
            java.lang.String r1 = "Timestamp value "
            java.lang.String r2 = " out of 64-bit value range"
            java.lang.String r6 = YU.a.h(r1, r6, r2)
            int r7 = r7.getErrorIndex()
            r0.<init>(r6, r7)
            throw r0
        Lac:
            java.text.DateFormat r0 = r5.h
            if (r0 != 0) goto Le5
            java.util.TimeZone r0 = r5.d
            java.lang.Boolean r1 = r5.f
            java.util.Locale r2 = com.fasterxml.jackson.databind.util.StdDateFormat.n
            java.util.Locale r3 = r5.e
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto Lcd
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r4 = "EEE, dd MMM yyyy HH:mm:ss zzz"
            r2.<init>(r4, r3)
            if (r0 != 0) goto Lc9
            java.util.TimeZone r0 = com.fasterxml.jackson.databind.util.StdDateFormat.m
        Lc9:
            r2.setTimeZone(r0)
            goto Lda
        Lcd:
            java.text.SimpleDateFormat r2 = com.fasterxml.jackson.databind.util.StdDateFormat.o
            java.lang.Object r2 = r2.clone()
            java.text.DateFormat r2 = (java.text.DateFormat) r2
            if (r0 == 0) goto Lda
            r2.setTimeZone(r0)
        Lda:
            if (r1 == 0) goto Le3
            boolean r0 = r1.booleanValue()
            r2.setLenient(r0)
        Le3:
            r5.h = r2
        Le5:
            java.text.DateFormat r0 = r5.h
            java.util.Date r6 = r0.parse(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.StdDateFormat.e(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    @Override // java.text.DateFormat
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // java.text.DateFormat
    public final StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        TimeZone timeZone = this.d;
        if (timeZone == null) {
            timeZone = m;
        }
        Calendar calendarA = a(timeZone);
        calendarA.setTime(date);
        int i = calendarA.get(1);
        if (calendarA.get(0) != 0) {
            if (i > 9999) {
                stringBuffer.append('+');
            }
            g(stringBuffer, i);
        } else if (i == 1) {
            stringBuffer.append("+0000");
        } else {
            stringBuffer.append('-');
            g(stringBuffer, i - 1);
        }
        stringBuffer.append('-');
        f(stringBuffer, calendarA.get(2) + 1);
        stringBuffer.append('-');
        f(stringBuffer, calendarA.get(5));
        stringBuffer.append('T');
        f(stringBuffer, calendarA.get(11));
        stringBuffer.append(':');
        f(stringBuffer, calendarA.get(12));
        stringBuffer.append(':');
        f(stringBuffer, calendarA.get(13));
        stringBuffer.append(JwtParser.SEPARATOR_CHAR);
        int i2 = calendarA.get(14);
        int i3 = i2 / 100;
        if (i3 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i3 + 48));
            i2 -= i3 * 100;
        }
        f(stringBuffer, i2);
        int offset = timeZone.getOffset(calendarA.getTimeInMillis());
        boolean z = this.i;
        if (offset == 0) {
            if (z) {
                stringBuffer.append("+00:00");
                return stringBuffer;
            }
            stringBuffer.append("+0000");
            return stringBuffer;
        }
        int i4 = offset / 60000;
        int iAbs = Math.abs(i4 / 60);
        int iAbs2 = Math.abs(i4 % 60);
        stringBuffer.append(offset < 0 ? '-' : '+');
        f(stringBuffer, iAbs);
        if (z) {
            stringBuffer.append(':');
        }
        f(stringBuffer, iAbs2);
        return stringBuffer;
    }

    @Override // java.text.DateFormat
    public final TimeZone getTimeZone() {
        return this.d;
    }

    @Override // java.text.DateFormat
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // java.text.DateFormat
    public final boolean isLenient() {
        Boolean bool = this.f;
        return bool == null || bool.booleanValue();
    }

    @Override // java.text.DateFormat
    public final Date parse(String str) throws ParseException {
        String strTrim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date dateE = e(strTrim, parsePosition);
        if (dateE != null) {
            return dateE;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : l) {
            if (sb.length() > 0) {
                sb.append("\", \"");
            } else {
                sb.append('\"');
            }
            sb.append(str2);
        }
        sb.append('\"');
        throw new ParseException(a.j("Cannot parse date \"", strTrim, "\": not compatible with any of standard forms (", sb.toString(), ")"), parsePosition.getErrorIndex());
    }

    @Override // java.text.DateFormat
    public final void setLenient(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Boolean bool = this.f;
        if (boolValueOf == bool || boolValueOf.equals(bool)) {
            return;
        }
        this.f = boolValueOf;
        this.h = null;
    }

    @Override // java.text.DateFormat
    public final void setTimeZone(TimeZone timeZone) {
        if (timeZone.equals(this.d)) {
            return;
        }
        this.h = null;
        this.d = timeZone;
    }

    public final String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", getClass().getName(), this.d, this.e, this.f);
    }

    public StdDateFormat(TimeZone timeZone, Locale locale, Boolean bool, boolean z) {
        this.d = timeZone;
        this.e = locale;
        this.f = bool;
        this.i = z;
    }

    @Override // java.text.DateFormat
    public final Date parse(String str, ParsePosition parsePosition) {
        try {
            return e(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }
}
