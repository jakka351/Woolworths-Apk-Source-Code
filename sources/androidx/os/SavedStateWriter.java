package androidx.os;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Landroidx/savedstate/SavedStateWriter;", "", "source", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class SavedStateWriter {
    public static final void a(Bundle bundle, String key, int[] value) {
        Intrinsics.h(key, "key");
        Intrinsics.h(value, "value");
        bundle.putIntArray(key, value);
    }

    public static final void b(Bundle bundle, String key) {
        Intrinsics.h(key, "key");
        bundle.putString(key, null);
    }

    public static final void c(Bundle bundle, String key, Parcelable value) {
        Intrinsics.h(key, "key");
        Intrinsics.h(value, "value");
        bundle.putParcelable(key, value);
    }

    public static final void d(Bundle bundle, String key, Bundle value) {
        Intrinsics.h(key, "key");
        Intrinsics.h(value, "value");
        bundle.putBundle(key, value);
    }

    public static final void e(Bundle bundle, String key, String value) {
        Intrinsics.h(key, "key");
        Intrinsics.h(value, "value");
        bundle.putString(key, value);
    }

    public static final void f(Bundle bundle, String key, String[] value) {
        Intrinsics.h(key, "key");
        Intrinsics.h(value, "value");
        bundle.putStringArray(key, value);
    }

    public static final void g(Bundle bundle, String key, List value) {
        Intrinsics.h(key, "key");
        Intrinsics.h(value, "value");
        bundle.putStringArrayList(key, SavedStateWriterKt.a(value));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof SavedStateWriter) && Intrinsics.c(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "SavedStateWriter(source=null)";
    }
}
