package au.com.woolworths.android.onesite.utils;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class Extensions {
    public static final int a(int i, Context context) {
        Intrinsics.h(context, "<this>");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Intrinsics.g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int color = typedArrayObtainStyledAttributes.getColor(0, context.getColor(R.color.black));
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }
}
