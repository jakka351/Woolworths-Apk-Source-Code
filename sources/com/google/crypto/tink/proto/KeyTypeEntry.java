package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractMessageLite;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

@Deprecated
/* loaded from: classes.dex */
public final class KeyTypeEntry extends GeneratedMessageLite<KeyTypeEntry, Builder> implements KeyTypeEntryOrBuilder {
    public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
    private static final KeyTypeEntry DEFAULT_INSTANCE;
    public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
    public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
    private static volatile Parser<KeyTypeEntry> PARSER = null;
    public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
    public static final int TYPE_URL_FIELD_NUMBER = 2;
    private int keyManagerVersion_;
    private boolean newKeyAllowed_;
    private String primitiveName_ = "";
    private String typeUrl_ = "";
    private String catalogueName_ = "";

    /* renamed from: com.google.crypto.tink.proto.KeyTypeEntry$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15058a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15058a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15058a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15058a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15058a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15058a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15058a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15058a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<KeyTypeEntry, Builder> implements KeyTypeEntryOrBuilder {
        public Builder() {
            super(KeyTypeEntry.DEFAULT_INSTANCE);
        }
    }

    static {
        KeyTypeEntry keyTypeEntry = new KeyTypeEntry();
        DEFAULT_INSTANCE = keyTypeEntry;
        GeneratedMessageLite.registerDefaultInstance(KeyTypeEntry.class, keyTypeEntry);
    }

    private KeyTypeEntry() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCatalogueName() {
        this.catalogueName_ = getDefaultInstance().getCatalogueName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyManagerVersion() {
        this.keyManagerVersion_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewKeyAllowed() {
        this.newKeyAllowed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimitiveName() {
        this.primitiveName_ = getDefaultInstance().getPrimitiveName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    public static KeyTypeEntry getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static KeyTypeEntry parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (KeyTypeEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeyTypeEntry parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<KeyTypeEntry> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCatalogueName(String str) {
        str.getClass();
        this.catalogueName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCatalogueNameBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.catalogueName_ = byteString.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyManagerVersion(int i) {
        this.keyManagerVersion_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewKeyAllowed(boolean z) {
        this.newKeyAllowed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimitiveName(String str) {
        str.getClass();
        this.primitiveName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimitiveNameBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.primitiveName_ = byteString.y();
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_"});
            case 3:
                return new KeyTypeEntry();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<KeyTypeEntry> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (KeyTypeEntry.class) {
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

    public String getCatalogueName() {
        return this.catalogueName_;
    }

    public ByteString getCatalogueNameBytes() {
        return ByteString.j(this.catalogueName_);
    }

    public int getKeyManagerVersion() {
        return this.keyManagerVersion_;
    }

    public boolean getNewKeyAllowed() {
        return this.newKeyAllowed_;
    }

    public String getPrimitiveName() {
        return this.primitiveName_;
    }

    public ByteString getPrimitiveNameBytes() {
        return ByteString.j(this.primitiveName_);
    }

    public String getTypeUrl() {
        return this.typeUrl_;
    }

    public ByteString getTypeUrlBytes() {
        return ByteString.j(this.typeUrl_);
    }

    public static Builder newBuilder(KeyTypeEntry keyTypeEntry) {
        return DEFAULT_INSTANCE.createBuilder(keyTypeEntry);
    }

    public static KeyTypeEntry parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KeyTypeEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static KeyTypeEntry parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static KeyTypeEntry parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static KeyTypeEntry parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static KeyTypeEntry parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static KeyTypeEntry parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static KeyTypeEntry parseFrom(InputStream inputStream) throws IOException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeyTypeEntry parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static KeyTypeEntry parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static KeyTypeEntry parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
