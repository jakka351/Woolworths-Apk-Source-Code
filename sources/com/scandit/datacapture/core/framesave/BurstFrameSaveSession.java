package com.scandit.datacapture.core.framesave;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.framesave.NativeBurstFrameSaveConfiguration;
import com.scandit.datacapture.core.internal.module.framesave.NativeBurstFrameSaveSession;
import com.scandit.datacapture.core.internal.module.framesave.NativeFrameSaveSession;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0002\u0019\u001aJ\t\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001J\t\u0010\u000b\u001a\u00020\tH\u0097\u0001J\t\u0010\f\u001a\u00020\tH\u0097\u0001J\u0011\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001J\t\u0010\u000e\u001a\u00020\tH\u0097\u0001J\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSession;", "Lcom/scandit/datacapture/core/framesave/FrameSaveSession;", "Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSessionProxy;", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeFrameSaveSession;", "_frameSaveSessionImpl", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeBurstFrameSaveSession;", "_impl", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "", "addToContext", "disable", "enable", "removeFromContext", "save", "Lcom/scandit/datacapture/core/framesave/FrameSaveSessionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "removeListener", "Ljava/util/concurrent/CopyOnWriteArraySet;", "b", "Ljava/util/concurrent/CopyOnWriteArraySet;", "getListeners$scandit_capture_core", "()Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Companion", "com/scandit/datacapture/core/framesave/a", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BurstFrameSaveSession implements FrameSaveSession, BurstFrameSaveSessionProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int DEFAULT_BURST_SIZE = 3;

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BurstFrameSaveSessionProxyAdapter f18502a;

    /* renamed from: b, reason: from kotlin metadata */
    private final CopyOnWriteArraySet listeners;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSession$Companion;", "", "Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSession;", "create", "", "burstSize", "Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSession$Companion$Builder;", "builder", "DEFAULT_BURST_SIZE", "I", "Builder", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\u000b¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSession$Companion$Builder;", "", "Lcom/scandit/datacapture/core/framesave/FileFormat;", "format", "fileFormat", "", "size", "burstSize", "Ljava/io/File;", "directory", "saveToLocalDirectory", "Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSession;", "build", "<init>", "()V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
        @SourceDebugExtension
        public static final class Builder {
            private File c;

            /* renamed from: a, reason: collision with root package name */
            private int f18503a = 3;
            private FileFormat b = FileFormat.SC_RAW;
            private String d = "";

            @NotNull
            public final BurstFrameSaveSession build() {
                NativeBurstFrameSaveConfiguration nativeBurstFrameSaveConfigurationForRemoteStorage;
                File file = this.c;
                if (file == null || (nativeBurstFrameSaveConfigurationForRemoteStorage = NativeBurstFrameSaveConfiguration.forLocalStorage(file.getAbsolutePath(), this.f18503a, this.b, this.d)) == null) {
                    nativeBurstFrameSaveConfigurationForRemoteStorage = NativeBurstFrameSaveConfiguration.forRemoteStorage(this.f18503a, this.b, this.d);
                }
                NativeBurstFrameSaveSession impl = NativeBurstFrameSaveSession.create(nativeBurstFrameSaveConfigurationForRemoteStorage);
                Intrinsics.g(impl, "impl");
                return new BurstFrameSaveSession(impl, null);
            }

            @NotNull
            public final Builder burstSize(int size) {
                this.f18503a = size;
                return this;
            }

            @VisibleForTesting
            @NotNull
            public final Builder fileFormat(@NotNull FileFormat format) {
                Intrinsics.h(format, "format");
                this.b = format;
                return this;
            }

            @NotNull
            public final Builder saveToLocalDirectory(@NotNull File directory) {
                Intrinsics.h(directory, "directory");
                this.c = directory;
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
        public final BurstFrameSaveSession create() {
            return builder().build();
        }

        private Companion() {
        }

        @Deprecated
        @JvmStatic
        @NotNull
        public final BurstFrameSaveSession create(int burstSize) {
            return builder().burstSize(burstSize).build();
        }
    }

    public /* synthetic */ BurstFrameSaveSession(NativeBurstFrameSaveSession nativeBurstFrameSaveSession, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBurstFrameSaveSession);
    }

    @JvmStatic
    @NotNull
    public static final Companion.Builder builder() {
        return INSTANCE.builder();
    }

    @JvmStatic
    @NotNull
    public static final BurstFrameSaveSession create() {
        return INSTANCE.create();
    }

    @Override // com.scandit.datacapture.core.framesave.FrameSaveSession, com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    @NativeImpl
    @NotNull
    /* renamed from: _frameSaveSessionImpl */
    public NativeFrameSaveSession getC() {
        return this.f18502a.getC();
    }

    @Override // com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBurstFrameSaveSession getF18504a() {
        return this.f18502a.getF18504a();
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
        this.f18502a.addToContext(dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    @ProxyFunction
    public void disable() {
        this.f18502a.disable();
    }

    @Override // com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    @ProxyFunction
    public void enable() {
        this.f18502a.enable();
    }

    @NotNull
    public final CopyOnWriteArraySet<FrameSaveSessionListener> getListeners$scandit_capture_core() {
        return this.listeners;
    }

    @Override // com.scandit.datacapture.core.framesave.FrameSaveSession, com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    @ProxyFunction
    public void removeFromContext(@NotNull DataCaptureContext dataCaptureContext) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        this.f18502a.removeFromContext(dataCaptureContext);
    }

    public final void removeListener(@NotNull FrameSaveSessionListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.listeners.remove(listener)) {
            listener.onObservationStopped(this);
        }
    }

    @Override // com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    @ProxyFunction
    public void save() {
        this.f18502a.save();
    }

    private BurstFrameSaveSession(NativeBurstFrameSaveSession nativeBurstFrameSaveSession) {
        this.f18502a = new BurstFrameSaveSessionProxyAdapter(nativeBurstFrameSaveSession, null, 2, 0 == true ? 1 : 0);
        this.listeners = new CopyOnWriteArraySet();
        nativeBurstFrameSaveSession.addListenerAsync(new FrameSaveSessionListenerReversedAdapter(new a(this), this, null, 4, null));
    }

    @Deprecated
    @JvmStatic
    @NotNull
    public static final BurstFrameSaveSession create(int i) {
        return INSTANCE.create(i);
    }
}
