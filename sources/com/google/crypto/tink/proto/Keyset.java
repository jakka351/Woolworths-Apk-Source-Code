package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.KeyData;
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
public final class Keyset extends GeneratedMessageLite<Keyset, Builder> implements KeysetOrBuilder {
    private static final Keyset DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile Parser<Keyset> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Key> key_ = GeneratedMessageLite.emptyProtobufList();
    private int primaryKeyId_;

    /* renamed from: com.google.crypto.tink.proto.Keyset$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15059a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15059a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15059a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15059a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15059a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15059a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15059a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15059a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Keyset, Builder> implements KeysetOrBuilder {
    }

    public static final class Key extends GeneratedMessageLite<Key, Builder> implements KeyOrBuilder {
        private static final Key DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile Parser<Key> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private KeyData keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* loaded from: classes6.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<Key, Builder> implements KeyOrBuilder {
            public Builder() {
                super(Key.DEFAULT_INSTANCE);
            }

            public final void m(KeyData keyData) {
                g();
                ((Key) this.e).setKeyData(keyData);
            }

            public final void o(int i) {
                g();
                ((Key) this.e).setKeyId(i);
            }

            public final void p(OutputPrefixType outputPrefixType) {
                g();
                ((Key) this.e).setOutputPrefixType(outputPrefixType);
            }

            public final void q(KeyStatusType keyStatusType) {
                g();
                ((Key) this.e).setStatus(keyStatusType);
            }
        }

        static {
            Key key = new Key();
            DEFAULT_INSTANCE = key;
            GeneratedMessageLite.registerDefaultInstance(Key.class, key);
        }

        private Key() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeyData() {
            this.keyData_ = null;
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

        public static Key getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeKeyData(KeyData keyData) {
            keyData.getClass();
            KeyData keyData2 = this.keyData_;
            if (keyData2 == null || keyData2 == KeyData.getDefaultInstance()) {
                this.keyData_ = keyData;
                return;
            }
            KeyData.Builder builderNewBuilder = KeyData.newBuilder(this.keyData_);
            builderNewBuilder.j(keyData);
            this.keyData_ = (KeyData) builderNewBuilder.l();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Key parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Key) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Key parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Key> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyData(KeyData keyData) {
            keyData.getClass();
            this.keyData_ = keyData;
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

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 3:
                    return new Key();
                case 4:
                    return new Builder();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<Key> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Key.class) {
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

        public KeyData getKeyData() {
            KeyData keyData = this.keyData_;
            return keyData == null ? KeyData.getDefaultInstance() : keyData;
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

        public boolean hasKeyData() {
            return this.keyData_ != null;
        }

        public static Builder newBuilder(Key key) {
            return DEFAULT_INSTANCE.createBuilder(key);
        }

        public static Key parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Key) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Key parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Key parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Key parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Key parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Key parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Key parseFrom(InputStream inputStream) throws IOException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Key parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Key parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Key parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface KeyOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        Keyset keyset = new Keyset();
        DEFAULT_INSTANCE = keyset;
        GeneratedMessageLite.registerDefaultInstance(Keyset.class, keyset);
    }

    private Keyset() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllKey(Iterable<? extends Key> iterable) {
        ensureKeyIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.key_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKey(Key key) {
        key.getClass();
        ensureKeyIsMutable();
        this.key_.add(key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.key_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryKeyId() {
        this.primaryKeyId_ = 0;
    }

    private void ensureKeyIsMutable() {
        if (this.key_.r()) {
            return;
        }
        this.key_ = GeneratedMessageLite.mutableCopy(this.key_);
    }

    public static Keyset getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Keyset parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Keyset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Keyset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Keyset> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeKey(int i) {
        ensureKeyIsMutable();
        this.key_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKey(int i, Key key) {
        key.getClass();
        ensureKeyIsMutable();
        this.key_.set(i, key);
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", Key.class});
            case 3:
                return new Keyset();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Keyset> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Keyset.class) {
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

    public Key getKey(int i) {
        return this.key_.get(i);
    }

    public int getKeyCount() {
        return this.key_.size();
    }

    public List<Key> getKeyList() {
        return this.key_;
    }

    public KeyOrBuilder getKeyOrBuilder(int i) {
        return this.key_.get(i);
    }

    public List<? extends KeyOrBuilder> getKeyOrBuilderList() {
        return this.key_;
    }

    public int getPrimaryKeyId() {
        return this.primaryKeyId_;
    }

    public static Builder newBuilder(Keyset keyset) {
        return DEFAULT_INSTANCE.createBuilder(keyset);
    }

    public static Keyset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Keyset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Keyset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Keyset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKey(int i, Key key) {
        key.getClass();
        ensureKeyIsMutable();
        this.key_.add(i, key);
    }

    public static Keyset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Keyset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Keyset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Keyset parseFrom(InputStream inputStream) throws IOException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Keyset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Keyset parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Keyset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
