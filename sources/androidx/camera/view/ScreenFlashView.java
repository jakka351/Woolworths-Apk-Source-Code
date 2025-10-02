package androidx.camera.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.view.internal.ScreenFlashUiInfo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ScreenFlashView extends View {
    public static final /* synthetic */ int g = 0;
    public CameraController d;
    public Window e;
    public ImageCapture.ScreenFlash f;

    @UiThread
    public ScreenFlashView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.e;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        Logger.b("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f) {
        if (this.e == null) {
            Logger.b("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f)) {
            Logger.b("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.e.getAttributes();
        attributes.screenBrightness = f;
        this.e.setAttributes(attributes);
        Logger.a("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
    }

    private void setScreenFlashUiInfo(ImageCapture.ScreenFlash screenFlash) {
        CameraController cameraController = this.d;
        if (cameraController == null) {
            Logger.a("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
            return;
        }
        ScreenFlashUiInfo.ProviderType providerType = ScreenFlashUiInfo.ProviderType.e;
        ScreenFlashUiInfo screenFlashUiInfo = new ScreenFlashUiInfo(providerType, screenFlash);
        ScreenFlashUiInfo screenFlashUiInfoF = cameraController.f();
        cameraController.y.put(providerType, screenFlashUiInfo);
        ScreenFlashUiInfo screenFlashUiInfoF2 = cameraController.f();
        if (screenFlashUiInfoF2 == null || screenFlashUiInfoF2.equals(screenFlashUiInfoF)) {
            return;
        }
        cameraController.m();
    }

    @Nullable
    @UiThread
    public ImageCapture.ScreenFlash getScreenFlash() {
        return this.f;
    }

    @RestrictTo
    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    @UiThread
    public void setController(@Nullable CameraController cameraController) {
        Threads.a();
        CameraController cameraController2 = this.d;
        if (cameraController2 != null && cameraController2 != cameraController) {
            setScreenFlashUiInfo(null);
        }
        this.d = cameraController;
        if (cameraController == null) {
            return;
        }
        Threads.a();
        if (cameraController.c.G() == 3 && this.e == null) {
            throw new IllegalStateException("No window set despite setting FLASH_MODE_SCREEN in CameraController");
        }
        setScreenFlashUiInfo(getScreenFlash());
    }

    @UiThread
    public void setScreenFlashWindow(@Nullable Window window) {
        Threads.a();
        if (this.e != window) {
            this.f = window == null ? null : new ImageCapture.ScreenFlash() { // from class: androidx.camera.view.ScreenFlashView.1

                /* renamed from: a, reason: collision with root package name */
                public float f656a;
                public ValueAnimator b;

                @Override // androidx.camera.core.ImageCapture.ScreenFlash
                public final void a(long j, ImageCapture.ScreenFlashListener screenFlashListener) {
                    Logger.a("ScreenFlashView", "ScreenFlash#apply");
                    final ScreenFlashView screenFlashView = ScreenFlashView.this;
                    this.f656a = screenFlashView.getBrightness();
                    screenFlashView.setBrightness(1.0f);
                    ValueAnimator valueAnimator = this.b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    Objects.requireNonNull(screenFlashListener);
                    final k kVar = new k(screenFlashListener, 0);
                    Logger.a("ScreenFlashView", "animateToFullOpacity");
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
                    valueAnimatorOfFloat.setDuration(screenFlashView.getVisibilityRampUpAnimationDurationMillis());
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.camera.view.j
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            int i = ScreenFlashView.g;
                            ScreenFlashView screenFlashView2 = screenFlashView;
                            screenFlashView2.getClass();
                            Logger.a("ScreenFlashView", "animateToFullOpacity: value = " + ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                            screenFlashView2.setAlpha(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                        }
                    });
                    valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: androidx.camera.view.ScreenFlashView.2
                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            Logger.a("ScreenFlashView", "ScreenFlash#apply: onAnimationEnd");
                            kVar.run();
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                        }
                    });
                    valueAnimatorOfFloat.start();
                    this.b = valueAnimatorOfFloat;
                }

                @Override // androidx.camera.core.ImageCapture.ScreenFlash
                public final void clear() {
                    Logger.a("ScreenFlashView", "ScreenFlash#clearScreenFlashUi");
                    ValueAnimator valueAnimator = this.b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.b = null;
                    }
                    ScreenFlashView screenFlashView = ScreenFlashView.this;
                    screenFlashView.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    screenFlashView.setBrightness(this.f656a);
                }
            };
        }
        this.e = window;
        setScreenFlashUiInfo(getScreenFlash());
    }

    @UiThread
    public ScreenFlashView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @UiThread
    public ScreenFlashView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        setBackgroundColor(-1);
        setAlpha(BitmapDescriptorFactory.HUE_RED);
        setElevation(Float.MAX_VALUE);
    }
}
