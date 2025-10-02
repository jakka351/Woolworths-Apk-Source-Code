package com.google.crypto.tink.subtle;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class Random {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f15159a = new AnonymousClass1();

    /* renamed from: com.google.crypto.tink.subtle.Random$1, reason: invalid class name */
    public class AnonymousClass1 extends ThreadLocal<SecureRandom> {
        @Override // java.lang.ThreadLocal
        public final SecureRandom initialValue() {
            ThreadLocal threadLocal = Random.f15159a;
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextLong();
            return secureRandom;
        }
    }

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f15159a.get()).nextBytes(bArr);
        return bArr;
    }
}
