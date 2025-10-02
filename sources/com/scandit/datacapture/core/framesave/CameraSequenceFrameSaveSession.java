package com.scandit.datacapture.core.framesave;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.framesave.SingleFrameRecorder;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/core/framesave/CameraSequenceFrameSaveSession;", "", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "", "addToContext", "removeFromContext", "start", "stop", "Lcom/scandit/datacapture/core/framesave/CameraSequenceFrameSaveSessionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "removeListener", "onFrameSaveSuccess", "onFrameSaveFinished", "Ljava/util/concurrent/CopyOnWriteArraySet;", "d", "Ljava/util/concurrent/CopyOnWriteArraySet;", "getListeners$scandit_capture_core", "()Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Companion", "com/scandit/datacapture/core/framesave/b", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CameraSequenceFrameSaveSession {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final File f18505a;
    private SingleFrameRecorder b;
    private final b c;

    /* renamed from: d, reason: from kotlin metadata */
    private final CopyOnWriteArraySet listeners;
    private boolean e;
    private int f;
    private boolean g;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/core/framesave/CameraSequenceFrameSaveSession$Companion;", "", "Ljava/io/File;", "localPath", "Lcom/scandit/datacapture/core/framesave/CameraSequenceFrameSaveSession;", "create", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CameraSequenceFrameSaveSession create(@NotNull File localPath) {
            Intrinsics.h(localPath, "localPath");
            return new CameraSequenceFrameSaveSession(localPath, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ CameraSequenceFrameSaveSession(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    @JvmStatic
    @NotNull
    public static final CameraSequenceFrameSaveSession create(@NotNull File file) {
        return INSTANCE.create(file);
    }

    public final void addListener(@NotNull CameraSequenceFrameSaveSessionListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.listeners.add(listener)) {
            listener.onObservationStarted();
        }
    }

    public final void addToContext(@NotNull DataCaptureContext dataCaptureContext) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        dataCaptureContext.addFrameListener(this.c);
    }

    @NotNull
    public final CopyOnWriteArraySet<CameraSequenceFrameSaveSessionListener> getListeners$scandit_capture_core() {
        return this.listeners;
    }

    public final void onFrameSaveFinished() {
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((CameraSequenceFrameSaveSessionListener) it.next()).onFrameSave(this.f, true);
        }
    }

    public final void onFrameSaveSuccess() {
        this.f++;
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((CameraSequenceFrameSaveSessionListener) it.next()).onFrameSave(this.f, false);
        }
    }

    public final void removeFromContext(@NotNull DataCaptureContext dataCaptureContext) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        dataCaptureContext.removeFrameListener(this.c);
    }

    public final void removeListener(@NotNull CameraSequenceFrameSaveSessionListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.listeners.remove(listener)) {
            listener.onObservationStopped();
        }
    }

    public final void start() {
        File nextFrameSequenceDirectoryName = FileExtensionsKt.getNextFrameSequenceDirectoryName(this.f18505a);
        nextFrameSequenceDirectoryName.mkdir();
        SingleFrameRecorder.Companion companion = SingleFrameRecorder.INSTANCE;
        String absolutePath = nextFrameSequenceDirectoryName.getAbsolutePath();
        Intrinsics.g(absolutePath, "nextWritablePath.absolutePath");
        this.b = companion.create(absolutePath);
        this.f = 0;
        this.g = false;
        this.e = true;
    }

    public final void stop() {
        this.e = false;
        this.g = true;
    }

    private CameraSequenceFrameSaveSession(File file) {
        this.f18505a = file;
        this.c = new b(this);
        this.listeners = new CopyOnWriteArraySet();
    }
}
