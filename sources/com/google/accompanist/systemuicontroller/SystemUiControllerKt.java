package com.google.accompanist.systemuicontroller;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.DialogWindowProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"systemuicontroller_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SystemUiControllerKt {

    /* renamed from: a, reason: collision with root package name */
    public static final long f14371a = ColorKt.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.3f, ColorSpaces.e);
    public static final Function1 b = SystemUiControllerKt$BlackScrimmed$1.h;

    public static final AndroidSystemUiController a(Composer composer) {
        composer.F(-715745933);
        composer.F(1009281237);
        CompositionLocal compositionLocal = AndroidCompositionLocals_androidKt.f;
        ViewParent parent = ((View) composer.x(compositionLocal)).getParent();
        Window window = null;
        DialogWindowProvider dialogWindowProvider = parent instanceof DialogWindowProvider ? (DialogWindowProvider) parent : null;
        Window window2 = dialogWindowProvider != null ? dialogWindowProvider.getWindow() : null;
        if (window2 == null) {
            Context context = ((View) composer.x(compositionLocal)).getContext();
            Intrinsics.g(context, "getContext(...)");
            while (true) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                    Intrinsics.g(context, "getBaseContext(...)");
                } else {
                    window = ((Activity) context).getWindow();
                    break;
                }
            }
            window2 = window;
        }
        composer.N();
        View view = (View) composer.x(AndroidCompositionLocals_androidKt.f);
        composer.F(511388516);
        boolean zN = composer.n(view) | composer.n(window2);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = new AndroidSystemUiController(window2, view);
            composer.A(objG);
        }
        composer.N();
        AndroidSystemUiController androidSystemUiController = (AndroidSystemUiController) objG;
        composer.N();
        return androidSystemUiController;
    }
}
