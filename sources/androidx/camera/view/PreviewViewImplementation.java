package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes2.dex */
abstract class PreviewViewImplementation {

    /* renamed from: a, reason: collision with root package name */
    public Size f650a;
    public final FrameLayout b;
    public final PreviewTransformation c;
    public boolean d = false;

    public interface OnSurfaceNotInUseListener {
        void a();
    }

    public PreviewViewImplementation(FrameLayout frameLayout, PreviewTransformation previewTransformation) {
        this.b = frameLayout;
        this.c = previewTransformation;
    }

    public abstract View a();

    public abstract Bitmap b();

    public abstract void c();

    public abstract void d();

    public abstract void e(SurfaceRequest surfaceRequest, h hVar);

    public final void f() {
        View viewA = a();
        if (viewA == null || !this.d) {
            return;
        }
        FrameLayout frameLayout = this.b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        PreviewTransformation previewTransformation = this.c;
        previewTransformation.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            Logger.e("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (previewTransformation.f()) {
            if (viewA instanceof TextureView) {
                ((TextureView) viewA).setTransform(previewTransformation.d());
            } else {
                Display display = viewA.getDisplay();
                boolean z = false;
                boolean z2 = (!previewTransformation.g || display == null || display.getRotation() == previewTransformation.e) ? false : true;
                boolean z3 = previewTransformation.g;
                if (!z3) {
                    if ((!z3 ? previewTransformation.c : -CameraOrientationUtil.b(previewTransformation.e)) != 0) {
                        z = true;
                    }
                }
                if (z2 || z) {
                    Logger.b("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF rectFE = previewTransformation.e(size, layoutDirection);
            viewA.setPivotX(BitmapDescriptorFactory.HUE_RED);
            viewA.setPivotY(BitmapDescriptorFactory.HUE_RED);
            viewA.setScaleX(rectFE.width() / previewTransformation.f647a.getWidth());
            viewA.setScaleY(rectFE.height() / previewTransformation.f647a.getHeight());
            viewA.setTranslationX(rectFE.left - viewA.getLeft());
            viewA.setTranslationY(rectFE.top - viewA.getTop());
        }
    }

    public abstract ListenableFuture g();
}
