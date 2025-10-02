package dagger.hilt.android;

import android.content.Context;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.internal.Contexts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldagger/hilt/android/EntryPointAccessors;", "", "java_dagger_hilt_android-entry_point_accessors_internal_kt"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EntryPointAccessors {
    public static final Object a(Context context, Class cls) {
        Intrinsics.h(context, "context");
        return EntryPoints.a(cls, Contexts.a(context.getApplicationContext()));
    }
}
