package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentTagUsageViolation;", "Landroidx/fragment/app/strictmode/Violation;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FragmentTagUsageViolation extends Violation {
    public final ViewGroup e;

    public FragmentTagUsageViolation(Fragment fragment2, ViewGroup viewGroup) {
        super(fragment2, "Attempting to use <fragment> tag to add fragment " + fragment2 + " to container " + viewGroup);
        this.e = viewGroup;
    }
}
