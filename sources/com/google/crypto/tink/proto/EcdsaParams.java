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
public final class EcdsaParams extends GeneratedMessageLite<EcdsaParams, Builder> implements EcdsaParamsOrBuilder {
    public static final int CURVE_FIELD_NUMBER = 2;
    private static final EcdsaParams DEFAULT_INSTANCE;
    public static final int ENCODING_FIELD_NUMBER = 3;
    public static final int HASH_TYPE_FIELD_NUMBER = 1;
    private static volatile Parser<EcdsaParams> PARSER;
    private int curve_;
    private int encoding_;
    private int hashType_;

    /* renamed from: com.google.crypto.tink.proto.EcdsaParams$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15036a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15036a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15036a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15036a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15036a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15036a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15036a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15036a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<EcdsaParams, Builder> implements EcdsaParamsOrBuilder {
    }

    static {
        EcdsaParams ecdsaParams = new EcdsaParams();
        DEFAULT_INSTANCE = ecdsaParams;
        GeneratedMessageLite.registerDefaultInstance(EcdsaParams.class, ecdsaParams);
    }

    private EcdsaParams() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurve() {
        this.curve_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncoding() {
        this.encoding_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHashType() {
        this.hashType_ = 0;
    }

    public static EcdsaParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EcdsaParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EcdsaParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EcdsaParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EcdsaParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurve(EllipticCurveType ellipticCurveType) {
        this.curve_ = ellipticCurveType.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurveValue(int i) {
        this.curve_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncoding(EcdsaSignatureEncoding ecdsaSignatureEncoding) {
        this.encoding_ = ecdsaSignatureEncoding.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncodingValue(int i) {
        this.encoding_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHashType(HashType hashType) {
        this.hashType_ = hashType.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHashTypeValue(int i) {
        this.hashType_ = i;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"hashType_", "curve_", "encoding_"});
            case 3:
                return new EcdsaParams();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<EcdsaParams> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (EcdsaParams.class) {
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

    public EllipticCurveType getCurve() {
        EllipticCurveType ellipticCurveTypeA = EllipticCurveType.a(this.curve_);
        return ellipticCurveTypeA == null ? EllipticCurveType.UNRECOGNIZED : ellipticCurveTypeA;
    }

    public int getCurveValue() {
        return this.curve_;
    }

    public EcdsaSignatureEncoding getEncoding() {
        EcdsaSignatureEncoding ecdsaSignatureEncodingA = EcdsaSignatureEncoding.a(this.encoding_);
        return ecdsaSignatureEncodingA == null ? EcdsaSignatureEncoding.UNRECOGNIZED : ecdsaSignatureEncodingA;
    }

    public int getEncodingValue() {
        return this.encoding_;
    }

    public HashType getHashType() {
        HashType hashTypeA = HashType.a(this.hashType_);
        return hashTypeA == null ? HashType.UNRECOGNIZED : hashTypeA;
    }

    public int getHashTypeValue() {
        return this.hashType_;
    }

    public static Builder newBuilder(EcdsaParams ecdsaParams) {
        return DEFAULT_INSTANCE.createBuilder(ecdsaParams);
    }

    public static EcdsaParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EcdsaParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EcdsaParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EcdsaParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EcdsaParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EcdsaParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EcdsaParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EcdsaParams parseFrom(InputStream inputStream) throws IOException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EcdsaParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EcdsaParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EcdsaParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
