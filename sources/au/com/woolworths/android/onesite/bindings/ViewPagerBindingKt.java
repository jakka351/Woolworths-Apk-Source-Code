package au.com.woolworths.android.onesite.bindings;

import androidx.databinding.adapters.ListenerUtil;
import androidx.viewpager.widget.ViewPager;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ViewPagerBindingKt {
    public static final void a(ViewPager viewPager, final OnPageSelectedListener onPageSelectedListener) {
        ArrayList arrayList;
        Intrinsics.h(viewPager, "viewPager");
        ViewPager.OnPageChangeListener onPageChangeListener = onPageSelectedListener == null ? null : new ViewPager.OnPageChangeListener() { // from class: au.com.woolworths.android.onesite.bindings.ViewPagerBindingKt$setPageChangeListener$1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void a(int i) {
                Callback.r();
                try {
                    OnPageSelectedListener onPageSelectedListener2 = onPageSelectedListener;
                    if (onPageSelectedListener2 != null) {
                        onPageSelectedListener2.a(i);
                    }
                    Callback.s();
                } catch (Throwable th) {
                    Callback.s();
                    throw th;
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void b(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void c(float f, int i, int i2) {
            }
        };
        int i = ListenerUtil.f2553a;
        Object tag = viewPager.getTag(R.id.pageChangedListener);
        viewPager.setTag(R.id.pageChangedListener, onPageChangeListener);
        ViewPager.OnPageChangeListener onPageChangeListener2 = (ViewPager.OnPageChangeListener) tag;
        if (onPageChangeListener2 != null && (arrayList = viewPager.U) != null) {
            arrayList.remove(onPageChangeListener2);
        }
        if (onPageChangeListener != null) {
            viewPager.b(onPageChangeListener);
        }
    }
}
