package com.scandit.datacapture.core.framesave;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.module.framesave.NativeSingleFrameRecorder;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\t\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\t\u0010\u0005\u001a\u00020\u0004H\u0097\u0001J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/core/framesave/SingleFrameRecorder;", "Lcom/scandit/datacapture/core/framesave/SingleFrameRecorderProxy;", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeSingleFrameRecorder;", "_impl", "", "_waitUntilSavesAreCompleted", "Lcom/scandit/datacapture/core/data/FrameData;", "frame", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "context", "saveFrame", "", "prefix", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SingleFrameRecorder implements SingleFrameRecorderProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SingleFrameRecorderProxyAdapter f18511a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/core/framesave/SingleFrameRecorder$Companion;", "", "", "storageDir", "Lcom/scandit/datacapture/core/framesave/SingleFrameRecorder;", "create", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SingleFrameRecorder create(@NotNull String storageDir) {
            Intrinsics.h(storageDir, "storageDir");
            NativeSingleFrameRecorder nativeSingleFrameRecorderCreate = NativeSingleFrameRecorder.create(storageDir);
            Intrinsics.g(nativeSingleFrameRecorderCreate, "create(storageDir)");
            return new SingleFrameRecorder(nativeSingleFrameRecorderCreate, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ SingleFrameRecorder(NativeSingleFrameRecorder nativeSingleFrameRecorder, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeSingleFrameRecorder);
    }

    @JvmStatic
    @NotNull
    public static final SingleFrameRecorder create(@NotNull String str) {
        return INSTANCE.create(str);
    }

    @Override // com.scandit.datacapture.core.framesave.SingleFrameRecorderProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeSingleFrameRecorder getF18512a() {
        return this.f18511a.getF18512a();
    }

    @Override // com.scandit.datacapture.core.framesave.SingleFrameRecorderProxy
    @ProxyFunction(nativeName = "waitUntilSavesAreCompleted")
    public void _waitUntilSavesAreCompleted() {
        this.f18511a._waitUntilSavesAreCompleted();
    }

    public final void saveFrame(@NotNull FrameData frame, @NotNull DataCaptureContext context) {
        Intrinsics.h(frame, "frame");
        Intrinsics.h(context, "context");
        getF18512a().saveAsync(frame.getF18642a(), context.getF18429a());
    }

    private SingleFrameRecorder(NativeSingleFrameRecorder nativeSingleFrameRecorder) {
        this.f18511a = new SingleFrameRecorderProxyAdapter(nativeSingleFrameRecorder, null, 2, null);
    }

    public final void saveFrame(@NotNull FrameData frame, @NotNull DataCaptureContext context, @NotNull String prefix) {
        Intrinsics.h(frame, "frame");
        Intrinsics.h(context, "context");
        Intrinsics.h(prefix, "prefix");
        getF18512a().saveAsyncWithPrefix(prefix, frame.getF18642a(), context.getF18429a());
    }
}
