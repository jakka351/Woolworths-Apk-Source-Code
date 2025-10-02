package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/BoundsHelperApi29Impl;", "Landroidx/compose/ui/platform/BoundsHelper;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BoundsHelperApi29Impl implements BoundsHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final BoundsHelperApi29Impl f1958a = new BoundsHelperApi29Impl();

    @Override // androidx.compose.ui.platform.BoundsHelper
    public final Rect a(Activity activity) throws Exception {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            Intrinsics.f(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) objInvoke);
        } catch (Exception e) {
            if (e instanceof NoSuchFieldException ? true : e instanceof NoSuchMethodException ? true : e instanceof IllegalAccessException ? true : e instanceof InvocationTargetException) {
                return BoundsHelperApi28Impl.f1957a.a(activity);
            }
            throw e;
        }
    }
}
