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

/* loaded from: classes.dex */
public final class KeyData extends GeneratedMessageLite<KeyData, Builder> implements KeyDataOrBuilder {
    private static final KeyData DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile Parser<KeyData> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.e;

    /* renamed from: com.google.crypto.tink.proto.KeyData$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15056a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15056a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15056a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15056a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15056a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15056a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15056a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15056a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<KeyData, Builder> implements KeyDataOrBuilder {
        public Builder() {
            super(KeyData.DEFAULT_INSTANCE);
        }

        public final void m(KeyMaterialType keyMaterialType) {
            g();
            ((KeyData) this.e).setKeyMaterialType(keyMaterialType);
        }

        public final void o(String str) {
            g();
            ((KeyData) this.e).setTypeUrl(str);
        }

        public final void p(ByteString byteString) {
            g();
            ((KeyData) this.e).setValue(byteString);
        }
    }

    public enum KeyMaterialType implements Internal.EnumLite {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);

        public final int d;

        /* renamed from: com.google.crypto.tink.proto.KeyData$KeyMaterialType$1, reason: invalid class name */
        public class AnonymousClass1 implements Internal.EnumLiteMap<KeyMaterialType> {
            @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite a(int i) {
                return KeyMaterialType.a(i);
            }
        }

        /* loaded from: classes6.dex */
        public static final class KeyMaterialTypeVerifier implements Internal.EnumVerifier {
            @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
            public final boolean a(int i) {
                return KeyMaterialType.a(i) != null;
            }
        }

        KeyMaterialType(int i) {
            this.d = i;
        }

        public static KeyMaterialType a(int i) {
            if (i == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i == 1) {
                return SYMMETRIC;
            }
            if (i == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i != 4) {
                return null;
            }
            return REMOTE;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
        public final int g() {
            if (this != UNRECOGNIZED) {
                return this.d;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        KeyData keyData = new KeyData();
        DEFAULT_INSTANCE = keyData;
        GeneratedMessageLite.registerDefaultInstance(KeyData.class, keyData);
    }

    private KeyData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyMaterialType() {
        this.keyMaterialType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static KeyData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static KeyData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (KeyData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeyData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (KeyData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<KeyData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyMaterialType(KeyMaterialType keyMaterialType) {
        this.keyMaterialType_ = keyMaterialType.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyMaterialTypeValue(int i) {
        this.keyMaterialType_ = i;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(ByteString byteString) {
        byteString.getClass();
        this.value_ = byteString;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new KeyData();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<KeyData> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (KeyData.class) {
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

    public KeyMaterialType getKeyMaterialType() {
        KeyMaterialType keyMaterialTypeA = KeyMaterialType.a(this.keyMaterialType_);
        return keyMaterialTypeA == null ? KeyMaterialType.UNRECOGNIZED : keyMaterialTypeA;
    }

    public int getKeyMaterialTypeValue() {
        return this.keyMaterialType_;
    }

    public String getTypeUrl() {
        return this.typeUrl_;
    }

    public ByteString getTypeUrlBytes() {
        return ByteString.j(this.typeUrl_);
    }

    public ByteString getValue() {
        return this.value_;
    }

    public static Builder newBuilder(KeyData keyData) {
        return DEFAULT_INSTANCE.createBuilder(keyData);
    }

    public static KeyData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KeyData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static KeyData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KeyData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static KeyData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (KeyData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static KeyData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KeyData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static KeyData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (KeyData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static KeyData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KeyData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static KeyData parseFrom(InputStream inputStream) throws IOException {
        return (KeyData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeyData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KeyData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static KeyData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (KeyData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static KeyData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KeyData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
