package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import com.salesforce.marketingcloud.storage.db.k;

/* loaded from: classes.dex */
public final class AutoBatchedLogRequestEncoder implements Configurator {

    /* renamed from: a, reason: collision with root package name */
    public static final AutoBatchedLogRequestEncoder f14394a = new AutoBatchedLogRequestEncoder();

    public static final class AndroidClientInfoEncoder implements ObjectEncoder<AndroidClientInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final AndroidClientInfoEncoder f14395a = new AndroidClientInfoEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b(lllqqql.cc006300630063cc);
        public static final FieldDescriptor c = FieldDescriptor.b("model");
        public static final FieldDescriptor d = FieldDescriptor.b("hardware");
        public static final FieldDescriptor e = FieldDescriptor.b("device");
        public static final FieldDescriptor f = FieldDescriptor.b("product");
        public static final FieldDescriptor g = FieldDescriptor.b("osBuild");
        public static final FieldDescriptor h = FieldDescriptor.b("manufacturer");
        public static final FieldDescriptor i = FieldDescriptor.b("fingerprint");
        public static final FieldDescriptor j = FieldDescriptor.b(k.a.n);
        public static final FieldDescriptor k = FieldDescriptor.b("country");
        public static final FieldDescriptor l = FieldDescriptor.b("mccMnc");
        public static final FieldDescriptor m = FieldDescriptor.b("applicationBuild");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            AndroidClientInfo androidClientInfo = (AndroidClientInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, androidClientInfo.m());
            objectEncoderContext.add(c, androidClientInfo.j());
            objectEncoderContext.add(d, androidClientInfo.f());
            objectEncoderContext.add(e, androidClientInfo.d());
            objectEncoderContext.add(f, androidClientInfo.l());
            objectEncoderContext.add(g, androidClientInfo.k());
            objectEncoderContext.add(h, androidClientInfo.h());
            objectEncoderContext.add(i, androidClientInfo.e());
            objectEncoderContext.add(j, androidClientInfo.g());
            objectEncoderContext.add(k, androidClientInfo.c());
            objectEncoderContext.add(l, androidClientInfo.i());
            objectEncoderContext.add(m, androidClientInfo.b());
        }
    }

    public static final class BatchedLogRequestEncoder implements ObjectEncoder<BatchedLogRequest> {

        /* renamed from: a, reason: collision with root package name */
        public static final BatchedLogRequestEncoder f14396a = new BatchedLogRequestEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("logRequest");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).add(b, ((BatchedLogRequest) obj).b());
        }
    }

    public static final class ClientInfoEncoder implements ObjectEncoder<ClientInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final ClientInfoEncoder f14397a = new ClientInfoEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("clientType");
        public static final FieldDescriptor c = FieldDescriptor.b("androidClientInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            ClientInfo clientInfo = (ClientInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, clientInfo.c());
            objectEncoderContext.add(c, clientInfo.b());
        }
    }

    public static final class ComplianceDataEncoder implements ObjectEncoder<ComplianceData> {

        /* renamed from: a, reason: collision with root package name */
        public static final ComplianceDataEncoder f14398a = new ComplianceDataEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("privacyContext");
        public static final FieldDescriptor c = FieldDescriptor.b("productIdOrigin");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            ComplianceData complianceData = (ComplianceData) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, complianceData.b());
            objectEncoderContext.add(c, complianceData.c());
        }
    }

    public static final class ExperimentIdsEncoder implements ObjectEncoder<ExperimentIds> {

        /* renamed from: a, reason: collision with root package name */
        public static final ExperimentIdsEncoder f14399a = new ExperimentIdsEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("clearBlob");
        public static final FieldDescriptor c = FieldDescriptor.b("encryptedBlob");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            ExperimentIds experimentIds = (ExperimentIds) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, experimentIds.b());
            objectEncoderContext.add(c, experimentIds.c());
        }
    }

    public static final class ExternalPRequestContextEncoder implements ObjectEncoder<ExternalPRequestContext> {

        /* renamed from: a, reason: collision with root package name */
        public static final ExternalPRequestContextEncoder f14400a = new ExternalPRequestContextEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("originAssociatedProductId");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).add(b, ((ExternalPRequestContext) obj).b());
        }
    }

    public static final class ExternalPrivacyContextEncoder implements ObjectEncoder<ExternalPrivacyContext> {

        /* renamed from: a, reason: collision with root package name */
        public static final ExternalPrivacyContextEncoder f14401a = new ExternalPrivacyContextEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("prequest");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).add(b, ((ExternalPrivacyContext) obj).b());
        }
    }

    public static final class LogEventEncoder implements ObjectEncoder<LogEvent> {

        /* renamed from: a, reason: collision with root package name */
        public static final LogEventEncoder f14402a = new LogEventEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("eventTimeMs");
        public static final FieldDescriptor c = FieldDescriptor.b("eventCode");
        public static final FieldDescriptor d = FieldDescriptor.b("complianceData");
        public static final FieldDescriptor e = FieldDescriptor.b("eventUptimeMs");
        public static final FieldDescriptor f = FieldDescriptor.b("sourceExtension");
        public static final FieldDescriptor g = FieldDescriptor.b("sourceExtensionJsonProto3");
        public static final FieldDescriptor h = FieldDescriptor.b("timezoneOffsetSeconds");
        public static final FieldDescriptor i = FieldDescriptor.b("networkConnectionInfo");
        public static final FieldDescriptor j = FieldDescriptor.b("experimentIds");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            LogEvent logEvent = (LogEvent) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, logEvent.c());
            objectEncoderContext.add(c, logEvent.b());
            objectEncoderContext.add(d, logEvent.a());
            objectEncoderContext.add(e, logEvent.d());
            objectEncoderContext.add(f, logEvent.g());
            objectEncoderContext.add(g, logEvent.h());
            objectEncoderContext.add(h, logEvent.i());
            objectEncoderContext.add(i, logEvent.f());
            objectEncoderContext.add(j, logEvent.e());
        }
    }

    public static final class LogRequestEncoder implements ObjectEncoder<LogRequest> {

        /* renamed from: a, reason: collision with root package name */
        public static final LogRequestEncoder f14403a = new LogRequestEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("requestTimeMs");
        public static final FieldDescriptor c = FieldDescriptor.b("requestUptimeMs");
        public static final FieldDescriptor d = FieldDescriptor.b("clientInfo");
        public static final FieldDescriptor e = FieldDescriptor.b("logSource");
        public static final FieldDescriptor f = FieldDescriptor.b("logSourceName");
        public static final FieldDescriptor g = FieldDescriptor.b("logEvent");
        public static final FieldDescriptor h = FieldDescriptor.b("qosTier");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            LogRequest logRequest = (LogRequest) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, logRequest.g());
            objectEncoderContext.add(c, logRequest.h());
            objectEncoderContext.add(d, logRequest.b());
            objectEncoderContext.add(e, logRequest.d());
            objectEncoderContext.add(f, logRequest.e());
            objectEncoderContext.add(g, logRequest.c());
            objectEncoderContext.add(h, logRequest.f());
        }
    }

    public static final class NetworkConnectionInfoEncoder implements ObjectEncoder<NetworkConnectionInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final NetworkConnectionInfoEncoder f14404a = new NetworkConnectionInfoEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("networkType");
        public static final FieldDescriptor c = FieldDescriptor.b("mobileSubtype");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, networkConnectionInfo.c());
            objectEncoderContext.add(c, networkConnectionInfo.b());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public final void configure(EncoderConfig encoderConfig) {
        BatchedLogRequestEncoder batchedLogRequestEncoder = BatchedLogRequestEncoder.f14396a;
        encoderConfig.registerEncoder(BatchedLogRequest.class, batchedLogRequestEncoder);
        encoderConfig.registerEncoder(AutoValue_BatchedLogRequest.class, batchedLogRequestEncoder);
        LogRequestEncoder logRequestEncoder = LogRequestEncoder.f14403a;
        encoderConfig.registerEncoder(LogRequest.class, logRequestEncoder);
        encoderConfig.registerEncoder(AutoValue_LogRequest.class, logRequestEncoder);
        ClientInfoEncoder clientInfoEncoder = ClientInfoEncoder.f14397a;
        encoderConfig.registerEncoder(ClientInfo.class, clientInfoEncoder);
        encoderConfig.registerEncoder(AutoValue_ClientInfo.class, clientInfoEncoder);
        AndroidClientInfoEncoder androidClientInfoEncoder = AndroidClientInfoEncoder.f14395a;
        encoderConfig.registerEncoder(AndroidClientInfo.class, androidClientInfoEncoder);
        encoderConfig.registerEncoder(AutoValue_AndroidClientInfo.class, androidClientInfoEncoder);
        LogEventEncoder logEventEncoder = LogEventEncoder.f14402a;
        encoderConfig.registerEncoder(LogEvent.class, logEventEncoder);
        encoderConfig.registerEncoder(AutoValue_LogEvent.class, logEventEncoder);
        ComplianceDataEncoder complianceDataEncoder = ComplianceDataEncoder.f14398a;
        encoderConfig.registerEncoder(ComplianceData.class, complianceDataEncoder);
        encoderConfig.registerEncoder(AutoValue_ComplianceData.class, complianceDataEncoder);
        ExternalPrivacyContextEncoder externalPrivacyContextEncoder = ExternalPrivacyContextEncoder.f14401a;
        encoderConfig.registerEncoder(ExternalPrivacyContext.class, externalPrivacyContextEncoder);
        encoderConfig.registerEncoder(AutoValue_ExternalPrivacyContext.class, externalPrivacyContextEncoder);
        ExternalPRequestContextEncoder externalPRequestContextEncoder = ExternalPRequestContextEncoder.f14400a;
        encoderConfig.registerEncoder(ExternalPRequestContext.class, externalPRequestContextEncoder);
        encoderConfig.registerEncoder(AutoValue_ExternalPRequestContext.class, externalPRequestContextEncoder);
        NetworkConnectionInfoEncoder networkConnectionInfoEncoder = NetworkConnectionInfoEncoder.f14404a;
        encoderConfig.registerEncoder(NetworkConnectionInfo.class, networkConnectionInfoEncoder);
        encoderConfig.registerEncoder(AutoValue_NetworkConnectionInfo.class, networkConnectionInfoEncoder);
        ExperimentIdsEncoder experimentIdsEncoder = ExperimentIdsEncoder.f14399a;
        encoderConfig.registerEncoder(ExperimentIds.class, experimentIdsEncoder);
        encoderConfig.registerEncoder(AutoValue_ExperimentIds.class, experimentIdsEncoder);
    }
}
