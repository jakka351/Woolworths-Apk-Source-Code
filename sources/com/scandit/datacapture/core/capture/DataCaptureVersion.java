package com.scandit.datacapture.core.capture;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/capture/DataCaptureVersion;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "getProperty", "VERSION_STRING", "Ljava/lang/String;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class DataCaptureVersion {

    @NotNull
    public static final DataCaptureVersion INSTANCE = new DataCaptureVersion();

    @JvmField
    @NotNull
    public static final String VERSION_STRING;

    static {
        String version = NativeDataCaptureContext.getVersion();
        Intrinsics.g(version, "getVersion()");
        VERSION_STRING = version;
    }

    private DataCaptureVersion() {
    }

    @Nullable
    public final Object getProperty(@NotNull String name) {
        Intrinsics.h(name, "name");
        if (name.equals("lowLevelVersionString")) {
            return NativeDataCaptureContext.getEngineVersionNumber();
        }
        if (name.equals("lowLevelBuildString")) {
            return NativeDataCaptureContext.getEngineCommitHash();
        }
        return null;
    }
}
