package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.EciesAeadDemParams;
import com.google.crypto.tink.proto.EciesHkdfKemParams;
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
public final class EciesAeadHkdfParams extends GeneratedMessageLite<EciesAeadHkdfParams, Builder> implements EciesAeadHkdfParamsOrBuilder {
    private static final EciesAeadHkdfParams DEFAULT_INSTANCE;
    public static final int DEM_PARAMS_FIELD_NUMBER = 2;
    public static final int EC_POINT_FORMAT_FIELD_NUMBER = 3;
    public static final int KEM_PARAMS_FIELD_NUMBER = 1;
    private static volatile Parser<EciesAeadHkdfParams> PARSER;
    private EciesAeadDemParams demParams_;
    private int ecPointFormat_;
    private EciesHkdfKemParams kemParams_;

    /* renamed from: com.google.crypto.tink.proto.EciesAeadHkdfParams$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15041a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15041a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15041a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15041a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15041a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15041a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15041a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15041a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<EciesAeadHkdfParams, Builder> implements EciesAeadHkdfParamsOrBuilder {
    }

    static {
        EciesAeadHkdfParams eciesAeadHkdfParams = new EciesAeadHkdfParams();
        DEFAULT_INSTANCE = eciesAeadHkdfParams;
        GeneratedMessageLite.registerDefaultInstance(EciesAeadHkdfParams.class, eciesAeadHkdfParams);
    }

    private EciesAeadHkdfParams() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDemParams() {
        this.demParams_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEcPointFormat() {
        this.ecPointFormat_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKemParams() {
        this.kemParams_ = null;
    }

    public static EciesAeadHkdfParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDemParams(EciesAeadDemParams eciesAeadDemParams) {
        eciesAeadDemParams.getClass();
        EciesAeadDemParams eciesAeadDemParams2 = this.demParams_;
        if (eciesAeadDemParams2 == null || eciesAeadDemParams2 == EciesAeadDemParams.getDefaultInstance()) {
            this.demParams_ = eciesAeadDemParams;
            return;
        }
        EciesAeadDemParams.Builder builderNewBuilder = EciesAeadDemParams.newBuilder(this.demParams_);
        builderNewBuilder.j(eciesAeadDemParams);
        this.demParams_ = (EciesAeadDemParams) builderNewBuilder.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKemParams(EciesHkdfKemParams eciesHkdfKemParams) {
        eciesHkdfKemParams.getClass();
        EciesHkdfKemParams eciesHkdfKemParams2 = this.kemParams_;
        if (eciesHkdfKemParams2 == null || eciesHkdfKemParams2 == EciesHkdfKemParams.getDefaultInstance()) {
            this.kemParams_ = eciesHkdfKemParams;
            return;
        }
        EciesHkdfKemParams.Builder builderNewBuilder = EciesHkdfKemParams.newBuilder(this.kemParams_);
        builderNewBuilder.j(eciesHkdfKemParams);
        this.kemParams_ = (EciesHkdfKemParams) builderNewBuilder.l();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EciesAeadHkdfParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EciesAeadHkdfParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EciesAeadHkdfParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDemParams(EciesAeadDemParams eciesAeadDemParams) {
        eciesAeadDemParams.getClass();
        this.demParams_ = eciesAeadDemParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEcPointFormat(EcPointFormat ecPointFormat) {
        this.ecPointFormat_ = ecPointFormat.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEcPointFormatValue(int i) {
        this.ecPointFormat_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKemParams(EciesHkdfKemParams eciesHkdfKemParams) {
        eciesHkdfKemParams.getClass();
        this.kemParams_ = eciesHkdfKemParams;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"kemParams_", "demParams_", "ecPointFormat_"});
            case 3:
                return new EciesAeadHkdfParams();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<EciesAeadHkdfParams> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (EciesAeadHkdfParams.class) {
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

    public EciesAeadDemParams getDemParams() {
        EciesAeadDemParams eciesAeadDemParams = this.demParams_;
        return eciesAeadDemParams == null ? EciesAeadDemParams.getDefaultInstance() : eciesAeadDemParams;
    }

    public EcPointFormat getEcPointFormat() {
        EcPointFormat ecPointFormatA = EcPointFormat.a(this.ecPointFormat_);
        return ecPointFormatA == null ? EcPointFormat.UNRECOGNIZED : ecPointFormatA;
    }

    public int getEcPointFormatValue() {
        return this.ecPointFormat_;
    }

    public EciesHkdfKemParams getKemParams() {
        EciesHkdfKemParams eciesHkdfKemParams = this.kemParams_;
        return eciesHkdfKemParams == null ? EciesHkdfKemParams.getDefaultInstance() : eciesHkdfKemParams;
    }

    public boolean hasDemParams() {
        return this.demParams_ != null;
    }

    public boolean hasKemParams() {
        return this.kemParams_ != null;
    }

    public static Builder newBuilder(EciesAeadHkdfParams eciesAeadHkdfParams) {
        return DEFAULT_INSTANCE.createBuilder(eciesAeadHkdfParams);
    }

    public static EciesAeadHkdfParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EciesAeadHkdfParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EciesAeadHkdfParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EciesAeadHkdfParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EciesAeadHkdfParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EciesAeadHkdfParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EciesAeadHkdfParams parseFrom(InputStream inputStream) throws IOException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EciesAeadHkdfParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EciesAeadHkdfParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EciesAeadHkdfParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EciesAeadHkdfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
