package com.google.firebase.crashlytics.internal.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import com.salesforce.marketingcloud.storage.db.k;

/* loaded from: classes.dex */
public final class AutoCrashlyticsReportEncoder implements Configurator {

    /* renamed from: a, reason: collision with root package name */
    public static final AutoCrashlyticsReportEncoder f15302a = new AutoCrashlyticsReportEncoder();

    public static final class CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder implements ObjectEncoder<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder f15303a = new CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("arch");
        public static final FieldDescriptor c = FieldDescriptor.b("libraryName");
        public static final FieldDescriptor d = FieldDescriptor.b("buildId");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch = (CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, buildIdMappingForArch.b());
            objectEncoderContext.add(c, buildIdMappingForArch.d());
            objectEncoderContext.add(d, buildIdMappingForArch.c());
        }
    }

    public static final class CrashlyticsReportApplicationExitInfoEncoder implements ObjectEncoder<CrashlyticsReport.ApplicationExitInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportApplicationExitInfoEncoder f15304a = new CrashlyticsReportApplicationExitInfoEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("pid");
        public static final FieldDescriptor c = FieldDescriptor.b("processName");
        public static final FieldDescriptor d = FieldDescriptor.b("reasonCode");
        public static final FieldDescriptor e = FieldDescriptor.b("importance");
        public static final FieldDescriptor f = FieldDescriptor.b("pss");
        public static final FieldDescriptor g = FieldDescriptor.b("rss");
        public static final FieldDescriptor h = FieldDescriptor.b("timestamp");
        public static final FieldDescriptor i = FieldDescriptor.b("traceFile");
        public static final FieldDescriptor j = FieldDescriptor.b("buildIdMappingForArch");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.ApplicationExitInfo applicationExitInfo = (CrashlyticsReport.ApplicationExitInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, applicationExitInfo.d());
            objectEncoderContext.add(c, applicationExitInfo.e());
            objectEncoderContext.add(d, applicationExitInfo.g());
            objectEncoderContext.add(e, applicationExitInfo.c());
            objectEncoderContext.add(f, applicationExitInfo.f());
            objectEncoderContext.add(g, applicationExitInfo.h());
            objectEncoderContext.add(h, applicationExitInfo.i());
            objectEncoderContext.add(i, applicationExitInfo.j());
            objectEncoderContext.add(j, applicationExitInfo.b());
        }
    }

    public static final class CrashlyticsReportCustomAttributeEncoder implements ObjectEncoder<CrashlyticsReport.CustomAttribute> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportCustomAttributeEncoder f15305a = new CrashlyticsReportCustomAttributeEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("key");
        public static final FieldDescriptor c = FieldDescriptor.b("value");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.CustomAttribute customAttribute = (CrashlyticsReport.CustomAttribute) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, customAttribute.b());
            objectEncoderContext.add(c, customAttribute.c());
        }
    }

    public static final class CrashlyticsReportEncoder implements ObjectEncoder<CrashlyticsReport> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportEncoder f15306a = new CrashlyticsReportEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b(lllqqql.cc006300630063cc);
        public static final FieldDescriptor c = FieldDescriptor.b("gmpAppId");
        public static final FieldDescriptor d = FieldDescriptor.b(k.a.b);
        public static final FieldDescriptor e = FieldDescriptor.b("installationUuid");
        public static final FieldDescriptor f = FieldDescriptor.b("firebaseInstallationId");
        public static final FieldDescriptor g = FieldDescriptor.b("firebaseAuthenticationToken");
        public static final FieldDescriptor h = FieldDescriptor.b("appQualitySessionId");
        public static final FieldDescriptor i = FieldDescriptor.b("buildVersion");
        public static final FieldDescriptor j = FieldDescriptor.b("displayVersion");
        public static final FieldDescriptor k = FieldDescriptor.b("session");
        public static final FieldDescriptor l = FieldDescriptor.b("ndkPayload");
        public static final FieldDescriptor m = FieldDescriptor.b("appExitInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, crashlyticsReport.l());
            objectEncoderContext.add(c, crashlyticsReport.h());
            objectEncoderContext.add(d, crashlyticsReport.k());
            objectEncoderContext.add(e, crashlyticsReport.i());
            objectEncoderContext.add(f, crashlyticsReport.g());
            objectEncoderContext.add(g, crashlyticsReport.f());
            objectEncoderContext.add(h, crashlyticsReport.c());
            objectEncoderContext.add(i, crashlyticsReport.d());
            objectEncoderContext.add(j, crashlyticsReport.e());
            objectEncoderContext.add(k, crashlyticsReport.m());
            objectEncoderContext.add(l, crashlyticsReport.j());
            objectEncoderContext.add(m, crashlyticsReport.b());
        }
    }

    public static final class CrashlyticsReportFilesPayloadEncoder implements ObjectEncoder<CrashlyticsReport.FilesPayload> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportFilesPayloadEncoder f15307a = new CrashlyticsReportFilesPayloadEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("files");
        public static final FieldDescriptor c = FieldDescriptor.b("orgId");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.FilesPayload filesPayload = (CrashlyticsReport.FilesPayload) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, filesPayload.b());
            objectEncoderContext.add(c, filesPayload.c());
        }
    }

    public static final class CrashlyticsReportFilesPayloadFileEncoder implements ObjectEncoder<CrashlyticsReport.FilesPayload.File> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportFilesPayloadFileEncoder f15308a = new CrashlyticsReportFilesPayloadFileEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("filename");
        public static final FieldDescriptor c = FieldDescriptor.b("contents");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.FilesPayload.File file = (CrashlyticsReport.FilesPayload.File) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, file.c());
            objectEncoderContext.add(c, file.b());
        }
    }

    public static final class CrashlyticsReportSessionApplicationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Application> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionApplicationEncoder f15309a = new CrashlyticsReportSessionApplicationEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("identifier");
        public static final FieldDescriptor c = FieldDescriptor.b("version");
        public static final FieldDescriptor d = FieldDescriptor.b("displayVersion");
        public static final FieldDescriptor e = FieldDescriptor.b("organization");
        public static final FieldDescriptor f = FieldDescriptor.b("installationUuid");
        public static final FieldDescriptor g = FieldDescriptor.b("developmentPlatform");
        public static final FieldDescriptor h = FieldDescriptor.b("developmentPlatformVersion");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.Session.Application application = (CrashlyticsReport.Session.Application) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, application.e());
            objectEncoderContext.add(c, application.h());
            objectEncoderContext.add(d, application.d());
            objectEncoderContext.add(e, application.g());
            objectEncoderContext.add(f, application.f());
            objectEncoderContext.add(g, application.b());
            objectEncoderContext.add(h, application.c());
        }
    }

    public static final class CrashlyticsReportSessionApplicationOrganizationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Application.Organization> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionApplicationOrganizationEncoder f15310a = new CrashlyticsReportSessionApplicationOrganizationEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("clsId");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            ((CrashlyticsReport.Session.Application.Organization) obj).getClass();
            ((ObjectEncoderContext) obj2).add(b, (Object) null);
        }
    }

    public static final class CrashlyticsReportSessionDeviceEncoder implements ObjectEncoder<CrashlyticsReport.Session.Device> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionDeviceEncoder f15311a = new CrashlyticsReportSessionDeviceEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("arch");
        public static final FieldDescriptor c = FieldDescriptor.b("model");
        public static final FieldDescriptor d = FieldDescriptor.b("cores");
        public static final FieldDescriptor e = FieldDescriptor.b("ram");
        public static final FieldDescriptor f = FieldDescriptor.b("diskSpace");
        public static final FieldDescriptor g = FieldDescriptor.b("simulator");
        public static final FieldDescriptor h = FieldDescriptor.b("state");
        public static final FieldDescriptor i = FieldDescriptor.b("manufacturer");
        public static final FieldDescriptor j = FieldDescriptor.b("modelClass");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.Session.Device device = (CrashlyticsReport.Session.Device) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, device.b());
            objectEncoderContext.add(c, device.f());
            objectEncoderContext.add(d, device.c());
            objectEncoderContext.add(e, device.h());
            objectEncoderContext.add(f, device.d());
            objectEncoderContext.add(g, device.j());
            objectEncoderContext.add(h, device.i());
            objectEncoderContext.add(i, device.e());
            objectEncoderContext.add(j, device.g());
        }
    }

    public static final class CrashlyticsReportSessionEncoder implements ObjectEncoder<CrashlyticsReport.Session> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEncoder f15312a = new CrashlyticsReportSessionEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("generator");
        public static final FieldDescriptor c = FieldDescriptor.b("identifier");
        public static final FieldDescriptor d = FieldDescriptor.b("appQualitySessionId");
        public static final FieldDescriptor e = FieldDescriptor.b("startedAt");
        public static final FieldDescriptor f = FieldDescriptor.b("endedAt");
        public static final FieldDescriptor g = FieldDescriptor.b("crashed");
        public static final FieldDescriptor h = FieldDescriptor.b("app");
        public static final FieldDescriptor i = FieldDescriptor.b("user");
        public static final FieldDescriptor j = FieldDescriptor.b("os");
        public static final FieldDescriptor k = FieldDescriptor.b("device");
        public static final FieldDescriptor l = FieldDescriptor.b("events");
        public static final FieldDescriptor m = FieldDescriptor.b("generatorType");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.Session session = (CrashlyticsReport.Session) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, session.g());
            objectEncoderContext.add(c, session.i().getBytes(CrashlyticsReport.f15382a));
            objectEncoderContext.add(d, session.c());
            objectEncoderContext.add(e, session.k());
            objectEncoderContext.add(f, session.e());
            objectEncoderContext.add(g, session.m());
            objectEncoderContext.add(h, session.b());
            objectEncoderContext.add(i, session.l());
            objectEncoderContext.add(j, session.j());
            objectEncoderContext.add(k, session.d());
            objectEncoderContext.add(l, session.f());
            objectEncoderContext.add(m, session.h());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationEncoder f15313a = new CrashlyticsReportSessionEventApplicationEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("execution");
        public static final FieldDescriptor c = FieldDescriptor.b("customAttributes");
        public static final FieldDescriptor d = FieldDescriptor.b("internalKeys");
        public static final FieldDescriptor e = FieldDescriptor.b("background");
        public static final FieldDescriptor f = FieldDescriptor.b("currentProcessDetails");
        public static final FieldDescriptor g = FieldDescriptor.b("appProcessDetails");
        public static final FieldDescriptor h = FieldDescriptor.b("uiOrientation");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application application = (CrashlyticsReport.Session.Event.Application) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, application.f());
            objectEncoderContext.add(c, application.e());
            objectEncoderContext.add(d, application.g());
            objectEncoderContext.add(e, application.c());
            objectEncoderContext.add(f, application.d());
            objectEncoderContext.add(g, application.b());
            objectEncoderContext.add(h, application.h());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder f15314a = new CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("baseAddress");
        public static final FieldDescriptor c = FieldDescriptor.b("size");
        public static final FieldDescriptor d = FieldDescriptor.b(AppMeasurementSdk.ConditionalUserProperty.NAME);
        public static final FieldDescriptor e = FieldDescriptor.b("uuid");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage = (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, binaryImage.b());
            objectEncoderContext.add(c, binaryImage.d());
            objectEncoderContext.add(d, binaryImage.c());
            String strE = binaryImage.e();
            objectEncoderContext.add(e, strE != null ? strE.getBytes(CrashlyticsReport.f15382a) : null);
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationExecutionEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionEncoder f15315a = new CrashlyticsReportSessionEventApplicationExecutionEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("threads");
        public static final FieldDescriptor c = FieldDescriptor.b("exception");
        public static final FieldDescriptor d = FieldDescriptor.b("appExitInfo");
        public static final FieldDescriptor e = FieldDescriptor.b("signal");
        public static final FieldDescriptor f = FieldDescriptor.b("binaries");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, execution.f());
            objectEncoderContext.add(c, execution.d());
            objectEncoderContext.add(d, execution.b());
            objectEncoderContext.add(e, execution.e());
            objectEncoderContext.add(f, execution.c());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Exception> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder f15316a = new CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("type");
        public static final FieldDescriptor c = FieldDescriptor.b("reason");
        public static final FieldDescriptor d = FieldDescriptor.b("frames");
        public static final FieldDescriptor e = FieldDescriptor.b("causedBy");
        public static final FieldDescriptor f = FieldDescriptor.b("overflowCount");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application.Execution.Exception exception = (CrashlyticsReport.Session.Event.Application.Execution.Exception) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, exception.f());
            objectEncoderContext.add(c, exception.e());
            objectEncoderContext.add(d, exception.c());
            objectEncoderContext.add(e, exception.b());
            objectEncoderContext.add(f, exception.d());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationExecutionSignalEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Signal> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionSignalEncoder f15317a = new CrashlyticsReportSessionEventApplicationExecutionSignalEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b(AppMeasurementSdk.ConditionalUserProperty.NAME);
        public static final FieldDescriptor c = FieldDescriptor.b("code");
        public static final FieldDescriptor d = FieldDescriptor.b("address");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application.Execution.Signal signal = (CrashlyticsReport.Session.Event.Application.Execution.Signal) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, signal.d());
            objectEncoderContext.add(c, signal.c());
            objectEncoderContext.add(d, signal.b());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationExecutionThreadEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionThreadEncoder f15318a = new CrashlyticsReportSessionEventApplicationExecutionThreadEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b(AppMeasurementSdk.ConditionalUserProperty.NAME);
        public static final FieldDescriptor c = FieldDescriptor.b("importance");
        public static final FieldDescriptor d = FieldDescriptor.b("frames");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application.Execution.Thread thread = (CrashlyticsReport.Session.Event.Application.Execution.Thread) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, thread.d());
            objectEncoderContext.add(c, thread.c());
            objectEncoderContext.add(d, thread.b());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder f15319a = new CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("pc");
        public static final FieldDescriptor c = FieldDescriptor.b("symbol");
        public static final FieldDescriptor d = FieldDescriptor.b("file");
        public static final FieldDescriptor e = FieldDescriptor.b("offset");
        public static final FieldDescriptor f = FieldDescriptor.b("importance");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame = (CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, frame.e());
            objectEncoderContext.add(c, frame.f());
            objectEncoderContext.add(d, frame.b());
            objectEncoderContext.add(e, frame.d());
            objectEncoderContext.add(f, frame.c());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationProcessDetailsEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.ProcessDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationProcessDetailsEncoder f15320a = new CrashlyticsReportSessionEventApplicationProcessDetailsEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("processName");
        public static final FieldDescriptor c = FieldDescriptor.b("pid");
        public static final FieldDescriptor d = FieldDescriptor.b("importance");
        public static final FieldDescriptor e = FieldDescriptor.b("defaultProcess");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, processDetails.d());
            objectEncoderContext.add(c, processDetails.c());
            objectEncoderContext.add(d, processDetails.b());
            objectEncoderContext.add(e, processDetails.e());
        }
    }

    public static final class CrashlyticsReportSessionEventDeviceEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Device> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventDeviceEncoder f15321a = new CrashlyticsReportSessionEventDeviceEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("batteryLevel");
        public static final FieldDescriptor c = FieldDescriptor.b("batteryVelocity");
        public static final FieldDescriptor d = FieldDescriptor.b("proximityOn");
        public static final FieldDescriptor e = FieldDescriptor.b("orientation");
        public static final FieldDescriptor f = FieldDescriptor.b("ramUsed");
        public static final FieldDescriptor g = FieldDescriptor.b("diskUsed");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Device device = (CrashlyticsReport.Session.Event.Device) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, device.b());
            objectEncoderContext.add(c, device.c());
            objectEncoderContext.add(d, device.g());
            objectEncoderContext.add(e, device.e());
            objectEncoderContext.add(f, device.f());
            objectEncoderContext.add(g, device.d());
        }
    }

    public static final class CrashlyticsReportSessionEventEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventEncoder f15322a = new CrashlyticsReportSessionEventEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("timestamp");
        public static final FieldDescriptor c = FieldDescriptor.b("type");
        public static final FieldDescriptor d = FieldDescriptor.b("app");
        public static final FieldDescriptor e = FieldDescriptor.b("device");
        public static final FieldDescriptor f = FieldDescriptor.b("log");
        public static final FieldDescriptor g = FieldDescriptor.b("rollouts");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event event = (CrashlyticsReport.Session.Event) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, event.f());
            objectEncoderContext.add(c, event.g());
            objectEncoderContext.add(d, event.b());
            objectEncoderContext.add(e, event.c());
            objectEncoderContext.add(f, event.d());
            objectEncoderContext.add(g, event.e());
        }
    }

    public static final class CrashlyticsReportSessionEventLogEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Log> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventLogEncoder f15323a = new CrashlyticsReportSessionEventLogEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("content");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).add(b, ((CrashlyticsReport.Session.Event.Log) obj).b());
        }
    }

    public static final class CrashlyticsReportSessionEventRolloutAssignmentEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutAssignment> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventRolloutAssignmentEncoder f15324a = new CrashlyticsReportSessionEventRolloutAssignmentEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("rolloutVariant");
        public static final FieldDescriptor c = FieldDescriptor.b("parameterKey");
        public static final FieldDescriptor d = FieldDescriptor.b("parameterValue");
        public static final FieldDescriptor e = FieldDescriptor.b("templateVersion");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment = (CrashlyticsReport.Session.Event.RolloutAssignment) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, rolloutAssignment.d());
            objectEncoderContext.add(c, rolloutAssignment.b());
            objectEncoderContext.add(d, rolloutAssignment.c());
            objectEncoderContext.add(e, rolloutAssignment.e());
        }
    }

    public static final class CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder f15325a = new CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("rolloutId");
        public static final FieldDescriptor c = FieldDescriptor.b("variantId");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant = (CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, rolloutVariant.b());
            objectEncoderContext.add(c, rolloutVariant.c());
        }
    }

    public static final class CrashlyticsReportSessionEventRolloutsStateEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutsState> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventRolloutsStateEncoder f15326a = new CrashlyticsReportSessionEventRolloutsStateEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("assignments");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).add(b, ((CrashlyticsReport.Session.Event.RolloutsState) obj).b());
        }
    }

    public static final class CrashlyticsReportSessionOperatingSystemEncoder implements ObjectEncoder<CrashlyticsReport.Session.OperatingSystem> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionOperatingSystemEncoder f15327a = new CrashlyticsReportSessionOperatingSystemEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b(k.a.b);
        public static final FieldDescriptor c = FieldDescriptor.b("version");
        public static final FieldDescriptor d = FieldDescriptor.b("buildVersion");
        public static final FieldDescriptor e = FieldDescriptor.b("jailbroken");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.Session.OperatingSystem operatingSystem = (CrashlyticsReport.Session.OperatingSystem) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, operatingSystem.c());
            objectEncoderContext.add(c, operatingSystem.d());
            objectEncoderContext.add(d, operatingSystem.b());
            objectEncoderContext.add(e, operatingSystem.e());
        }
    }

    public static final class CrashlyticsReportSessionUserEncoder implements ObjectEncoder<CrashlyticsReport.Session.User> {

        /* renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionUserEncoder f15328a = new CrashlyticsReportSessionUserEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("identifier");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).add(b, ((CrashlyticsReport.Session.User) obj).b());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public final void configure(EncoderConfig encoderConfig) {
        CrashlyticsReportEncoder crashlyticsReportEncoder = CrashlyticsReportEncoder.f15306a;
        encoderConfig.registerEncoder(CrashlyticsReport.class, crashlyticsReportEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport.class, crashlyticsReportEncoder);
        CrashlyticsReportSessionEncoder crashlyticsReportSessionEncoder = CrashlyticsReportSessionEncoder.f15312a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.class, crashlyticsReportSessionEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session.class, crashlyticsReportSessionEncoder);
        CrashlyticsReportSessionApplicationEncoder crashlyticsReportSessionApplicationEncoder = CrashlyticsReportSessionApplicationEncoder.f15309a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Application.class, crashlyticsReportSessionApplicationEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Application.class, crashlyticsReportSessionApplicationEncoder);
        CrashlyticsReportSessionApplicationOrganizationEncoder crashlyticsReportSessionApplicationOrganizationEncoder = CrashlyticsReportSessionApplicationOrganizationEncoder.f15310a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Application.Organization.class, crashlyticsReportSessionApplicationOrganizationEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Application_Organization.class, crashlyticsReportSessionApplicationOrganizationEncoder);
        CrashlyticsReportSessionUserEncoder crashlyticsReportSessionUserEncoder = CrashlyticsReportSessionUserEncoder.f15328a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.User.class, crashlyticsReportSessionUserEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_User.class, crashlyticsReportSessionUserEncoder);
        CrashlyticsReportSessionOperatingSystemEncoder crashlyticsReportSessionOperatingSystemEncoder = CrashlyticsReportSessionOperatingSystemEncoder.f15327a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.OperatingSystem.class, crashlyticsReportSessionOperatingSystemEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_OperatingSystem.class, crashlyticsReportSessionOperatingSystemEncoder);
        CrashlyticsReportSessionDeviceEncoder crashlyticsReportSessionDeviceEncoder = CrashlyticsReportSessionDeviceEncoder.f15311a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Device.class, crashlyticsReportSessionDeviceEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Device.class, crashlyticsReportSessionDeviceEncoder);
        CrashlyticsReportSessionEventEncoder crashlyticsReportSessionEventEncoder = CrashlyticsReportSessionEventEncoder.f15322a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.class, crashlyticsReportSessionEventEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event.class, crashlyticsReportSessionEventEncoder);
        CrashlyticsReportSessionEventApplicationEncoder crashlyticsReportSessionEventApplicationEncoder = CrashlyticsReportSessionEventApplicationEncoder.f15313a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.class, crashlyticsReportSessionEventApplicationEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Application.class, crashlyticsReportSessionEventApplicationEncoder);
        CrashlyticsReportSessionEventApplicationExecutionEncoder crashlyticsReportSessionEventApplicationExecutionEncoder = CrashlyticsReportSessionEventApplicationExecutionEncoder.f15315a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.class, crashlyticsReportSessionEventApplicationExecutionEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.class, crashlyticsReportSessionEventApplicationExecutionEncoder);
        CrashlyticsReportSessionEventApplicationExecutionThreadEncoder crashlyticsReportSessionEventApplicationExecutionThreadEncoder = CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.f15318a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Thread.class, crashlyticsReportSessionEventApplicationExecutionThreadEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.class, crashlyticsReportSessionEventApplicationExecutionThreadEncoder);
        CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder = CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.f15319a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.class, crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.class, crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder);
        CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder crashlyticsReportSessionEventApplicationExecutionExceptionEncoder = CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.f15316a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Exception.class, crashlyticsReportSessionEventApplicationExecutionExceptionEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.class, crashlyticsReportSessionEventApplicationExecutionExceptionEncoder);
        CrashlyticsReportApplicationExitInfoEncoder crashlyticsReportApplicationExitInfoEncoder = CrashlyticsReportApplicationExitInfoEncoder.f15304a;
        encoderConfig.registerEncoder(CrashlyticsReport.ApplicationExitInfo.class, crashlyticsReportApplicationExitInfoEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_ApplicationExitInfo.class, crashlyticsReportApplicationExitInfoEncoder);
        CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder = CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder.f15303a;
        encoderConfig.registerEncoder(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.class, crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.class, crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder);
        CrashlyticsReportSessionEventApplicationExecutionSignalEncoder crashlyticsReportSessionEventApplicationExecutionSignalEncoder = CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.f15317a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Signal.class, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.class, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder = CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder.f15314a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.class, crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.class, crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder);
        CrashlyticsReportCustomAttributeEncoder crashlyticsReportCustomAttributeEncoder = CrashlyticsReportCustomAttributeEncoder.f15305a;
        encoderConfig.registerEncoder(CrashlyticsReport.CustomAttribute.class, crashlyticsReportCustomAttributeEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_CustomAttribute.class, crashlyticsReportCustomAttributeEncoder);
        CrashlyticsReportSessionEventApplicationProcessDetailsEncoder crashlyticsReportSessionEventApplicationProcessDetailsEncoder = CrashlyticsReportSessionEventApplicationProcessDetailsEncoder.f15320a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.ProcessDetails.class, crashlyticsReportSessionEventApplicationProcessDetailsEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.class, crashlyticsReportSessionEventApplicationProcessDetailsEncoder);
        CrashlyticsReportSessionEventDeviceEncoder crashlyticsReportSessionEventDeviceEncoder = CrashlyticsReportSessionEventDeviceEncoder.f15321a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Device.class, crashlyticsReportSessionEventDeviceEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Device.class, crashlyticsReportSessionEventDeviceEncoder);
        CrashlyticsReportSessionEventLogEncoder crashlyticsReportSessionEventLogEncoder = CrashlyticsReportSessionEventLogEncoder.f15323a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Log.class, crashlyticsReportSessionEventLogEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Log.class, crashlyticsReportSessionEventLogEncoder);
        CrashlyticsReportSessionEventRolloutsStateEncoder crashlyticsReportSessionEventRolloutsStateEncoder = CrashlyticsReportSessionEventRolloutsStateEncoder.f15326a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.RolloutsState.class, crashlyticsReportSessionEventRolloutsStateEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_RolloutsState.class, crashlyticsReportSessionEventRolloutsStateEncoder);
        CrashlyticsReportSessionEventRolloutAssignmentEncoder crashlyticsReportSessionEventRolloutAssignmentEncoder = CrashlyticsReportSessionEventRolloutAssignmentEncoder.f15324a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.RolloutAssignment.class, crashlyticsReportSessionEventRolloutAssignmentEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.class, crashlyticsReportSessionEventRolloutAssignmentEncoder);
        CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder crashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder = CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder.f15325a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.class, crashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.class, crashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder);
        CrashlyticsReportFilesPayloadEncoder crashlyticsReportFilesPayloadEncoder = CrashlyticsReportFilesPayloadEncoder.f15307a;
        encoderConfig.registerEncoder(CrashlyticsReport.FilesPayload.class, crashlyticsReportFilesPayloadEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_FilesPayload.class, crashlyticsReportFilesPayloadEncoder);
        CrashlyticsReportFilesPayloadFileEncoder crashlyticsReportFilesPayloadFileEncoder = CrashlyticsReportFilesPayloadFileEncoder.f15308a;
        encoderConfig.registerEncoder(CrashlyticsReport.FilesPayload.File.class, crashlyticsReportFilesPayloadFileEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_FilesPayload_File.class, crashlyticsReportFilesPayloadFileEncoder);
    }
}
