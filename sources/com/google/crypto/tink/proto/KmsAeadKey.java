package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.KmsAeadKeyFormat;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class KmsAeadKey extends GeneratedMessageLite<KmsAeadKey, Builder> implements KmsAeadKeyOrBuilder {
    private static final KmsAeadKey DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser<KmsAeadKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private KmsAeadKeyFormat params_;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.KmsAeadKey$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15061a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15061a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15061a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15061a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15061a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15061a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15061a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15061a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<KmsAeadKey, Builder> implements KmsAeadKeyOrBuilder {
        public Builder() {
            super(KmsAeadKey.DEFAULT_INSTANCE);
        }
    }

    static {
        KmsAeadKey kmsAeadKey = new KmsAeadKey();
        DEFAULT_INSTANCE = kmsAeadKey;
        GeneratedMessageLite.registerDefaultInstance(KmsAeadKey.class, kmsAeadKey);
    }

    private KmsAeadKey() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static KmsAeadKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(KmsAeadKeyFormat kmsAeadKeyFormat) {
        kmsAeadKeyFormat.getClass();
        KmsAeadKeyFormat kmsAeadKeyFormat2 = this.params_;
        if (kmsAeadKeyFormat2 == null || kmsAeadKeyFormat2 == KmsAeadKeyFormat.getDefaultInstance()) {
            this.params_ = kmsAeadKeyFormat;
            return;
        }
        KmsAeadKeyFormat.Builder builderNewBuilder = KmsAeadKeyFormat.newBuilder(this.params_);
        builderNewBuilder.j(kmsAeadKeyFormat);
        this.params_ = (KmsAeadKeyFormat) builderNewBuilder.l();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static KmsAeadKey parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (KmsAeadKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KmsAeadKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (KmsAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<KmsAeadKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(KmsAeadKeyFormat kmsAeadKeyFormat) {
        kmsAeadKeyFormat.getClass();
        this.params_ = kmsAeadKeyFormat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i) {
        this.version_ = i;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new KmsAeadKey();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<KmsAeadKey> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (KmsAeadKey.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    public KmsAeadKeyFormat getParams() {
        KmsAeadKeyFormat kmsAeadKeyFormat = this.params_;
        return kmsAeadKeyFormat == null ? KmsAeadKeyFormat.getDefaultInstance() : kmsAeadKeyFormat;
    }

    public int getVersion() {
        return this.version_;
    }

    public boolean hasParams() {
        return this.params_ != null;
    }

    public static Builder newBuilder(KmsAeadKey kmsAeadKey) {
        return DEFAULT_INSTANCE.createBuilder(kmsAeadKey);
    }

    public static KmsAeadKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KmsAeadKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static KmsAeadKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KmsAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static KmsAeadKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (KmsAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static KmsAeadKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KmsAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static KmsAeadKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (KmsAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static KmsAeadKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KmsAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static KmsAeadKey parseFrom(InputStream inputStream) throws IOException {
        return (KmsAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KmsAeadKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KmsAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static KmsAeadKey parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (KmsAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static KmsAeadKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KmsAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
