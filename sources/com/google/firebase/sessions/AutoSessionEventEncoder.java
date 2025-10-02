package com.google.firebase.sessions;

import android.os.Build;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;

/* loaded from: classes.dex */
public final class AutoSessionEventEncoder implements Configurator {

    /* renamed from: a, reason: collision with root package name */
    public static final AutoSessionEventEncoder f15786a = new AutoSessionEventEncoder();

    public static final class AndroidApplicationInfoEncoder implements ObjectEncoder<AndroidApplicationInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final AndroidApplicationInfoEncoder f15787a = new AndroidApplicationInfoEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("packageName");
        public static final FieldDescriptor c = FieldDescriptor.b("versionName");
        public static final FieldDescriptor d = FieldDescriptor.b("appBuildVersion");
        public static final FieldDescriptor e = FieldDescriptor.b("deviceManufacturer");
        public static final FieldDescriptor f = FieldDescriptor.b("currentProcessDetails");
        public static final FieldDescriptor g = FieldDescriptor.b("appProcessDetails");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, androidApplicationInfo.f15784a);
            objectEncoderContext.add(c, androidApplicationInfo.b);
            objectEncoderContext.add(d, androidApplicationInfo.c);
            objectEncoderContext.add(e, Build.MANUFACTURER);
            objectEncoderContext.add(f, androidApplicationInfo.d);
            objectEncoderContext.add(g, androidApplicationInfo.e);
        }
    }

    public static final class ApplicationInfoEncoder implements ObjectEncoder<ApplicationInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final ApplicationInfoEncoder f15788a = new ApplicationInfoEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("appId");
        public static final FieldDescriptor c = FieldDescriptor.b("deviceModel");
        public static final FieldDescriptor d = FieldDescriptor.b("sessionSdkVersion");
        public static final FieldDescriptor e = FieldDescriptor.b("osVersion");
        public static final FieldDescriptor f = FieldDescriptor.b("logEnvironment");
        public static final FieldDescriptor g = FieldDescriptor.b("androidAppInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            ApplicationInfo applicationInfo = (ApplicationInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, applicationInfo.f15785a);
            objectEncoderContext.add(c, Build.MODEL);
            objectEncoderContext.add(d, "3.0.1");
            objectEncoderContext.add(e, Build.VERSION.RELEASE);
            objectEncoderContext.add(f, LogEnvironment.e);
            objectEncoderContext.add(g, applicationInfo.b);
        }
    }

    public static final class DataCollectionStatusEncoder implements ObjectEncoder<DataCollectionStatus> {

        /* renamed from: a, reason: collision with root package name */
        public static final DataCollectionStatusEncoder f15789a = new DataCollectionStatusEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("performance");
        public static final FieldDescriptor c = FieldDescriptor.b("crashlytics");
        public static final FieldDescriptor d = FieldDescriptor.b("sessionSamplingRate");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            DataCollectionStatus dataCollectionStatus = (DataCollectionStatus) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, dataCollectionStatus.f15795a);
            objectEncoderContext.add(c, dataCollectionStatus.b);
            objectEncoderContext.add(d, dataCollectionStatus.c);
        }
    }

    public static final class ProcessDetailsEncoder implements ObjectEncoder<ProcessDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProcessDetailsEncoder f15790a = new ProcessDetailsEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("processName");
        public static final FieldDescriptor c = FieldDescriptor.b("pid");
        public static final FieldDescriptor d = FieldDescriptor.b("importance");
        public static final FieldDescriptor e = FieldDescriptor.b("defaultProcess");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            ProcessDetails processDetails = (ProcessDetails) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, processDetails.f15810a);
            objectEncoderContext.add(c, processDetails.b);
            objectEncoderContext.add(d, processDetails.c);
            objectEncoderContext.add(e, processDetails.d);
        }
    }

    public static final class SessionEventEncoder implements ObjectEncoder<SessionEvent> {

        /* renamed from: a, reason: collision with root package name */
        public static final SessionEventEncoder f15791a = new SessionEventEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("eventType");
        public static final FieldDescriptor c = FieldDescriptor.b("sessionData");
        public static final FieldDescriptor d = FieldDescriptor.b("applicationInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            SessionEvent sessionEvent = (SessionEvent) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            sessionEvent.getClass();
            objectEncoderContext.add(b, EventType.e);
            objectEncoderContext.add(c, sessionEvent.f15817a);
            objectEncoderContext.add(d, sessionEvent.b);
        }
    }

    public static final class SessionInfoEncoder implements ObjectEncoder<SessionInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final SessionInfoEncoder f15792a = new SessionInfoEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("sessionId");
        public static final FieldDescriptor c = FieldDescriptor.b("firstSessionId");
        public static final FieldDescriptor d = FieldDescriptor.b("sessionIndex");
        public static final FieldDescriptor e = FieldDescriptor.b("eventTimestampUs");
        public static final FieldDescriptor f = FieldDescriptor.b("dataCollectionStatus");
        public static final FieldDescriptor g = FieldDescriptor.b("firebaseInstallationId");
        public static final FieldDescriptor h = FieldDescriptor.b("firebaseAuthenticationToken");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            SessionInfo sessionInfo = (SessionInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, sessionInfo.f15823a);
            objectEncoderContext.add(c, sessionInfo.b);
            objectEncoderContext.add(d, sessionInfo.c);
            objectEncoderContext.add(e, sessionInfo.d);
            objectEncoderContext.add(f, sessionInfo.e);
            objectEncoderContext.add(g, sessionInfo.f);
            objectEncoderContext.add(h, sessionInfo.g);
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public final void configure(EncoderConfig encoderConfig) {
        encoderConfig.registerEncoder(SessionEvent.class, SessionEventEncoder.f15791a);
        encoderConfig.registerEncoder(SessionInfo.class, SessionInfoEncoder.f15792a);
        encoderConfig.registerEncoder(DataCollectionStatus.class, DataCollectionStatusEncoder.f15789a);
        encoderConfig.registerEncoder(ApplicationInfo.class, ApplicationInfoEncoder.f15788a);
        encoderConfig.registerEncoder(AndroidApplicationInfo.class, AndroidApplicationInfoEncoder.f15787a);
        encoderConfig.registerEncoder(ProcessDetails.class, ProcessDetailsEncoder.f15790a);
    }
}
