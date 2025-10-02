package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.KeysetInfo;
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
public final class EncryptedKeyset extends GeneratedMessageLite<EncryptedKeyset, Builder> implements EncryptedKeysetOrBuilder {
    private static final EncryptedKeyset DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile Parser<EncryptedKeyset> PARSER;
    private ByteString encryptedKeyset_ = ByteString.e;
    private KeysetInfo keysetInfo_;

    /* renamed from: com.google.crypto.tink.proto.EncryptedKeyset$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15049a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15049a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15049a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15049a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15049a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15049a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15049a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15049a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EncryptedKeyset, Builder> implements EncryptedKeysetOrBuilder {
        public Builder() {
            super(EncryptedKeyset.DEFAULT_INSTANCE);
        }

        public final void m(ByteString byteString) {
            g();
            ((EncryptedKeyset) this.e).setEncryptedKeyset(byteString);
        }

        public final void o(KeysetInfo keysetInfo) {
            g();
            ((EncryptedKeyset) this.e).setKeysetInfo(keysetInfo);
        }
    }

    static {
        EncryptedKeyset encryptedKeyset = new EncryptedKeyset();
        DEFAULT_INSTANCE = encryptedKeyset;
        GeneratedMessageLite.registerDefaultInstance(EncryptedKeyset.class, encryptedKeyset);
    }

    private EncryptedKeyset() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncryptedKeyset() {
        this.encryptedKeyset_ = getDefaultInstance().getEncryptedKeyset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeysetInfo() {
        this.keysetInfo_ = null;
    }

    public static EncryptedKeyset getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKeysetInfo(KeysetInfo keysetInfo) {
        keysetInfo.getClass();
        KeysetInfo keysetInfo2 = this.keysetInfo_;
        if (keysetInfo2 == null || keysetInfo2 == KeysetInfo.getDefaultInstance()) {
            this.keysetInfo_ = keysetInfo;
            return;
        }
        KeysetInfo.Builder builderNewBuilder = KeysetInfo.newBuilder(this.keysetInfo_);
        builderNewBuilder.j(keysetInfo);
        this.keysetInfo_ = (KeysetInfo) builderNewBuilder.l();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EncryptedKeyset parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EncryptedKeyset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EncryptedKeyset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EncryptedKeyset> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncryptedKeyset(ByteString byteString) {
        byteString.getClass();
        this.encryptedKeyset_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeysetInfo(KeysetInfo keysetInfo) {
        keysetInfo.getClass();
        this.keysetInfo_ = keysetInfo;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new EncryptedKeyset();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<EncryptedKeyset> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (EncryptedKeyset.class) {
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

    public ByteString getEncryptedKeyset() {
        return this.encryptedKeyset_;
    }

    public KeysetInfo getKeysetInfo() {
        KeysetInfo keysetInfo = this.keysetInfo_;
        return keysetInfo == null ? KeysetInfo.getDefaultInstance() : keysetInfo;
    }

    public boolean hasKeysetInfo() {
        return this.keysetInfo_ != null;
    }

    public static Builder newBuilder(EncryptedKeyset encryptedKeyset) {
        return DEFAULT_INSTANCE.createBuilder(encryptedKeyset);
    }

    public static EncryptedKeyset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EncryptedKeyset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EncryptedKeyset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EncryptedKeyset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EncryptedKeyset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EncryptedKeyset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EncryptedKeyset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EncryptedKeyset parseFrom(InputStream inputStream) throws IOException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EncryptedKeyset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EncryptedKeyset parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EncryptedKeyset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
