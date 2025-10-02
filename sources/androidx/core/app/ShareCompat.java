package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class ShareCompat {

    public static class IntentBuilder {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f2411a;

        public IntentBuilder(Context context) {
            Activity activity;
            context.getClass();
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f2411a = action;
            action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
            action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.f2411a.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
                this.f2411a.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
            }
        }
    }

    public static class IntentReader {
    }
}
