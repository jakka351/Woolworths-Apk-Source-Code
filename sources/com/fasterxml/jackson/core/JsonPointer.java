package com.fasterxml.jackson.core;

import YU.a;
import com.fasterxml.jackson.core.io.NumberInput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class JsonPointer implements Serializable {
    public static final JsonPointer j = new JsonPointer();
    public final JsonPointer d;
    public final String e;
    public final int f;
    public final String g;
    public final int h;
    public int i;

    public static class PointerParent {

        /* renamed from: a, reason: collision with root package name */
        public final PointerParent f14192a;
        public final int b;
        public final String c;

        public PointerParent(PointerParent pointerParent, int i, String str) {
            this.f14192a = pointerParent;
            this.b = i;
            this.c = str;
        }
    }

    public static class PointerSegment {
    }

    public static class Serialization implements Externalizable {
        public String d;

        private Object readResolve() throws ObjectStreamException {
            String str = this.d;
            JsonPointer jsonPointer = JsonPointer.j;
            if (str == null || str.length() == 0) {
                return jsonPointer;
            }
            if (str.charAt(0) != '/') {
                throw new IllegalArgumentException(a.h("Invalid input: JSON Pointer expression must start with '/': \"", str, "\""));
            }
            int length = str.length();
            int i = 0;
            int i2 = 1;
            PointerParent pointerParent = null;
            while (i2 < length) {
                char cCharAt = str.charAt(i2);
                if (cCharAt == '/') {
                    PointerParent pointerParent2 = new PointerParent(pointerParent, i, str.substring(i + 1, i2));
                    i = i2;
                    i2++;
                    pointerParent = pointerParent2;
                } else {
                    int i3 = i2 + 1;
                    if (cCharAt != '~' || i3 >= length) {
                        i2 = i3;
                    } else {
                        StringBuilder sb = new StringBuilder(32);
                        int i4 = i + 1;
                        int length2 = str.length();
                        if (i2 - i4 > 0) {
                            sb.append((CharSequence) str, i4, i2);
                        }
                        int i5 = i2 + 2;
                        char cCharAt2 = str.charAt(i3);
                        if (cCharAt2 == '0') {
                            cCharAt2 = '~';
                        } else if (cCharAt2 == '1') {
                            cCharAt2 = '/';
                        } else {
                            sb.append('~');
                        }
                        sb.append(cCharAt2);
                        while (true) {
                            if (i5 >= length2) {
                                i5 = -1;
                                break;
                            }
                            char cCharAt3 = str.charAt(i5);
                            if (cCharAt3 == '/') {
                                break;
                            }
                            int i6 = i5 + 1;
                            if (cCharAt3 != '~' || i6 >= length2) {
                                sb.append(cCharAt3);
                                i5 = i6;
                            } else {
                                i5 += 2;
                                char cCharAt4 = str.charAt(i6);
                                if (cCharAt4 == '0') {
                                    cCharAt4 = '~';
                                } else if (cCharAt4 == '1') {
                                    cCharAt4 = '/';
                                } else {
                                    sb.append('~');
                                }
                                sb.append(cCharAt4);
                            }
                        }
                        String string = sb.toString();
                        if (i5 < 0) {
                            JsonPointer jsonPointer2 = new JsonPointer(str, i, string, jsonPointer);
                            while (pointerParent != null) {
                                JsonPointer jsonPointer3 = new JsonPointer(str, pointerParent.b, pointerParent.c, jsonPointer2);
                                pointerParent = pointerParent.f14192a;
                                jsonPointer2 = jsonPointer3;
                            }
                            return jsonPointer2;
                        }
                        PointerParent pointerParent3 = new PointerParent(pointerParent, i, string);
                        i = i5;
                        i2 = i5 + 1;
                        pointerParent = pointerParent3;
                    }
                }
            }
            JsonPointer jsonPointer4 = new JsonPointer(str, i, str.substring(i + 1), jsonPointer);
            while (pointerParent != null) {
                JsonPointer jsonPointer5 = new JsonPointer(str, pointerParent.b, pointerParent.c, jsonPointer4);
                pointerParent = pointerParent.f14192a;
                jsonPointer4 = jsonPointer5;
            }
            return jsonPointer4;
        }

        @Override // java.io.Externalizable
        public final void readExternal(ObjectInput objectInput) {
            this.d = objectInput.readUTF();
        }

        @Override // java.io.Externalizable
        public final void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeUTF(this.d);
        }
    }

    public JsonPointer() {
        this.d = null;
        this.g = null;
        this.h = -1;
        this.e = "";
        this.f = 0;
    }

    private Object writeReplace() {
        String string = toString();
        Serialization serialization = new Serialization();
        serialization.d = string;
        return serialization;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonPointer)) {
            return false;
        }
        JsonPointer jsonPointer = (JsonPointer) obj;
        String str = jsonPointer.e;
        int i = jsonPointer.f;
        String str2 = this.e;
        int length = str2.length();
        int i2 = this.f;
        if (length - i2 == str.length() - i) {
            while (i2 < length) {
                int i3 = i2 + 1;
                int i4 = i + 1;
                if (str2.charAt(i2) == str.charAt(i)) {
                    i2 = i3;
                    i = i4;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.i;
        if (iHashCode == 0) {
            iHashCode = toString().hashCode();
            if (iHashCode == 0) {
                iHashCode = -1;
            }
            this.i = iHashCode;
        }
        return iHashCode;
    }

    public final String toString() {
        String str = this.e;
        int i = this.f;
        return i <= 0 ? str : str.substring(i);
    }

    public JsonPointer(String str, int i, String str2, JsonPointer jsonPointer) {
        this.e = str;
        this.f = i;
        this.d = jsonPointer;
        this.g = str2;
        int length = str2.length();
        int iD = -1;
        if (length != 0 && length <= 10) {
            char cCharAt = str2.charAt(0);
            int i2 = 1;
            if (cCharAt <= '0') {
                if (length == 1 && cCharAt == '0') {
                    iD = 0;
                }
            } else if (cCharAt <= '9') {
                while (true) {
                    if (i2 < length) {
                        char cCharAt2 = str2.charAt(i2);
                        if (cCharAt2 > '9' || cCharAt2 < '0') {
                            break;
                        } else {
                            i2++;
                        }
                    } else if (length != 10 || NumberInput.f(str2) <= 2147483647L) {
                        iD = NumberInput.d(str2);
                    }
                }
            }
        }
        this.h = iD;
    }
}
