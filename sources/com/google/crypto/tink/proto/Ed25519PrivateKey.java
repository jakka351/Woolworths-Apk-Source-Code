package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.Ed25519PublicKey;
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
public final class Ed25519PrivateKey extends GeneratedMessageLite<Ed25519PrivateKey, Builder> implements Ed25519PrivateKeyOrBuilder {
    private static final Ed25519PrivateKey DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile Parser<Ed25519PrivateKey> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.e;
    private Ed25519PublicKey publicKey_;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.Ed25519PrivateKey$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15046a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15046a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15046a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15046a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15046a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15046a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15046a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15046a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Ed25519PrivateKey, Builder> implements Ed25519PrivateKeyOrBuilder {
        public Builder() {
            super(Ed25519PrivateKey.DEFAULT_INSTANCE);
        }
    }

    static {
        Ed25519PrivateKey ed25519PrivateKey = new Ed25519PrivateKey();
        DEFAULT_INSTANCE = ed25519PrivateKey;
        GeneratedMessageLite.registerDefaultInstance(Ed25519PrivateKey.class, ed25519PrivateKey);
    }

    private Ed25519PrivateKey() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyValue() {
        this.keyValue_ = getDefaultInstance().getKeyValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicKey() {
        this.publicKey_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static Ed25519PrivateKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePublicKey(Ed25519PublicKey ed25519PublicKey) {
        ed25519PublicKey.getClass();
        Ed25519PublicKey ed25519PublicKey2 = this.publicKey_;
        if (ed25519PublicKey2 == null || ed25519PublicKey2 == Ed25519PublicKey.getDefaultInstance()) {
            this.publicKey_ = ed25519PublicKey;
            return;
        }
        Ed25519PublicKey.Builder builderNewBuilder = Ed25519PublicKey.newBuilder(this.publicKey_);
        builderNewBuilder.j(ed25519PublicKey);
        this.publicKey_ = (Ed25519PublicKey) builderNewBuilder.l();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Ed25519PrivateKey parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Ed25519PrivateKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Ed25519PrivateKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Ed25519PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Ed25519PrivateKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyValue(ByteString byteString) {
        byteString.getClass();
        this.keyValue_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicKey(Ed25519PublicKey ed25519PublicKey) {
        ed25519PublicKey.getClass();
        this.publicKey_ = ed25519PublicKey;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "publicKey_"});
            case 3:
                return new Ed25519PrivateKey();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Ed25519PrivateKey> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Ed25519PrivateKey.class) {
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

    public ByteString getKeyValue() {
        return this.keyValue_;
    }

    public Ed25519PublicKey getPublicKey() {
        Ed25519PublicKey ed25519PublicKey = this.publicKey_;
        return ed25519PublicKey == null ? Ed25519PublicKey.getDefaultInstance() : ed25519PublicKey;
    }

    public int getVersion() {
        return this.version_;
    }

    public boolean hasPublicKey() {
        return this.publicKey_ != null;
    }

    public static Builder newBuilder(Ed25519PrivateKey ed25519PrivateKey) {
        return DEFAULT_INSTANCE.createBuilder(ed25519PrivateKey);
    }

    public static Ed25519PrivateKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Ed25519PrivateKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Ed25519PrivateKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Ed25519PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Ed25519PrivateKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Ed25519PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Ed25519PrivateKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Ed25519PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Ed25519PrivateKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Ed25519PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Ed25519PrivateKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Ed25519PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Ed25519PrivateKey parseFrom(InputStream inputStream) throws IOException {
        return (Ed25519PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Ed25519PrivateKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Ed25519PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Ed25519PrivateKey parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Ed25519PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Ed25519PrivateKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Ed25519PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
