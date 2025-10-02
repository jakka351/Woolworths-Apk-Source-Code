package org.sqlite.date;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class FastDatePrinter implements DatePrinter, Serializable {
    public static final ConcurrentHashMap i = new ConcurrentHashMap(7);
    public final String d;
    public final TimeZone e;
    public final Locale f;
    public transient Rule[] g;
    public transient int h;

    public static class CharacterLiteral implements Rule {

        /* renamed from: a, reason: collision with root package name */
        public final char f26886a;

        public CharacterLiteral(char c) {
            this.f26886a = c;
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final int b() {
            return 1;
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final void c(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.f26886a);
        }
    }

    public static class Iso8601_Rule implements Rule {
        public static final Iso8601_Rule b = new Iso8601_Rule(3);
        public static final Iso8601_Rule c = new Iso8601_Rule(5);
        public static final Iso8601_Rule d = new Iso8601_Rule(6);

        /* renamed from: a, reason: collision with root package name */
        public final int f26887a;

        public Iso8601_Rule(int i) {
            this.f26887a = i;
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final int b() {
            return this.f26887a;
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final void c(StringBuffer stringBuffer, Calendar calendar) {
            int i = calendar.get(15);
            if (i == 0) {
                stringBuffer.append("Z");
                return;
            }
            int i2 = calendar.get(16) + i;
            if (i2 < 0) {
                stringBuffer.append('-');
                i2 = -i2;
            } else {
                stringBuffer.append('+');
            }
            int i3 = i2 / 3600000;
            FastDatePrinter.a(stringBuffer, i3);
            int i4 = this.f26887a;
            if (i4 < 5) {
                return;
            }
            if (i4 == 6) {
                stringBuffer.append(':');
            }
            FastDatePrinter.a(stringBuffer, (i2 / 60000) - (i3 * 60));
        }
    }

    public interface NumberRule extends Rule {
        void a(StringBuffer stringBuffer, int i);
    }

    public static class PaddedNumberField implements NumberRule {

        /* renamed from: a, reason: collision with root package name */
        public final int f26888a;
        public final int b;

        public PaddedNumberField(int i, int i2) {
            if (i2 < 3) {
                throw new IllegalArgumentException();
            }
            this.f26888a = i;
            this.b = i2;
        }

        @Override // org.sqlite.date.FastDatePrinter.NumberRule
        public final void a(StringBuffer stringBuffer, int i) {
            for (int i2 = 0; i2 < this.b; i2++) {
                stringBuffer.append('0');
            }
            int length = stringBuffer.length();
            while (i > 0) {
                length--;
                stringBuffer.setCharAt(length, (char) ((i % 10) + 48));
                i /= 10;
            }
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final int b() {
            return this.b;
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final void c(StringBuffer stringBuffer, Calendar calendar) {
            a(stringBuffer, calendar.get(this.f26888a));
        }
    }

    public interface Rule {
        int b();

        void c(StringBuffer stringBuffer, Calendar calendar);
    }

    public static class StringLiteral implements Rule {

        /* renamed from: a, reason: collision with root package name */
        public final String f26889a;

        public StringLiteral(String str) {
            this.f26889a = str;
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final int b() {
            return this.f26889a.length();
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final void c(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.f26889a);
        }
    }

    public static class TextField implements Rule {

        /* renamed from: a, reason: collision with root package name */
        public final int f26890a;
        public final String[] b;

        public TextField(int i, String[] strArr) {
            this.f26890a = i;
            this.b = strArr;
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final int b() {
            String[] strArr = this.b;
            int length = strArr.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i;
                }
                int length2 = strArr[length].length();
                if (length2 > i) {
                    i = length2;
                }
            }
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final void c(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.b[calendar.get(this.f26890a)]);
        }
    }

    public static class TimeZoneDisplayKey {

        /* renamed from: a, reason: collision with root package name */
        public final TimeZone f26891a;
        public final int b;
        public final Locale c;

        public TimeZoneDisplayKey(TimeZone timeZone, boolean z, int i, Locale locale) {
            this.f26891a = timeZone;
            if (z) {
                this.b = Integer.MIN_VALUE | i;
            } else {
                this.b = i;
            }
            this.c = locale;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TimeZoneDisplayKey) {
                TimeZoneDisplayKey timeZoneDisplayKey = (TimeZoneDisplayKey) obj;
                if (this.f26891a.equals(timeZoneDisplayKey.f26891a) && this.b == timeZoneDisplayKey.b && this.c.equals(timeZoneDisplayKey.c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f26891a.hashCode() + ((this.c.hashCode() + (this.b * 31)) * 31);
        }
    }

    public static class TimeZoneNameRule implements Rule {

        /* renamed from: a, reason: collision with root package name */
        public final Locale f26892a;
        public final int b;
        public final String c;
        public final String d;

        public TimeZoneNameRule(TimeZone timeZone, Locale locale, int i) {
            this.f26892a = locale;
            this.b = i;
            this.c = FastDatePrinter.c(timeZone, false, i, locale);
            this.d = FastDatePrinter.c(timeZone, true, i, locale);
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final int b() {
            return Math.max(this.c.length(), this.d.length());
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final void c(StringBuffer stringBuffer, Calendar calendar) {
            TimeZone timeZone = calendar.getTimeZone();
            int i = calendar.get(16);
            Locale locale = this.f26892a;
            int i2 = this.b;
            if (i != 0) {
                stringBuffer.append(FastDatePrinter.c(timeZone, true, i2, locale));
            } else {
                stringBuffer.append(FastDatePrinter.c(timeZone, false, i2, locale));
            }
        }
    }

    public static class TimeZoneNumberRule implements Rule {
        public static final TimeZoneNumberRule c = new TimeZoneNumberRule(true, false);
        public static final TimeZoneNumberRule d = new TimeZoneNumberRule(false, false);
        public static final TimeZoneNumberRule e = new TimeZoneNumberRule(true, true);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f26893a;
        public final boolean b;

        public TimeZoneNumberRule(boolean z, boolean z2) {
            this.f26893a = z;
            this.b = z2;
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final int b() {
            return 5;
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final void c(StringBuffer stringBuffer, Calendar calendar) {
            if (this.b && calendar.getTimeZone().getID().equals("UTC")) {
                stringBuffer.append("Z");
                return;
            }
            int i = calendar.get(16) + calendar.get(15);
            if (i < 0) {
                stringBuffer.append('-');
                i = -i;
            } else {
                stringBuffer.append('+');
            }
            int i2 = i / 3600000;
            FastDatePrinter.a(stringBuffer, i2);
            if (this.f26893a) {
                stringBuffer.append(':');
            }
            FastDatePrinter.a(stringBuffer, (i / 60000) - (i2 * 60));
        }
    }

    public static class TwelveHourField implements NumberRule {

        /* renamed from: a, reason: collision with root package name */
        public final NumberRule f26894a;

        public TwelveHourField(NumberRule numberRule) {
            this.f26894a = numberRule;
        }

        @Override // org.sqlite.date.FastDatePrinter.NumberRule
        public final void a(StringBuffer stringBuffer, int i) {
            this.f26894a.a(stringBuffer, i);
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final int b() {
            return this.f26894a.b();
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final void c(StringBuffer stringBuffer, Calendar calendar) {
            int leastMaximum = calendar.get(10);
            if (leastMaximum == 0) {
                leastMaximum = calendar.getLeastMaximum(10) + 1;
            }
            this.f26894a.a(stringBuffer, leastMaximum);
        }
    }

    public static class TwentyFourHourField implements NumberRule {

        /* renamed from: a, reason: collision with root package name */
        public final NumberRule f26895a;

        public TwentyFourHourField(NumberRule numberRule) {
            this.f26895a = numberRule;
        }

        @Override // org.sqlite.date.FastDatePrinter.NumberRule
        public final void a(StringBuffer stringBuffer, int i) {
            this.f26895a.a(stringBuffer, i);
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final int b() {
            return this.f26895a.b();
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final void c(StringBuffer stringBuffer, Calendar calendar) {
            int maximum = calendar.get(11);
            if (maximum == 0) {
                maximum = calendar.getMaximum(11) + 1;
            }
            this.f26895a.a(stringBuffer, maximum);
        }
    }

    public static class TwoDigitMonthField implements NumberRule {

        /* renamed from: a, reason: collision with root package name */
        public static final TwoDigitMonthField f26896a = new TwoDigitMonthField();

        @Override // org.sqlite.date.FastDatePrinter.NumberRule
        public final void a(StringBuffer stringBuffer, int i) {
            FastDatePrinter.a(stringBuffer, i);
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final int b() {
            return 2;
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final void c(StringBuffer stringBuffer, Calendar calendar) {
            FastDatePrinter.a(stringBuffer, calendar.get(2) + 1);
        }
    }

    public static class TwoDigitNumberField implements NumberRule {

        /* renamed from: a, reason: collision with root package name */
        public final int f26897a;

        public TwoDigitNumberField(int i) {
            this.f26897a = i;
        }

        @Override // org.sqlite.date.FastDatePrinter.NumberRule
        public final void a(StringBuffer stringBuffer, int i) {
            if (i < 100) {
                FastDatePrinter.a(stringBuffer, i);
            } else {
                stringBuffer.append(i);
            }
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final int b() {
            return 2;
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final void c(StringBuffer stringBuffer, Calendar calendar) {
            a(stringBuffer, calendar.get(this.f26897a));
        }
    }

    public static class TwoDigitYearField implements NumberRule {

        /* renamed from: a, reason: collision with root package name */
        public static final TwoDigitYearField f26898a = new TwoDigitYearField();

        @Override // org.sqlite.date.FastDatePrinter.NumberRule
        public final void a(StringBuffer stringBuffer, int i) {
            FastDatePrinter.a(stringBuffer, i);
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final int b() {
            return 2;
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final void c(StringBuffer stringBuffer, Calendar calendar) {
            FastDatePrinter.a(stringBuffer, calendar.get(1) % 100);
        }
    }

    public static class UnpaddedMonthField implements NumberRule {

        /* renamed from: a, reason: collision with root package name */
        public static final UnpaddedMonthField f26899a = new UnpaddedMonthField();

        @Override // org.sqlite.date.FastDatePrinter.NumberRule
        public final void a(StringBuffer stringBuffer, int i) {
            if (i < 10) {
                stringBuffer.append((char) (i + 48));
            } else {
                FastDatePrinter.a(stringBuffer, i);
            }
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final int b() {
            return 2;
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final void c(StringBuffer stringBuffer, Calendar calendar) {
            a(stringBuffer, calendar.get(2) + 1);
        }
    }

    public static class UnpaddedNumberField implements NumberRule {

        /* renamed from: a, reason: collision with root package name */
        public final int f26900a;

        public UnpaddedNumberField(int i) {
            this.f26900a = i;
        }

        @Override // org.sqlite.date.FastDatePrinter.NumberRule
        public final void a(StringBuffer stringBuffer, int i) {
            if (i < 10) {
                stringBuffer.append((char) (i + 48));
            } else if (i < 100) {
                FastDatePrinter.a(stringBuffer, i);
            } else {
                stringBuffer.append(i);
            }
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final int b() {
            return 4;
        }

        @Override // org.sqlite.date.FastDatePrinter.Rule
        public final void c(StringBuffer stringBuffer, Calendar calendar) {
            a(stringBuffer, calendar.get(this.f26900a));
        }
    }

    public FastDatePrinter(String str, Locale locale, TimeZone timeZone) {
        this.d = str;
        this.e = timeZone;
        this.f = locale;
        d();
    }

    public static void a(StringBuffer stringBuffer, int i2) {
        stringBuffer.append((char) ((i2 / 10) + 48));
        stringBuffer.append((char) ((i2 % 10) + 48));
    }

    public static String c(TimeZone timeZone, boolean z, int i2, Locale locale) {
        TimeZoneDisplayKey timeZoneDisplayKey = new TimeZoneDisplayKey(timeZone, z, i2, locale);
        ConcurrentHashMap concurrentHashMap = i;
        String str = (String) concurrentHashMap.get(timeZoneDisplayKey);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z, i2, locale);
        String str2 = (String) concurrentHashMap.putIfAbsent(timeZoneDisplayKey, displayName);
        return str2 != null ? str2 : displayName;
    }

    public static NumberRule e(int i2, int i3) {
        return i3 != 1 ? i3 != 2 ? new PaddedNumberField(i2, i3) : new TwoDigitNumberField(i2) : new UnpaddedNumberField(i2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        d();
    }

    public final void b(StringBuffer stringBuffer, Calendar calendar) {
        for (Rule rule : this.g) {
            rule.c(stringBuffer, calendar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x020e, code lost:
    
        r1 = (org.sqlite.date.FastDatePrinter.Rule[]) r3.toArray(new org.sqlite.date.FastDatePrinter.Rule[r3.size()]);
        r22.g = r1;
        r1 = r1.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x021d, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x021f, code lost:
    
        if (r1 < 0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0221, code lost:
    
        r13 = r13 + r22.g[r1].b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x022b, code lost:
    
        r22.h = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x022d, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.sqlite.date.FastDatePrinter.d():void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FastDatePrinter)) {
            return false;
        }
        FastDatePrinter fastDatePrinter = (FastDatePrinter) obj;
        return this.d.equals(fastDatePrinter.d) && this.e.equals(fastDatePrinter.e) && this.f.equals(fastDatePrinter.f);
    }

    public final int hashCode() {
        return (((this.f.hashCode() * 13) + this.e.hashCode()) * 13) + this.d.hashCode();
    }

    public final String toString() {
        return "FastDatePrinter[" + this.d + "," + this.f + "," + this.e.getID() + "]";
    }
}
