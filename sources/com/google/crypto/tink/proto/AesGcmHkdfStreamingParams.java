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
public final class AesGcmHkdfStreamingParams extends GeneratedMessageLite<AesGcmHkdfStreamingParams, Builder> implements AesGcmHkdfStreamingParamsOrBuilder {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final AesGcmHkdfStreamingParams DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    private static volatile Parser<AesGcmHkdfStreamingParams> PARSER;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;

    /* renamed from: com.google.crypto.tink.proto.AesGcmHkdfStreamingParams$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15028a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15028a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15028a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15028a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15028a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15028a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15028a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15028a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AesGcmHkdfStreamingParams, Builder> implements AesGcmHkdfStreamingParamsOrBuilder {
        public final void m(int i) {
            g();
            ((AesGcmHkdfStreamingParams) this.e).setCiphertextSegmentSize(i);
        }

        public final void o(int i) {
            g();
            ((AesGcmHkdfStreamingParams) this.e).setDerivedKeySize(i);
        }

        public final void p() {
            g();
            ((AesGcmHkdfStreamingParams) this.e).setHkdfHashType(HashType.SHA256);
        }
    }

    static {
        AesGcmHkdfStreamingParams aesGcmHkdfStreamingParams = new AesGcmHkdfStreamingParams();
        DEFAULT_INSTANCE = aesGcmHkdfStreamingParams;
        GeneratedMessageLite.registerDefaultInstance(AesGcmHkdfStreamingParams.class, aesGcmHkdfStreamingParams);
    }

    private AesGcmHkdfStreamingParams() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCiphertextSegmentSize() {
        this.ciphertextSegmentSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDerivedKeySize() {
        this.derivedKeySize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHkdfHashType() {
        this.hkdfHashType_ = 0;
    }

    public static AesGcmHkdfStreamingParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AesGcmHkdfStreamingParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AesGcmHkdfStreamingParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesGcmHkdfStreamingParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AesGcmHkdfStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AesGcmHkdfStreamingParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCiphertextSegmentSize(int i) {
        this.ciphertextSegmentSize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDerivedKeySize(int i) {
        this.derivedKeySize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHkdfHashType(HashType hashType) {
        this.hkdfHashType_ = hashType.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHkdfHashTypeValue(int i) {
        this.hkdfHashType_ = i;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_"});
            case 3:
                return new AesGcmHkdfStreamingParams();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<AesGcmHkdfStreamingParams> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AesGcmHkdfStreamingParams.class) {
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

    public int getCiphertextSegmentSize() {
        return this.ciphertextSegmentSize_;
    }

    public int getDerivedKeySize() {
        return this.derivedKeySize_;
    }

    public HashType getHkdfHashType() {
        HashType hashTypeA = HashType.a(this.hkdfHashType_);
        return hashTypeA == null ? HashType.UNRECOGNIZED : hashTypeA;
    }

    public int getHkdfHashTypeValue() {
        return this.hkdfHashType_;
    }

    public static Builder newBuilder(AesGcmHkdfStreamingParams aesGcmHkdfStreamingParams) {
        return DEFAULT_INSTANCE.createBuilder(aesGcmHkdfStreamingParams);
    }

    public static AesGcmHkdfStreamingParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesGcmHkdfStreamingParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesGcmHkdfStreamingParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesGcmHkdfStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AesGcmHkdfStreamingParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AesGcmHkdfStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AesGcmHkdfStreamingParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesGcmHkdfStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AesGcmHkdfStreamingParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AesGcmHkdfStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AesGcmHkdfStreamingParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesGcmHkdfStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AesGcmHkdfStreamingParams parseFrom(InputStream inputStream) throws IOException {
        return (AesGcmHkdfStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesGcmHkdfStreamingParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesGcmHkdfStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesGcmHkdfStreamingParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AesGcmHkdfStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AesGcmHkdfStreamingParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesGcmHkdfStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
