package com.fasterxml.jackson.core;

/* loaded from: classes4.dex */
public enum JsonToken {
    NOT_AVAILABLE(null, -1),
    START_OBJECT("{", 1),
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME(null, 5),
    VALUE_EMBEDDED_OBJECT(null, 12),
    VALUE_STRING(null, 6),
    VALUE_NUMBER_INT(null, 7),
    VALUE_NUMBER_FLOAT(null, 8),
    VALUE_TRUE("true", 9),
    VALUE_FALSE("false", 10),
    VALUE_NULL("null", 11);

    public final String d;
    public final char[] e;
    public final byte[] f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    JsonToken(String str, int i) {
        boolean z = false;
        if (str == null) {
            this.d = null;
            this.e = null;
            this.f = null;
        } else {
            this.d = str;
            char[] charArray = str.toCharArray();
            this.e = charArray;
            int length = charArray.length;
            this.f = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                this.f[i2] = (byte) this.e[i2];
            }
        }
        this.g = i;
        if (i != 10) {
        }
        this.j = i == 7 || i == 8;
        boolean z2 = i == 1 || i == 3;
        this.h = z2;
        boolean z3 = i == 2 || i == 4;
        this.i = z3;
        if (!z2 && !z3 && i != 5 && i != -1) {
            z = true;
        }
        this.k = z;
    }
}
