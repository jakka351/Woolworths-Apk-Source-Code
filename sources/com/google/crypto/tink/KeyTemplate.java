package com.google.crypto.tink;

import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.errorprone.annotations.Immutable;

@Immutable
/* loaded from: classes.dex */
public final class KeyTemplate {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.crypto.tink.proto.KeyTemplate f14973a;

    /* renamed from: com.google.crypto.tink.KeyTemplate$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14974a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            b = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[com.google.crypto.tink.proto.OutputPrefixType.values().length];
            f14974a = iArr2;
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14974a[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14974a[3] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14974a[4] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OutputPrefixType {
        public static final OutputPrefixType d;
        public static final OutputPrefixType e;
        public static final /* synthetic */ OutputPrefixType[] f;

        static {
            OutputPrefixType outputPrefixType = new OutputPrefixType("TINK", 0);
            d = outputPrefixType;
            OutputPrefixType outputPrefixType2 = new OutputPrefixType("LEGACY", 1);
            OutputPrefixType outputPrefixType3 = new OutputPrefixType("RAW", 2);
            e = outputPrefixType3;
            f = new OutputPrefixType[]{outputPrefixType, outputPrefixType2, outputPrefixType3, new OutputPrefixType("CRUNCHY", 3)};
        }

        public static OutputPrefixType valueOf(String str) {
            return (OutputPrefixType) Enum.valueOf(OutputPrefixType.class, str);
        }

        public static OutputPrefixType[] values() {
            return (OutputPrefixType[]) f.clone();
        }
    }

    public KeyTemplate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        this.f14973a = keyTemplate;
    }

    public static KeyTemplate a(String str, byte[] bArr, OutputPrefixType outputPrefixType) {
        com.google.crypto.tink.proto.OutputPrefixType outputPrefixType2;
        KeyTemplate.Builder builderNewBuilder = com.google.crypto.tink.proto.KeyTemplate.newBuilder();
        builderNewBuilder.o(str);
        ByteString byteString = ByteString.e;
        builderNewBuilder.p(ByteString.i(0, bArr.length, bArr));
        int iOrdinal = outputPrefixType.ordinal();
        if (iOrdinal == 0) {
            outputPrefixType2 = com.google.crypto.tink.proto.OutputPrefixType.TINK;
        } else if (iOrdinal == 1) {
            outputPrefixType2 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY;
        } else if (iOrdinal == 2) {
            outputPrefixType2 = com.google.crypto.tink.proto.OutputPrefixType.RAW;
        } else {
            if (iOrdinal != 3) {
                throw new IllegalArgumentException("Unknown output prefix type");
            }
            outputPrefixType2 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY;
        }
        builderNewBuilder.m(outputPrefixType2);
        return new KeyTemplate((com.google.crypto.tink.proto.KeyTemplate) builderNewBuilder.p1());
    }
}
