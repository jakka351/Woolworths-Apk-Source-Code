package com.scandit.datacapture.core.capture;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\t¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/core/capture/DataCaptureContextBuilder;", "", "", "deviceName", "externalId", "frameworkName", "frameworkVersion", "Lcom/scandit/datacapture/core/capture/DataCaptureContextSettings;", "settings", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "build", "licenseKey", "<init>", "(Ljava/lang/String;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class DataCaptureContextBuilder {

    /* renamed from: a, reason: collision with root package name */
    private final String f18426a;
    private String b;
    private String c;
    private String d;
    private String e;
    private DataCaptureContextSettings f;

    public DataCaptureContextBuilder(@NotNull String licenseKey) {
        Intrinsics.h(licenseKey, "licenseKey");
        this.f18426a = licenseKey;
        this.d = "native";
        this.f = new DataCaptureContextSettings();
    }

    @NotNull
    public final DataCaptureContext build() {
        return DataCaptureContext.INSTANCE._forAllProperties$scandit_capture_core(this.f18426a, this.d, this.e, this.b, this.c, this.f);
    }

    @NotNull
    public final DataCaptureContextBuilder deviceName(@Nullable String deviceName) {
        this.b = deviceName;
        return this;
    }

    @NotNull
    public final DataCaptureContextBuilder externalId(@Nullable String externalId) {
        this.c = externalId;
        return this;
    }

    @NotNull
    public final DataCaptureContextBuilder frameworkName(@NotNull String frameworkName) {
        Intrinsics.h(frameworkName, "frameworkName");
        this.d = frameworkName;
        return this;
    }

    @NotNull
    public final DataCaptureContextBuilder frameworkVersion(@NotNull String frameworkVersion) {
        Intrinsics.h(frameworkVersion, "frameworkVersion");
        this.e = frameworkVersion;
        return this;
    }

    @NotNull
    public final DataCaptureContextBuilder settings(@NotNull DataCaptureContextSettings settings) {
        Intrinsics.h(settings, "settings");
        this.f = settings;
        return this;
    }
}
