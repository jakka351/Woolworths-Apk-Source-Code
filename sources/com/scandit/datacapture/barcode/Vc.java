package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewUISettings;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewHandMode;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Vc extends RelativeLayout {
    private SparkScanViewUISettings b;
    private ImageView c;
    private ImageView d;
    private Function1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vc(Context context, SparkScanViewHandMode handMode, SparkScanViewUISettings uiSettings) {
        super(context);
        Intrinsics.h(context, "context");
        Intrinsics.h(handMode, "handMode");
        Intrinsics.h(uiSettings, "uiSettings");
        this.b = uiSettings;
        a(true);
        a(false);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Gc.c(), -1);
        a(layoutParams, handMode);
        setLayoutParams(layoutParams);
        Tc tc = new Tc(this);
        this.e = tc;
        this.b.l().add(tc);
        b();
    }

    private static void a(RelativeLayout.LayoutParams layoutParams, SparkScanViewHandMode sparkScanViewHandMode) {
        int i = Uc.f17320a[sparkScanViewHandMode.ordinal()];
        if (i == 1) {
            layoutParams.removeRule(9);
            layoutParams.addRule(11);
        } else {
            if (i != 2) {
                return;
            }
            layoutParams.removeRule(11);
            layoutParams.addRule(9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        int iIntValue;
        Integer numS = this.b.s();
        if (numS != null) {
            iIntValue = numS.intValue();
        } else {
            NativeColor nativeColorDefaultToolbarIconInactiveTintColor = NativeSparkScanViewDefaults.defaultToolbarIconInactiveTintColor();
            Intrinsics.g(nativeColorDefaultToolbarIconInactiveTintColor, "defaultToolbarIconInactiveTintColor()");
            iIntValue = NativeColorExtensionsKt.toInt(nativeColorDefaultToolbarIconInactiveTintColor);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setColorFilter(iIntValue);
        }
        ImageView imageView2 = this.d;
        if (imageView2 != null) {
            imageView2.setColorFilter(iIntValue);
        }
    }

    private final void a(boolean z) {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.sc_ic_handle);
        if (z) {
            this.c = imageView;
        } else if (!z) {
            this.d = imageView;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = z ? 0 : Gc.e();
        layoutParams.topMargin = z ? Gc.e() : 0;
        layoutParams.addRule(14);
        if (z) {
            layoutParams.addRule(10);
        } else {
            layoutParams.addRule(12);
        }
        addView(imageView, layoutParams);
    }

    public final void a(SparkScanViewHandMode handMode) {
        Intrinsics.h(handMode, "handMode");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        a((RelativeLayout.LayoutParams) layoutParams, handMode);
    }

    public final void a() {
        this.b.l().remove(this.e);
        this.e = null;
    }
}
