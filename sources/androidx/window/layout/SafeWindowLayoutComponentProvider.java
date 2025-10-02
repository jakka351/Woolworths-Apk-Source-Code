package androidx.window.layout;

import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/layout/SafeWindowLayoutComponentProvider;", "", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SafeWindowLayoutComponentProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f3878a = LazyKt.b(SafeWindowLayoutComponentProvider$windowLayoutComponent$2.h);

    public static WindowLayoutComponent a() {
        return (WindowLayoutComponent) f3878a.getD();
    }

    public static boolean b(Function0 function0) {
        try {
            return ((Boolean) function0.invoke()).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }
}
