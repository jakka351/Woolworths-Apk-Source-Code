package androidx.core.content;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class IntentCompat {

    @RequiresApi
    public static class Api33Impl {
        public static Object a(Intent intent, String str, Class cls) {
            return intent.getParcelableExtra(str, cls);
        }
    }

    public static Object a(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.a(intent, str, cls);
        }
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (cls.isInstance(parcelableExtra)) {
            return parcelableExtra;
        }
        return null;
    }
}
