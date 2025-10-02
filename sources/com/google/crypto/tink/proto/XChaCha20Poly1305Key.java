package com.google.crypto.tink.proto;

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
public final class XChaCha20Poly1305Key extends GeneratedMessageLite<XChaCha20Poly1305Key, Builder> implements XChaCha20Poly1305KeyOrBuilder {
    private static final XChaCha20Poly1305Key DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile Parser<XChaCha20Poly1305Key> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.e;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.XChaCha20Poly1305Key$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15074a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15074a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15074a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15074a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15074a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15074a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15074a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15074a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<XChaCha20Poly1305Key, Builder> implements XChaCha20Poly1305KeyOrBuilder {
        public Builder() {
            super(XChaCha20Poly1305Key.DEFAULT_INSTANCE);
        }
    }

    static {
        XChaCha20Poly1305Key xChaCha20Poly1305Key = new XChaCha20Poly1305Key();
        DEFAULT_INSTANCE = xChaCha20Poly1305Key;
        GeneratedMessageLite.registerDefaultInstance(XChaCha20Poly1305Key.class, xChaCha20Poly1305Key);
    }

    private XChaCha20Poly1305Key() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyValue() {
        this.keyValue_ = getDefaultInstance().getKeyValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static XChaCha20Poly1305Key getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static XChaCha20Poly1305Key parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static XChaCha20Poly1305Key parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<XChaCha20Poly1305Key> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyValue(ByteString byteString) {
        byteString.getClass();
        this.keyValue_ = byteString;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new XChaCha20Poly1305Key();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<XChaCha20Poly1305Key> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (XChaCha20Poly1305Key.class) {
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

    public int getVersion() {
        return this.version_;
    }

    public static Builder newBuilder(XChaCha20Poly1305Key xChaCha20Poly1305Key) {
        return DEFAULT_INSTANCE.createBuilder(xChaCha20Poly1305Key);
    }

    public static XChaCha20Poly1305Key parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static XChaCha20Poly1305Key parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static XChaCha20Poly1305Key parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static XChaCha20Poly1305Key parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static XChaCha20Poly1305Key parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static XChaCha20Poly1305Key parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static XChaCha20Poly1305Key parseFrom(InputStream inputStream) throws IOException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static XChaCha20Poly1305Key parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static XChaCha20Poly1305Key parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static XChaCha20Poly1305Key parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
