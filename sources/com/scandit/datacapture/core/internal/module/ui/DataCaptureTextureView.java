package com.scandit.datacapture.core.internal.module.ui;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES10;
import android.view.MotionEvent;
import android.view.TextureView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.core.C1091p2;
import com.scandit.datacapture.core.C1145v2;
import com.scandit.datacapture.core.C1172y2;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.module.ui.video.NativePreviewShaderFormat;
import com.scandit.datacapture.core.internal.module.ui.video.NativeVideoGeometry;
import com.scandit.datacapture.core.internal.module.ui.video.NativeVideoPreview;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeTextureBinding;
import com.scandit.datacapture.core.internal.sdk.data.DisposableResource;
import com.scandit.datacapture.core.internal.sdk.data.Subscription;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.ui.DataCaptureView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DataCaptureTextureView extends TextureView {

    /* renamed from: a, reason: collision with root package name */
    private final DataCaptureView f18591a;
    private final NativeVideoPreview b;
    private final Lazy c;
    private final AtomicBoolean d;
    private DisposableResource e;
    private Subscription f;
    private AtomicBoolean g;
    private final C1091p2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataCaptureTextureView(Context context, DataCaptureView parentView, NativeVideoPreview videoPreview) {
        super(context);
        Intrinsics.h(context, "context");
        Intrinsics.h(parentView, "parentView");
        Intrinsics.h(videoPreview, "videoPreview");
        this.f18591a = parentView;
        this.b = videoPreview;
        this.c = LazyKt.b(new b(this));
        this.d = new AtomicBoolean(false);
        this.e = C1145v2.b();
        this.g = new AtomicBoolean(false);
        C1091p2 c1091p2 = new C1091p2(a(), context);
        this.h = c1091p2;
        b();
        parentView._setGestureRecognizer(c1091p2);
    }

    public static final void e(DataCaptureTextureView dataCaptureTextureView) {
        if (dataCaptureTextureView.f == null) {
            dataCaptureTextureView.f = dataCaptureTextureView.e.start();
        }
        Subscription subscription = dataCaptureTextureView.f;
        if (subscription != null) {
            subscription.use(new g(dataCaptureTextureView));
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f18591a._impl().getVideoGeometry().setViewSize(new Size2(getWidth() / a(), getHeight() / a()));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.h(event, "event");
        return this.h.a(event) || super.onTouchEvent(event);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        if (i == 0 && isAvailable()) {
            if (this.f == null) {
                this.f = this.e.start();
            }
            Subscription subscription = this.f;
            if (subscription != null) {
                subscription.use(new g(this));
            }
            this.f18591a.onSurfaceTextureAvailable$scandit_capture_core();
        }
    }

    private final float a() {
        return ((Number) this.c.getD()).floatValue();
    }

    public static final void b(DataCaptureTextureView dataCaptureTextureView, SurfaceTexture surfaceTexture) {
        Subscription subscription = dataCaptureTextureView.f;
        dataCaptureTextureView.f = null;
        if (subscription != null) {
            subscription.use(new j(surfaceTexture, dataCaptureTextureView, subscription));
        }
    }

    public final void a(FrameSource frameSource) {
        Subscription subscription = this.f;
        if (subscription != null) {
            subscription.use(new a(frameSource));
        }
    }

    public static final void a(DataCaptureTextureView dataCaptureTextureView, SurfaceTexture surfaceTexture) {
        Subscription subscription = dataCaptureTextureView.f;
        if (subscription != null) {
            subscription.use(new c(surfaceTexture));
        }
    }

    private final void b() {
        setSurfaceTextureListener(new h(this));
    }

    public static final void a(DataCaptureTextureView dataCaptureTextureView, C1172y2 c1172y2) {
        NativePreviewShaderFormat nativePreviewShaderFormat;
        if (dataCaptureTextureView.d.compareAndSet(false, true)) {
            NativeVideoGeometry videoGeometry = dataCaptureTextureView.f18591a._impl().getVideoGeometry();
            videoGeometry.setViewSize(new Size2(dataCaptureTextureView.getWidth() / dataCaptureTextureView.a(), dataCaptureTextureView.getHeight() / dataCaptureTextureView.a()));
            videoGeometry.setFrameSize(c1172y2.a());
            NativeVideoPreview nativeVideoPreview = dataCaptureTextureView.b;
            nativeVideoPreview.prepareForFormat(NativePreviewShaderFormat.RGBA);
            nativeVideoPreview.prepareForFormat(NativePreviewShaderFormat.OES_EXTERNAL);
            GLES10.glClearColor(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
        }
        GLES10.glViewport(0, 0, dataCaptureTextureView.getWidth(), dataCaptureTextureView.getHeight());
        GLES10.glClear(17408);
        if (dataCaptureTextureView.g.get() && c1172y2.b()) {
            ArrayList<NativeTextureBinding> arrayList = new ArrayList<>();
            arrayList.add(c1172y2.c());
            dataCaptureTextureView.b.setTextureCoordinateTransformation(c1172y2.d());
            if (c1172y2.c().getTarget() == 36197) {
                nativePreviewShaderFormat = NativePreviewShaderFormat.OES_EXTERNAL;
            } else {
                nativePreviewShaderFormat = NativePreviewShaderFormat.RGBA;
            }
            dataCaptureTextureView.b.draw(nativePreviewShaderFormat, arrayList, dataCaptureTextureView.f18591a._impl().getVideoGeometry());
        }
        dataCaptureTextureView.f18591a._impl().draw();
    }
}
