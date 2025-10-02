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

/* loaded from: classes6.dex */
public final class Ed25519KeyFormat extends GeneratedMessageLite<Ed25519KeyFormat, Builder> implements Ed25519KeyFormatOrBuilder {
    private static final Ed25519KeyFormat DEFAULT_INSTANCE;
    private static volatile Parser<Ed25519KeyFormat> PARSER;

    /* renamed from: com.google.crypto.tink.proto.Ed25519KeyFormat$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15045a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15045a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15045a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15045a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15045a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15045a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15045a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15045a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Ed25519KeyFormat, Builder> implements Ed25519KeyFormatOrBuilder {
    }

    static {
        Ed25519KeyFormat ed25519KeyFormat = new Ed25519KeyFormat();
        DEFAULT_INSTANCE = ed25519KeyFormat;
        GeneratedMessageLite.registerDefaultInstance(Ed25519KeyFormat.class, ed25519KeyFormat);
    }

    private Ed25519KeyFormat() {
    }

    public static Ed25519KeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Ed25519KeyFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Ed25519KeyFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Ed25519KeyFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Ed25519KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Ed25519KeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new Ed25519KeyFormat();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Ed25519KeyFormat> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Ed25519KeyFormat.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser();
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

    public static Builder newBuilder(Ed25519KeyFormat ed25519KeyFormat) {
        return DEFAULT_INSTANCE.createBuilder(ed25519KeyFormat);
    }

    public static Ed25519KeyFormat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Ed25519KeyFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Ed25519KeyFormat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Ed25519KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Ed25519KeyFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Ed25519KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Ed25519KeyFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Ed25519KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Ed25519KeyFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Ed25519KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Ed25519KeyFormat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Ed25519KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Ed25519KeyFormat parseFrom(InputStream inputStream) throws IOException {
        return (Ed25519KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Ed25519KeyFormat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Ed25519KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Ed25519KeyFormat parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Ed25519KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Ed25519KeyFormat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Ed25519KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
