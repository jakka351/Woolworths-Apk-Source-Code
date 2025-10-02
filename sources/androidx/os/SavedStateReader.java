package androidx.os;

import android.os.Bundle;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Landroidx/savedstate/SavedStateReader;", "", "source", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SavedStateReader {
    public static final boolean a(Bundle bundle, Bundle other) {
        Intrinsics.h(other, "other");
        return SavedStateReaderKt__SavedStateReader_androidKt.c(bundle, other);
    }

    public static final int b(Bundle bundle) {
        return SavedStateReaderKt__SavedStateReader_androidKt.d(bundle);
    }

    public static final boolean c(Bundle bundle, String key) {
        Intrinsics.h(key, "key");
        boolean z = bundle.getBoolean(key, false);
        if (z || !bundle.getBoolean(key, true)) {
            return z;
        }
        SavedStateReaderKt.a(key);
        throw null;
    }

    public static final double d(Bundle bundle, String key) {
        Intrinsics.h(key, "key");
        double d = bundle.getDouble(key, Double.MIN_VALUE);
        if (d != Double.MIN_VALUE || bundle.getDouble(key, Double.MAX_VALUE) != Double.MAX_VALUE) {
            return d;
        }
        SavedStateReaderKt.a(key);
        throw null;
    }

    public static final float e(Bundle bundle, String key) {
        Intrinsics.h(key, "key");
        float f = bundle.getFloat(key, Float.MIN_VALUE);
        if (f != Float.MIN_VALUE || bundle.getFloat(key, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return f;
        }
        SavedStateReaderKt.a(key);
        throw null;
    }

    public static final int f(Bundle bundle, String key) {
        Intrinsics.h(key, "key");
        int i = bundle.getInt(key, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(key, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        SavedStateReaderKt.a(key);
        throw null;
    }

    public static final int[] g(Bundle bundle, String key) {
        Intrinsics.h(key, "key");
        int[] intArray = bundle.getIntArray(key);
        if (intArray != null) {
            return intArray;
        }
        SavedStateReaderKt.a(key);
        throw null;
    }

    public static final long h(Bundle bundle, String key) {
        Intrinsics.h(key, "key");
        long j = bundle.getLong(key, Long.MIN_VALUE);
        if (j != Long.MIN_VALUE || bundle.getLong(key, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return j;
        }
        SavedStateReaderKt.a(key);
        throw null;
    }

    public static final Bundle i(Bundle bundle, String key) {
        Intrinsics.h(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        SavedStateReaderKt.a(key);
        throw null;
    }

    public static final String j(Bundle bundle, String key) {
        Intrinsics.h(key, "key");
        String string = bundle.getString(key);
        if (string != null) {
            return string;
        }
        SavedStateReaderKt.a(key);
        throw null;
    }

    public static final String[] k(Bundle bundle, String key) {
        Intrinsics.h(key, "key");
        String[] stringArray = bundle.getStringArray(key);
        if (stringArray != null) {
            return stringArray;
        }
        SavedStateReaderKt.a(key);
        throw null;
    }

    public static final ArrayList l(Bundle bundle, String key) {
        Intrinsics.h(key, "key");
        ArrayList<String> stringArrayList = bundle.getStringArrayList(key);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        SavedStateReaderKt.a(key);
        throw null;
    }

    public static final boolean m(Bundle bundle, String key) {
        Intrinsics.h(key, "key");
        return bundle.containsKey(key) && bundle.get(key) == null;
    }

    public static final MapBuilder n(Bundle bundle) {
        MapBuilder mapBuilder = new MapBuilder(bundle.size());
        for (String str : bundle.keySet()) {
            Intrinsics.e(str);
            mapBuilder.put(str, bundle.get(str));
        }
        return mapBuilder.b();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof SavedStateReader) && Intrinsics.c(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "SavedStateReader(source=null)";
    }
}
