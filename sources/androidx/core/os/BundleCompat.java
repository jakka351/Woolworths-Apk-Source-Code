package androidx.core.os;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class BundleCompat {

    @RequiresApi
    public static class Api33Impl {
        public static Object a(Bundle bundle, String str, Class cls) {
            return bundle.getParcelable(str, cls);
        }

        public static Object[] b(Bundle bundle, String str, Class cls) {
            return bundle.getParcelableArray(str, cls);
        }

        public static ArrayList c(Bundle bundle, String str, Class cls) {
            return bundle.getParcelableArrayList(str, cls);
        }

        public static Serializable d(Bundle bundle, String str, Class cls) {
            return bundle.getSerializable(str, cls);
        }

        public static SparseArray e(Bundle bundle, String str, Class cls) {
            return bundle.getSparseParcelableArray(str, cls);
        }
    }

    public static Object a(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.a(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static Parcelable[] b(Bundle bundle, String str, Class cls) {
        return Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) Api33Impl.b(bundle, str, cls) : bundle.getParcelableArray(str);
    }

    public static ArrayList c(Bundle bundle, String str, Class cls) {
        return Build.VERSION.SDK_INT >= 34 ? Api33Impl.c(bundle, str, cls) : bundle.getParcelableArrayList(str);
    }

    public static Serializable d(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.d(bundle, str, cls);
        }
        Serializable serializable = bundle.getSerializable(str);
        if (cls.isInstance(serializable)) {
            return serializable;
        }
        return null;
    }

    public static SparseArray e(Bundle bundle, String str, Class cls) {
        return Build.VERSION.SDK_INT >= 34 ? Api33Impl.e(bundle, str, cls) : bundle.getSparseParcelableArray(str);
    }
}
