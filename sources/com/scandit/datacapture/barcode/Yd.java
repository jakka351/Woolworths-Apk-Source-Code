package com.scandit.datacapture.barcode;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.feedback.BarcodeCountFeedback;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountToolbarSettings;
import com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.BarcodeCountToolbarViewHolder;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Yd implements Sd {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f17360a;
    private K b;
    private final He c;
    private boolean d;
    private BarcodeCountToolbarSettings e;
    private BarcodeCountToolbarViewHolder f;

    public Yd(FrameLayout container, SharedPreferences sharedPreferences) {
        Intrinsics.h(container, "container");
        Intrinsics.h(sharedPreferences, "sharedPreferences");
        this.f17360a = sharedPreferences;
        this.c = new He(container);
        this.d = BarcodeCountViewDefaults.INSTANCE.getShouldShowToolbar();
        this.e = new BarcodeCountToolbarSettings();
    }

    public static final BarcodeCountToolbarViewHolder a(Yd yd, Context context) {
        yd.getClass();
        BarcodeCountToolbarViewHolder barcodeCountToolbarViewHolder = new BarcodeCountToolbarViewHolder(context, yd.c.a(), new L(yd.f17360a.getBoolean("barcode_count_toolbar_audio_feedback_key", false), yd.f17360a.getBoolean("barcode_count_toolbar_haptic_feedback_key", false), yd.f17360a.getBoolean("barcode_count_toolbar_strap_mode_key", false), yd.f17360a.getBoolean("barcode_count_toolbar_color_scheme_key", false)));
        View viewC = barcodeCountToolbarViewHolder.c();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        barcodeCountToolbarViewHolder.a(new Ud(yd));
        viewC.setLayoutParams(layoutParams);
        yd.f = barcodeCountToolbarViewHolder;
        return barcodeCountToolbarViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        BarcodeCountToolbarViewHolder barcodeCountToolbarViewHolder = this.f;
        if (barcodeCountToolbarViewHolder != null) {
            barcodeCountToolbarViewHolder.c(this.e.getAudioOnButtonText());
            barcodeCountToolbarViewHolder.b(this.e.getAudioOffButtonText());
            barcodeCountToolbarViewHolder.a(this.e.getAudioButtonContentDescription());
            barcodeCountToolbarViewHolder.i(this.e.getVibrationOnButtonText());
            barcodeCountToolbarViewHolder.h(this.e.getVibrationOffButtonText());
            barcodeCountToolbarViewHolder.g(this.e.getVibrationButtonContentDescription());
            barcodeCountToolbarViewHolder.l(this.e.getStrapModeOnButtonText());
            barcodeCountToolbarViewHolder.k(this.e.getStrapModeOffButtonText());
            barcodeCountToolbarViewHolder.j(this.e.getStrapModeButtonContentDescription());
            barcodeCountToolbarViewHolder.f(this.e.getColorSchemeOnButtonText());
            barcodeCountToolbarViewHolder.e(this.e.getColorSchemeOffButtonText());
            barcodeCountToolbarViewHolder.d(this.e.getColorSchemeButtonContentDescription());
        }
    }

    public final void b(boolean z) {
        Rd preference = Rd.STRAP_MODE;
        Intrinsics.h(preference, "preference");
        String key = a(preference);
        Intrinsics.h(key, "key");
        this.f17360a.edit().putBoolean(key, z).apply();
        this.c.a(new Xd(this));
    }

    public final void e() {
        He he = this.c;
        BarcodeCountToolbarViewHolder barcodeCountToolbarViewHolder = this.f;
        he.a(new Wd(this), barcodeCountToolbarViewHolder != null ? barcodeCountToolbarViewHolder.c() : null);
        BarcodeCountToolbarViewHolder barcodeCountToolbarViewHolder2 = this.f;
        if (barcodeCountToolbarViewHolder2 == null) {
            return;
        }
        barcodeCountToolbarViewHolder2.b(false);
    }

    public final boolean f() {
        Rd preference = Rd.STRAP_MODE;
        Intrinsics.h(preference, "preference");
        return this.f17360a.getBoolean(a(preference), false);
    }

    public final void h() {
        BarcodeCountToolbarViewHolder barcodeCountToolbarViewHolder;
        BarcodeCountToolbarViewHolder barcodeCountToolbarViewHolder2 = this.f;
        if (barcodeCountToolbarViewHolder2 != null) {
            barcodeCountToolbarViewHolder2.b(this.d);
        }
        if (!this.d || (barcodeCountToolbarViewHolder = this.f) == null) {
            return;
        }
        barcodeCountToolbarViewHolder.a();
    }

    public final void c(boolean z) {
        this.d = z;
    }

    public final BarcodeCountToolbarViewHolder d() {
        return this.f;
    }

    public final BarcodeCountToolbarViewHolder c() {
        return this.f;
    }

    public final K b() {
        return this.b;
    }

    public final void a(K k) {
        this.b = k;
    }

    public final void a(boolean z) {
        BarcodeCountToolbarViewHolder barcodeCountToolbarViewHolder = this.f;
        if (barcodeCountToolbarViewHolder == null) {
            return;
        }
        barcodeCountToolbarViewHolder.a(z);
    }

    private static String a(Rd rd) {
        int iOrdinal = rd.ordinal();
        if (iOrdinal == 0) {
            return "barcode_count_toolbar_audio_feedback_key";
        }
        if (iOrdinal == 1) {
            return "barcode_count_toolbar_haptic_feedback_key";
        }
        if (iOrdinal == 2) {
            return "barcode_count_toolbar_strap_mode_key";
        }
        if (iOrdinal == 3) {
            return "barcode_count_toolbar_color_scheme_key";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void a(BarcodeCount mode) {
        Intrinsics.h(mode, "mode");
        mode.setFeedback(BarcodeCountFeedback.INSTANCE.defaultFeedback$scandit_barcode_capture(this.f17360a.getBoolean("barcode_count_toolbar_audio_feedback_key", false), this.f17360a.getBoolean("barcode_count_toolbar_haptic_feedback_key", false)));
    }

    public final void a(BarcodeCountFeedback feedback) {
        Intrinsics.h(feedback, "feedback");
        String key = a(Rd.AUDIO);
        boolean z = feedback.getSuccess().getSound() != null;
        Intrinsics.h(key, "key");
        this.f17360a.edit().putBoolean(key, z).apply();
        this.c.a(new Xd(this));
        String key2 = a(Rd.HAPTIC);
        boolean z2 = feedback.getSuccess().getVibration() != null;
        Intrinsics.h(key2, "key");
        this.f17360a.edit().putBoolean(key2, z2).apply();
        this.c.a(new Xd(this));
    }

    public final NativeBarcodeCountBasicOverlayColorScheme a() {
        boolean z = this.f17360a.getBoolean(a(Rd.COLOR_SCHEME), false);
        if (z) {
            return NativeBarcodeCountBasicOverlayColorScheme.ACCESSIBLE;
        }
        if (!z) {
            return NativeBarcodeCountBasicOverlayColorScheme.DEFAULT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void a(BarcodeCountToolbarSettings settings) {
        Intrinsics.h(settings, "settings");
        this.e = settings.clone$scandit_barcode_capture();
        g();
    }

    public static final L a(Yd yd) {
        return new L(yd.f17360a.getBoolean("barcode_count_toolbar_audio_feedback_key", false), yd.f17360a.getBoolean("barcode_count_toolbar_haptic_feedback_key", false), yd.f17360a.getBoolean("barcode_count_toolbar_strap_mode_key", false), yd.f17360a.getBoolean("barcode_count_toolbar_color_scheme_key", false));
    }
}
