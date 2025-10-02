package androidx.camera.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.MeteringPointFactory;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.ViewPort;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.view.impl.ZoomGestureDetector;
import androidx.camera.view.internal.ScreenFlashUiInfo;
import androidx.camera.view.internal.compat.quirk.DeviceQuirks;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.camera.view.transform.OutputTransform;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.math.MathKt;

/* loaded from: classes2.dex */
public final class PreviewView extends FrameLayout {
    public static final /* synthetic */ int s = 0;
    public ImplementationMode d;
    public PreviewViewImplementation e;
    public final ScreenFlashView f;
    public final PreviewTransformation g;
    public boolean h;
    public final MutableLiveData i;
    public final AtomicReference j;
    public CameraController k;
    public final PreviewViewMeteringPointFactory l;
    public final ZoomGestureDetector m;
    public CameraInfoInternal n;
    public MotionEvent o;
    public final DisplayRotationListener p;
    public final f q;
    public final Preview.SurfaceProvider r;

    /* renamed from: androidx.camera.view.PreviewView$1, reason: invalid class name */
    public class AnonymousClass1 implements Preview.SurfaceProvider {
        public AnonymousClass1() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.camera.core.Preview.SurfaceProvider
        public final void a(SurfaceRequest surfaceRequest) {
            SurfaceViewImplementation surfaceViewImplementation;
            if (!Threads.b()) {
                ContextCompat.d(PreviewView.this.getContext()).execute(new g(this, surfaceRequest, 0));
                return;
            }
            Logger.a("PreviewView", "Surface requested by Preview.");
            CameraInternal cameraInternal = surfaceRequest.e;
            PreviewView.this.n = cameraInternal.d();
            PreviewViewMeteringPointFactory previewViewMeteringPointFactory = PreviewView.this.l;
            Rect rectI = cameraInternal.k().i();
            previewViewMeteringPointFactory.getClass();
            previewViewMeteringPointFactory.f417a = new Rational(rectI.width(), rectI.height());
            synchronized (previewViewMeteringPointFactory) {
                previewViewMeteringPointFactory.c = rectI;
            }
            surfaceRequest.b(ContextCompat.d(PreviewView.this.getContext()), new h(this, cameraInternal, surfaceRequest));
            PreviewView previewView = PreviewView.this;
            PreviewViewImplementation previewViewImplementation = previewView.e;
            ImplementationMode implementationMode = previewView.d;
            if (!(previewViewImplementation instanceof SurfaceViewImplementation) || PreviewView.c(surfaceRequest, implementationMode)) {
                PreviewView previewView2 = PreviewView.this;
                if (PreviewView.c(surfaceRequest, previewView2.d)) {
                    PreviewView previewView3 = PreviewView.this;
                    TextureViewImplementation textureViewImplementation = new TextureViewImplementation(previewView3, previewView3.g);
                    textureViewImplementation.i = false;
                    textureViewImplementation.k = new AtomicReference();
                    surfaceViewImplementation = textureViewImplementation;
                } else {
                    PreviewView previewView4 = PreviewView.this;
                    surfaceViewImplementation = new SurfaceViewImplementation(previewView4, previewView4.g);
                }
                previewView2.e = surfaceViewImplementation;
            }
            CameraInfoInternal cameraInfoInternalD = cameraInternal.d();
            PreviewView previewView5 = PreviewView.this;
            PreviewStreamStateObserver previewStreamStateObserver = new PreviewStreamStateObserver(cameraInfoInternalD, previewView5.i, previewView5.e);
            PreviewView.this.j.set(previewStreamStateObserver);
            cameraInternal.g().c(ContextCompat.d(PreviewView.this.getContext()), previewStreamStateObserver);
            PreviewView.this.e.e(surfaceRequest, new h(this, previewStreamStateObserver, cameraInternal));
            PreviewView previewView6 = PreviewView.this;
            if (previewView6.indexOfChild(previewView6.f) == -1) {
                PreviewView previewView7 = PreviewView.this;
                previewView7.addView(previewView7.f);
            }
        }
    }

    public class DisplayRotationListener implements DisplayManager.DisplayListener {
        public DisplayRotationListener() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            PreviewView previewView = PreviewView.this;
            Display display = previewView.getDisplay();
            if (display == null || display.getDisplayId() != i) {
                return;
            }
            previewView.b();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }
    }

    public enum ImplementationMode {
        PERFORMANCE(0),
        /* JADX INFO: Fake field, exist only in values array */
        COMPATIBLE(1);

        public final int d;

        ImplementationMode(int i) {
            this.d = i;
        }
    }

    @RestrictTo
    public interface OnFrameUpdateListener {
    }

    public enum ScaleType {
        /* JADX INFO: Fake field, exist only in values array */
        FILL_START(0),
        FILL_CENTER(1),
        /* JADX INFO: Fake field, exist only in values array */
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);

        public final int d;

        ScaleType(int i2) {
            this.d = i2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class StreamState {
        public static final StreamState d;
        public static final StreamState e;
        public static final /* synthetic */ StreamState[] f;

        static {
            StreamState streamState = new StreamState("IDLE", 0);
            d = streamState;
            StreamState streamState2 = new StreamState("STREAMING", 1);
            e = streamState2;
            f = new StreamState[]{streamState, streamState2};
        }

        public static StreamState valueOf(String str) {
            return (StreamState) Enum.valueOf(StreamState.class, str);
        }

        public static StreamState[] values() {
            return (StreamState[]) f.clone();
        }
    }

    @UiThread
    public PreviewView(@NonNull Context context) {
        this(context, null);
    }

    public static boolean c(SurfaceRequest surfaceRequest, ImplementationMode implementationMode) {
        boolean zEquals = surfaceRequest.e.d().o().equals("androidx.camera.camera2.legacy");
        boolean z = (DeviceQuirks.f663a.b(SurfaceViewStretchedQuirk.class) == null && DeviceQuirks.f663a.b(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (!zEquals && !z) {
            int iOrdinal = implementationMode.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal != 1) {
                throw new IllegalArgumentException("Invalid implementation mode: " + implementationMode);
            }
        }
        return true;
    }

    @Nullable
    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    @Nullable
    @UiThread
    private ImageCapture.ScreenFlash getScreenFlashInternal() {
        return this.f.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i;
    }

    private void setScreenFlashUiInfo(ImageCapture.ScreenFlash screenFlash) {
        CameraController cameraController = this.k;
        if (cameraController == null) {
            Logger.a("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
            return;
        }
        ScreenFlashUiInfo.ProviderType providerType = ScreenFlashUiInfo.ProviderType.d;
        ScreenFlashUiInfo screenFlashUiInfo = new ScreenFlashUiInfo(providerType, screenFlash);
        ScreenFlashUiInfo screenFlashUiInfoF = cameraController.f();
        cameraController.y.put(providerType, screenFlashUiInfo);
        ScreenFlashUiInfo screenFlashUiInfoF2 = cameraController.f();
        if (screenFlashUiInfoF2 == null || screenFlashUiInfoF2.equals(screenFlashUiInfoF)) {
            return;
        }
        cameraController.m();
    }

    public final void a(boolean z) {
        Threads.a();
        ViewPort viewPort = getViewPort();
        if (this.k == null || viewPort == null || !isAttachedToWindow()) {
            return;
        }
        try {
            this.k.a(getSurfaceProvider(), viewPort);
        } catch (IllegalStateException e) {
            if (!z) {
                throw e;
            }
            Logger.c("PreviewView", e.toString(), e);
        }
    }

    public final void b() {
        Rect rect;
        Display display;
        CameraInfoInternal cameraInfoInternal;
        Threads.a();
        if (this.e != null) {
            if (this.h && (display = getDisplay()) != null && (cameraInfoInternal = this.n) != null) {
                PreviewTransformation previewTransformation = this.g;
                int iF = cameraInfoInternal.f(display.getRotation());
                int rotation = display.getRotation();
                if (previewTransformation.g) {
                    previewTransformation.c = iF;
                    previewTransformation.e = rotation;
                }
            }
            this.e.f();
        }
        PreviewViewMeteringPointFactory previewViewMeteringPointFactory = this.l;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        previewViewMeteringPointFactory.getClass();
        Threads.a();
        synchronized (previewViewMeteringPointFactory) {
            try {
                if (size.getWidth() == 0 || size.getHeight() == 0 || (rect = previewViewMeteringPointFactory.c) == null) {
                    previewViewMeteringPointFactory.d = null;
                } else {
                    previewViewMeteringPointFactory.d = previewViewMeteringPointFactory.b.a(size, layoutDirection, rect);
                }
            } finally {
            }
        }
        if (this.k != null) {
            getSensorToViewTransform();
            Threads.a();
        }
    }

    @Nullable
    @UiThread
    public Bitmap getBitmap() {
        Threads.a();
        PreviewViewImplementation previewViewImplementation = this.e;
        if (previewViewImplementation == null) {
            return null;
        }
        FrameLayout frameLayout = previewViewImplementation.b;
        Bitmap bitmapB = previewViewImplementation.b();
        if (bitmapB == null) {
            return null;
        }
        PreviewTransformation previewTransformation = previewViewImplementation.c;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        if (!previewTransformation.f()) {
            return bitmapB;
        }
        Matrix matrixD = previewTransformation.d();
        RectF rectFE = previewTransformation.e(size, layoutDirection);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmapB.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixD);
        matrix.postScale(rectFE.width() / previewTransformation.f647a.getWidth(), rectFE.height() / previewTransformation.f647a.getHeight());
        matrix.postTranslate(rectFE.left, rectFE.top);
        canvas.drawBitmap(bitmapB, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    @Nullable
    @UiThread
    public CameraController getController() {
        Threads.a();
        return this.k;
    }

    @NonNull
    @UiThread
    public ImplementationMode getImplementationMode() {
        Threads.a();
        return this.d;
    }

    @NonNull
    @UiThread
    public MeteringPointFactory getMeteringPointFactory() {
        Threads.a();
        return this.l;
    }

    @Nullable
    @TransformExperimental
    public OutputTransform getOutputTransform() {
        Matrix matrixC;
        PreviewTransformation previewTransformation = this.g;
        Threads.a();
        try {
            matrixC = previewTransformation.c(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixC = null;
        }
        Rect rect = previewTransformation.b;
        if (matrixC == null || rect == null) {
            Logger.a("PreviewView", "Transform info is not ready");
            return null;
        }
        RectF rectF = TransformUtils.f522a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(TransformUtils.f522a, rectF2, Matrix.ScaleToFit.FILL);
        matrixC.preConcat(matrix);
        if (this.e instanceof TextureViewImplementation) {
            matrixC.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            Logger.e("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        new Size(rect.width(), rect.height());
        return new OutputTransform();
    }

    @NonNull
    public LiveData<StreamState> getPreviewStreamState() {
        return this.i;
    }

    @NonNull
    @UiThread
    public ScaleType getScaleType() {
        Threads.a();
        return this.g.h;
    }

    @Nullable
    @ExperimentalPreviewViewScreenFlash
    @UiThread
    public ImageCapture.ScreenFlash getScreenFlash() {
        return getScreenFlashInternal();
    }

    @Nullable
    @UiThread
    public Matrix getSensorToViewTransform() {
        Threads.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        PreviewTransformation previewTransformation = this.g;
        if (!previewTransformation.f()) {
            return null;
        }
        Matrix matrix = new Matrix(previewTransformation.d);
        matrix.postConcat(previewTransformation.c(size, layoutDirection));
        return matrix;
    }

    @NonNull
    @UiThread
    public Preview.SurfaceProvider getSurfaceProvider() {
        Threads.a();
        return this.r;
    }

    @Nullable
    @UiThread
    public ViewPort getViewPort() {
        Threads.a();
        if (getDisplay() == null) {
            return null;
        }
        int rotation = getDisplay().getRotation();
        Threads.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Rational rational = new Rational(getWidth(), getHeight());
        ViewPort.Builder builder = new ViewPort.Builder();
        builder.f432a = 1;
        builder.f432a = getViewPortScaleType();
        int layoutDirection = getLayoutDirection();
        int i = builder.f432a;
        ViewPort viewPort = new ViewPort();
        viewPort.f431a = i;
        viewPort.b = rational;
        viewPort.c = rotation;
        viewPort.d = layoutDirection;
        return viewPort;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.p, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.q);
        PreviewViewImplementation previewViewImplementation = this.e;
        if (previewViewImplementation != null) {
            previewViewImplementation.c();
        }
        a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.q);
        PreviewViewImplementation previewViewImplementation = this.e;
        if (previewViewImplementation != null) {
            previewViewImplementation.d();
        }
        CameraController cameraController = this.k;
        if (cameraController != null) {
            cameraController.b();
        }
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.p);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.k == null) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z = motionEvent.getPointerCount() == 1;
        boolean z2 = motionEvent.getAction() == 1;
        boolean z3 = motionEvent.getEventTime() - motionEvent.getDownTime() < ((long) ViewConfiguration.getLongPressTimeout());
        if (z && z2 && z3) {
            this.o = motionEvent;
            performClick();
            return true;
        }
        ZoomGestureDetector zoomGestureDetector = this.m;
        int i = zoomGestureDetector.f660a;
        e eVar = zoomGestureDetector.b;
        motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (zoomGestureDetector.c) {
            zoomGestureDetector.l.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z4 = (motionEvent.getButtonState() & 32) != 0;
        boolean z5 = zoomGestureDetector.k == 2 && !z4;
        boolean z6 = actionMasked == 1 || actionMasked == 3 || z5;
        if (actionMasked == 0 || z6) {
            if (zoomGestureDetector.g) {
                zoomGestureDetector.a();
                eVar.b(new ZoomGestureDetector.ZoomEvent.End());
                zoomGestureDetector.g = false;
                zoomGestureDetector.h = BitmapDescriptorFactory.HUE_RED;
                zoomGestureDetector.k = 0;
            } else if (zoomGestureDetector.b() && z6) {
                zoomGestureDetector.g = false;
                zoomGestureDetector.h = BitmapDescriptorFactory.HUE_RED;
                zoomGestureDetector.k = 0;
            }
            if (z6) {
                return true;
            }
        }
        if (!zoomGestureDetector.g && zoomGestureDetector.d && !zoomGestureDetector.b() && !z6 && z4) {
            zoomGestureDetector.i = motionEvent.getX();
            zoomGestureDetector.j = motionEvent.getY();
            zoomGestureDetector.k = 2;
            zoomGestureDetector.h = BitmapDescriptorFactory.HUE_RED;
        }
        boolean z7 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z5;
        boolean z8 = actionMasked == 6;
        int actionIndex = z8 ? motionEvent.getActionIndex() : -1;
        int i2 = z8 ? pointerCount - 1 : pointerCount;
        if (zoomGestureDetector.b()) {
            f = zoomGestureDetector.i;
            f2 = zoomGestureDetector.j;
            zoomGestureDetector.m = motionEvent.getY() < f2;
        } else {
            float x = BitmapDescriptorFactory.HUE_RED;
            float y = BitmapDescriptorFactory.HUE_RED;
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (actionIndex != i3) {
                    x = motionEvent.getX(i3) + x;
                    y = motionEvent.getY(i3) + y;
                }
            }
            float f3 = i2;
            f = x / f3;
            f2 = y / f3;
        }
        float f4 = BitmapDescriptorFactory.HUE_RED;
        float fAbs = BitmapDescriptorFactory.HUE_RED;
        for (int i4 = 0; i4 < pointerCount; i4++) {
            if (actionIndex != i4) {
                float fAbs2 = Math.abs(motionEvent.getX(i4) - f) + f4;
                fAbs = Math.abs(motionEvent.getY(i4) - f2) + fAbs;
                f4 = fAbs2;
            }
        }
        float f5 = i2;
        float f6 = f4 / f5;
        float f7 = fAbs / f5;
        float f8 = 2;
        float f9 = f6 * f8;
        float fHypot = f8 * f7;
        if (!zoomGestureDetector.b()) {
            fHypot = (float) Math.hypot(f9, fHypot);
        }
        boolean z9 = zoomGestureDetector.g;
        MathKt.b(f);
        MathKt.b(f2);
        if (!zoomGestureDetector.b() && zoomGestureDetector.g && (fHypot < 0 || z7)) {
            zoomGestureDetector.a();
            eVar.b(new ZoomGestureDetector.ZoomEvent.End());
            zoomGestureDetector.g = false;
            zoomGestureDetector.h = fHypot;
        }
        if (z7) {
            zoomGestureDetector.e = fHypot;
            zoomGestureDetector.f = fHypot;
            zoomGestureDetector.h = fHypot;
        }
        int i5 = zoomGestureDetector.b() ? i : 0;
        if (!zoomGestureDetector.g && fHypot >= i5 && (z9 || Math.abs(fHypot - zoomGestureDetector.h) > i)) {
            zoomGestureDetector.e = fHypot;
            zoomGestureDetector.f = fHypot;
            eVar.b(new ZoomGestureDetector.ZoomEvent.Begin());
            zoomGestureDetector.g = true;
        }
        if (actionMasked != 2) {
            return true;
        }
        zoomGestureDetector.e = fHypot;
        if (zoomGestureDetector.g) {
            eVar.b(new ZoomGestureDetector.ZoomEvent.Move(zoomGestureDetector.a()));
        }
        zoomGestureDetector.f = zoomGestureDetector.e;
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.k != null) {
            MotionEvent motionEvent = this.o;
            float x = motionEvent != null ? motionEvent.getX() : getWidth() / 2.0f;
            MotionEvent motionEvent2 = this.o;
            float y = motionEvent2 != null ? motionEvent2.getY() : getHeight() / 2.0f;
            final CameraController cameraController = this.k;
            if (!cameraController.h()) {
                Logger.e("CameraController", "Use cases not attached to camera.");
            } else if (cameraController.q) {
                Logger.a("CameraController", "Tap to focus started: " + x + ", " + y);
                cameraController.t.j(1);
                PreviewViewMeteringPointFactory previewViewMeteringPointFactory = this.l;
                PointF pointFA = previewViewMeteringPointFactory.a(x, y);
                float f = pointFA.x;
                float f2 = pointFA.y;
                Rational rational = previewViewMeteringPointFactory.f417a;
                MeteringPoint meteringPoint = new MeteringPoint();
                meteringPoint.f416a = f;
                meteringPoint.b = f2;
                meteringPoint.c = 0.16666667f;
                meteringPoint.d = rational;
                PointF pointFA2 = previewViewMeteringPointFactory.a(x, y);
                float f3 = pointFA2.x;
                float f4 = pointFA2.y;
                Rational rational2 = previewViewMeteringPointFactory.f417a;
                MeteringPoint meteringPoint2 = new MeteringPoint();
                meteringPoint2.f416a = f3;
                meteringPoint2.b = f4;
                meteringPoint2.c = 0.25f;
                meteringPoint2.d = rational2;
                FocusMeteringAction.Builder builder = new FocusMeteringAction.Builder(meteringPoint);
                builder.a(meteringPoint2, 2);
                Futures.a(cameraController.j.a().f(new FocusMeteringAction(builder)), new FutureCallback<FocusMeteringResult>() { // from class: androidx.camera.view.CameraController.3
                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public final void onFailure(Throwable th) {
                        if (th instanceof CameraControl.OperationCanceledException) {
                            Logger.a("CameraController", "Tap-to-focus is canceled by new action.");
                            return;
                        }
                        if (Logger.d(3, "CameraController")) {
                            Log.d("CameraController", "Tap to focus failed.", th);
                        }
                        CameraController.this.t.j(4);
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public final void onSuccess(Object obj) {
                        FocusMeteringResult focusMeteringResult = (FocusMeteringResult) obj;
                        if (focusMeteringResult == null) {
                            return;
                        }
                        boolean z = focusMeteringResult.f403a;
                        Logger.a("CameraController", "Tap to focus onSuccess: " + z);
                        CameraController.this.t.j(Integer.valueOf(z ? 2 : 3));
                    }
                }, CameraXExecutors.a());
            } else {
                Logger.a("CameraController", "Tap to focus disabled. ");
            }
        }
        this.o = null;
        return super.performClick();
    }

    @UiThread
    public void setController(@Nullable CameraController cameraController) {
        Threads.a();
        CameraController cameraController2 = this.k;
        if (cameraController2 != null && cameraController2 != cameraController) {
            cameraController2.b();
            setScreenFlashUiInfo(null);
        }
        this.k = cameraController;
        a(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    @UiThread
    public void setImplementationMode(@NonNull ImplementationMode implementationMode) {
        Threads.a();
        this.d = implementationMode;
    }

    @UiThread
    public void setScaleType(@NonNull ScaleType scaleType) {
        Threads.a();
        this.g.h = scaleType;
        b();
        a(false);
    }

    @ExperimentalPreviewViewScreenFlash
    public void setScreenFlashOverlayColor(@ColorInt int i) {
        this.f.setBackgroundColor(i);
    }

    @UiThread
    public void setScreenFlashWindow(@Nullable Window window) {
        Threads.a();
        this.f.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    @UiThread
    public PreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.camera.view.f] */
    @UiThread
    public PreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.d = ImplementationMode.PERFORMANCE;
        PreviewTransformation previewTransformation = new PreviewTransformation();
        previewTransformation.h = ScaleType.FILL_CENTER;
        this.g = previewTransformation;
        this.h = true;
        this.i = new MutableLiveData(StreamState.d);
        this.j = new AtomicReference();
        this.l = new PreviewViewMeteringPointFactory(previewTransformation);
        this.p = new DisplayRotationListener();
        this.q = new View.OnLayoutChangeListener() { // from class: androidx.camera.view.f
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int i10 = PreviewView.s;
                if (i4 - i2 == i8 - i6 && i5 - i3 == i9 - i7) {
                    return;
                }
                PreviewView previewView = this.f659a;
                previewView.b();
                previewView.a(true);
            }
        };
        this.r = new AnonymousClass1();
        Threads.a();
        Resources.Theme theme = context.getTheme();
        int[] iArr = R.styleable.f652a;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ViewCompat.z(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        try {
            int integer = typedArrayObtainStyledAttributes.getInteger(1, previewTransformation.h.d);
            for (ScaleType scaleType : ScaleType.values()) {
                if (scaleType.d == integer) {
                    setScaleType(scaleType);
                    int integer2 = typedArrayObtainStyledAttributes.getInteger(0, 0);
                    for (ImplementationMode implementationMode : ImplementationMode.values()) {
                        if (implementationMode.d == integer2) {
                            setImplementationMode(implementationMode);
                            typedArrayObtainStyledAttributes.recycle();
                            this.m = new ZoomGestureDetector(context, new e(this));
                            if (getBackground() == null) {
                                setBackgroundColor(getContext().getColor(android.R.color.black));
                            }
                            ScreenFlashView screenFlashView = new ScreenFlashView(context);
                            this.f = screenFlashView;
                            screenFlashView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
