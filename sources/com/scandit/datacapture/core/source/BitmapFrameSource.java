package com.scandit.datacapture.core.source;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.module.source.SingleBitmapFrameDataCollection;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.source.NativeBitmapConfig;
import com.scandit.datacapture.core.internal.sdk.source.NativeBitmapInfo;
import com.scandit.datacapture.core.internal.sdk.source.NativeByteOrder;
import com.scandit.datacapture.core.internal.sdk.source.NativeFrameDataCollectionFrameSource;
import com.scandit.datacapture.core.internal.sdk.source.NativeSingleBitmapFrameDataCollection;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0002\u001e\u001fB\u0019\b\u0000\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001J!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0096\u0001J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00078WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006 "}, d2 = {"Lcom/scandit/datacapture/core/source/BitmapFrameSource;", "Lcom/scandit/datacapture/core/source/FrameSource;", "Lcom/scandit/datacapture/core/source/BitmapFrameSourceProxy;", "Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "_frameSourceImpl", "Lcom/scandit/datacapture/core/internal/sdk/source/NativeFrameDataCollectionFrameSource;", "_impl", "Lcom/scandit/datacapture/core/source/FrameSourceState;", "desiredState", "Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "_switchToDesiredState", "Lcom/scandit/datacapture/core/common/async/Callback;", "", "whenDone", "", "switchToDesiredState", "Lcom/scandit/datacapture/core/source/FrameSourceListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "removeListener", "Lcom/scandit/datacapture/core/internal/module/source/SingleBitmapFrameDataCollection;", "frames", "Lcom/scandit/datacapture/core/internal/module/source/SingleBitmapFrameDataCollection;", "getCurrentState", "()Lcom/scandit/datacapture/core/source/FrameSourceState;", "currentState", "getDesiredState", "impl", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/source/NativeFrameDataCollectionFrameSource;Lcom/scandit/datacapture/core/internal/module/source/SingleBitmapFrameDataCollection;)V", "Companion", "com/scandit/datacapture/core/source/a", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BitmapFrameSource implements FrameSource, BitmapFrameSourceProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BitmapFrameSourceProxyAdapter f18833a;
    private final CopyOnWriteArraySet b;

    @Keep
    @NotNull
    private final SingleBitmapFrameDataCollection frames;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/core/source/BitmapFrameSource$Companion;", "", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/scandit/datacapture/core/source/BitmapFrameSource;", "of", "", "json", "fromJson", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final BitmapFrameSource fromJson(@NotNull String json) {
            Intrinsics.h(json, "json");
            Bitmap bitmapBitmapFromBase64 = BitmapExtensionsKt.bitmapFromBase64(new JsonValue(json).getByKeyAsString("image", ""));
            if (bitmapBitmapFromBase64 == null) {
                return null;
            }
            return of(bitmapBitmapFromBase64);
        }

        @JvmStatic
        @NotNull
        public final BitmapFrameSource of(@NotNull Bitmap bitmap) {
            NativeByteOrder nativeByteOrder;
            Intrinsics.h(bitmap, "bitmap");
            if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
                throw new IllegalArgumentException("Creating BitmapFrameSource is supported only from ARGB_8888 Bitmaps.");
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getHeight() * bitmap.getWidth() * 4);
            byteBufferAllocate.order(ByteOrder.nativeOrder());
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
            byteBufferAllocate.rewind();
            byte[] bArr = new byte[byteBufferAllocate.remaining()];
            byteBufferAllocate.get(bArr);
            NativeBitmapConfig nativeBitmapConfig = NativeBitmapConfig.ARGB_8888;
            ByteOrder byteOrderNativeOrder = ByteOrder.nativeOrder();
            if (Intrinsics.c(byteOrderNativeOrder, ByteOrder.BIG_ENDIAN)) {
                nativeByteOrder = NativeByteOrder.BIG_ENDIAN;
            } else {
                if (!Intrinsics.c(byteOrderNativeOrder, ByteOrder.LITTLE_ENDIAN)) {
                    throw new IllegalStateException(("Unknown order " + byteOrderNativeOrder).toString());
                }
                nativeByteOrder = NativeByteOrder.LITTLE_ENDIAN;
            }
            NativeSingleBitmapFrameDataCollection nativeSingleBitmapFrameDataCollectionCreate = NativeSingleBitmapFrameDataCollection.create(NativeBitmapInfo.create(nativeBitmapConfig, nativeByteOrder, bArr, bitmap.getWidth(), bitmap.getHeight(), bitmap.getWidth() * 4, 0));
            Intrinsics.g(nativeSingleBitmapFrameDataCollectionCreate, "create(bitmapInfo)");
            SingleBitmapFrameDataCollection singleBitmapFrameDataCollection = new SingleBitmapFrameDataCollection(nativeSingleBitmapFrameDataCollectionCreate, 0);
            NativeFrameDataCollectionFrameSource impl = NativeFrameDataCollectionFrameSource.create(singleBitmapFrameDataCollection.a());
            Intrinsics.g(impl, "impl");
            return new BitmapFrameSource(impl, singleBitmapFrameDataCollection);
        }

        private Companion() {
        }
    }

    public BitmapFrameSource(@NotNull NativeFrameDataCollectionFrameSource impl, @NotNull SingleBitmapFrameDataCollection frames) {
        Intrinsics.h(impl, "impl");
        Intrinsics.h(frames, "frames");
        this.frames = frames;
        this.f18833a = new BitmapFrameSourceProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.b = new CopyOnWriteArraySet();
        impl.addListenerAsync(new FrameSourceListenerReversedAdapter(new a(this), this, null, 4, null));
    }

    @JvmStatic
    @Nullable
    public static final BitmapFrameSource fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    @JvmStatic
    @NotNull
    public static final BitmapFrameSource of(@NotNull Bitmap bitmap) {
        return INSTANCE.of(bitmap);
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @NativeImpl
    @NotNull
    /* renamed from: _frameSourceImpl */
    public NativeFrameSource getC() {
        return this.f18833a.getC();
    }

    @Override // com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeFrameDataCollectionFrameSource getF18834a() {
        return this.f18833a.getF18834a();
    }

    @Override // com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @ProxyFunction(nativeName = "switchToDesiredStateAsyncAndroid")
    @NotNull
    public NativeWrappedFuture _switchToDesiredState(@NotNull FrameSourceState desiredState) {
        Intrinsics.h(desiredState, "desiredState");
        return this.f18833a._switchToDesiredState(desiredState);
    }

    @Override // com.scandit.datacapture.core.source.FrameSource
    public void addListener(@NotNull FrameSourceListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.b.add(listener)) {
            listener.onObservationStarted(this);
        }
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @ProxyFunction(property = "currentState")
    @NotNull
    public FrameSourceState getCurrentState() {
        return this.f18833a.getCurrentState();
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @ProxyFunction(property = "desiredState")
    @NotNull
    public FrameSourceState getDesiredState() {
        return this.f18833a.getDesiredState();
    }

    @Override // com.scandit.datacapture.core.source.FrameSource
    public void removeListener(@NotNull FrameSourceListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.b.remove(listener)) {
            listener.onObservationStopped(this);
        }
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    public void switchToDesiredState(@NotNull FrameSourceState desiredState, @Nullable Callback<? super Boolean> whenDone) {
        Intrinsics.h(desiredState, "desiredState");
        this.f18833a.switchToDesiredState(desiredState, whenDone);
    }
}
