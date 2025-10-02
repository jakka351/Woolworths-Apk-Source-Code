package org.sqlite.date;

import YU.a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public class FastDateParser implements DateParser, Serializable {
    public final String d;
    public final TimeZone e;
    public final Locale f;
    public final int g;
    public final int h;
    public transient Pattern i;
    public transient Strategy[] j;
    public transient String k;
    public transient Strategy l;
    public static final Locale m = new Locale("ja", "JP", "JP");
    public static final Pattern n = Pattern.compile("D+|E+|F+|G+|H+|K+|M+|S+|W+|X+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++");
    public static final ConcurrentMap[] o = new ConcurrentMap[17];
    public static final AnonymousClass1 p = new AnonymousClass1(1);
    public static final AnonymousClass2 q = new AnonymousClass2(2);
    public static final NumberStrategy r = new NumberStrategy(1);
    public static final NumberStrategy s = new NumberStrategy(3);
    public static final NumberStrategy t = new NumberStrategy(4);
    public static final NumberStrategy u = new NumberStrategy(6);
    public static final NumberStrategy v = new NumberStrategy(5);
    public static final NumberStrategy w = new NumberStrategy(8);
    public static final NumberStrategy x = new NumberStrategy(11);
    public static final AnonymousClass3 y = new AnonymousClass3(11);
    public static final AnonymousClass4 z = new AnonymousClass4(10);
    public static final NumberStrategy A = new NumberStrategy(10);
    public static final NumberStrategy B = new NumberStrategy(12);
    public static final NumberStrategy C = new NumberStrategy(13);
    public static final NumberStrategy D = new NumberStrategy(14);
    public static final ISO8601TimeZoneStrategy E = new ISO8601TimeZoneStrategy("(Z|(?:[+-]\\d{2}(?::?\\d{2})?))");

    /* renamed from: org.sqlite.date.FastDateParser$1, reason: invalid class name */
    public static class AnonymousClass1 extends NumberStrategy {
        @Override // org.sqlite.date.FastDateParser.NumberStrategy, org.sqlite.date.FastDateParser.Strategy
        public final void c(FastDateParser fastDateParser, Calendar calendar, String str) throws NumberFormatException {
            int i = Integer.parseInt(str);
            if (i < 100) {
                int i2 = fastDateParser.g + i;
                if (i < fastDateParser.h) {
                    i2 += 100;
                }
                i = i2;
            }
            calendar.set(1, i);
        }
    }

    /* renamed from: org.sqlite.date.FastDateParser$2, reason: invalid class name */
    public static class AnonymousClass2 extends NumberStrategy {
        @Override // org.sqlite.date.FastDateParser.NumberStrategy
        public final int d(int i) {
            return i - 1;
        }
    }

    /* renamed from: org.sqlite.date.FastDateParser$3, reason: invalid class name */
    public static class AnonymousClass3 extends NumberStrategy {
        @Override // org.sqlite.date.FastDateParser.NumberStrategy
        public final int d(int i) {
            if (i == 24) {
                return 0;
            }
            return i;
        }
    }

    /* renamed from: org.sqlite.date.FastDateParser$4, reason: invalid class name */
    public static class AnonymousClass4 extends NumberStrategy {
        @Override // org.sqlite.date.FastDateParser.NumberStrategy
        public final int d(int i) {
            if (i == 12) {
                return 0;
            }
            return i;
        }
    }

    public static class CaseInsensitiveTextStrategy extends Strategy {

        /* renamed from: a, reason: collision with root package name */
        public final int f26881a;
        public final Locale b;
        public final HashMap c;

        public CaseInsensitiveTextStrategy(int i, Calendar calendar, Locale locale) {
            this.f26881a = i;
            this.b = locale;
            Locale locale2 = FastDateParser.m;
            Map<String, Integer> displayNames = calendar.getDisplayNames(i, 0, locale);
            this.c = new HashMap();
            for (Map.Entry<String, Integer> entry : displayNames.entrySet()) {
                this.c.put(entry.getKey().toLowerCase(locale), entry.getValue());
            }
        }

        @Override // org.sqlite.date.FastDateParser.Strategy
        public final boolean a(FastDateParser fastDateParser, StringBuilder sb) {
            sb.append("((?iu)");
            Iterator it = this.c.keySet().iterator();
            while (it.hasNext()) {
                FastDateParser.a((String) it.next(), sb, false);
                sb.append('|');
            }
            sb.setCharAt(sb.length() - 1, ')');
            return true;
        }

        @Override // org.sqlite.date.FastDateParser.Strategy
        public final void c(FastDateParser fastDateParser, Calendar calendar, String str) {
            String lowerCase = str.toLowerCase(this.b);
            HashMap map = this.c;
            Integer num = (Integer) map.get(lowerCase);
            if (num != null) {
                calendar.set(this.f26881a, num.intValue());
                return;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.append(" not in (");
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(' ');
            }
            sb.setCharAt(sb.length() - 1, ')');
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static class CopyQuotedStrategy extends Strategy {

        /* renamed from: a, reason: collision with root package name */
        public final String f26882a;

        public CopyQuotedStrategy(String str) {
            this.f26882a = str;
        }

        @Override // org.sqlite.date.FastDateParser.Strategy
        public final boolean a(FastDateParser fastDateParser, StringBuilder sb) {
            FastDateParser.a(this.f26882a, sb, true);
            return false;
        }

        @Override // org.sqlite.date.FastDateParser.Strategy
        public final boolean b() {
            String str = this.f26882a;
            char cCharAt = str.charAt(0);
            if (cCharAt == '\'') {
                cCharAt = str.charAt(1);
            }
            return Character.isDigit(cCharAt);
        }
    }

    public static class ISO8601TimeZoneStrategy extends Strategy {
        public static final ISO8601TimeZoneStrategy b = new ISO8601TimeZoneStrategy("(Z|(?:[+-]\\d{2}))");
        public static final ISO8601TimeZoneStrategy c = new ISO8601TimeZoneStrategy("(Z|(?:[+-]\\d{2}\\d{2}))");
        public static final ISO8601TimeZoneStrategy d = new ISO8601TimeZoneStrategy("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

        /* renamed from: a, reason: collision with root package name */
        public final String f26883a;

        public ISO8601TimeZoneStrategy(String str) {
            this.f26883a = str;
        }

        @Override // org.sqlite.date.FastDateParser.Strategy
        public final boolean a(FastDateParser fastDateParser, StringBuilder sb) {
            sb.append(this.f26883a);
            return true;
        }

        @Override // org.sqlite.date.FastDateParser.Strategy
        public final void c(FastDateParser fastDateParser, Calendar calendar, String str) {
            if (str.equals("Z")) {
                calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
            } else {
                calendar.setTimeZone(TimeZone.getTimeZone("GMT".concat(str)));
            }
        }
    }

    public static class NumberStrategy extends Strategy {

        /* renamed from: a, reason: collision with root package name */
        public final int f26884a;

        public NumberStrategy(int i) {
            this.f26884a = i;
        }

        @Override // org.sqlite.date.FastDateParser.Strategy
        public final boolean a(FastDateParser fastDateParser, StringBuilder sb) {
            Strategy strategy = fastDateParser.l;
            if (strategy == null || !strategy.b()) {
                sb.append("(\\p{Nd}++)");
                return true;
            }
            sb.append("(\\p{Nd}{");
            sb.append(fastDateParser.k.length());
            sb.append("}+)");
            return true;
        }

        @Override // org.sqlite.date.FastDateParser.Strategy
        public final boolean b() {
            return true;
        }

        @Override // org.sqlite.date.FastDateParser.Strategy
        public void c(FastDateParser fastDateParser, Calendar calendar, String str) {
            calendar.set(this.f26884a, d(Integer.parseInt(str)));
        }

        public int d(int i) {
            return i;
        }
    }

    public static abstract class Strategy {
        public abstract boolean a(FastDateParser fastDateParser, StringBuilder sb);

        public boolean b() {
            return false;
        }

        public void c(FastDateParser fastDateParser, Calendar calendar, String str) {
        }
    }

    public static class TimeZoneStrategy extends Strategy {

        /* renamed from: a, reason: collision with root package name */
        public final String f26885a;
        public final TreeMap b = new TreeMap(String.CASE_INSENSITIVE_ORDER);

        public TimeZoneStrategy(Locale locale) {
            for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
                if (!strArr[0].startsWith("GMT")) {
                    TimeZone timeZone = TimeZone.getTimeZone(strArr[0]);
                    if (!this.b.containsKey(strArr[1])) {
                        this.b.put(strArr[1], timeZone);
                    }
                    if (!this.b.containsKey(strArr[2])) {
                        this.b.put(strArr[2], timeZone);
                    }
                    if (timeZone.useDaylightTime()) {
                        if (!this.b.containsKey(strArr[3])) {
                            this.b.put(strArr[3], timeZone);
                        }
                        if (!this.b.containsKey(strArr[4])) {
                            this.b.put(strArr[4], timeZone);
                        }
                    }
                }
            }
            StringBuilder sbS = a.s("(GMT[+-]\\d{1,2}:\\d{2}|[+-]\\d{4}|");
            Iterator it = this.b.keySet().iterator();
            while (it.hasNext()) {
                FastDateParser.a((String) it.next(), sbS, false);
                sbS.append('|');
            }
            sbS.setCharAt(sbS.length() - 1, ')');
            this.f26885a = sbS.toString();
        }

        @Override // org.sqlite.date.FastDateParser.Strategy
        public final boolean a(FastDateParser fastDateParser, StringBuilder sb) {
            sb.append(this.f26885a);
            return true;
        }

        @Override // org.sqlite.date.FastDateParser.Strategy
        public final void c(FastDateParser fastDateParser, Calendar calendar, String str) {
            TimeZone timeZone;
            if (str.charAt(0) == '+' || str.charAt(0) == '-') {
                timeZone = TimeZone.getTimeZone("GMT".concat(str));
            } else if (str.startsWith("GMT")) {
                timeZone = TimeZone.getTimeZone(str);
            } else {
                timeZone = (TimeZone) this.b.get(str);
                if (timeZone == null) {
                    throw new IllegalArgumentException(str.concat(" is not a supported timezone name"));
                }
            }
            calendar.setTimeZone(timeZone);
        }
    }

    public FastDateParser(String str, Locale locale, TimeZone timeZone) {
        int i;
        this.d = str;
        this.e = timeZone;
        this.f = locale;
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        if (locale.equals(m)) {
            i = 0;
        } else {
            calendar.setTime(new Date());
            i = calendar.get(1) - 80;
        }
        int i2 = (i / 100) * 100;
        this.g = i2;
        this.h = i - i2;
        d(calendar);
    }

    public static void a(String str, StringBuilder sb, boolean z2) {
        sb.append("\\Q");
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\'') {
                if (cCharAt == '\\' && (i = i + 1) != str.length()) {
                    sb.append(cCharAt);
                    cCharAt = str.charAt(i);
                    if (cCharAt == 'E') {
                        sb.append("E\\\\E\\");
                        cCharAt = 'Q';
                    }
                }
            } else if (z2) {
                i++;
                if (i == str.length()) {
                    return;
                } else {
                    cCharAt = str.charAt(i);
                }
            } else {
                continue;
            }
            sb.append(cCharAt);
            i++;
        }
        sb.append("\\E");
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        d(Calendar.getInstance(this.e, this.f));
    }

    public final Strategy b(int i, Calendar calendar) {
        ConcurrentMap concurrentMap;
        ConcurrentMap[] concurrentMapArr = o;
        synchronized (concurrentMapArr) {
            try {
                if (concurrentMapArr[i] == null) {
                    concurrentMapArr[i] = new ConcurrentHashMap(3);
                }
                concurrentMap = concurrentMapArr[i];
            } catch (Throwable th) {
                throw th;
            }
        }
        Strategy strategy = (Strategy) concurrentMap.get(this.f);
        if (strategy != null) {
            return strategy;
        }
        Strategy timeZoneStrategy = i == 15 ? new TimeZoneStrategy(this.f) : new CaseInsensitiveTextStrategy(i, calendar, this.f);
        Strategy strategy2 = (Strategy) concurrentMap.putIfAbsent(this.f, timeZoneStrategy);
        return strategy2 != null ? strategy2 : timeZoneStrategy;
    }

    public final Strategy c(String str, Calendar calendar) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'W') {
            return t;
        }
        if (cCharAt == 'X') {
            int length = str.length();
            if (length == 1) {
                return ISO8601TimeZoneStrategy.b;
            }
            if (length == 2) {
                return ISO8601TimeZoneStrategy.c;
            }
            if (length == 3) {
                return ISO8601TimeZoneStrategy.d;
            }
            throw new IllegalArgumentException("invalid number of X");
        }
        if (cCharAt == 'y') {
            return str.length() > 2 ? r : p;
        }
        if (cCharAt != 'z') {
            switch (cCharAt) {
                case '\'':
                    if (str.length() > 2) {
                        return new CopyQuotedStrategy(androidx.compose.ui.input.pointer.a.h(1, 1, str));
                    }
                    return new CopyQuotedStrategy(str);
                case 'K':
                    return A;
                case 'M':
                    return str.length() >= 3 ? b(2, calendar) : q;
                case 'S':
                    return D;
                case 'Z':
                    if (str.equals("ZZ")) {
                        return E;
                    }
                    break;
                case 'a':
                    return b(9, calendar);
                case 'd':
                    return v;
                case 'h':
                    return z;
                case 'k':
                    return y;
                case 'm':
                    return B;
                case 's':
                    return C;
                case 'w':
                    return s;
                default:
                    switch (cCharAt) {
                        case 'D':
                            return u;
                        case 'E':
                            return b(7, calendar);
                        case 'F':
                            return w;
                        case 'G':
                            return b(0, calendar);
                        case 'H':
                            return x;
                        default:
                            return new CopyQuotedStrategy(str);
                    }
            }
        }
        return b(15, calendar);
    }

    public final void d(Calendar calendar) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        Pattern pattern = n;
        String str = this.d;
        Matcher matcher = pattern.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("Illegal pattern character '" + str.charAt(matcher.regionStart()) + "'");
        }
        String strGroup = matcher.group();
        this.k = strGroup;
        Strategy strategyC = c(strGroup, calendar);
        while (true) {
            matcher.region(matcher.end(), matcher.regionEnd());
            if (!matcher.lookingAt()) {
                break;
            }
            String strGroup2 = matcher.group();
            this.l = c(strGroup2, calendar);
            if (strategyC.a(this, sb)) {
                arrayList.add(strategyC);
            }
            this.k = strGroup2;
            strategyC = this.l;
        }
        this.l = null;
        if (matcher.regionStart() != matcher.regionEnd()) {
            StringBuilder sbU = a.u("Failed to parse \"", str, "\" ; gave up at index ");
            sbU.append(matcher.regionStart());
            throw new IllegalArgumentException(sbU.toString());
        }
        if (strategyC.a(this, sb)) {
            arrayList.add(strategyC);
        }
        this.k = null;
        this.j = (Strategy[]) arrayList.toArray(new Strategy[arrayList.size()]);
        this.i = Pattern.compile(sb.toString());
    }

    public final Date e(String str, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        Matcher matcher = this.i.matcher(str.substring(index));
        if (!matcher.lookingAt()) {
            return null;
        }
        Calendar calendar = Calendar.getInstance(this.e, this.f);
        calendar.clear();
        int i = 0;
        while (true) {
            Strategy[] strategyArr = this.j;
            if (i >= strategyArr.length) {
                parsePosition.setIndex(matcher.end() + index);
                return calendar.getTime();
            }
            int i2 = i + 1;
            strategyArr[i].c(this, calendar, matcher.group(i2));
            i = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FastDateParser)) {
            return false;
        }
        FastDateParser fastDateParser = (FastDateParser) obj;
        return this.d.equals(fastDateParser.d) && this.e.equals(fastDateParser.e) && this.f.equals(fastDateParser.f);
    }

    public final int hashCode() {
        return (((this.f.hashCode() * 13) + this.e.hashCode()) * 13) + this.d.hashCode();
    }

    public final String toString() {
        return "FastDateParser[" + this.d + "," + this.f + "," + this.e.getID() + "]";
    }
}
