package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class EciesHkdfKemParams extends GeneratedMessageLite<EciesHkdfKemParams, Builder> implements EciesHkdfKemParamsOrBuilder {
    public static final int CURVE_TYPE_FIELD_NUMBER = 1;
    private static final EciesHkdfKemParams DEFAULT_INSTANCE;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 2;
    public static final int HKDF_SALT_FIELD_NUMBER = 11;
    private static volatile Parser<EciesHkdfKemParams> PARSER;
    private int curveType_;
    private int hkdfHashType_;
    private ByteString hkdfSalt_ = ByteString.e;

    /* renamed from: com.google.crypto.tink.proto.EciesHkdfKemParams$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15044a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15044a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15044a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15044a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15044a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15044a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15044a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15044a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<EciesHkdfKemParams, Builder> implements EciesHkdfKemParamsOrBuilder {
    }

    static {
        EciesHkdfKemParams eciesHkdfKemParams = new EciesHkdfKemParams();
        DEFAULT_INSTANCE = eciesHkdfKemParams;
        GeneratedMessageLite.registerDefaultInstance(EciesHkdfKemParams.class, eciesHkdfKemParams);
    }

    private EciesHkdfKemParams() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurveType() {
        this.curveType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHkdfHashType() {
        this.hkdfHashType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHkdfSalt() {
        this.hkdfSalt_ = getDefaultInstance().getHkdfSalt();
    }

    public static EciesHkdfKemParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EciesHkdfKemParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EciesHkdfKemParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EciesHkdfKemParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurveType(EllipticCurveType ellipticCurveType) {
        this.curveType_ = ellipticCurveType.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurveTypeValue(int i) {
        this.curveType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHkdfHashType(HashType hashType) {
        this.hkdfHashType_ = hashType.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHkdfHashTypeValue(int i) {
        this.hkdfHashType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHkdfSalt(ByteString byteString) {
        byteString.getClass();
        this.hkdfSalt_ = byteString;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"curveType_", "hkdfHashType_", "hkdfSalt_"});
            case 3:
                return new EciesHkdfKemParams();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<EciesHkdfKemParams> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (EciesHkdfKemParams.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser();
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return defaultInstanceBasedParser;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public EllipticCurveType getCurveType() {
        EllipticCurveType ellipticCurveTypeA = EllipticCurveType.a(this.curveType_);
        return ellipticCurveTypeA == null ? EllipticCurveType.UNRECOGNIZED : ellipticCurveTypeA;
    }

    public int getCurveTypeValue() {
        return this.curveType_;
    }

    public HashType getHkdfHashType() {
        HashType hashTypeA = HashType.a(this.hkdfHashType_);
        return hashTypeA == null ? HashType.UNRECOGNIZED : hashTypeA;
    }

    public int getHkdfHashTypeValue() {
        return this.hkdfHashType_;
    }

    public ByteString getHkdfSalt() {
        return this.hkdfSalt_;
    }

    public static Builder newBuilder(EciesHkdfKemParams eciesHkdfKemParams) {
        return DEFAULT_INSTANCE.createBuilder(eciesHkdfKemParams);
    }

    public static EciesHkdfKemParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EciesHkdfKemParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EciesHkdfKemParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EciesHkdfKemParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EciesHkdfKemParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EciesHkdfKemParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EciesHkdfKemParams parseFrom(InputStream inputStream) throws IOException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EciesHkdfKemParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EciesHkdfKemParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EciesHkdfKemParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
