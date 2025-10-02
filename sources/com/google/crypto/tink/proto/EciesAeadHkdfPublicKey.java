package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.EciesAeadHkdfParams;
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
public final class EciesAeadHkdfPublicKey extends GeneratedMessageLite<EciesAeadHkdfPublicKey, Builder> implements EciesAeadHkdfPublicKeyOrBuilder {
    private static final EciesAeadHkdfPublicKey DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser<EciesAeadHkdfPublicKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 4;
    private EciesAeadHkdfParams params_;
    private int version_;
    private ByteString x_;
    private ByteString y_;

    /* renamed from: com.google.crypto.tink.proto.EciesAeadHkdfPublicKey$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15043a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15043a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15043a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15043a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15043a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15043a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15043a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15043a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EciesAeadHkdfPublicKey, Builder> implements EciesAeadHkdfPublicKeyOrBuilder {
        public Builder() {
            super(EciesAeadHkdfPublicKey.DEFAULT_INSTANCE);
        }
    }

    static {
        EciesAeadHkdfPublicKey eciesAeadHkdfPublicKey = new EciesAeadHkdfPublicKey();
        DEFAULT_INSTANCE = eciesAeadHkdfPublicKey;
        GeneratedMessageLite.registerDefaultInstance(EciesAeadHkdfPublicKey.class, eciesAeadHkdfPublicKey);
    }

    private EciesAeadHkdfPublicKey() {
        ByteString byteString = ByteString.e;
        this.x_ = byteString;
        this.y_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearX() {
        this.x_ = getDefaultInstance().getX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearY() {
        this.y_ = getDefaultInstance().getY();
    }

    public static EciesAeadHkdfPublicKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(EciesAeadHkdfParams eciesAeadHkdfParams) {
        eciesAeadHkdfParams.getClass();
        EciesAeadHkdfParams eciesAeadHkdfParams2 = this.params_;
        if (eciesAeadHkdfParams2 == null || eciesAeadHkdfParams2 == EciesAeadHkdfParams.getDefaultInstance()) {
            this.params_ = eciesAeadHkdfParams;
            return;
        }
        EciesAeadHkdfParams.Builder builderNewBuilder = EciesAeadHkdfParams.newBuilder(this.params_);
        builderNewBuilder.j(eciesAeadHkdfParams);
        this.params_ = (EciesAeadHkdfParams) builderNewBuilder.l();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EciesAeadHkdfPublicKey parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EciesAeadHkdfPublicKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EciesAeadHkdfPublicKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EciesAeadHkdfPublicKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(EciesAeadHkdfParams eciesAeadHkdfParams) {
        eciesAeadHkdfParams.getClass();
        this.params_ = eciesAeadHkdfParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i) {
        this.version_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setX(ByteString byteString) {
        byteString.getClass();
        this.x_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setY(ByteString byteString) {
        byteString.getClass();
        this.y_ = byteString;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"version_", "params_", "x_", "y_"});
            case 3:
                return new EciesAeadHkdfPublicKey();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<EciesAeadHkdfPublicKey> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (EciesAeadHkdfPublicKey.class) {
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

    public EciesAeadHkdfParams getParams() {
        EciesAeadHkdfParams eciesAeadHkdfParams = this.params_;
        return eciesAeadHkdfParams == null ? EciesAeadHkdfParams.getDefaultInstance() : eciesAeadHkdfParams;
    }

    public int getVersion() {
        return this.version_;
    }

    public ByteString getX() {
        return this.x_;
    }

    public ByteString getY() {
        return this.y_;
    }

    public boolean hasParams() {
        return this.params_ != null;
    }

    public static Builder newBuilder(EciesAeadHkdfPublicKey eciesAeadHkdfPublicKey) {
        return DEFAULT_INSTANCE.createBuilder(eciesAeadHkdfPublicKey);
    }

    public static EciesAeadHkdfPublicKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EciesAeadHkdfPublicKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EciesAeadHkdfPublicKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EciesAeadHkdfPublicKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EciesAeadHkdfPublicKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EciesAeadHkdfPublicKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EciesAeadHkdfPublicKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EciesAeadHkdfPublicKey parseFrom(InputStream inputStream) throws IOException {
        return (EciesAeadHkdfPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EciesAeadHkdfPublicKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EciesAeadHkdfPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EciesAeadHkdfPublicKey parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EciesAeadHkdfPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EciesAeadHkdfPublicKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EciesAeadHkdfPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
