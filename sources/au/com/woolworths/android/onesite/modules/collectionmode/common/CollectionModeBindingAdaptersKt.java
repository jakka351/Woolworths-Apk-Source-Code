package au.com.woolworths.android.onesite.modules.collectionmode.common;

import android.widget.TextView;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.base.shopapp.modules.collectionmode.data.CollectionModeLabel;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CollectionModeBindingAdaptersKt {
    public static final void a(TextView textView, CollectionModeLabel collectionModeLabel) {
        Intrinsics.h(textView, "textView");
        if (collectionModeLabel == null) {
            return;
        }
        String str = collectionModeLabel.b;
        CollectionMode collectionMode = collectionModeLabel.f4625a;
        if (!Intrinsics.c(collectionMode, CollectionMode.PickUp.d) || str == null) {
            textView.setText(CollectionModeKt.a(collectionMode));
        } else {
            textView.setText(textView.getContext().getString(R.string.collection_mode_pick_up_title, str));
        }
    }
}
