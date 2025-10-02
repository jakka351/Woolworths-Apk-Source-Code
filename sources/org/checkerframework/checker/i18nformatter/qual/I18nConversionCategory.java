package org.checkerframework.checker.i18nformatter.qual;

import java.util.Date;
import java.util.StringJoiner;

/* loaded from: classes8.dex */
public enum I18nConversionCategory {
    /* JADX INFO: Fake field, exist only in values array */
    UNUSED(null),
    /* JADX INFO: Fake field, exist only in values array */
    GENERAL(null),
    /* JADX INFO: Fake field, exist only in values array */
    DATE(new Class[]{Date.class, Number.class}),
    /* JADX INFO: Fake field, exist only in values array */
    NUMBER(new Class[]{Number.class});

    public final Class[] d;

    I18nConversionCategory(Class[] clsArr) {
        this.d = clsArr;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder(name());
        Class[] clsArr = this.d;
        if (clsArr == null) {
            sb.append(" conversion category (all types)");
        } else {
            StringJoiner stringJoiner = new StringJoiner(", ", " conversion category (one of: ", ")");
            for (Class cls : clsArr) {
                stringJoiner.add(cls.getCanonicalName());
            }
            sb.append(stringJoiner);
        }
        return sb.toString();
    }
}
