package au.com.woolworths.android.onesite.extensions;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DialogFragmentExtKt {
    public static final void a(DialogFragment dialogFragment, FragmentManager fragmentManager, String str) {
        Intrinsics.h(fragmentManager, "fragmentManager");
        if (fragmentManager.G(str) == null) {
            dialogFragment.showNow(fragmentManager, str);
        }
    }
}
