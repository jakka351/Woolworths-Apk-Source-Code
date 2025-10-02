package com.github.piasy.biv.utils;

import android.graphics.PointF;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes4.dex */
public class DisplayOptimizeListener implements SubsamplingScaleImageView.OnImageEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final SubsamplingScaleImageView f14355a;
    public int b;

    public DisplayOptimizeListener(SubsamplingScaleImageView subsamplingScaleImageView) {
        this.f14355a = subsamplingScaleImageView;
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public final void onImageLoadError(Exception exc) {
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public final void onImageLoaded() {
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public final void onPreviewLoadError(Exception exc) {
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public final void onPreviewReleased() {
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public final void onReady() {
        float f;
        float f2;
        float f3;
        SubsamplingScaleImageView subsamplingScaleImageView = this.f14355a;
        int sWidth = subsamplingScaleImageView.getSWidth();
        int sHeight = subsamplingScaleImageView.getSHeight();
        int width = subsamplingScaleImageView.getWidth();
        int height = subsamplingScaleImageView.getHeight();
        boolean z = sWidth == 0 || sHeight == 0 || width == 0 || height == 0;
        if (z) {
            f = 0.5f;
        } else {
            if (sWidth <= sHeight) {
                f2 = width;
                f3 = sWidth;
            } else {
                f2 = height;
                f3 = sHeight;
            }
            f = f2 / f3;
        }
        if (!z && sHeight / sWidth > 2.0f) {
            subsamplingScaleImageView.animateScaleAndCenter(f, new PointF(sWidth / 2, BitmapDescriptorFactory.HUE_RED)).withEasing(1).start();
        }
        if (Math.abs(f - 0.1d) < 0.20000000298023224d) {
            f += 0.2f;
        }
        if (this.b == 7) {
            float f4 = width / sWidth;
            float f5 = height / sHeight;
            float fMax = Math.max(f4, f5);
            if (fMax > 1.0f) {
                subsamplingScaleImageView.setMinScale(1.0f);
                subsamplingScaleImageView.setMaxScale(Math.max(subsamplingScaleImageView.getMaxScale(), 1.2f * fMax));
            } else {
                subsamplingScaleImageView.setMinScale(Math.min(f4, f5));
            }
            subsamplingScaleImageView.setScaleAndCenter(fMax, new PointF(sWidth / 2, sHeight / 2));
        }
        subsamplingScaleImageView.setDoubleTapZoomScale(f);
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public final void onTileLoadError(Exception exc) {
    }
}
