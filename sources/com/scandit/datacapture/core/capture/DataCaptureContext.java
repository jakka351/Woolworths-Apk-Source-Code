package com.scandit.datacapture.core.capture;

import android.content.res.AssetManager;
import android.os.Build;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.core.L1;
import com.scandit.datacapture.core.N6;
import com.scandit.datacapture.core.imu.ImuDataCollector;
import com.scandit.datacapture.core.internal.module.capture.NativeDeviceIdUtils;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.capture.AssetResourceLoader;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeLicenseInfo;
import com.scandit.datacapture.core.internal.sdk.capture.NativeLicensedFeature;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.init.CoreLibraryLoader;
import com.scandit.datacapture.core.internal.sdk.source.NativeAndroidCamera;
import com.scandit.datacapture.core.license.LicenseInfo;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 L2\u00020\u0001:\u0005LMNOPB\u001b\b\u0000\u0012\u0006\u0010G\u001a\u00020\u0007\u0012\b\b\u0002\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KJ\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\t\u0010\u0006\u001a\u00020\u0000H\u0097\u0001J\t\u0010\b\u001a\u00020\u0007H\u0097\u0001J\t\u0010\t\u001a\u00020\u0004H\u0097\u0001J\u0011\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0000H\u0097\u0001J\u0013\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0097\u0001J\u0011\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0097\u0001J\u001e\u0010\u0016\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007J\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u001bJ\u000e\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010 \u001a\u00020\fJ\u0006\u0010!\u001a\u00020\fJ\u0006\u0010#\u001a\u00020\"J\u000e\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\"J\u000e\u0010(\u001a\u00020\"2\u0006\u0010'\u001a\u00020&R$\u0010/\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R \u00105\u001a\b\u0012\u0004\u0012\u00020\u0017008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u00108\u001a\b\u0012\u0004\u0012\u00020\u001b008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00104R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b9\u0010,R\u001c\u0010>\u001a\u0004\u0018\u00010&8FX\u0087\u0004¢\u0006\f\u0012\u0004\b<\u0010=\u001a\u0004\b:\u0010;R\u0013\u0010B\u001a\u0004\u0018\u00010?8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00020C8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006Q"}, d2 = {"Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "Lcom/scandit/datacapture/core/capture/DataCaptureContextProxy;", "Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "mode", "Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "_addModeAsyncWrapped", "_context", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "_impl", "_removeAllModesAsyncWrapped", "_removeModeAsyncWrapped", "dataCaptureContext", "", "_setContext", "Lcom/scandit/datacapture/core/source/FrameSource;", "frameSource", "_setFrameSourceAsyncWrapped", "Lcom/scandit/datacapture/core/capture/DataCaptureContextSettings;", "settings", "applySettings", "Ljava/lang/Runnable;", "whenDone", "setFrameSource", "Lcom/scandit/datacapture/core/capture/DataCaptureContextListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "removeListener", "Lcom/scandit/datacapture/core/capture/DataCaptureContextFrameListener;", "addFrameListener", "removeFrameListener", "addMode", "removeMode", "removeAllModes", "release", "", "_isCameraTimestampsRealtime", "enable", "_setShouldUseImuData", "", "featureName", "isFeatureSupported", "b", "Lcom/scandit/datacapture/core/source/FrameSource;", "get_frameSource$scandit_capture_core", "()Lcom/scandit/datacapture/core/source/FrameSource;", "set_frameSource$scandit_capture_core", "(Lcom/scandit/datacapture/core/source/FrameSource;)V", "_frameSource", "Ljava/util/concurrent/CopyOnWriteArraySet;", "f", "Ljava/util/concurrent/CopyOnWriteArraySet;", "getListeners$scandit_capture_core", "()Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "g", "getFrameListeners$scandit_capture_core", "frameListeners", "getFrameSource", "getDeviceId", "()Ljava/lang/String;", "getDeviceId$annotations", "()V", "deviceId", "Lcom/scandit/datacapture/core/license/LicenseInfo;", "getLicenseInfo", "()Lcom/scandit/datacapture/core/license/LicenseInfo;", "licenseInfo", "", "get_modes$scandit_capture_core", "()Ljava/util/Set;", "_modes", "impl", "Lcom/scandit/datacapture/core/capture/DataCaptureContextProxyAdapter;", "adapter", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;Lcom/scandit/datacapture/core/capture/DataCaptureContextProxyAdapter;)V", "Companion", "com/scandit/datacapture/core/capture/a", "com/scandit/datacapture/core/capture/b", "com/scandit/datacapture/core/capture/c", "com/scandit/datacapture/core/capture/d", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class DataCaptureContext implements DataCaptureContextProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final String DEVICE_ID;

    /* renamed from: a, reason: collision with root package name */
    private final DataCaptureContextProxyAdapter f18425a;

    /* renamed from: b, reason: from kotlin metadata */
    private FrameSource _frameSource;
    private final LinkedHashSet c;
    private final Object d;
    private boolean e;

    /* renamed from: f, reason: from kotlin metadata */
    private final CopyOnWriteArraySet listeners;

    /* renamed from: g, reason: from kotlin metadata */
    private final CopyOnWriteArraySet frameListeners;
    private final Function0 h;
    private final ImuDataCollector i;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007JE\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/core/capture/DataCaptureContext$Companion;", "", "", "licenseKey", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "forLicenseKey", "deviceName", "frameworkName", "frameworkVersion", "externalId", "Lcom/scandit/datacapture/core/capture/DataCaptureContextSettings;", "settings", "_forAllProperties$scandit_capture_core", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/scandit/datacapture/core/capture/DataCaptureContextSettings;)Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "_forAllProperties", "Lcom/scandit/datacapture/core/capture/DataCaptureContextBuilder;", "builder", "DEVICE_ID", "Ljava/lang/String;", "FRAMEWORK_NAME", "UNINITIALIZED_DEVICE_ID", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final File access$getWorkingDirectory(Companion companion) {
            companion.getClass();
            File noBackupFilesDir = AppAndroidEnvironment.INSTANCE.getApplicationContext().getNoBackupFilesDir();
            Intrinsics.g(noBackupFilesDir, "AppAndroidEnvironment.ap…nContext.noBackupFilesDir");
            return noBackupFilesDir;
        }

        @JvmStatic
        @NotNull
        public final DataCaptureContext _forAllProperties$scandit_capture_core(@NotNull String licenseKey, @NotNull String frameworkName, @Nullable String frameworkVersion, @Nullable String deviceName, @Nullable String externalId, @NotNull DataCaptureContextSettings settings) {
            Intrinsics.h(licenseKey, "licenseKey");
            Intrinsics.h(frameworkName, "frameworkName");
            Intrinsics.h(settings, "settings");
            return new DataCaptureContext(licenseKey, frameworkName, frameworkVersion, deviceName, externalId, settings, null);
        }

        @JvmStatic
        @NotNull
        public final DataCaptureContextBuilder builder(@NotNull String licenseKey) {
            Intrinsics.h(licenseKey, "licenseKey");
            return new DataCaptureContextBuilder(licenseKey);
        }

        @JvmStatic
        @NotNull
        public final DataCaptureContext forLicenseKey(@NotNull String licenseKey) {
            Intrinsics.h(licenseKey, "licenseKey");
            return builder(licenseKey).build();
        }

        private Companion() {
        }

        @Deprecated
        @JvmStatic
        @NotNull
        public final DataCaptureContext forLicenseKey(@NotNull String licenseKey, @Nullable String deviceName) {
            Intrinsics.h(licenseKey, "licenseKey");
            return builder(licenseKey).deviceName(deviceName).build();
        }
    }

    static {
        String strHashDeviceId;
        if (CoreLibraryLoader.INSTANCE.isInitialized$scandit_capture_core()) {
            strHashDeviceId = NativeDeviceIdUtils.hashDeviceId(new L1(AppAndroidEnvironment.INSTANCE.getApplicationContext()).a());
            Intrinsics.g(strHashDeviceId, "{\n            NativeDevi…)\n            )\n        }");
        } else {
            strHashDeviceId = "UNINITIALIZED_DEVICE_ID";
        }
        DEVICE_ID = strHashDeviceId;
    }

    public /* synthetic */ DataCaptureContext(String str, String str2, String str3, String str4, String str5, DataCaptureContextSettings dataCaptureContextSettings, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, dataCaptureContextSettings);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(DataCaptureContext this$0, FrameSource frameSource, Runnable runnable) {
        Intrinsics.h(this$0, "this$0");
        this$0._frameSource = frameSource;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(DataCaptureMode mode, DataCaptureContext this$0) {
        Intrinsics.h(mode, "$mode");
        Intrinsics.h(this$0, "this$0");
        mode._setDataCaptureContext(null);
        this$0.c.remove(mode);
    }

    @JvmStatic
    @NotNull
    public static final DataCaptureContextBuilder builder(@NotNull String str) {
        return INSTANCE.builder(str);
    }

    @JvmStatic
    @NotNull
    public static final DataCaptureContext forLicenseKey(@NotNull String str) {
        return INSTANCE.forLicenseKey(str);
    }

    @Deprecated
    public static /* synthetic */ void getDeviceId$annotations() {
    }

    public static /* synthetic */ void setFrameSource$default(DataCaptureContext dataCaptureContext, FrameSource frameSource, Runnable runnable, int i, Object obj) {
        if ((i & 2) != 0) {
            runnable = null;
        }
        dataCaptureContext.setFrameSource(frameSource, runnable);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @ProxyFunction(nativeName = "addModeAsyncWrapped")
    @NotNull
    public NativeWrappedFuture _addModeAsyncWrapped(@NotNull DataCaptureMode mode) {
        Intrinsics.h(mode, "mode");
        return this.f18425a._addModeAsyncWrapped(mode);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    @NotNull
    public DataCaptureContext _context() {
        return this.f18425a._context();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeDataCaptureContext getF18429a() {
        return this.f18425a.getF18429a();
    }

    public final boolean _isCameraTimestampsRealtime() {
        NativeAndroidCamera nativeAndroidCamera_impl;
        FrameSource frameSource = get_frameSource();
        Camera camera = frameSource instanceof Camera ? (Camera) frameSource : null;
        return (camera == null || (nativeAndroidCamera_impl = camera.getF18831a()) == null || !nativeAndroidCamera_impl.isTimestampRealtime()) ? false : true;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @ProxyFunction(nativeName = "removeAllModesAsyncWrapped")
    @NotNull
    public NativeWrappedFuture _removeAllModesAsyncWrapped() {
        return this.f18425a._removeAllModesAsyncWrapped();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @ProxyFunction(nativeName = "removeModeAsyncWrapped")
    @NotNull
    public NativeWrappedFuture _removeModeAsyncWrapped(@NotNull DataCaptureMode mode) {
        Intrinsics.h(mode, "mode");
        return this.f18425a._removeModeAsyncWrapped(mode);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @ProxySetter
    public void _setContext(@NotNull DataCaptureContext dataCaptureContext) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        this.f18425a._setContext(dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @ProxyFunction(nativeName = "setFrameSourceAsyncWrapped")
    @NotNull
    public NativeWrappedFuture _setFrameSourceAsyncWrapped(@Nullable FrameSource frameSource) {
        return this.f18425a._setFrameSourceAsyncWrapped(frameSource);
    }

    public final void _setShouldUseImuData(boolean enable) {
        this.i.setEnabled(enable);
        getF18429a().setShouldUseImuDataAsync(enable);
    }

    public final void addFrameListener(@NotNull DataCaptureContextFrameListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.frameListeners.add(listener)) {
            listener.onObservationStarted(this);
        }
    }

    public final void addListener(@NotNull DataCaptureContextListener listener) {
        boolean z;
        Intrinsics.h(listener, "listener");
        synchronized (this.d) {
            z = this.listeners.add(listener) ? this.e : false;
        }
        if (z) {
            listener.onObservationStarted(this);
        }
    }

    public final void addMode(@NotNull DataCaptureMode mode) {
        Intrinsics.h(mode, "mode");
        NativeExtensionsKt.andThen(_addModeAsyncWrapped(mode), new r(mode, this, 0));
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @ProxyFunction(nativeName = "applySettings")
    public void applySettings(@NotNull DataCaptureContextSettings settings) {
        Intrinsics.h(settings, "settings");
        this.f18425a.applySettings(settings);
    }

    @Nullable
    public final String getDeviceId() {
        String deviceId = getF18429a().getSettings().getDeviceId();
        Intrinsics.g(deviceId, "deviceId");
        if (StringsKt.D(deviceId)) {
            return null;
        }
        return deviceId;
    }

    @NotNull
    public final CopyOnWriteArraySet<DataCaptureContextFrameListener> getFrameListeners$scandit_capture_core() {
        return this.frameListeners;
    }

    @Nullable
    /* renamed from: getFrameSource, reason: from getter */
    public final FrameSource get_frameSource() {
        return this._frameSource;
    }

    @Nullable
    public final LicenseInfo getLicenseInfo() {
        NativeLicenseInfo licenseInfo = getF18429a().getLicenseInfo();
        if (licenseInfo != null) {
            return new LicenseInfo(licenseInfo);
        }
        return null;
    }

    @NotNull
    public final CopyOnWriteArraySet<DataCaptureContextListener> getListeners$scandit_capture_core() {
        return this.listeners;
    }

    @Nullable
    public final FrameSource get_frameSource$scandit_capture_core() {
        return this._frameSource;
    }

    public final /* synthetic */ Set get_modes$scandit_capture_core() {
        return this.c;
    }

    public final boolean isFeatureSupported(@NotNull String featureName) {
        Intrinsics.h(featureName, "featureName");
        if (featureName.equals("barcode-ar-full")) {
            return getF18429a().featureIsSupported(NativeLicensedFeature.BARCODE_AR_FULL);
        }
        return false;
    }

    public final void release() {
        AppAndroidEnvironment.INSTANCE.getAppLifecycleListener().deregisterOnActivityStoppedCallback(this.h);
        getF18429a().disposeAsync();
    }

    public final void removeAllModes() {
        NativeExtensionsKt.andThen(_removeAllModesAsyncWrapped(), new com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.f(this, 4));
    }

    public final void removeFrameListener(@NotNull DataCaptureContextFrameListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.frameListeners.remove(listener)) {
            listener.onObservationStopped(this);
        }
    }

    public final void removeListener(@NotNull DataCaptureContextListener listener) {
        boolean z;
        Intrinsics.h(listener, "listener");
        synchronized (this.d) {
            z = this.listeners.remove(listener) ? this.e : false;
        }
        if (z) {
            listener.onObservationStopped(this);
        }
    }

    public final void removeMode(@NotNull DataCaptureMode mode) {
        Intrinsics.h(mode, "mode");
        NativeExtensionsKt.andThen(_removeModeAsyncWrapped(mode), new r(mode, this, 1));
    }

    @JvmOverloads
    public final void setFrameSource(@Nullable FrameSource frameSource) {
        setFrameSource$default(this, frameSource, null, 2, null);
    }

    public final void set_frameSource$scandit_capture_core(@Nullable FrameSource frameSource) {
        this._frameSource = frameSource;
    }

    public DataCaptureContext(@NotNull NativeDataCaptureContext impl, @NotNull DataCaptureContextProxyAdapter adapter) {
        Intrinsics.h(impl, "impl");
        Intrinsics.h(adapter, "adapter");
        this.f18425a = adapter;
        this.c = new LinkedHashSet();
        Object obj = new Object();
        this.d = obj;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.listeners = copyOnWriteArraySet;
        this.frameListeners = new CopyOnWriteArraySet();
        e eVar = new e(this);
        this.h = eVar;
        this.i = new ImuDataCollector(new c(this));
        _setContext(this);
        int i = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ProxyCache proxyCache = null;
        impl.addListenerAsync(new DataCaptureContextListenerReversedAdapter(new b(this), this, proxyCache, i, defaultConstructorMarker), NativeDataCaptureContext.getListenerPriorityUser());
        impl.addFrameListenerAsync(new DataCaptureContextFrameListenerReversedAdapter(new a(this), this, proxyCache, i, defaultConstructorMarker));
        synchronized (obj) {
            copyOnWriteArraySet.add(new d());
        }
        AppAndroidEnvironment.INSTANCE.getAppLifecycleListener().registerOnActivityStoppedCallback(eVar);
    }

    @Deprecated
    @JvmStatic
    @NotNull
    public static final DataCaptureContext forLicenseKey(@NotNull String str, @Nullable String str2) {
        return INSTANCE.forLicenseKey(str, str2);
    }

    @JvmOverloads
    public final void setFrameSource(@Nullable FrameSource frameSource, @Nullable Runnable whenDone) {
        NativeExtensionsKt.andThen(_setFrameSourceAsyncWrapped(frameSource), new androidx.camera.core.processing.g(this, frameSource, whenDone, 22));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(DataCaptureMode mode, DataCaptureContext this$0) {
        Intrinsics.h(mode, "$mode");
        Intrinsics.h(this$0, "this$0");
        mode._setDataCaptureContext(this$0);
        this$0.c.add(mode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(DataCaptureContext this$0) {
        Intrinsics.h(this$0, "this$0");
        Iterator it = this$0.c.iterator();
        while (it.hasNext()) {
            ((DataCaptureMode) it.next())._setDataCaptureContext(null);
        }
        this$0.c.clear();
    }

    public /* synthetic */ DataCaptureContext(NativeDataCaptureContext nativeDataCaptureContext, DataCaptureContextProxyAdapter dataCaptureContextProxyAdapter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeDataCaptureContext, (i & 2) != 0 ? new DataCaptureContextProxyAdapter(nativeDataCaptureContext, null, 2, 0 == true ? 1 : 0) : dataCaptureContextProxyAdapter);
    }

    private DataCaptureContext(String str, String str2, String str3, String str4, String str5, DataCaptureContextSettings dataCaptureContextSettings) {
        String absolutePath = Companion.access$getWorkingDirectory(INSTANCE).getAbsolutePath();
        String str6 = Build.VERSION.RELEASE;
        String str7 = str2 == null ? "native" : str2;
        String str8 = Build.MODEL;
        AppAndroidEnvironment appAndroidEnvironment = AppAndroidEnvironment.INSTANCE;
        String packageName = appAndroidEnvironment.getApplicationContext().getPackageName();
        String strA = new L1(appAndroidEnvironment.getApplicationContext()).a();
        String str9 = str4 == null ? "" : str4;
        String str10 = str5 == null ? "" : str5;
        ArrayList arrayList = new ArrayList(N6.a(appAndroidEnvironment.getApplicationContext()));
        AssetManager assets = appAndroidEnvironment.getApplicationContext().getAssets();
        Intrinsics.g(assets, "AppAndroidEnvironment.applicationContext.assets");
        NativeDataCaptureContext nativeDataCaptureContextCreateWithDeviceName = NativeDataCaptureContext.createWithDeviceName(str, absolutePath, str6, str7, str3, str8, packageName, strA, str9, str10, arrayList, new AssetResourceLoader(assets), false, dataCaptureContextSettings.getF18431a());
        Intrinsics.g(nativeDataCaptureContextCreateWithDeviceName, "createWithDeviceName(\n  …ettings._impl()\n        )");
        this(nativeDataCaptureContextCreateWithDeviceName, null, 2, 0 == true ? 1 : 0);
    }
}
