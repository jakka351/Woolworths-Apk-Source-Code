package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AndroidWindowInfo_androidKt {
    public static final long a(AndroidComposeView androidComposeView) {
        Activity activity;
        int iRound;
        long j;
        Context context = androidComposeView.getContext();
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof Activity)) {
                if (!(baseContext instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            } else {
                activity = (Activity) baseContext;
                break;
            }
        }
        if (activity != null) {
            int i = Build.VERSION.SDK_INT;
            Rect rectA = (i >= 30 ? BoundsHelperApi30Impl.f1959a : i >= 29 ? BoundsHelperApi29Impl.f1958a : BoundsHelperApi28Impl.f1957a).a(activity);
            int iWidth = rectA.width();
            iRound = rectA.height();
            j = iWidth;
        } else {
            Configuration configuration = context.getResources().getConfiguration();
            float f = context.getResources().getDisplayMetrics().density;
            int iRound2 = Math.round(configuration.screenWidthDp * f);
            iRound = Math.round(configuration.screenHeightDp * f);
            j = iRound2;
        }
        return (iRound & 4294967295L) | (j << 32);
    }
}
