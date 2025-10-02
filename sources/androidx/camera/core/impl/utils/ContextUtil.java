package androidx.camera.core.impl.utils;

import android.content.Context;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ContextUtil {

    @RequiresApi
    public static class Api30Impl {
        public static Context a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        public static String b(Context context) {
            return context.getAttributionTag();
        }
    }

    @RequiresApi
    public static class Api34Impl {
        public static Context a(int i, Context context) {
            return context.createDeviceContext(i);
        }

        public static int b(Context context) {
            return context.getDeviceId();
        }
    }

    public static Context a(Context context) {
        int iB;
        Context applicationContext = context.getApplicationContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && (iB = Api34Impl.b(context)) != Api34Impl.b(applicationContext)) {
            applicationContext = Api34Impl.a(iB, applicationContext);
        }
        if (i >= 30) {
            String strB = Api30Impl.b(context);
            if (!Objects.equals(strB, Api30Impl.b(applicationContext))) {
                return Api30Impl.a(applicationContext, strB);
            }
        }
        return applicationContext;
    }
}
