package com.google.crypto.tink.subtle;

/* loaded from: classes6.dex */
public final class Enums {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class HashType {
        public static final HashType d;
        public static final HashType e;
        public static final HashType f;
        public static final HashType g;
        public static final /* synthetic */ HashType[] h;

        static {
            HashType hashType = new HashType("SHA1", 0);
            d = hashType;
            HashType hashType2 = new HashType("SHA256", 1);
            e = hashType2;
            HashType hashType3 = new HashType("SHA384", 2);
            f = hashType3;
            HashType hashType4 = new HashType("SHA512", 3);
            g = hashType4;
            h = new HashType[]{hashType, hashType2, hashType3, hashType4};
        }

        public static HashType valueOf(String str) {
            return (HashType) Enum.valueOf(HashType.class, str);
        }

        public static HashType[] values() {
            return (HashType[]) h.clone();
        }
    }
}
