package com.scandit.datacapture.barcode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewUISettings;
import com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonTouchListener;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewHandMode;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.hc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0656hc extends RelativeLayout {
    public SparkScanViewUISettings b;
    private ImageView c;
    private Function1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0656hc(Context context) {
        super(context);
        Intrinsics.h(context, "context");
    }

    public static final void b(C0656hc c0656hc) {
        int iIntValue;
        SparkScanViewUISettings sparkScanViewUISettings = c0656hc.b;
        if (sparkScanViewUISettings == null) {
            Intrinsics.p("settings");
            throw null;
        }
        Integer numQ = sparkScanViewUISettings.q();
        if (numQ != null) {
            iIntValue = numQ.intValue();
        } else {
            NativeColor nativeColorDefaultToolbarBackgroundColor = NativeSparkScanViewDefaults.defaultToolbarBackgroundColor();
            Intrinsics.g(nativeColorDefaultToolbarBackgroundColor, "defaultToolbarBackgroundColor()");
            iIntValue = NativeColorExtensionsKt.toInt(nativeColorDefaultToolbarBackgroundColor);
        }
        Drawable background = c0656hc.getBackground();
        Intrinsics.g(background, "background");
        int i = R.id.sc_spark_scan_inner_circle;
        LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
        Object objFindDrawableByLayerId = layerDrawable != null ? layerDrawable.findDrawableByLayerId(i) : null;
        GradientDrawable gradientDrawable = objFindDrawableByLayerId instanceof GradientDrawable ? (GradientDrawable) objFindDrawableByLayerId : null;
        if (gradientDrawable == null) {
            return;
        }
        gradientDrawable.setColor(ColorStateList.valueOf(iIntValue));
    }

    public static final void c(C0656hc c0656hc) {
        int iIntValue;
        SparkScanViewUISettings sparkScanViewUISettings = c0656hc.b;
        if (sparkScanViewUISettings == null) {
            Intrinsics.p("settings");
            throw null;
        }
        Integer numE = sparkScanViewUISettings.e();
        if (numE != null) {
            iIntValue = numE.intValue();
        } else {
            NativeColor nativeColorDefaultCaptureButtonBackgroundColor = NativeSparkScanViewDefaults.defaultCaptureButtonBackgroundColor();
            Intrinsics.g(nativeColorDefaultCaptureButtonBackgroundColor, "defaultCaptureButtonBackgroundColor()");
            iIntValue = NativeColorExtensionsKt.toInt(nativeColorDefaultCaptureButtonBackgroundColor);
        }
        Drawable background = c0656hc.getBackground();
        Intrinsics.g(background, "background");
        int i = R.id.sc_spark_scan_outer_circle;
        LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
        Object objFindDrawableByLayerId = layerDrawable != null ? layerDrawable.findDrawableByLayerId(i) : null;
        GradientDrawable gradientDrawable = objFindDrawableByLayerId instanceof GradientDrawable ? (GradientDrawable) objFindDrawableByLayerId : null;
        if (gradientDrawable == null) {
            return;
        }
        gradientDrawable.setColor(ColorStateList.valueOf(iIntValue));
    }

    public final void a(SparkScanViewScanButtonTouchListener scanButtonTouchListener, SparkScanViewHandMode handMode, SparkScanViewUISettings settings, Zc zc) {
        int i;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        Intrinsics.h(scanButtonTouchListener, "scanButtonTouchListener");
        Intrinsics.h(handMode, "handMode");
        Intrinsics.h(settings, "settings");
        this.b = settings;
        int i2 = AbstractC0592dc.f17620a[handMode.ordinal()];
        if (i2 == 1) {
            i = R.drawable.sc_spark_scan_view_collapsed_button_background_right;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.sc_spark_scan_view_collapsed_button_background_left;
        }
        setBackgroundResource(i);
        SparkScanViewUISettings sparkScanViewUISettings = this.b;
        if (sparkScanViewUISettings == null) {
            Intrinsics.p("settings");
            throw null;
        }
        Integer numQ = sparkScanViewUISettings.q();
        if (numQ != null) {
            iIntValue = numQ.intValue();
        } else {
            NativeColor nativeColorDefaultToolbarBackgroundColor = NativeSparkScanViewDefaults.defaultToolbarBackgroundColor();
            Intrinsics.g(nativeColorDefaultToolbarBackgroundColor, "defaultToolbarBackgroundColor()");
            iIntValue = NativeColorExtensionsKt.toInt(nativeColorDefaultToolbarBackgroundColor);
        }
        Drawable background = getBackground();
        Intrinsics.g(background, "background");
        int i3 = R.id.sc_spark_scan_inner_circle;
        LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
        Drawable drawableFindDrawableByLayerId = layerDrawable != null ? layerDrawable.findDrawableByLayerId(i3) : null;
        GradientDrawable gradientDrawable = drawableFindDrawableByLayerId instanceof GradientDrawable ? (GradientDrawable) drawableFindDrawableByLayerId : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(iIntValue));
        }
        SparkScanViewUISettings sparkScanViewUISettings2 = this.b;
        if (sparkScanViewUISettings2 == null) {
            Intrinsics.p("settings");
            throw null;
        }
        Integer numE = sparkScanViewUISettings2.e();
        if (numE != null) {
            iIntValue2 = numE.intValue();
        } else {
            NativeColor nativeColorDefaultCaptureButtonBackgroundColor = NativeSparkScanViewDefaults.defaultCaptureButtonBackgroundColor();
            Intrinsics.g(nativeColorDefaultCaptureButtonBackgroundColor, "defaultCaptureButtonBackgroundColor()");
            iIntValue2 = NativeColorExtensionsKt.toInt(nativeColorDefaultCaptureButtonBackgroundColor);
        }
        Drawable background2 = getBackground();
        Intrinsics.g(background2, "background");
        int i4 = R.id.sc_spark_scan_outer_circle;
        LayerDrawable layerDrawable2 = background2 instanceof LayerDrawable ? (LayerDrawable) background2 : null;
        Drawable drawableFindDrawableByLayerId2 = layerDrawable2 != null ? layerDrawable2.findDrawableByLayerId(i4) : null;
        GradientDrawable gradientDrawable2 = drawableFindDrawableByLayerId2 instanceof GradientDrawable ? (GradientDrawable) drawableFindDrawableByLayerId2 : null;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setColor(ColorStateList.valueOf(iIntValue2));
        }
        scanButtonTouchListener.a((View) null);
        scanButtonTouchListener.a(new C0624fc(zc));
        setOnTouchListener(scanButtonTouchListener);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.sc_ic_spark_scan_view_button);
        this.c = imageView;
        SparkScanViewUISettings sparkScanViewUISettings3 = this.b;
        if (sparkScanViewUISettings3 == null) {
            Intrinsics.p("settings");
            throw null;
        }
        Integer numS = sparkScanViewUISettings3.s();
        if (numS != null) {
            iIntValue3 = numS.intValue();
        } else {
            NativeColor nativeColorDefaultToolbarIconInactiveTintColor = NativeSparkScanViewDefaults.defaultToolbarIconInactiveTintColor();
            Intrinsics.g(nativeColorDefaultToolbarIconInactiveTintColor, "defaultToolbarIconInactiveTintColor()");
            iIntValue3 = NativeColorExtensionsKt.toInt(nativeColorDefaultToolbarIconInactiveTintColor);
        }
        imageView.setColorFilter(iIntValue3);
        View view = this.c;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Gc.a(), Gc.a());
        layoutParams.addRule(13);
        addView(view, layoutParams);
        C0640gc c0640gc = new C0640gc(settings, this);
        this.d = c0640gc;
        settings.l().add(c0640gc);
    }

    public final void a() {
        SparkScanViewUISettings sparkScanViewUISettings = this.b;
        if (sparkScanViewUISettings != null) {
            sparkScanViewUISettings.l().remove(this.d);
            this.d = null;
        } else {
            Intrinsics.p("settings");
            throw null;
        }
    }

    public static final void a(C0656hc c0656hc) {
        int iIntValue;
        ImageView imageView = c0656hc.c;
        if (imageView != null) {
            SparkScanViewUISettings sparkScanViewUISettings = c0656hc.b;
            if (sparkScanViewUISettings != null) {
                Integer numS = sparkScanViewUISettings.s();
                if (numS != null) {
                    iIntValue = numS.intValue();
                } else {
                    NativeColor nativeColorDefaultToolbarIconInactiveTintColor = NativeSparkScanViewDefaults.defaultToolbarIconInactiveTintColor();
                    Intrinsics.g(nativeColorDefaultToolbarIconInactiveTintColor, "defaultToolbarIconInactiveTintColor()");
                    iIntValue = NativeColorExtensionsKt.toInt(nativeColorDefaultToolbarIconInactiveTintColor);
                }
                imageView.setColorFilter(iIntValue);
                return;
            }
            Intrinsics.p("settings");
            throw null;
        }
    }
}
