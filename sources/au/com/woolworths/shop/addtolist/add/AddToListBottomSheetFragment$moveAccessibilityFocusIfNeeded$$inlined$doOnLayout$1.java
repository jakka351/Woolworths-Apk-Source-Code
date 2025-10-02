package au.com.woolworths.shop.addtolist.add;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "androidx/core/view/ViewKt$doOnLayout$$inlined$doOnNextLayout$1", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AddToListBottomSheetFragment$moveAccessibilityFocusIfNeeded$$inlined$doOnLayout$1 implements View.OnLayoutChangeListener {
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        view.performAccessibilityAction(64, null);
    }
}
