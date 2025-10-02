package au.com.woolworths.android.onesite.modules.customviews.statefulbutton;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StatefulButtonBindingKt {
    public static final void a(StatefulButton statefulButton, String str) {
        Intrinsics.h(statefulButton, "statefulButton");
        if (str == null) {
            str = "";
        }
        statefulButton.a(str, "");
    }
}
