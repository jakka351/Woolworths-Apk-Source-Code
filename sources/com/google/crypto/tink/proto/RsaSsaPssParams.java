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
public final class RsaSsaPssParams extends GeneratedMessageLite<RsaSsaPssParams, Builder> implements RsaSsaPssParamsOrBuilder {
    private static final RsaSsaPssParams DEFAULT_INSTANCE;
    public static final int MGF1_HASH_FIELD_NUMBER = 2;
    private static volatile Parser<RsaSsaPssParams> PARSER = null;
    public static final int SALT_LENGTH_FIELD_NUMBER = 3;
    public static final int SIG_HASH_FIELD_NUMBER = 1;
    private int mgf1Hash_;
    private int saltLength_;
    private int sigHash_;

    /* renamed from: com.google.crypto.tink.proto.RsaSsaPssParams$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15071a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15071a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15071a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15071a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15071a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15071a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15071a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15071a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<RsaSsaPssParams, Builder> implements RsaSsaPssParamsOrBuilder {
    }

    static {
        RsaSsaPssParams rsaSsaPssParams = new RsaSsaPssParams();
        DEFAULT_INSTANCE = rsaSsaPssParams;
        GeneratedMessageLite.registerDefaultInstance(RsaSsaPssParams.class, rsaSsaPssParams);
    }

    private RsaSsaPssParams() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMgf1Hash() {
        this.mgf1Hash_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSaltLength() {
        this.saltLength_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSigHash() {
        this.sigHash_ = 0;
    }

    public static RsaSsaPssParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RsaSsaPssParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RsaSsaPssParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPssParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RsaSsaPssParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RsaSsaPssParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMgf1Hash(HashType hashType) {
        this.mgf1Hash_ = hashType.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMgf1HashValue(int i) {
        this.mgf1Hash_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSaltLength(int i) {
        this.saltLength_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSigHash(HashType hashType) {
        this.sigHash_ = hashType.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSigHashValue(int i) {
        this.sigHash_ = i;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"sigHash_", "mgf1Hash_", "saltLength_"});
            case 3:
                return new RsaSsaPssParams();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<RsaSsaPssParams> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (RsaSsaPssParams.class) {
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

    public HashType getMgf1Hash() {
        HashType hashTypeA = HashType.a(this.mgf1Hash_);
        return hashTypeA == null ? HashType.UNRECOGNIZED : hashTypeA;
    }

    public int getMgf1HashValue() {
        return this.mgf1Hash_;
    }

    public int getSaltLength() {
        return this.saltLength_;
    }

    public HashType getSigHash() {
        HashType hashTypeA = HashType.a(this.sigHash_);
        return hashTypeA == null ? HashType.UNRECOGNIZED : hashTypeA;
    }

    public int getSigHashValue() {
        return this.sigHash_;
    }

    public static Builder newBuilder(RsaSsaPssParams rsaSsaPssParams) {
        return DEFAULT_INSTANCE.createBuilder(rsaSsaPssParams);
    }

    public static RsaSsaPssParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RsaSsaPssParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RsaSsaPssParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RsaSsaPssParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RsaSsaPssParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RsaSsaPssParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RsaSsaPssParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RsaSsaPssParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RsaSsaPssParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RsaSsaPssParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RsaSsaPssParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RsaSsaPssParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RsaSsaPssParams parseFrom(InputStream inputStream) throws IOException {
        return (RsaSsaPssParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPssParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RsaSsaPssParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RsaSsaPssParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RsaSsaPssParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RsaSsaPssParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RsaSsaPssParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
