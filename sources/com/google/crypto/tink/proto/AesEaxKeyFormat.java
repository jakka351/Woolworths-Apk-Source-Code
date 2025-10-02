package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.AesEaxParams;
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
public final class AesEaxKeyFormat extends GeneratedMessageLite<AesEaxKeyFormat, Builder> implements AesEaxKeyFormatOrBuilder {
    private static final AesEaxKeyFormat DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile Parser<AesEaxKeyFormat> PARSER;
    private int keySize_;
    private AesEaxParams params_;

    /* renamed from: com.google.crypto.tink.proto.AesEaxKeyFormat$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15024a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15024a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15024a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15024a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15024a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15024a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15024a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15024a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AesEaxKeyFormat, Builder> implements AesEaxKeyFormatOrBuilder {
    }

    static {
        AesEaxKeyFormat aesEaxKeyFormat = new AesEaxKeyFormat();
        DEFAULT_INSTANCE = aesEaxKeyFormat;
        GeneratedMessageLite.registerDefaultInstance(AesEaxKeyFormat.class, aesEaxKeyFormat);
    }

    private AesEaxKeyFormat() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeySize() {
        this.keySize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    public static AesEaxKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(AesEaxParams aesEaxParams) {
        aesEaxParams.getClass();
        AesEaxParams aesEaxParams2 = this.params_;
        if (aesEaxParams2 == null || aesEaxParams2 == AesEaxParams.getDefaultInstance()) {
            this.params_ = aesEaxParams;
            return;
        }
        AesEaxParams.Builder builderNewBuilder = AesEaxParams.newBuilder(this.params_);
        builderNewBuilder.j(aesEaxParams);
        this.params_ = (AesEaxParams) builderNewBuilder.l();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AesEaxKeyFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AesEaxKeyFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesEaxKeyFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AesEaxKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AesEaxKeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeySize(int i) {
        this.keySize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(AesEaxParams aesEaxParams) {
        aesEaxParams.getClass();
        this.params_ = aesEaxParams;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new AesEaxKeyFormat();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<AesEaxKeyFormat> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AesEaxKeyFormat.class) {
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

    public int getKeySize() {
        return this.keySize_;
    }

    public AesEaxParams getParams() {
        AesEaxParams aesEaxParams = this.params_;
        return aesEaxParams == null ? AesEaxParams.getDefaultInstance() : aesEaxParams;
    }

    public boolean hasParams() {
        return this.params_ != null;
    }

    public static Builder newBuilder(AesEaxKeyFormat aesEaxKeyFormat) {
        return DEFAULT_INSTANCE.createBuilder(aesEaxKeyFormat);
    }

    public static AesEaxKeyFormat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesEaxKeyFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesEaxKeyFormat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesEaxKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AesEaxKeyFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AesEaxKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AesEaxKeyFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesEaxKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AesEaxKeyFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AesEaxKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AesEaxKeyFormat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AesEaxKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AesEaxKeyFormat parseFrom(InputStream inputStream) throws IOException {
        return (AesEaxKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AesEaxKeyFormat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesEaxKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AesEaxKeyFormat parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AesEaxKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AesEaxKeyFormat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AesEaxKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
