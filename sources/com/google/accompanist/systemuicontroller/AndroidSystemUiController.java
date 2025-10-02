package com.google.accompanist.systemuicontroller;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/systemuicontroller/AndroidSystemUiController;", "Lcom/google/accompanist/systemuicontroller/SystemUiController;", "systemuicontroller_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidSystemUiController implements SystemUiController {

    /* renamed from: a, reason: collision with root package name */
    public final View f14370a;
    public final Window b;
    public final WindowInsetsControllerCompat c;

    public AndroidSystemUiController(Window window, View view) {
        Intrinsics.h(view, "view");
        this.f14370a = view;
        this.b = window;
        this.c = window != null ? new WindowInsetsControllerCompat(window, view) : null;
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public final void d(long j, boolean z, Function1 transformColorForLightContent) {
        Intrinsics.h(transformColorForLightContent, "transformColorForLightContent");
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.c;
        if (windowInsetsControllerCompat != null) {
            windowInsetsControllerCompat.d(z);
        }
        int i = Build.VERSION.SDK_INT;
        Window window = this.b;
        if (i >= 29 && window != null) {
            window.setNavigationBarContrastEnforced(true);
        }
        if (window == null) {
            return;
        }
        if (z && (windowInsetsControllerCompat == null || !windowInsetsControllerCompat.b())) {
            j = ((Color) transformColorForLightContent.invoke(new Color(j))).f1766a;
        }
        window.setNavigationBarColor(ColorKt.j(j));
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public final void e(long j, boolean z, Function1 transformColorForLightContent) {
        WindowInsetsControllerCompat windowInsetsControllerCompat;
        Intrinsics.h(transformColorForLightContent, "transformColorForLightContent");
        f(z);
        Window window = this.b;
        if (window == null) {
            return;
        }
        if (z && ((windowInsetsControllerCompat = this.c) == null || !windowInsetsControllerCompat.c())) {
            j = ((Color) transformColorForLightContent.invoke(new Color(j))).f1766a;
        }
        window.setStatusBarColor(ColorKt.j(j));
    }

    @Override // com.google.accompanist.systemuicontroller.SystemUiController
    public final void f(boolean z) {
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.c;
        if (windowInsetsControllerCompat == null) {
            return;
        }
        windowInsetsControllerCompat.e(z);
    }
}
