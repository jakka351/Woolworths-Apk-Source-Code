package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.HkdfPrfParams;
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
public final class HkdfPrfKey extends GeneratedMessageLite<HkdfPrfKey, Builder> implements HkdfPrfKeyOrBuilder {
    private static final HkdfPrfKey DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser<HkdfPrfKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.e;
    private HkdfPrfParams params_;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.HkdfPrfKey$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15050a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15050a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15050a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15050a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15050a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15050a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15050a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15050a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<HkdfPrfKey, Builder> implements HkdfPrfKeyOrBuilder {
        public Builder() {
            super(HkdfPrfKey.DEFAULT_INSTANCE);
        }
    }

    static {
        HkdfPrfKey hkdfPrfKey = new HkdfPrfKey();
        DEFAULT_INSTANCE = hkdfPrfKey;
        GeneratedMessageLite.registerDefaultInstance(HkdfPrfKey.class, hkdfPrfKey);
    }

    private HkdfPrfKey() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyValue() {
        this.keyValue_ = getDefaultInstance().getKeyValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static HkdfPrfKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(HkdfPrfParams hkdfPrfParams) {
        hkdfPrfParams.getClass();
        HkdfPrfParams hkdfPrfParams2 = this.params_;
        if (hkdfPrfParams2 == null || hkdfPrfParams2 == HkdfPrfParams.getDefaultInstance()) {
            this.params_ = hkdfPrfParams;
            return;
        }
        HkdfPrfParams.Builder builderNewBuilder = HkdfPrfParams.newBuilder(this.params_);
        builderNewBuilder.j(hkdfPrfParams);
        this.params_ = (HkdfPrfParams) builderNewBuilder.l();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static HkdfPrfKey parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HkdfPrfKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HkdfPrfKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HkdfPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<HkdfPrfKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyValue(ByteString byteString) {
        byteString.getClass();
        this.keyValue_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(HkdfPrfParams hkdfPrfParams) {
        hkdfPrfParams.getClass();
        this.params_ = hkdfPrfParams;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new HkdfPrfKey();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<HkdfPrfKey> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (HkdfPrfKey.class) {
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

    public HkdfPrfParams getParams() {
        HkdfPrfParams hkdfPrfParams = this.params_;
        return hkdfPrfParams == null ? HkdfPrfParams.getDefaultInstance() : hkdfPrfParams;
    }

    public int getVersion() {
        return this.version_;
    }

    public boolean hasParams() {
        return this.params_ != null;
    }

    public static Builder newBuilder(HkdfPrfKey hkdfPrfKey) {
        return DEFAULT_INSTANCE.createBuilder(hkdfPrfKey);
    }

    public static HkdfPrfKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HkdfPrfKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HkdfPrfKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HkdfPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static HkdfPrfKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HkdfPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static HkdfPrfKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HkdfPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static HkdfPrfKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HkdfPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HkdfPrfKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HkdfPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static HkdfPrfKey parseFrom(InputStream inputStream) throws IOException {
        return (HkdfPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HkdfPrfKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HkdfPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HkdfPrfKey parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HkdfPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static HkdfPrfKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HkdfPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
