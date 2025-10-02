package androidx.window.layout;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import androidx.window.core.Bounds;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.HardwareFoldingFeature;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/layout/ExtensionsWindowLayoutInfoAdapter;", "", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExtensionsWindowLayoutInfoAdapter {
    public static HardwareFoldingFeature a(Activity activity, androidx.window.extensions.layout.FoldingFeature foldingFeature) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        HardwareFoldingFeature.Type type;
        FoldingFeature.State state;
        Rect rectA;
        int type2 = foldingFeature.getType();
        if (type2 != 1) {
            if (type2 == 2) {
                type = HardwareFoldingFeature.Type.c;
            }
            return null;
        }
        type = HardwareFoldingFeature.Type.b;
        int state2 = foldingFeature.getState();
        if (state2 != 1) {
            if (state2 == 2) {
                state = FoldingFeature.State.c;
            }
            return null;
        }
        state = FoldingFeature.State.b;
        Rect bounds = foldingFeature.getBounds();
        Intrinsics.g(bounds, "oemFeature.bounds");
        Bounds bounds2 = new Bounds(bounds);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            rectA = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
            Intrinsics.g(rectA, "activity.windowManager.currentWindowMetrics.bounds");
        } else if (i >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rectA = new Rect((Rect) objInvoke);
            } catch (IllegalAccessException e) {
                Log.w("WindowMetricsCalculatorCompat", e);
                rectA = WindowMetricsCalculatorCompat.a(activity);
            } catch (NoSuchFieldException e2) {
                Log.w("WindowMetricsCalculatorCompat", e2);
                rectA = WindowMetricsCalculatorCompat.a(activity);
            } catch (NoSuchMethodException e3) {
                Log.w("WindowMetricsCalculatorCompat", e3);
                rectA = WindowMetricsCalculatorCompat.a(activity);
            } catch (InvocationTargetException e4) {
                Log.w("WindowMetricsCalculatorCompat", e4);
                rectA = WindowMetricsCalculatorCompat.a(activity);
            }
        } else {
            rectA = WindowMetricsCalculatorCompat.a(activity);
        }
        Rect rectC = new WindowMetrics(rectA).f3890a.c();
        if (bounds2.a() == 0 && bounds2.b() == 0) {
            return null;
        }
        if (bounds2.b() != rectC.width() && bounds2.a() != rectC.height()) {
            return null;
        }
        if (bounds2.b() < rectC.width() && bounds2.a() < rectC.height()) {
            return null;
        }
        if (bounds2.b() == rectC.width() && bounds2.a() == rectC.height()) {
            return null;
        }
        Rect bounds3 = foldingFeature.getBounds();
        Intrinsics.g(bounds3, "oemFeature.bounds");
        return new HardwareFoldingFeature(new Bounds(bounds3), type, state);
    }

    public static WindowLayoutInfo b(Activity activity, androidx.window.extensions.layout.WindowLayoutInfo info) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        HardwareFoldingFeature hardwareFoldingFeatureA;
        Intrinsics.h(info, "info");
        List<androidx.window.extensions.layout.FoldingFeature> displayFeatures = info.getDisplayFeatures();
        Intrinsics.g(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (androidx.window.extensions.layout.FoldingFeature feature : displayFeatures) {
            if (feature instanceof androidx.window.extensions.layout.FoldingFeature) {
                Intrinsics.g(feature, "feature");
                hardwareFoldingFeatureA = a(activity, feature);
            } else {
                hardwareFoldingFeatureA = null;
            }
            if (hardwareFoldingFeatureA != null) {
                arrayList.add(hardwareFoldingFeatureA);
            }
        }
        return new WindowLayoutInfo(arrayList);
    }
}
