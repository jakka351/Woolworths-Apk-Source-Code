package com.scandit.datacapture.core.framesave;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.framesave.NativeFrameSaveSession;
import com.scandit.datacapture.core.internal.module.framesave.NativeSequenceFrameSaveConfiguration;
import com.scandit.datacapture.core.internal.module.framesave.NativeSequenceFrameSaveSession;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0002\u001b\u001cJ\t\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0005\u001a\u00020\u0001H\u0097\u0001J\t\u0010\u0007\u001a\u00020\u0006H\u0097\u0001J\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0001H\u0097\u0001J\u0011\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0097\u0001J\u0011\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0097\u0001J\t\u0010\u000f\u001a\u00020\tH\u0097\u0001J\t\u0010\u0010\u001a\u00020\tH\u0097\u0001J\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/scandit/datacapture/core/framesave/EngineSequenceFrameSaveSession;", "Lcom/scandit/datacapture/core/framesave/FrameSaveSession;", "Lcom/scandit/datacapture/core/framesave/SequenceFrameSaveSessionProxy;", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeFrameSaveSession;", "_frameSaveSessionImpl", "_getFrameSaveSession", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeSequenceFrameSaveSession;", "_impl", "frameSaveSession", "", "_setFrameSaveSession", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "addToContext", "removeFromContext", "start", "stop", "Lcom/scandit/datacapture/core/framesave/FrameSaveSessionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "removeListener", "Ljava/util/concurrent/CopyOnWriteArraySet;", "b", "Ljava/util/concurrent/CopyOnWriteArraySet;", "getListeners$scandit_capture_core", "()Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Companion", "com/scandit/datacapture/core/framesave/c", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class EngineSequenceFrameSaveSession implements FrameSaveSession, SequenceFrameSaveSessionProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SequenceFrameSaveSessionProxyAdapter f18506a;

    /* renamed from: b, reason: from kotlin metadata */
    private final CopyOnWriteArraySet listeners;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/framesave/EngineSequenceFrameSaveSession$Companion;", "", "Lcom/scandit/datacapture/core/framesave/EngineSequenceFrameSaveSession;", "create", "Lcom/scandit/datacapture/core/framesave/EngineSequenceFrameSaveSession$Companion$Builder;", "builder", "Builder", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\b¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/core/framesave/EngineSequenceFrameSaveSession$Companion$Builder;", "", "Lcom/scandit/datacapture/core/framesave/FileFormat;", "format", "fileFormat", "Ljava/io/File;", "directory", "saveToLocalDirectory", "Lcom/scandit/datacapture/core/framesave/EngineSequenceFrameSaveSession;", "build", "<init>", "()V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
        @SourceDebugExtension
        public static final class Builder {
            private File b;

            /* renamed from: a, reason: collision with root package name */
            private FileFormat f18507a = FileFormat.SC_RAW;
            private String c = "";

            @NotNull
            public final EngineSequenceFrameSaveSession build() {
                NativeSequenceFrameSaveConfiguration nativeSequenceFrameSaveConfigurationForRemoteStorage;
                String absolutePath = AppAndroidEnvironment.INSTANCE.getApplicationContext().getCacheDir().getAbsolutePath();
                File file = this.b;
                if (file == null || (nativeSequenceFrameSaveConfigurationForRemoteStorage = NativeSequenceFrameSaveConfiguration.forLocalStorage(absolutePath, file.getAbsolutePath(), this.f18507a, this.c)) == null) {
                    nativeSequenceFrameSaveConfigurationForRemoteStorage = NativeSequenceFrameSaveConfiguration.forRemoteStorage(absolutePath, this.f18507a, this.c);
                }
                NativeSequenceFrameSaveSession impl = NativeSequenceFrameSaveSession.create(nativeSequenceFrameSaveConfigurationForRemoteStorage);
                Intrinsics.g(impl, "impl");
                return new EngineSequenceFrameSaveSession(impl, null);
            }

            @VisibleForTesting
            @NotNull
            public final Builder fileFormat(@NotNull FileFormat format) {
                Intrinsics.h(format, "format");
                this.f18507a = format;
                return this;
            }

            @NotNull
            public final Builder saveToLocalDirectory(@NotNull File directory) {
                Intrinsics.h(directory, "directory");
                this.b = directory;
                return this;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Builder builder() {
            return new Builder();
        }

        @JvmStatic
        @NotNull
        public final EngineSequenceFrameSaveSession create() {
            return builder().build();
        }

        private Companion() {
        }
    }

    public /* synthetic */ EngineSequenceFrameSaveSession(NativeSequenceFrameSaveSession nativeSequenceFrameSaveSession, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeSequenceFrameSaveSession);
    }

    @JvmStatic
    @NotNull
    public static final Companion.Builder builder() {
        return INSTANCE.builder();
    }

    @JvmStatic
    @NotNull
    public static final EngineSequenceFrameSaveSession create() {
        return INSTANCE.create();
    }

    @Override // com.scandit.datacapture.core.framesave.FrameSaveSession, com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    @NativeImpl
    @NotNull
    /* renamed from: _frameSaveSessionImpl */
    public NativeFrameSaveSession getC() {
        return this.f18506a.getC();
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    @NotNull
    public FrameSaveSession _getFrameSaveSession() {
        return this.f18506a._getFrameSaveSession();
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeSequenceFrameSaveSession getF18510a() {
        return this.f18506a.getF18510a();
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy
    @ProxySetter
    public void _setFrameSaveSession(@NotNull FrameSaveSession frameSaveSession) {
        Intrinsics.h(frameSaveSession, "frameSaveSession");
        this.f18506a._setFrameSaveSession(frameSaveSession);
    }

    public final void addListener(@NotNull FrameSaveSessionListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.listeners.add(listener)) {
            listener.onObservationStarted(this);
        }
    }

    @Override // com.scandit.datacapture.core.framesave.FrameSaveSession, com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    @ProxyFunction
    public void addToContext(@NotNull DataCaptureContext dataCaptureContext) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        this.f18506a.addToContext(dataCaptureContext);
    }

    @NotNull
    public final CopyOnWriteArraySet<FrameSaveSessionListener> getListeners$scandit_capture_core() {
        return this.listeners;
    }

    @Override // com.scandit.datacapture.core.framesave.FrameSaveSession, com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    @ProxyFunction
    public void removeFromContext(@NotNull DataCaptureContext dataCaptureContext) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        this.f18506a.removeFromContext(dataCaptureContext);
    }

    public final void removeListener(@NotNull FrameSaveSessionListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.listeners.remove(listener)) {
            listener.onObservationStopped(this);
        }
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy
    @ProxyFunction
    public void start() {
        this.f18506a.start();
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy
    @ProxyFunction
    public void stop() {
        this.f18506a.stop();
    }

    private EngineSequenceFrameSaveSession(NativeSequenceFrameSaveSession nativeSequenceFrameSaveSession) {
        this.f18506a = new SequenceFrameSaveSessionProxyAdapter(nativeSequenceFrameSaveSession, null, 2, 0 == true ? 1 : 0);
        this.listeners = new CopyOnWriteArraySet();
        nativeSequenceFrameSaveSession.addListenerAsync(new FrameSaveSessionListenerReversedAdapter(new c(this), this, null, 4, null));
    }
}
