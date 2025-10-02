package androidx.navigation;

import android.os.Bundle;
import androidx.os.SavedStateReader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/navigation/LongNavType;", "Landroidx/navigation/NavType;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LongNavType extends NavType<Long> {
    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String key) {
        Intrinsics.h(bundle, "bundle");
        Intrinsics.h(key, "key");
        return Long.valueOf(SavedStateReader.h(bundle, key));
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "long";
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final Object g(String value) throws NumberFormatException {
        String strSubstring;
        long j;
        Intrinsics.h(value, "value");
        if (StringsKt.v(value, "L", false)) {
            strSubstring = value.substring(0, value.length() - 1);
            Intrinsics.g(strSubstring, "substring(...)");
        } else {
            strSubstring = value;
        }
        if (StringsKt.W(value, "0x", false)) {
            String strSubstring2 = strSubstring.substring(2);
            Intrinsics.g(strSubstring2, "substring(...)");
            CharsKt.b(16);
            j = Long.parseLong(strSubstring2, 16);
        } else {
            j = Long.parseLong(strSubstring);
        }
        return Long.valueOf(j);
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String key, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Intrinsics.h(key, "key");
        bundle.putLong(key, jLongValue);
    }
}
