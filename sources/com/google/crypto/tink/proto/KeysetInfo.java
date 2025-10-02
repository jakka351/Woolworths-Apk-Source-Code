package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractMessageLite;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.Internal;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class KeysetInfo extends GeneratedMessageLite<KeysetInfo, Builder> implements KeysetInfoOrBuilder {
    private static final KeysetInfo DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile Parser<KeysetInfo> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private Internal.ProtobufList<KeyInfo> keyInfo_ = GeneratedMessageLite.emptyProtobufList();
    private int primaryKeyId_;

    /* renamed from: com.google.crypto.tink.proto.KeysetInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15060a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15060a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15060a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15060a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15060a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15060a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15060a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15060a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<KeysetInfo, Builder> implements KeysetInfoOrBuilder {
        public Builder() {
            super(KeysetInfo.DEFAULT_INSTANCE);
        }

        public final void m(KeyInfo keyInfo) {
            g();
            ((KeysetInfo) this.e).addKeyInfo(keyInfo);
        }

        public final void o(int i) {
            g();
            ((KeysetInfo) this.e).setPrimaryKeyId(i);
        }
    }

    public static final class KeyInfo extends GeneratedMessageLite<KeyInfo, Builder> implements KeyInfoOrBuilder {
        private static final KeyInfo DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile Parser<KeyInfo> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        /* loaded from: classes6.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<KeyInfo, Builder> implements KeyInfoOrBuilder {
            public Builder() {
                super(KeyInfo.DEFAULT_INSTANCE);
            }

            public final void m(int i) {
                g();
                ((KeyInfo) this.e).setKeyId(i);
            }

            public final void o(OutputPrefixType outputPrefixType) {
                g();
                ((KeyInfo) this.e).setOutputPrefixType(outputPrefixType);
            }

            public final void p(KeyStatusType keyStatusType) {
                g();
                ((KeyInfo) this.e).setStatus(keyStatusType);
            }

            public final void q(String str) {
                g();
                ((KeyInfo) this.e).setTypeUrl(str);
            }
        }

        static {
            KeyInfo keyInfo = new KeyInfo();
            DEFAULT_INSTANCE = keyInfo;
            GeneratedMessageLite.registerDefaultInstance(KeyInfo.class, keyInfo);
        }

        private KeyInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeyId() {
            this.keyId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOutputPrefixType() {
            this.outputPrefixType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTypeUrl() {
            this.typeUrl_ = getDefaultInstance().getTypeUrl();
        }

        public static KeyInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static KeyInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (KeyInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static KeyInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (KeyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<KeyInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyId(int i) {
            this.keyId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOutputPrefixType(OutputPrefixType outputPrefixType) {
            this.outputPrefixType_ = outputPrefixType.g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOutputPrefixTypeValue(int i) {
            this.outputPrefixType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(KeyStatusType keyStatusType) {
            this.status_ = keyStatusType.g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusValue(int i) {
            this.status_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeUrl(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeUrlBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.typeUrl_ = byteString.y();
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
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 3:
                    return new KeyInfo();
                case 4:
                    return new Builder();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<KeyInfo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (KeyInfo.class) {
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

        public int getKeyId() {
            return this.keyId_;
        }

        public OutputPrefixType getOutputPrefixType() {
            OutputPrefixType outputPrefixTypeA = OutputPrefixType.a(this.outputPrefixType_);
            return outputPrefixTypeA == null ? OutputPrefixType.UNRECOGNIZED : outputPrefixTypeA;
        }

        public int getOutputPrefixTypeValue() {
            return this.outputPrefixType_;
        }

        public KeyStatusType getStatus() {
            KeyStatusType keyStatusTypeA = KeyStatusType.a(this.status_);
            return keyStatusTypeA == null ? KeyStatusType.UNRECOGNIZED : keyStatusTypeA;
        }

        public int getStatusValue() {
            return this.status_;
        }

        public String getTypeUrl() {
            return this.typeUrl_;
        }

        public ByteString getTypeUrlBytes() {
            return ByteString.j(this.typeUrl_);
        }

        public static Builder newBuilder(KeyInfo keyInfo) {
            return DEFAULT_INSTANCE.createBuilder(keyInfo);
        }

        public static KeyInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (KeyInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static KeyInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (KeyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static KeyInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (KeyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static KeyInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (KeyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static KeyInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (KeyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static KeyInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (KeyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static KeyInfo parseFrom(InputStream inputStream) throws IOException {
            return (KeyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static KeyInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (KeyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static KeyInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (KeyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static KeyInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (KeyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface KeyInfoOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        KeysetInfo keysetInfo = new KeysetInfo();
        DEFAULT_INSTANCE = keysetInfo;
        GeneratedMessageLite.registerDefaultInstance(KeysetInfo.class, keysetInfo);
    }

    private KeysetInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllKeyInfo(Iterable<? extends KeyInfo> iterable) {
        ensureKeyInfoIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.keyInfo_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKeyInfo(KeyInfo keyInfo) {
        keyInfo.getClass();
        ensureKeyInfoIsMutable();
        this.keyInfo_.add(keyInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyInfo() {
        this.keyInfo_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryKeyId() {
        this.primaryKeyId_ = 0;
    }

    private void ensureKeyInfoIsMutable() {
        if (this.keyInfo_.r()) {
            return;
        }
        this.keyInfo_ = GeneratedMessageLite.mutableCopy(this.keyInfo_);
    }

    public static KeysetInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static KeysetInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (KeysetInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeysetInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (KeysetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<KeysetInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeKeyInfo(int i) {
        ensureKeyInfoIsMutable();
        this.keyInfo_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyInfo(int i, KeyInfo keyInfo) {
        keyInfo.getClass();
        ensureKeyInfoIsMutable();
        this.keyInfo_.set(i, keyInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryKeyId(int i) {
        this.primaryKeyId_ = i;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", KeyInfo.class});
            case 3:
                return new KeysetInfo();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<KeysetInfo> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (KeysetInfo.class) {
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

    public KeyInfo getKeyInfo(int i) {
        return this.keyInfo_.get(i);
    }

    public int getKeyInfoCount() {
        return this.keyInfo_.size();
    }

    public List<KeyInfo> getKeyInfoList() {
        return this.keyInfo_;
    }

    public KeyInfoOrBuilder getKeyInfoOrBuilder(int i) {
        return this.keyInfo_.get(i);
    }

    public List<? extends KeyInfoOrBuilder> getKeyInfoOrBuilderList() {
        return this.keyInfo_;
    }

    public int getPrimaryKeyId() {
        return this.primaryKeyId_;
    }

    public static Builder newBuilder(KeysetInfo keysetInfo) {
        return DEFAULT_INSTANCE.createBuilder(keysetInfo);
    }

    public static KeysetInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KeysetInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static KeysetInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KeysetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static KeysetInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (KeysetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKeyInfo(int i, KeyInfo keyInfo) {
        keyInfo.getClass();
        ensureKeyInfoIsMutable();
        this.keyInfo_.add(i, keyInfo);
    }

    public static KeysetInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KeysetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static KeysetInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (KeysetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static KeysetInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KeysetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static KeysetInfo parseFrom(InputStream inputStream) throws IOException {
        return (KeysetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeysetInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KeysetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static KeysetInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (KeysetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static KeysetInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KeysetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
