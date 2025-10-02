package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class ActivityOptionsCompat {

    public static class ActivityOptionsCompatImpl extends ActivityOptionsCompat {

        /* renamed from: a, reason: collision with root package name */
        public final ActivityOptions f2387a;

        public ActivityOptionsCompatImpl(ActivityOptions activityOptions) {
            this.f2387a = activityOptions;
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public final Bundle c() {
            return this.f2387a.toBundle();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface BackgroundActivityStartMode {
    }

    public static ActivityOptionsCompat a(Context context, int i, int i2) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeCustomAnimation(context, i, i2));
    }

    public static ActivityOptionsCompat b(Activity activity, View view, String str) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
    }

    public Bundle c() {
        return null;
    }
}
