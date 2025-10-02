package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.RsaSsaPkcs1Params;
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
public final class RsaSsaPkcs1PublicKey extends GeneratedMessageLite<RsaSsaPkcs1PublicKey, Builder> implements RsaSsaPkcs1PublicKeyOrBuilder {
    private static final RsaSsaPkcs1PublicKey DEFAULT_INSTANCE;
    public static final int E_FIELD_NUMBER = 4;
    public static final int N_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser<RsaSsaPkcs1PublicKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString e_;
    private ByteString n_;
    private RsaSsaPkcs1Params params_;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15069a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15069a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15069a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15069a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15069a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15069a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15069a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15069a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RsaSsaPkcs1PublicKey, Builder> implements RsaSsaPkcs1PublicKeyOrBuilder {
        public Builder() {
            super(RsaSsaPkcs1PublicKey.DEFAULT_INSTANCE);
        }
    }

    static {
        RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey = new RsaSsaPkcs1PublicKey();
        DEFAULT_INSTANCE = rsaSsaPkcs1PublicKey;
        GeneratedMessageLite.registerDefaultInstance(RsaSsaPkcs1PublicKey.class, rsaSsaPkcs1PublicKey);
    }

    private RsaSsaPkcs1PublicKey() {
        ByteString byteString = ByteString.e;
        this.n_ = byteString;
        this.e_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearE() {
        this.e_ = getDefaultInstance().getE();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearN() {
        this.n_ = getDefaultInstance().getN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static RsaSsaPkcs1PublicKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(RsaSsaPkcs1Params rsaSsaPkcs1Params) {
        rsaSsaPkcs1Params.getClass();
        RsaSsaPkcs1Params rsaSsaPkcs1Params2 = this.params_;
        if (rsaSsaPkcs1Params2 == null || rsaSsaPkcs1Params2 == RsaSsaPkcs1Params.getDefaultInstance()) {
            this.params_ = rsaSsaPkcs1Params;
            return;
        }
        RsaSsaPkcs1Params.Builder builderNewBuilder = RsaSsaPkcs1Params.newBuilder(this.params_);
        builderNewBuilder.j(rsaSsaPkcs1Params);
        this.params_ = (RsaSsaPkcs1Params) builderNewBuilder.l();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RsaSsaPkcs1PublicKey parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RsaSsaPkcs1PublicKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RsaSsaPkcs1PublicKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setE(ByteString byteString) {
        byteString.getClass();
        this.e_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setN(ByteString byteString) {
        byteString.getClass();
        this.n_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(RsaSsaPkcs1Params rsaSsaPkcs1Params) {
        rsaSsaPkcs1Params.getClass();
        this.params_ = rsaSsaPkcs1Params;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"version_", "params_", "n_", "e_"});
            case 3:
                return new RsaSsaPkcs1PublicKey();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<RsaSsaPkcs1PublicKey> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (RsaSsaPkcs1PublicKey.class) {
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

    public ByteString getE() {
        return this.e_;
    }

    public ByteString getN() {
        return this.n_;
    }

    public RsaSsaPkcs1Params getParams() {
        RsaSsaPkcs1Params rsaSsaPkcs1Params = this.params_;
        return rsaSsaPkcs1Params == null ? RsaSsaPkcs1Params.getDefaultInstance() : rsaSsaPkcs1Params;
    }

    public int getVersion() {
        return this.version_;
    }

    public boolean hasParams() {
        return this.params_ != null;
    }

    public static Builder newBuilder(RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey) {
        return DEFAULT_INSTANCE.createBuilder(rsaSsaPkcs1PublicKey);
    }

    public static RsaSsaPkcs1PublicKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RsaSsaPkcs1PublicKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(InputStream inputStream) throws IOException {
        return (RsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
