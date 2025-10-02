package leakcanary;

import android.annotation.SuppressLint;
import android.app.Application;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lleakcanary/ViewLocationHolderLeakFix;", "", "plumber-android-core_release"}, k = 1, mv = {1, 4, 1})
@SuppressLint
/* loaded from: classes.dex */
public final class ViewLocationHolderLeakFix {

    /* renamed from: a, reason: collision with root package name */
    public static Pair f24881a;
    public static boolean b;

    public static final void a(Application application) {
        if (b) {
            return;
        }
        try {
            if (f24881a == null) {
                FrameLayout frameLayout = new FrameLayout(application);
                for (int i = 0; i < 32; i++) {
                    frameLayout.addView(new View(application));
                }
                f24881a = new Pair(frameLayout, new ArrayList());
            }
            Pair pair = f24881a;
            if (pair == null) {
                Intrinsics.n();
                throw null;
            }
            ((ViewGroup) pair.d).addChildrenForAccessibility((ArrayList) pair.e);
        } catch (Throwable unused) {
            b = true;
        }
    }
}
