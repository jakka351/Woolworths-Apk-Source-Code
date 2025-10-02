package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;

@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/BoundsHelperApi30Impl;", "Landroidx/compose/ui/platform/BoundsHelper;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BoundsHelperApi30Impl implements BoundsHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final BoundsHelperApi30Impl f1959a = new BoundsHelperApi30Impl();

    @Override // androidx.compose.ui.platform.BoundsHelper
    public final Rect a(Activity activity) {
        return ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    }
}
