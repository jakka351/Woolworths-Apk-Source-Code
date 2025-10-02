package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Immutable
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class MessageDigestHashFunction extends AbstractHashFunction implements Serializable {
    public final MessageDigest d;
    public final int e;
    public final String f;

    public static final class MessageDigestHasher extends AbstractByteHasher {
    }

    public static final class SerializedForm implements Serializable {
        public final String d;
        public final int e;
        public final String f;

        public SerializedForm(String str, int i, String str2) {
            this.d = str;
            this.e = i;
            this.f = str2;
        }

        private Object readResolve() {
            return new MessageDigestHashFunction(this.d, this.e, this.f);
        }
    }

    public MessageDigestHashFunction(String str, int i, String str2) throws NoSuchAlgorithmException, CloneNotSupportedException {
        str2.getClass();
        this.f = str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            this.d = messageDigest;
            int digestLength = messageDigest.getDigestLength();
            Preconditions.d("bytes (%s) must be >= 4 and < %s", i, digestLength, i >= 4 && i <= digestLength);
            this.e = i;
            try {
                messageDigest.clone();
            } catch (CloneNotSupportedException unused) {
            }
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final String toString() {
        return this.f;
    }

    public Object writeReplace() {
        return new SerializedForm(this.d.getAlgorithm(), this.e, this.f);
    }

    public MessageDigestHashFunction(String str, String str2) throws NoSuchAlgorithmException, CloneNotSupportedException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            this.d = messageDigest;
            this.e = messageDigest.getDigestLength();
            this.f = str2;
            try {
                messageDigest.clone();
            } catch (CloneNotSupportedException unused) {
            }
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
