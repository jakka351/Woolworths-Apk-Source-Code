package com.google.firebase.firestore.remote;

import android.util.Base64;
import com.google.protobuf.ByteString;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes6.dex */
public final class BloomFilter {

    /* renamed from: a, reason: collision with root package name */
    public final int f15565a;
    public final ByteString b;
    public final int c;
    public final MessageDigest d;

    public static final class BloomFilterCreateException extends Exception {
    }

    public BloomFilter(ByteString byteString, int i, int i2) {
        if (i < 0 || i >= 8) {
            throw new IllegalArgumentException(YU.a.d(i, "Invalid padding: "));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(YU.a.d(i2, "Invalid hash count: "));
        }
        if (byteString.size() > 0 && i2 == 0) {
            throw new IllegalArgumentException(YU.a.d(i2, "Invalid hash count: "));
        }
        if (byteString.size() == 0 && i != 0) {
            throw new IllegalArgumentException(YU.a.d(i, "Expected padding of 0 when bitmap length is 0, but got "));
        }
        this.b = byteString;
        this.c = i2;
        this.f15565a = (byteString.size() * 8) - i;
        try {
            this.d = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Missing MD5 MessageDigest provider: ", e);
        }
    }

    public static BloomFilter a(ByteString byteString, int i, int i2) {
        if (i < 0 || i >= 8) {
            throw new BloomFilterCreateException(YU.a.d(i, "Invalid padding: "));
        }
        if (i2 < 0) {
            throw new BloomFilterCreateException(YU.a.d(i2, "Invalid hash count: "));
        }
        if (byteString.size() > 0 && i2 == 0) {
            throw new BloomFilterCreateException(YU.a.d(i2, "Invalid hash count: "));
        }
        if (byteString.size() != 0 || i == 0) {
            return new BloomFilter(byteString, i, i2);
        }
        throw new BloomFilterCreateException(YU.a.d(i, "Expected padding of 0 when bitmap length is 0, but got "));
    }

    public static long b(int i, byte[] bArr) {
        long j = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            j |= (bArr[i + i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public final String toString() {
        return "BloomFilter{hashCount=" + this.c + ", size=" + this.f15565a + ", bitmap=\"" + Base64.encodeToString(this.b.y(), 2) + "\"}";
    }
}
