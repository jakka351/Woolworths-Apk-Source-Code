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
public final class ChaCha20Poly1305KeyFormat extends GeneratedMessageLite<ChaCha20Poly1305KeyFormat, Builder> implements ChaCha20Poly1305KeyFormatOrBuilder {
    private static final ChaCha20Poly1305KeyFormat DEFAULT_INSTANCE;
    private static volatile Parser<ChaCha20Poly1305KeyFormat> PARSER;

    /* renamed from: com.google.crypto.tink.proto.ChaCha20Poly1305KeyFormat$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15034a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15034a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15034a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15034a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15034a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15034a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15034a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15034a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ChaCha20Poly1305KeyFormat, Builder> implements ChaCha20Poly1305KeyFormatOrBuilder {
    }

    static {
        ChaCha20Poly1305KeyFormat chaCha20Poly1305KeyFormat = new ChaCha20Poly1305KeyFormat();
        DEFAULT_INSTANCE = chaCha20Poly1305KeyFormat;
        GeneratedMessageLite.registerDefaultInstance(ChaCha20Poly1305KeyFormat.class, chaCha20Poly1305KeyFormat);
    }

    private ChaCha20Poly1305KeyFormat() {
    }

    public static ChaCha20Poly1305KeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ChaCha20Poly1305KeyFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChaCha20Poly1305KeyFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ChaCha20Poly1305KeyFormat> parser() {
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
                return new ChaCha20Poly1305KeyFormat();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<ChaCha20Poly1305KeyFormat> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ChaCha20Poly1305KeyFormat.class) {
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

    public static Builder newBuilder(ChaCha20Poly1305KeyFormat chaCha20Poly1305KeyFormat) {
        return DEFAULT_INSTANCE.createBuilder(chaCha20Poly1305KeyFormat);
    }

    public static ChaCha20Poly1305KeyFormat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ChaCha20Poly1305KeyFormat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ChaCha20Poly1305KeyFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ChaCha20Poly1305KeyFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ChaCha20Poly1305KeyFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ChaCha20Poly1305KeyFormat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ChaCha20Poly1305KeyFormat parseFrom(InputStream inputStream) throws IOException {
        return (ChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChaCha20Poly1305KeyFormat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ChaCha20Poly1305KeyFormat parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ChaCha20Poly1305KeyFormat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChaCha20Poly1305KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
