package org.sqlite.date;

import YU.a;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes8.dex */
public class FastDateFormat extends Format implements DateParser, DatePrinter {
    public static final AnonymousClass1 f = new AnonymousClass1();
    public final FastDatePrinter d;
    public final FastDateParser e;

    /* renamed from: org.sqlite.date.FastDateFormat$1, reason: invalid class name */
    public static class AnonymousClass1 extends FormatCache<FastDateFormat> {
        @Override // org.sqlite.date.FormatCache
        public final FastDateFormat a(String str, Locale locale, TimeZone timeZone) {
            return new FastDateFormat(str, locale, timeZone);
        }
    }

    public FastDateFormat(String str, Locale locale, TimeZone timeZone) {
        this.d = new FastDatePrinter(str, locale, timeZone);
        this.e = new FastDateParser(str, locale, timeZone);
    }

    public static FastDateFormat a(String str) {
        return (FastDateFormat) f.b(str, null, null);
    }

    public static FastDateFormat b(String str, TimeZone timeZone) {
        return (FastDateFormat) f.b(str, null, timeZone);
    }

    public final Date c(String str) throws ParseException {
        FastDateParser fastDateParser = this.e;
        Locale locale = fastDateParser.f;
        Date dateE = fastDateParser.e(str, new ParsePosition(0));
        if (dateE != null) {
            return dateE;
        }
        if (!locale.equals(FastDateParser.m)) {
            StringBuilder sbU = a.u("Unparseable date: \"", str, "\" does not match ");
            sbU.append(fastDateParser.i.pattern());
            throw new ParseException(sbU.toString(), 0);
        }
        throw new ParseException("(The " + locale + " locale does not support dates before 1868 AD)\nUnparseable date: \"" + str + "\" does not match " + fastDateParser.i.pattern(), 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FastDateFormat) {
            return this.d.equals(((FastDateFormat) obj).d);
        }
        return false;
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        boolean z = obj instanceof Date;
        FastDatePrinter fastDatePrinter = this.d;
        if (z) {
            fastDatePrinter.getClass();
            GregorianCalendar gregorianCalendar = new GregorianCalendar(fastDatePrinter.e, fastDatePrinter.f);
            gregorianCalendar.setTime((Date) obj);
            fastDatePrinter.b(stringBuffer, gregorianCalendar);
            return stringBuffer;
        }
        if (obj instanceof Calendar) {
            fastDatePrinter.b(stringBuffer, (Calendar) obj);
            return stringBuffer;
        }
        fastDatePrinter.getClass();
        if (!(obj instanceof Long)) {
            throw new IllegalArgumentException("Unknown class: ".concat(obj == null ? "<null>" : obj.getClass().getName()));
        }
        Date date = new Date(((Long) obj).longValue());
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(fastDatePrinter.e, fastDatePrinter.f);
        gregorianCalendar2.setTime(date);
        fastDatePrinter.b(stringBuffer, gregorianCalendar2);
        return stringBuffer;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.text.Format
    public final Object parseObject(String str, ParsePosition parsePosition) {
        return this.e.e(str, parsePosition);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FastDateFormat[");
        FastDatePrinter fastDatePrinter = this.d;
        sb.append(fastDatePrinter.d);
        sb.append(",");
        sb.append(fastDatePrinter.f);
        sb.append(",");
        sb.append(fastDatePrinter.e.getID());
        sb.append("]");
        return sb.toString();
    }
}
