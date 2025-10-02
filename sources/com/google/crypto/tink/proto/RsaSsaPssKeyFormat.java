package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.RsaSsaPssParams;
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
public final class RsaSsaPssKeyFormat extends GeneratedMessageLite<RsaSsaPssKeyFormat, Builder> implements RsaSsaPssKeyFormatOrBuilder {
    private static final RsaSsaPssKeyFormat DEFAULT_INSTANCE;
    public static final int MODULUS_SIZE_IN_BITS_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile Parser<RsaSsaPssKeyFormat> PARSER = null;
    public static final int PUBLIC_EXPONENT_FIELD_NUMBER = 3;
    private int modulusSizeInBits_;
    private RsaSsaPssParams params_;
    private ByteString publicExponent_ = ByteString.e;

    /* renamed from: com.google.crypto.tink.proto.RsaSsaPssKeyFormat$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15070a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15070a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15070a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15070a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15070a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15070a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15070a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15070a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<RsaSsaPssKeyFormat, Builder> implements RsaSsaPssKeyFormatOrBuilder {
    }

    static {
        RsaSsaPssKeyFormat rsaSsaPssKeyFormat = new RsaSsaPssKeyFormat();
        DEFAULT_INSTANCE = rsaSsaPssKeyFormat;
        GeneratedMessageLite.registerDefaultInstance(RsaSsaPssKeyFormat.class, rsaSsaPssKeyFormat);
    }

    private RsaSsaPssKeyFormat() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModulusSizeInBits() {
        this.modulusSizeInBits_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicExponent() {
        this.publicExponent_ = getDefaultInstance().getPublicExponent();
    }

    public static RsaSsaPssKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(RsaSsaPssParams rsaSsaPssParams) {
        rsaSsaPssParams.getClass();
        RsaSsaPssParams rsaSsaPssParams2 = this.params_;
        if (rsaSsaPssParams2 == null || rsaSsaPssParams2 == RsaSsaPssParams.getDefaultInstance()) {
            this.params_ = rsaSsaPssParams;
            return;
        }
        RsaSsaPssParams.Builder builderNewBuilder = RsaSsaPssParams.newBuilder(this.params_);
        builderNewBuilder.j(rsaSsaPssParams);
        this.params_ = (RsaSsaPssParams) builderNewBuilder.l();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RsaSsaPssKeyFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RsaSsaPssKeyFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPssKeyFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RsaSsaPssKeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModulusSizeInBits(int i) {
        this.modulusSizeInBits_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(RsaSsaPssParams rsaSsaPssParams) {
        rsaSsaPssParams.getClass();
        this.params_ = rsaSsaPssParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicExponent(ByteString byteString) {
        byteString.getClass();
        this.publicExponent_ = byteString;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\n", new Object[]{"params_", "modulusSizeInBits_", "publicExponent_"});
            case 3:
                return new RsaSsaPssKeyFormat();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<RsaSsaPssKeyFormat> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (RsaSsaPssKeyFormat.class) {
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

    public int getModulusSizeInBits() {
        return this.modulusSizeInBits_;
    }

    public RsaSsaPssParams getParams() {
        RsaSsaPssParams rsaSsaPssParams = this.params_;
        return rsaSsaPssParams == null ? RsaSsaPssParams.getDefaultInstance() : rsaSsaPssParams;
    }

    public ByteString getPublicExponent() {
        return this.publicExponent_;
    }

    public boolean hasParams() {
        return this.params_ != null;
    }

    public static Builder newBuilder(RsaSsaPssKeyFormat rsaSsaPssKeyFormat) {
        return DEFAULT_INSTANCE.createBuilder(rsaSsaPssKeyFormat);
    }

    public static RsaSsaPssKeyFormat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RsaSsaPssKeyFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RsaSsaPssKeyFormat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RsaSsaPssKeyFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RsaSsaPssKeyFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RsaSsaPssKeyFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RsaSsaPssKeyFormat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RsaSsaPssKeyFormat parseFrom(InputStream inputStream) throws IOException {
        return (RsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPssKeyFormat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RsaSsaPssKeyFormat parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RsaSsaPssKeyFormat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
