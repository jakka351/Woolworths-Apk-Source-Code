package com.scandit.datacapture.barcode.count.ui.view;

import android.content.Context;
import com.scandit.datacapture.barcode.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0012"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountToolbarDefaults;", "", "()V", "audioButtonContentDescription", "", "context", "Landroid/content/Context;", "audioOffButtonText", "audioOnButtonText", "colorSchemeButtonContentDescription", "colorSchemeOffButtonText", "colorSchemeOnButtonText", "strapModeButtonContentDescription", "strapModeOffButtonText", "strapModeOnButtonText", "vibrationButtonContentDescription", "vibrationOffButtonText", "vibrationOnButtonText", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BarcodeCountToolbarDefaults {
    @NotNull
    public final String audioButtonContentDescription(@NotNull Context context) {
        Intrinsics.h(context, "context");
        String string = context.getString(R.string.sc_barcodeCount_toolbar_audio_content_description);
        Intrinsics.g(string, "context.getString(R.stri…udio_content_description)");
        return string;
    }

    @NotNull
    public final String audioOffButtonText(@NotNull Context context) {
        Intrinsics.h(context, "context");
        String string = context.getString(R.string.sc_barcodeCount_toolbar_audio_off);
        Intrinsics.g(string, "context.getString(R.stri…eCount_toolbar_audio_off)");
        return string;
    }

    @NotNull
    public final String audioOnButtonText(@NotNull Context context) {
        Intrinsics.h(context, "context");
        String string = context.getString(R.string.sc_barcodeCount_toolbar_audio_on);
        Intrinsics.g(string, "context.getString(R.stri…deCount_toolbar_audio_on)");
        return string;
    }

    @NotNull
    public final String colorSchemeButtonContentDescription(@NotNull Context context) {
        Intrinsics.h(context, "context");
        String string = context.getString(R.string.sc_barcodeCount_toolbar_color_filter_content_description);
        Intrinsics.g(string, "context.getString(R.stri…lter_content_description)");
        return string;
    }

    @NotNull
    public final String colorSchemeOffButtonText(@NotNull Context context) {
        Intrinsics.h(context, "context");
        String string = context.getString(R.string.sc_barcodeCount_toolbar_color_filter);
        Intrinsics.g(string, "context.getString(R.stri…unt_toolbar_color_filter)");
        return string;
    }

    @NotNull
    public final String colorSchemeOnButtonText(@NotNull Context context) {
        Intrinsics.h(context, "context");
        String string = context.getString(R.string.sc_barcodeCount_toolbar_color_filter);
        Intrinsics.g(string, "context.getString(R.stri…unt_toolbar_color_filter)");
        return string;
    }

    @NotNull
    public final String strapModeButtonContentDescription(@NotNull Context context) {
        Intrinsics.h(context, "context");
        String string = context.getString(R.string.sc_barcodeCount_toolbar_strap_mode_content_description);
        Intrinsics.g(string, "context.getString(R.stri…mode_content_description)");
        return string;
    }

    @NotNull
    public final String strapModeOffButtonText(@NotNull Context context) {
        Intrinsics.h(context, "context");
        String string = context.getString(R.string.sc_barcodeCount_toolbar_strap_mode);
        Intrinsics.g(string, "context.getString(R.stri…Count_toolbar_strap_mode)");
        return string;
    }

    @NotNull
    public final String strapModeOnButtonText(@NotNull Context context) {
        Intrinsics.h(context, "context");
        String string = context.getString(R.string.sc_barcodeCount_toolbar_strap_mode);
        Intrinsics.g(string, "context.getString(R.stri…Count_toolbar_strap_mode)");
        return string;
    }

    @NotNull
    public final String vibrationButtonContentDescription(@NotNull Context context) {
        Intrinsics.h(context, "context");
        String string = context.getString(R.string.sc_barcodeCount_toolbar_haptic_content_description);
        Intrinsics.g(string, "context.getString(R.stri…ptic_content_description)");
        return string;
    }

    @NotNull
    public final String vibrationOffButtonText(@NotNull Context context) {
        Intrinsics.h(context, "context");
        String string = context.getString(R.string.sc_barcodeCount_toolbar_haptic_off);
        Intrinsics.g(string, "context.getString(R.stri…Count_toolbar_haptic_off)");
        return string;
    }

    @NotNull
    public final String vibrationOnButtonText(@NotNull Context context) {
        Intrinsics.h(context, "context");
        String string = context.getString(R.string.sc_barcodeCount_toolbar_haptic_on);
        Intrinsics.g(string, "context.getString(R.stri…eCount_toolbar_haptic_on)");
        return string;
    }
}
