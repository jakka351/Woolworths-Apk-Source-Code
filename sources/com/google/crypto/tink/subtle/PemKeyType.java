package com.google.crypto.tink.subtle;

import com.google.crypto.tink.subtle.Enums;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes6.dex */
public final class PemKeyType {
    public static final /* synthetic */ PemKeyType[] d;

    /* JADX INFO: Fake field, exist only in values array */
    PemKeyType EF0;

    static {
        Enums.HashType hashType = Enums.HashType.e;
        PemKeyType pemKeyType = new PemKeyType("RSA_PSS_2048_SHA256", 0, "RSA", "RSASSA-PSS", 2048, hashType);
        PemKeyType pemKeyType2 = new PemKeyType("RSA_PSS_3072_SHA256", 1, "RSA", "RSASSA-PSS", 3072, hashType);
        PemKeyType pemKeyType3 = new PemKeyType("RSA_PSS_4096_SHA256", 2, "RSA", "RSASSA-PSS", 4096, hashType);
        Enums.HashType hashType2 = Enums.HashType.g;
        d = new PemKeyType[]{pemKeyType, pemKeyType2, pemKeyType3, new PemKeyType("RSA_PSS_4096_SHA512", 3, "RSA", "RSASSA-PSS", 4096, hashType2), new PemKeyType("RSA_SIGN_PKCS1_2048_SHA256", 4, "RSA", "RSASSA-PKCS1-v1_5", 2048, hashType), new PemKeyType("RSA_SIGN_PKCS1_3072_SHA256", 5, "RSA", "RSASSA-PKCS1-v1_5", 3072, hashType), new PemKeyType("RSA_SIGN_PKCS1_4096_SHA256", 6, "RSA", "RSASSA-PKCS1-v1_5", 4096, hashType), new PemKeyType("RSA_SIGN_PKCS1_4096_SHA512", 7, "RSA", "RSASSA-PKCS1-v1_5", 4096, hashType2), new PemKeyType("ECDSA_P256_SHA256", 8, "EC", "ECDSA", 256, hashType), new PemKeyType("ECDSA_P384_SHA384", 9, "EC", "ECDSA", KyberEngine.KyberPolyBytes, Enums.HashType.f), new PemKeyType("ECDSA_P521_SHA512", 10, "EC", "ECDSA", 521, hashType2)};
    }

    public PemKeyType(String str, int i, String str2, String str3, int i2, Enums.HashType hashType) {
    }

    public static PemKeyType valueOf(String str) {
        return (PemKeyType) Enum.valueOf(PemKeyType.class, str);
    }

    public static PemKeyType[] values() {
        return (PemKeyType[]) d.clone();
    }
}
