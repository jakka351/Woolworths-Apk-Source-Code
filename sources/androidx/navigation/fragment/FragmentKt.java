package androidx.navigation.fragment;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"navigation-fragment_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FragmentKt {
    public static final NavController a(Fragment fragment2) {
        Dialog dialog;
        Window window;
        Intrinsics.h(fragment2, "<this>");
        for (Fragment parentFragment = fragment2; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof NavHostFragment) {
                return ((NavHostFragment) parentFragment).E1();
            }
            Fragment fragment3 = parentFragment.getParentFragmentManager().A;
            if (fragment3 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment3).E1();
            }
        }
        View view = fragment2.getView();
        if (view != null) {
            return Navigation.a(view);
        }
        View decorView = null;
        DialogFragment dialogFragment = fragment2 instanceof DialogFragment ? (DialogFragment) fragment2 : null;
        if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null && (window = dialog.getWindow()) != null) {
            decorView = window.getDecorView();
        }
        if (decorView != null) {
            return Navigation.a(decorView);
        }
        throw new IllegalStateException(androidx.compose.ui.input.pointer.a.l("Fragment ", fragment2, " does not have a NavController set"));
    }
}
