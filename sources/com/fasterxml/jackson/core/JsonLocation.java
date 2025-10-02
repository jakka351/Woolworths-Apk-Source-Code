package com.fasterxml.jackson.core;

import androidx.compose.ui.input.pointer.a;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.ContentReference;
import java.io.Serializable;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public class JsonLocation implements Serializable {
    public static final JsonLocation j = new JsonLocation(ContentReference.h, -1, -1, -1, -1);
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final ContentReference h;
    public transient String i;

    public JsonLocation(ContentReference contentReference, long j2, long j3, int i, int i2) {
        this.h = contentReference == null ? ContentReference.h : contentReference;
        this.d = j2;
        this.e = j3;
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonLocation)) {
            return false;
        }
        JsonLocation jsonLocation = (JsonLocation) obj;
        ContentReference contentReference = jsonLocation.h;
        ContentReference contentReference2 = this.h;
        if (contentReference2 == null) {
            if (contentReference != null) {
                return false;
            }
        } else if (!contentReference2.equals(contentReference)) {
            return false;
        }
        return this.f == jsonLocation.f && this.g == jsonLocation.g && this.e == jsonLocation.e && this.d == jsonLocation.d;
    }

    public final int hashCode() {
        return ((((this.h == null ? 1 : 2) ^ this.f) + this.g) ^ ((int) this.e)) + ((int) this.d);
    }

    public final String toString() {
        String str;
        ContentReference contentReference = this.h;
        boolean z = contentReference.g;
        if (this.i == null) {
            StringBuilder sb = new StringBuilder(200);
            int length = contentReference.f;
            Object obj = contentReference.d;
            if (obj == null) {
                sb.append("UNKNOWN");
            } else {
                Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
                String name = cls.getName();
                if (name.startsWith("java.")) {
                    name = cls.getSimpleName();
                } else if (obj instanceof byte[]) {
                    name = "byte[]";
                } else if (obj instanceof char[]) {
                    name = "char[]";
                }
                sb.append('(');
                sb.append(name);
                sb.append(')');
                if (z) {
                    int[] iArr = {contentReference.e, length};
                    String str2 = " chars";
                    if (obj instanceof CharSequence) {
                        CharSequence charSequence = (CharSequence) obj;
                        ContentReference.a(charSequence.length(), iArr);
                        int i = iArr[0];
                        str = charSequence.subSequence(i, Math.min(iArr[1], 500) + i).toString();
                    } else if (obj instanceof char[]) {
                        char[] cArr = (char[]) obj;
                        ContentReference.a(cArr.length, iArr);
                        str = new String(cArr, iArr[0], Math.min(iArr[1], 500));
                    } else if (obj instanceof byte[]) {
                        byte[] bArr = (byte[]) obj;
                        ContentReference.a(bArr.length, iArr);
                        str2 = " bytes";
                        str = new String(bArr, iArr[0], Math.min(iArr[1], 500), Charset.forName("UTF-8"));
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        sb.append('\"');
                        int length2 = str.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            char cCharAt = str.charAt(i2);
                            if (!Character.isISOControl(cCharAt) || cCharAt == '\r' || cCharAt == '\n') {
                                sb.append(cCharAt);
                            } else {
                                sb.append("\\u");
                                char[] cArr2 = CharTypes.f14195a;
                                sb.append(cArr2[(cCharAt >> '\f') & 15]);
                                sb.append(cArr2[(cCharAt >> '\b') & 15]);
                                sb.append(cArr2[(cCharAt >> 4) & 15]);
                                sb.append(cArr2[cCharAt & 15]);
                            }
                        }
                        sb.append('\"');
                        if (iArr[1] > 500) {
                            sb.append("[truncated ");
                            sb.append(iArr[1] - 500);
                            sb.append(str2);
                            sb.append(']');
                        }
                    }
                } else if (obj instanceof byte[]) {
                    if (length < 0) {
                        length = ((byte[]) obj).length;
                    }
                    sb.append('[');
                    sb.append(length);
                    sb.append(" bytes]");
                }
            }
            this.i = sb.toString();
        }
        String str3 = this.i;
        StringBuilder sb2 = new StringBuilder(str3.length() + 40);
        a.w(sb2, "[Source: ", str3, "; ");
        int i3 = this.g;
        int i4 = this.f;
        if (z) {
            sb2.append("line: ");
            if (i4 >= 0) {
                sb2.append(i4);
            } else {
                sb2.append("UNKNOWN");
            }
            sb2.append(", column: ");
            if (i3 >= 0) {
                sb2.append(i3);
            } else {
                sb2.append("UNKNOWN");
            }
        } else if (i4 > 0) {
            sb2.append("line: ");
            sb2.append(i4);
            if (i3 > 0) {
                sb2.append(", column: ");
                sb2.append(i3);
            }
        } else {
            sb2.append("byte offset: #");
            long j2 = this.d;
            if (j2 >= 0) {
                sb2.append(j2);
            } else {
                sb2.append("UNKNOWN");
            }
        }
        sb2.append(']');
        return sb2.toString();
    }
}
