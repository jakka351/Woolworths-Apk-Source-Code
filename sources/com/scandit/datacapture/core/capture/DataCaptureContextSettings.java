package com.scandit.datacapture.core.capture;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scandit.datacapture.core.internal.sdk.analytics.AnalyticsSettings;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0004H\u0097\u0001J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\b¨\u0006\u0010"}, d2 = {"Lcom/scandit/datacapture/core/capture/DataCaptureContextSettings;", "Lcom/scandit/datacapture/core/capture/DataCaptureContextSettingsProxy;", "()V", "impl", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContextSettings;", "(Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContextSettings;)V", "_impl", "getProperty", "", "key", "", "setProperty", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "value", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DataCaptureContextSettings implements DataCaptureContextSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ DataCaptureContextSettingsProxyAdapter f18430a;

    public DataCaptureContextSettings(@NotNull NativeDataCaptureContextSettings impl) {
        Intrinsics.h(impl, "impl");
        this.f18430a = new DataCaptureContextSettingsProxyAdapter(impl, null, 2, null);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextSettingsProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeDataCaptureContextSettings getF18431a() {
        return this.f18430a.getF18431a();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getProperty(@org.jetbrains.annotations.NotNull java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.h(r3, r0)
            int r0 = r3.hashCode()
            r1 = -1988438583(0xffffffff897ad5c9, float:-3.0193177E-33)
            if (r0 == r1) goto L41
            r1 = -1918698521(0xffffffff8da2fbe7, float:-1.0044664E-30)
            if (r0 == r1) goto L2b
            r1 = -1785958911(0xffffffff958c6e01, float:-5.6719105E-26)
            if (r0 == r1) goto L19
            goto L49
        L19:
            java.lang.String r0 = "enabledCpusBitset"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L22
            goto L49
        L22:
            com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings r3 = r2.getF18431a()
            java.lang.String r3 = r3.getEnabledCpusBitset()
            goto L57
        L2b:
            java.lang.String r0 = "numberOfEngineThreads"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L34
            goto L49
        L34:
            com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings r3 = r2.getF18431a()
            int r3 = r3.getNumberOfEngineThreads()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L57
        L41:
            java.lang.String r0 = "analyticsSettings"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4f
        L49:
            r3 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L57
        L4f:
            com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings r3 = r2.getF18431a()
            com.scandit.datacapture.core.internal.sdk.analytics.NativeAnalyticsSettings r3 = r3.getAnalyticsSettings()
        L57:
            java.lang.String r0 = "when (key) {\n        ANA…\n        else -> -1\n    }"
            kotlin.jvm.internal.Intrinsics.g(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.capture.DataCaptureContextSettings.getProperty(java.lang.String):java.lang.Object");
    }

    public final void setProperty(@NotNull String name, @NotNull Object value) {
        Intrinsics.h(name, "name");
        Intrinsics.h(value, "value");
        if (name.equals("analyticsSettings") && (value instanceof AnalyticsSettings)) {
            getF18431a().setAnalyticsSettings(((AnalyticsSettings) value).getF18647a());
            return;
        }
        if (name.equals("numberOfEngineThreads") && (value instanceof Integer)) {
            getF18431a().setNumberOfEngineThreads(((Number) value).intValue());
            return;
        }
        if (name.equals("enabledCpusBitset") && (value instanceof String)) {
            getF18431a().setEnabledCpusBitset((String) value);
            return;
        }
        if (value instanceof Boolean) {
            getF18431a().setBoolProperty(name, ((Boolean) value).booleanValue());
            return;
        }
        if (value instanceof Integer) {
            getF18431a().setIntProperty(name, ((Number) value).intValue());
        } else if (value instanceof Float) {
            getF18431a().setFloatProperty(name, ((Number) value).floatValue());
        } else if (value instanceof String) {
            getF18431a().setStringProperty(name, (String) value);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DataCaptureContextSettings() {
        NativeDataCaptureContextSettings nativeDataCaptureContextSettingsCreate = NativeDataCaptureContextSettings.create();
        Intrinsics.g(nativeDataCaptureContextSettingsCreate, "create()");
        this(nativeDataCaptureContextSettingsCreate);
    }
}
