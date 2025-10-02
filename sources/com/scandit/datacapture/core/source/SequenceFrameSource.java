package com.scandit.datacapture.core.source;

import android.media.Image;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.core.C0974c2;
import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.internal.module.common.geometry.NativeAxis;
import com.scandit.datacapture.core.internal.module.source.BufferStack;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.core.internal.sdk.extensions.ImageExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraCaptureParameters;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData;
import com.scandit.datacapture.core.internal.sdk.source.NativeFrameDataGeneratorFrameSource;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0003*+,B?\b\u0000\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010#\u001a\u00020\u0014\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0&¢\u0006\u0004\b(\u0010)J\t\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001J!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0096\u0001J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u001e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aR\u0014\u0010\u001e\u001a\u00020\u00078WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006-"}, d2 = {"Lcom/scandit/datacapture/core/source/SequenceFrameSource;", "Lcom/scandit/datacapture/core/source/FrameSource;", "Lcom/scandit/datacapture/core/source/SequenceFrameSourceProxy;", "Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "_frameSourceImpl", "Lcom/scandit/datacapture/core/internal/sdk/source/NativeFrameDataGeneratorFrameSource;", "_impl", "Lcom/scandit/datacapture/core/source/FrameSourceState;", "desiredState", "Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "_switchToDesiredState", "Lcom/scandit/datacapture/core/common/async/Callback;", "", "whenDone", "", "switchToDesiredState", "Lcom/scandit/datacapture/core/source/FrameSourceListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "removeListener", "", "width", "height", "", "buffer", "addFrame", "Landroid/media/Image;", "frame", "getCurrentState", "()Lcom/scandit/datacapture/core/source/FrameSourceState;", "currentState", "getDesiredState", "impl", "Lcom/scandit/datacapture/core/source/CameraPosition;", "captureDevicePosition", "captureDeviceOrientation", "Lcom/scandit/datacapture/core/internal/module/source/BufferStack;", "buffers", "Lkotlin/Function1;", "bufferProcessingFinished", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/source/NativeFrameDataGeneratorFrameSource;Lcom/scandit/datacapture/core/source/CameraPosition;ILcom/scandit/datacapture/core/internal/module/source/BufferStack;Lkotlin/jvm/functions/Function1;)V", "Companion", "com/scandit/datacapture/core/source/i", "com/scandit/datacapture/core/source/j", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SequenceFrameSource implements FrameSource, SequenceFrameSourceProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final CameraPosition f18842a;
    private final int b;
    private final BufferStack c;
    private final Function1 d;
    private final /* synthetic */ SequenceFrameSourceProxyAdapter e;
    private final LinkedHashMap f;
    private final j g;
    private final CopyOnWriteArraySet h;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/core/source/SequenceFrameSource$Companion;", "", "Lcom/scandit/datacapture/core/source/CameraPosition;", "cameraPosition", "Lcom/scandit/datacapture/core/source/SequenceFrameSource;", "create", "", "captureDeviceOrientation", "Lcom/scandit/datacapture/core/source/SequenceFrameSourceProcessListener;", "sequenceFrameSourceProcess", "BUFFER_STACK_SIZE", "I", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(byte[] it) {
            Intrinsics.h(it, "it");
        }

        @JvmStatic
        @NotNull
        public final SequenceFrameSource create(@NotNull CameraPosition cameraPosition) {
            Intrinsics.h(cameraPosition, "cameraPosition");
            return create(cameraPosition, 90, new com.google.common.net.a(12));
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final SequenceFrameSource create(@NotNull CameraPosition cameraPosition, int captureDeviceOrientation, @NotNull SequenceFrameSourceProcessListener sequenceFrameSourceProcess) {
            Intrinsics.h(cameraPosition, "cameraPosition");
            Intrinsics.h(sequenceFrameSourceProcess, "sequenceFrameSourceProcess");
            NativeFrameDataGeneratorFrameSource nativeFrameDataGeneratorFrameSourceCreate = NativeFrameDataGeneratorFrameSource.create();
            Intrinsics.g(nativeFrameDataGeneratorFrameSourceCreate, "create()");
            return new SequenceFrameSource(nativeFrameDataGeneratorFrameSourceCreate, cameraPosition, captureDeviceOrientation, null, new h(sequenceFrameSourceProcess), 8, null);
        }
    }

    public SequenceFrameSource(@NotNull NativeFrameDataGeneratorFrameSource impl, @NotNull CameraPosition captureDevicePosition, int i, @NotNull BufferStack buffers, @NotNull Function1<? super byte[], Unit> bufferProcessingFinished) {
        Intrinsics.h(impl, "impl");
        Intrinsics.h(captureDevicePosition, "captureDevicePosition");
        Intrinsics.h(buffers, "buffers");
        Intrinsics.h(bufferProcessingFinished, "bufferProcessingFinished");
        this.f18842a = captureDevicePosition;
        this.b = i;
        this.c = buffers;
        this.d = bufferProcessingFinished;
        this.e = new SequenceFrameSourceProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.f = new LinkedHashMap();
        this.g = new j(this);
        this.h = new CopyOnWriteArraySet();
        impl.addListenerAsync(new FrameSourceListenerReversedAdapter(new i(this), this, null, 4, null));
    }

    private static boolean a(byte[] bArr, int i, int i2) {
        return bArr.length == ((i * i2) * 12) / 8;
    }

    public static final void access$returnToPool(SequenceFrameSource sequenceFrameSource, NativeCameraFrameData nativeCameraFrameData) {
        sequenceFrameSource.f.remove(nativeCameraFrameData);
        byte[] bArrTakeBuffer = nativeCameraFrameData.takeBuffer();
        if (bArrTakeBuffer != null) {
            sequenceFrameSource.d.invoke(bArrTakeBuffer);
            sequenceFrameSource.c.a(bArrTakeBuffer);
        }
    }

    @JvmStatic
    @NotNull
    public static final SequenceFrameSource create(@NotNull CameraPosition cameraPosition) {
        return INSTANCE.create(cameraPosition);
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @NativeImpl
    @NotNull
    public NativeFrameSource _frameSourceImpl() {
        return this.e.getC();
    }

    @Override // com.scandit.datacapture.core.source.SequenceFrameSourceProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeFrameDataGeneratorFrameSource getF18843a() {
        return this.e.getF18843a();
    }

    @Override // com.scandit.datacapture.core.source.SequenceFrameSourceProxy
    @ProxyFunction(nativeName = "switchToDesiredStateAsyncAndroid")
    @NotNull
    public NativeWrappedFuture _switchToDesiredState(@NotNull FrameSourceState desiredState) {
        Intrinsics.h(desiredState, "desiredState");
        return this.e._switchToDesiredState(desiredState);
    }

    public final void addFrame(int width, int height, @NotNull byte[] buffer) {
        Intrinsics.h(buffer, "buffer");
        if (!a(buffer, width, height)) {
            throw new AssertionError("Invalid image format: only NV21 format allowed");
        }
        NativeCameraFrameData nativeCameraFrameDataCreate = NativeCameraFrameData.create(width, height, buffer, this.g, this.b, this.f18842a == CameraPosition.USER_FACING ? NativeAxis.X : NativeAxis.NONE, NativeCameraCaptureParameters.create(), null);
        Intrinsics.g(nativeCameraFrameDataCreate, "create(\n            widt…           null\n        )");
        LinkedHashMap linkedHashMap = this.f;
        NativeFrameData nativeFrameDataAsFrameData = nativeCameraFrameDataCreate.asFrameData();
        Intrinsics.g(nativeFrameDataAsFrameData, "it.asFrameData()");
        linkedHashMap.put(nativeCameraFrameDataCreate, nativeFrameDataAsFrameData);
        getF18843a().addFrame((NativeFrameData) this.f.get(nativeCameraFrameDataCreate));
    }

    @Override // com.scandit.datacapture.core.source.FrameSource
    public void addListener(@NotNull FrameSourceListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.h.add(listener)) {
            listener.onObservationStarted(this);
        }
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @ProxyFunction(property = "currentState")
    @NotNull
    public FrameSourceState getCurrentState() {
        return this.e.getCurrentState();
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @ProxyFunction(property = "desiredState")
    @NotNull
    public FrameSourceState getDesiredState() {
        return this.e.getDesiredState();
    }

    @Override // com.scandit.datacapture.core.source.FrameSource
    public void removeListener(@NotNull FrameSourceListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.h.remove(listener)) {
            listener.onObservationStopped(this);
        }
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    public void switchToDesiredState(@NotNull FrameSourceState desiredState, @Nullable Callback<? super Boolean> whenDone) {
        Intrinsics.h(desiredState, "desiredState");
        this.e.switchToDesiredState(desiredState, whenDone);
    }

    @JvmStatic
    @NotNull
    public static final SequenceFrameSource create(@NotNull CameraPosition cameraPosition, int i, @NotNull SequenceFrameSourceProcessListener sequenceFrameSourceProcessListener) {
        return INSTANCE.create(cameraPosition, i, sequenceFrameSourceProcessListener);
    }

    public final void addFrame(@NotNull Image frame) {
        Intrinsics.h(frame, "frame");
        if (frame.getFormat() == 35) {
            NativeCameraFrameData nativeCameraFrameDataConvertToFrameData$default = ImageExtensionsKt.convertToFrameData$default(frame, this.c, this.g, this.b, this.f18842a == CameraPosition.USER_FACING, false, null, 32, null);
            if (nativeCameraFrameDataConvertToFrameData$default != null) {
                LinkedHashMap linkedHashMap = this.f;
                NativeFrameData nativeFrameDataAsFrameData = nativeCameraFrameDataConvertToFrameData$default.asFrameData();
                Intrinsics.g(nativeFrameDataAsFrameData, "it.asFrameData()");
                linkedHashMap.put(nativeCameraFrameDataConvertToFrameData$default, nativeFrameDataAsFrameData);
                getF18843a().addFrame((NativeFrameData) this.f.get(nativeCameraFrameDataConvertToFrameData$default));
                return;
            }
            return;
        }
        throw new AssertionError("Invalid image format: only YUV_420_888 format allowed");
    }

    public /* synthetic */ SequenceFrameSource(NativeFrameDataGeneratorFrameSource nativeFrameDataGeneratorFrameSource, CameraPosition cameraPosition, int i, BufferStack bufferStack, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeFrameDataGeneratorFrameSource, cameraPosition, i, (i2 & 8) != 0 ? new C0974c2() : bufferStack, function1);
    }
}
