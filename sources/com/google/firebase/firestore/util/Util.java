package com.google.firebase.firestore.util;

import com.google.cloud.datastore.core.number.NumberComparisonHelper;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.protobuf.ByteString;
import io.grpc.Status;
import io.grpc.StatusException;
import java.security.SecureRandom;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class Util {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f15603a = 0;

    /* renamed from: com.google.firebase.firestore.util.Util$1, reason: invalid class name */
    class AnonymousClass1 implements Iterator<Object> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw null;
        }
    }

    static {
        new SecureRandom();
    }

    public static Object a(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static int b(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < iMin; i++) {
            int i2 = bArr[i] & 255;
            int i3 = bArr2[i] & 255;
            if (i2 < i3) {
                return -1;
            }
            if (i2 > i3) {
                return 1;
            }
        }
        return Integer.compare(bArr.length, bArr2.length);
    }

    public static int c(ByteString byteString, ByteString byteString2) {
        int iMin = Math.min(byteString.size(), byteString2.size());
        for (int i = 0; i < iMin; i++) {
            int iG = byteString.g(i) & 255;
            int iG2 = byteString2.g(i) & 255;
            if (iG < iG2) {
                return -1;
            }
            if (iG > iG2) {
                return 1;
            }
        }
        return Integer.compare(byteString.size(), byteString2.size());
    }

    public static int d(double d, long j) {
        if (Double.isNaN(d) || d < -9.223372036854776E18d) {
            return -1;
        }
        if (d >= 9.223372036854776E18d) {
            return 1;
        }
        int iCompare = Long.compare((long) d, j);
        return iCompare != 0 ? iCompare : NumberComparisonHelper.a(d, j);
    }

    public static int e(String str, String str2) {
        if (str == str2) {
            return 0;
        }
        int iMin = Math.min(str.length(), str2.length());
        for (int i = 0; i < iMin; i++) {
            char cCharAt = str.charAt(i);
            char cCharAt2 = str2.charAt(i);
            if (cCharAt != cCharAt2) {
                return Character.isSurrogate(cCharAt) == Character.isSurrogate(cCharAt2) ? Character.compare(cCharAt, cCharAt2) : Character.isSurrogate(cCharAt) ? 1 : -1;
            }
        }
        return Integer.compare(str.length(), str2.length());
    }

    public static FirebaseFirestoreException f(Status status) {
        status.getClass();
        StatusException statusException = new StatusException(status);
        String message = statusException.getMessage();
        FirebaseFirestoreException.Code code = (FirebaseFirestoreException.Code) FirebaseFirestoreException.Code.g.get(status.f23971a.d, FirebaseFirestoreException.Code.UNKNOWN);
        FirebaseFirestoreException firebaseFirestoreException = new FirebaseFirestoreException(message, statusException);
        Preconditions.a(message, "Provided message must not be null.");
        Assert.b(code != FirebaseFirestoreException.Code.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        Preconditions.a(code, "Provided code must not be null.");
        return firebaseFirestoreException;
    }

    public static StringBuilder g(int i, CharSequence charSequence, String str) {
        StringBuilder sb = new StringBuilder();
        if (i != 0) {
            sb.append(charSequence);
            for (int i2 = 1; i2 < i; i2++) {
                sb.append((CharSequence) str);
                sb.append(charSequence);
            }
        }
        return sb;
    }

    public static String h(ByteString byteString) {
        int size = byteString.size();
        StringBuilder sb = new StringBuilder(size * 2);
        for (int i = 0; i < size; i++) {
            byte bG = byteString.g(i);
            sb.append(Character.forDigit((bG & 255) >>> 4, 16));
            sb.append(Character.forDigit(bG & 15, 16));
        }
        return sb.toString();
    }
}
