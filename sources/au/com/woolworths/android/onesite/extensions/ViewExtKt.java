package au.com.woolworths.android.onesite.extensions;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.impl.e;
import androidx.core.view.ViewCompat;
import androidx.media3.extractor.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ViewExtKt {
    public static final void a(View view) {
        Intrinsics.h(view, "<this>");
        ViewCompat.I(view, new a(18));
    }

    public static final void b(View view, Function2 function2) {
        Intrinsics.h(view, "<this>");
        ViewCompat.I(view, new e(function2, 7));
    }

    public static final View c(View view, int i, int i2) {
        Intrinsics.h(view, "<this>");
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt instanceof ViewGroup) {
                View viewC = c(childAt, i, i2);
                if (viewC != null && viewC.isShown()) {
                    return viewC;
                }
            } else {
                int[] iArr = new int[2];
                childAt.getLocationOnScreen(iArr);
                int i4 = iArr[0];
                if (new Rect(i4, iArr[1], childAt.getWidth() + i4, childAt.getHeight() + iArr[1]).contains(i, i2)) {
                    return childAt;
                }
            }
        }
        return null;
    }
}
