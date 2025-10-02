package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.primitives.ImmutableLongArray;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes6.dex */
public class AtomicDoubleArray implements Serializable {
    public transient AtomicLongArray d;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        ImmutableLongArray.Builder builder = new ImmutableLongArray.Builder();
        builder.b = 0;
        builder.f14940a = new long[10];
        for (int i2 = 0; i2 < i; i2++) {
            long jDoubleToRawLongBits = Double.doubleToRawLongBits(objectInputStream.readDouble());
            int i3 = builder.b;
            int i4 = i3 + 1;
            long[] jArr = builder.f14940a;
            if (i4 > jArr.length) {
                int length = jArr.length;
                if (i4 < 0) {
                    throw new AssertionError("cannot store more than MAX_VALUE elements");
                }
                int iHighestOneBit = length + (length >> 1) + 1;
                if (iHighestOneBit < i4) {
                    iHighestOneBit = Integer.highestOneBit(i3) << 1;
                }
                if (iHighestOneBit < 0) {
                    iHighestOneBit = Integer.MAX_VALUE;
                }
                builder.f14940a = Arrays.copyOf(jArr, iHighestOneBit);
            }
            long[] jArr2 = builder.f14940a;
            int i5 = builder.b;
            jArr2[i5] = jDoubleToRawLongBits;
            builder.b = i5 + 1;
        }
        int i6 = builder.b;
        ImmutableLongArray immutableLongArray = i6 == 0 ? ImmutableLongArray.g : new ImmutableLongArray(builder.f14940a, 0, i6);
        this.d = new AtomicLongArray(Arrays.copyOfRange(immutableLongArray.d, immutableLongArray.e, immutableLongArray.f));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int length = this.d.length();
        objectOutputStream.writeInt(length);
        for (int i = 0; i < length; i++) {
            objectOutputStream.writeDouble(Double.longBitsToDouble(this.d.get(i)));
        }
    }

    public final String toString() {
        int length = this.d.length();
        int i = length - 1;
        if (i == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(length * 19);
        sb.append('[');
        int i2 = 0;
        while (true) {
            sb.append(Double.longBitsToDouble(this.d.get(i2)));
            if (i2 == i) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            i2++;
        }
    }
}
