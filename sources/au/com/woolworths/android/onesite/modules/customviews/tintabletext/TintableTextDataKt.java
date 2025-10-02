package au.com.woolworths.android.onesite.modules.customviews.tintabletext;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TintableTextDataKt {
    public static final int a(TintableTextData tintableTextData, Context context) {
        Intrinsics.h(tintableTextData, "tintableTextData");
        int i = tintableTextData.b;
        if (i != 0) {
            return context.getColor(i);
        }
        return 0;
    }
}
