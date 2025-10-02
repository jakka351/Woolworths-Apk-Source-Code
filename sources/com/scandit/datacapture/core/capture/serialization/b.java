package com.scandit.datacapture.core.capture.serialization;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureContextBuilder;
import com.scandit.datacapture.core.capture.DataCaptureContextSettings;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.serialization.FrameSourceDeserializer;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class b implements DataCaptureContextDeserializerHelper, DataCaptureDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    private DataCaptureContext f18455a;

    public b(FrameSourceDeserializer fsDeserializer) {
        Intrinsics.h(fsDeserializer, "fsDeserializer");
        new WeakReference(fsDeserializer);
    }

    public final DataCaptureContext a() {
        return this.f18455a;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper
    public final void clear() {
        this.f18455a = null;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerHelper
    public final DataCaptureContext createContext(String licenseKey, String deviceName, String externalId, String frameworkName, String str, DataCaptureContextSettings settings, String str2, String str3, String str4) {
        Intrinsics.h(licenseKey, "licenseKey");
        Intrinsics.h(deviceName, "deviceName");
        Intrinsics.h(externalId, "externalId");
        Intrinsics.h(frameworkName, "frameworkName");
        Intrinsics.h(settings, "settings");
        DataCaptureContextBuilder dataCaptureContextBuilderFrameworkName = DataCaptureContext.INSTANCE.builder(licenseKey).deviceName(deviceName).externalId(externalId).frameworkName(frameworkName);
        if (str != null) {
            dataCaptureContextBuilderFrameworkName.frameworkVersion(str);
        }
        DataCaptureContext dataCaptureContextBuild = dataCaptureContextBuilderFrameworkName.build();
        this.f18455a = dataCaptureContextBuild;
        return dataCaptureContextBuild;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerHelper
    public final void removeModeFromContext(DataCaptureContext dataCaptureContext, DataCaptureMode mode) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(mode, "mode");
        dataCaptureContext.removeMode(mode);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerHelper
    public final void setFrameSourceOnContext(DataCaptureContext context, FrameSource frameSource) {
        Intrinsics.h(context, "context");
        DataCaptureContext.setFrameSource$default(context, frameSource, null, 2, null);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerHelper
    public final void updateContextFromJson(DataCaptureContext dataCaptureContext, JsonValue json) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(json, "json");
    }
}
