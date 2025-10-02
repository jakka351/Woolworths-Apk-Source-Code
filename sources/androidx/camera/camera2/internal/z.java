package androidx.camera.camera2.internal;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.os.OutcomeReceiver;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.window.SplashScreenView;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class z {
    public static /* bridge */ /* synthetic */ boolean B(View view) {
        return view instanceof SplashScreenView;
    }

    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ MultiResolutionStreamInfo f(int i, int i2, String str) {
        return new MultiResolutionStreamInfo(i, i2, str);
    }

    public static /* bridge */ /* synthetic */ OutcomeReceiver g(Object obj) {
        return (OutcomeReceiver) obj;
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession h(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* synthetic */ ScrollCaptureTarget i(AndroidComposeView androidComposeView, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(androidComposeView, rect, point, scrollCaptureCallback);
    }

    public static /* synthetic */ ViewTranslationRequest.Builder n(AutofillId autofillId, long j) {
        return new ViewTranslationRequest.Builder(autofillId, j);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse p(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* synthetic */ void s() {
    }
}
