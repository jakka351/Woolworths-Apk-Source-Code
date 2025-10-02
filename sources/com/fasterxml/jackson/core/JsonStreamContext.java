package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharTypes;
import com.medallia.digital.mobilesdk.q2;

/* loaded from: classes4.dex */
public abstract class JsonStreamContext {

    /* renamed from: a, reason: collision with root package name */
    public int f14193a;
    public int b;

    public JsonStreamContext(JsonStreamContext jsonStreamContext) {
        this.f14193a = jsonStreamContext.f14193a;
        this.b = jsonStreamContext.b;
    }

    public abstract String a();

    public Object b() {
        return null;
    }

    public abstract JsonStreamContext c();

    public final boolean d() {
        return this.f14193a == 1;
    }

    public final boolean e() {
        return this.f14193a == 2;
    }

    public final boolean f() {
        return this.f14193a == 0;
    }

    public void g(Object obj) {
    }

    public final String h() {
        int i = this.f14193a;
        return i != 0 ? i != 1 ? i != 2 ? "?" : "Object" : "Array" : "root";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this.f14193a;
        if (i != 0) {
            if (i != 1) {
                sb.append('{');
                String strA = a();
                if (strA != null) {
                    sb.append('\"');
                    int[] iArr = CharTypes.j;
                    int length = iArr.length;
                    int length2 = strA.length();
                    while (i < length2) {
                        char cCharAt = strA.charAt(i);
                        if (cCharAt >= length || iArr[cCharAt] == 0) {
                            sb.append(cCharAt);
                        } else {
                            sb.append('\\');
                            int i2 = iArr[cCharAt];
                            if (i2 < 0) {
                                sb.append("u00");
                                char[] cArr = CharTypes.f14195a;
                                sb.append(cArr[cCharAt >> 4]);
                                sb.append(cArr[cCharAt & 15]);
                            } else {
                                sb.append((char) i2);
                            }
                        }
                        i++;
                    }
                    sb.append('\"');
                } else {
                    sb.append('?');
                }
                sb.append('}');
            } else {
                sb.append('[');
                int i3 = this.b;
                sb.append(i3 >= 0 ? i3 : 0);
                sb.append(']');
            }
        } else {
            sb.append(q2.c);
        }
        return sb.toString();
    }

    public JsonStreamContext(int i) {
        this.f14193a = i;
        this.b = -1;
    }
}
