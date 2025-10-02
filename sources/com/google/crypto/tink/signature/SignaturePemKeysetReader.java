package com.google.crypto.tink.signature;

import com.google.crypto.tink.KeysetReader;
import com.google.crypto.tink.subtle.Enums;

/* loaded from: classes6.dex */
public final class SignaturePemKeysetReader implements KeysetReader {

    /* renamed from: com.google.crypto.tink.signature.SignaturePemKeysetReader$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15126a;

        static {
            int[] iArr = new int[Enums.HashType.values().length];
            f15126a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15126a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15126a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class Builder {
    }

    public static final class PemKey {
    }
}
