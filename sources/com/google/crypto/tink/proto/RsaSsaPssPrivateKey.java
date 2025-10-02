package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.RsaSsaPssPublicKey;
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
public final class RsaSsaPssPrivateKey extends GeneratedMessageLite<RsaSsaPssPrivateKey, Builder> implements RsaSsaPssPrivateKeyOrBuilder {
    public static final int CRT_FIELD_NUMBER = 8;
    private static final RsaSsaPssPrivateKey DEFAULT_INSTANCE;
    public static final int DP_FIELD_NUMBER = 6;
    public static final int DQ_FIELD_NUMBER = 7;
    public static final int D_FIELD_NUMBER = 3;
    private static volatile Parser<RsaSsaPssPrivateKey> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int P_FIELD_NUMBER = 4;
    public static final int Q_FIELD_NUMBER = 5;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString crt_;
    private ByteString d_;
    private ByteString dp_;
    private ByteString dq_;
    private ByteString p_;
    private RsaSsaPssPublicKey publicKey_;
    private ByteString q_;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.RsaSsaPssPrivateKey$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15072a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15072a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15072a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15072a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15072a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15072a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15072a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15072a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RsaSsaPssPrivateKey, Builder> implements RsaSsaPssPrivateKeyOrBuilder {
        public Builder() {
            super(RsaSsaPssPrivateKey.DEFAULT_INSTANCE);
        }
    }

    static {
        RsaSsaPssPrivateKey rsaSsaPssPrivateKey = new RsaSsaPssPrivateKey();
        DEFAULT_INSTANCE = rsaSsaPssPrivateKey;
        GeneratedMessageLite.registerDefaultInstance(RsaSsaPssPrivateKey.class, rsaSsaPssPrivateKey);
    }

    private RsaSsaPssPrivateKey() {
        ByteString byteString = ByteString.e;
        this.d_ = byteString;
        this.p_ = byteString;
        this.q_ = byteString;
        this.dp_ = byteString;
        this.dq_ = byteString;
        this.crt_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrt() {
        this.crt_ = getDefaultInstance().getCrt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearD() {
        this.d_ = getDefaultInstance().getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDp() {
        this.dp_ = getDefaultInstance().getDp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDq() {
        this.dq_ = getDefaultInstance().getDq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearP() {
        this.p_ = getDefaultInstance().getP();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicKey() {
        this.publicKey_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQ() {
        this.q_ = getDefaultInstance().getQ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static RsaSsaPssPrivateKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePublicKey(RsaSsaPssPublicKey rsaSsaPssPublicKey) {
        rsaSsaPssPublicKey.getClass();
        RsaSsaPssPublicKey rsaSsaPssPublicKey2 = this.publicKey_;
        if (rsaSsaPssPublicKey2 == null || rsaSsaPssPublicKey2 == RsaSsaPssPublicKey.getDefaultInstance()) {
            this.publicKey_ = rsaSsaPssPublicKey;
            return;
        }
        RsaSsaPssPublicKey.Builder builderNewBuilder = RsaSsaPssPublicKey.newBuilder(this.publicKey_);
        builderNewBuilder.j(rsaSsaPssPublicKey);
        this.publicKey_ = (RsaSsaPssPublicKey) builderNewBuilder.l();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RsaSsaPssPrivateKey parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPssPrivateKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RsaSsaPssPrivateKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrt(ByteString byteString) {
        byteString.getClass();
        this.crt_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setD(ByteString byteString) {
        byteString.getClass();
        this.d_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDp(ByteString byteString) {
        byteString.getClass();
        this.dp_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDq(ByteString byteString) {
        byteString.getClass();
        this.dq_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP(ByteString byteString) {
        byteString.getClass();
        this.p_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicKey(RsaSsaPssPublicKey rsaSsaPssPublicKey) {
        rsaSsaPssPublicKey.getClass();
        this.publicKey_ = rsaSsaPssPublicKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQ(ByteString byteString) {
        byteString.getClass();
        this.q_ = byteString;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"version_", "publicKey_", "d_", "p_", "q_", "dp_", "dq_", "crt_"});
            case 3:
                return new RsaSsaPssPrivateKey();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<RsaSsaPssPrivateKey> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (RsaSsaPssPrivateKey.class) {
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

    public ByteString getCrt() {
        return this.crt_;
    }

    public ByteString getD() {
        return this.d_;
    }

    public ByteString getDp() {
        return this.dp_;
    }

    public ByteString getDq() {
        return this.dq_;
    }

    public ByteString getP() {
        return this.p_;
    }

    public RsaSsaPssPublicKey getPublicKey() {
        RsaSsaPssPublicKey rsaSsaPssPublicKey = this.publicKey_;
        return rsaSsaPssPublicKey == null ? RsaSsaPssPublicKey.getDefaultInstance() : rsaSsaPssPublicKey;
    }

    public ByteString getQ() {
        return this.q_;
    }

    public int getVersion() {
        return this.version_;
    }

    public boolean hasPublicKey() {
        return this.publicKey_ != null;
    }

    public static Builder newBuilder(RsaSsaPssPrivateKey rsaSsaPssPrivateKey) {
        return DEFAULT_INSTANCE.createBuilder(rsaSsaPssPrivateKey);
    }

    public static RsaSsaPssPrivateKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RsaSsaPssPrivateKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RsaSsaPssPrivateKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RsaSsaPssPrivateKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RsaSsaPssPrivateKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RsaSsaPssPrivateKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RsaSsaPssPrivateKey parseFrom(InputStream inputStream) throws IOException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RsaSsaPssPrivateKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RsaSsaPssPrivateKey parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RsaSsaPssPrivateKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RsaSsaPssPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
