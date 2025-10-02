package com.fasterxml.jackson.databind.util;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

@Deprecated
/* loaded from: classes4.dex */
public class ISO8601DateFormat extends DateFormat {
    @Override // java.text.DateFormat, java.text.Format
    public final Object clone() {
        return this;
    }

    @Override // java.text.DateFormat
    public final StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        TimeZone timeZone = ISO8601Utils.f14333a;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(30);
        sb.append(String.format("%04d-%02d-%02dT%02d:%02d:%02d", Integer.valueOf(gregorianCalendar.get(1)), Integer.valueOf(gregorianCalendar.get(2) + 1), Integer.valueOf(gregorianCalendar.get(5)), Integer.valueOf(gregorianCalendar.get(11)), Integer.valueOf(gregorianCalendar.get(12)), Integer.valueOf(gregorianCalendar.get(13))));
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            sb.append(String.format("%c%02d:%02d", Character.valueOf(offset < 0 ? '-' : '+'), Integer.valueOf(Math.abs(i / 60)), Integer.valueOf(Math.abs(i % 60))));
        } else {
            sb.append(Matrix.MATRIX_TYPE_ZERO);
        }
        stringBuffer.append(sb.toString());
        return stringBuffer;
    }

    @Override // java.text.DateFormat
    public final Date parse(String str, ParsePosition parsePosition) {
        try {
            return ISO8601Utils.b(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // java.text.DateFormat
    public final Date parse(String str) {
        return ISO8601Utils.b(str, new ParsePosition(0));
    }
}
