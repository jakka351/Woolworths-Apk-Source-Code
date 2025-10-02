package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.SerializableString;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class SerializedString implements SerializableString, Serializable {
    public static final JsonStringEncoder i = JsonStringEncoder.c;
    public final String d;
    public byte[] e;
    public byte[] f;
    public char[] g;
    public transient String h;

    public SerializedString(String str) {
        if (str == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this.d = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        this.h = objectInputStream.readUTF();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this.d);
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final int a(int i2, byte[] bArr) {
        byte[] bArrE = this.e;
        if (bArrE == null) {
            i.getClass();
            bArrE = JsonStringEncoder.e(this.d);
            this.e = bArrE;
        }
        int length = bArrE.length;
        if (i2 + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrE, 0, bArr, i2, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final char[] b() {
        char[] cArr = this.g;
        if (cArr != null) {
            return cArr;
        }
        i.getClass();
        char[] cArrD = JsonStringEncoder.d(this.d);
        this.g = cArrD;
        return cArrD;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final byte[] c() {
        byte[] bArr = this.e;
        if (bArr != null) {
            return bArr;
        }
        i.getClass();
        byte[] bArrE = JsonStringEncoder.e(this.d);
        this.e = bArrE;
        return bArrE;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final int d(char[] cArr, int i2) {
        String str = this.d;
        int length = str.length();
        if (i2 + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i2);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final int e(int i2, byte[] bArr) {
        byte[] bArrC = this.f;
        if (bArrC == null) {
            i.getClass();
            bArrC = JsonStringEncoder.c(this.d);
            this.f = bArrC;
        }
        int length = bArrC.length;
        if (i2 + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrC, 0, bArr, i2, length);
        return length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.d.equals(((SerializedString) obj).d);
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final int f(char[] cArr, int i2) {
        char[] cArrD = this.g;
        if (cArrD == null) {
            i.getClass();
            cArrD = JsonStringEncoder.d(this.d);
            this.g = cArrD;
        }
        int length = cArrD.length;
        if (i2 + length > cArr.length) {
            return -1;
        }
        System.arraycopy(cArrD, 0, cArr, i2, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final byte[] g() {
        byte[] bArr = this.f;
        if (bArr != null) {
            return bArr;
        }
        i.getClass();
        byte[] bArrC = JsonStringEncoder.c(this.d);
        this.f = bArrC;
        return bArrC;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final String getValue() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public Object readResolve() {
        return new SerializedString(this.h);
    }

    public final String toString() {
        return this.d;
    }
}
