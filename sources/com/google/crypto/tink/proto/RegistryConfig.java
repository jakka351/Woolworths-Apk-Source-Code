package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractMessageLite;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.Internal;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public final class RegistryConfig extends GeneratedMessageLite<RegistryConfig, Builder> implements RegistryConfigOrBuilder {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final RegistryConfig DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile Parser<RegistryConfig> PARSER;
    private String configName_ = "";
    private Internal.ProtobufList<KeyTypeEntry> entry_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.google.crypto.tink.proto.RegistryConfig$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15065a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15065a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15065a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15065a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15065a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15065a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15065a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15065a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<RegistryConfig, Builder> implements RegistryConfigOrBuilder {
    }

    static {
        RegistryConfig registryConfig = new RegistryConfig();
        DEFAULT_INSTANCE = registryConfig;
        GeneratedMessageLite.registerDefaultInstance(RegistryConfig.class, registryConfig);
    }

    private RegistryConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEntry(Iterable<? extends KeyTypeEntry> iterable) {
        ensureEntryIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.entry_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntry(KeyTypeEntry keyTypeEntry) {
        keyTypeEntry.getClass();
        ensureEntryIsMutable();
        this.entry_.add(keyTypeEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigName() {
        this.configName_ = getDefaultInstance().getConfigName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntry() {
        this.entry_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureEntryIsMutable() {
        if (this.entry_.r()) {
            return;
        }
        this.entry_ = GeneratedMessageLite.mutableCopy(this.entry_);
    }

    public static RegistryConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RegistryConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RegistryConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RegistryConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RegistryConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEntry(int i) {
        ensureEntryIsMutable();
        this.entry_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigName(String str) {
        str.getClass();
        this.configName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigNameBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.configName_ = byteString.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntry(int i, KeyTypeEntry keyTypeEntry) {
        keyTypeEntry.getClass();
        ensureEntryIsMutable();
        this.entry_.set(i, keyTypeEntry);
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", KeyTypeEntry.class});
            case 3:
                return new RegistryConfig();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<RegistryConfig> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (RegistryConfig.class) {
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

    public String getConfigName() {
        return this.configName_;
    }

    public ByteString getConfigNameBytes() {
        return ByteString.j(this.configName_);
    }

    public KeyTypeEntry getEntry(int i) {
        return this.entry_.get(i);
    }

    public int getEntryCount() {
        return this.entry_.size();
    }

    public List<KeyTypeEntry> getEntryList() {
        return this.entry_;
    }

    public KeyTypeEntryOrBuilder getEntryOrBuilder(int i) {
        return this.entry_.get(i);
    }

    public List<? extends KeyTypeEntryOrBuilder> getEntryOrBuilderList() {
        return this.entry_;
    }

    public static Builder newBuilder(RegistryConfig registryConfig) {
        return DEFAULT_INSTANCE.createBuilder(registryConfig);
    }

    public static RegistryConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RegistryConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RegistryConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RegistryConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntry(int i, KeyTypeEntry keyTypeEntry) {
        keyTypeEntry.getClass();
        ensureEntryIsMutable();
        this.entry_.add(i, keyTypeEntry);
    }

    public static RegistryConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RegistryConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RegistryConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RegistryConfig parseFrom(InputStream inputStream) throws IOException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RegistryConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RegistryConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RegistryConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
