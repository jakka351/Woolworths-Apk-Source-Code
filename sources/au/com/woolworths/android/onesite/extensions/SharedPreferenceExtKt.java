package au.com.woolworths.android.onesite.extensions;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SharedPreferenceExtKt {
    public static final SharedPreferenceExtKt$boolean$$inlined$delegate$1 a(SharedPreferences sharedPreferences, String str, boolean z) {
        Intrinsics.h(sharedPreferences, "<this>");
        return new SharedPreferenceExtKt$boolean$$inlined$delegate$1(sharedPreferences, str, Boolean.valueOf(z));
    }

    public static /* synthetic */ SharedPreferenceExtKt$boolean$$inlined$delegate$1 b(SharedPreferences sharedPreferences, String str, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        return a(sharedPreferences, str, false);
    }

    public static final SharedPreferenceExtKt$string$$inlined$delegate$1 c(SharedPreferences sharedPreferences, String def, String str) {
        Intrinsics.h(sharedPreferences, "<this>");
        Intrinsics.h(def, "def");
        return new SharedPreferenceExtKt$string$$inlined$delegate$1(sharedPreferences, str, def);
    }
}
