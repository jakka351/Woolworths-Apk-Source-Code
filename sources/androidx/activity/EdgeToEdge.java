package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class EdgeToEdge {

    /* renamed from: a, reason: collision with root package name */
    public static final int f53a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(128, 27, 27, 27);

    public static final void a(ComponentActivity componentActivity, SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2) {
        Intrinsics.h(componentActivity, "<this>");
        View decorView = componentActivity.getWindow().getDecorView();
        Intrinsics.g(decorView, "window.decorView");
        Function1 function1 = systemBarStyle.d;
        Resources resources = decorView.getResources();
        Intrinsics.g(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) function1.invoke(resources)).booleanValue();
        Function1 function12 = systemBarStyle2.d;
        Resources resources2 = decorView.getResources();
        Intrinsics.g(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) function12.invoke(resources2)).booleanValue();
        int i = Build.VERSION.SDK_INT;
        EdgeToEdgeImpl edgeToEdgeApi30 = i >= 30 ? new EdgeToEdgeApi30() : i >= 29 ? new EdgeToEdgeApi29() : new EdgeToEdgeApi28();
        Window window = componentActivity.getWindow();
        Intrinsics.g(window, "window");
        edgeToEdgeApi30.b(systemBarStyle, systemBarStyle2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = componentActivity.getWindow();
        Intrinsics.g(window2, "window");
        edgeToEdgeApi30.a(window2);
    }

    public static void b(ComponentActivity componentActivity) {
        SystemBarStyle$Companion$auto$1 systemBarStyle$Companion$auto$1 = SystemBarStyle$Companion$auto$1.h;
        a(componentActivity, new SystemBarStyle(systemBarStyle$Companion$auto$1, 0, 0, 0), new SystemBarStyle(systemBarStyle$Companion$auto$1, f53a, b, 0));
    }
}
