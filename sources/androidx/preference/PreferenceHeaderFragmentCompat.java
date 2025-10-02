package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.preference.PreferenceFragmentCompat;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/preference/PreferenceHeaderFragmentCompat;", "Landroidx/fragment/app/Fragment;", "Landroidx/preference/PreferenceFragmentCompat$OnPreferenceStartFragmentCallback;", "<init>", "()V", "InnerOnBackPressedCallback", "preference_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class PreferenceHeaderFragmentCompat extends Fragment implements PreferenceFragmentCompat.OnPreferenceStartFragmentCallback {
    public OnBackPressedCallback d;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/preference/PreferenceHeaderFragmentCompat$InnerOnBackPressedCallback;", "Landroidx/activity/OnBackPressedCallback;", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout$PanelSlideListener;", "preference_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class InnerOnBackPressedCallback extends OnBackPressedCallback implements SlidingPaneLayout.PanelSlideListener {
        public final PreferenceHeaderFragmentCompat d;

        public InnerOnBackPressedCallback(PreferenceHeaderFragmentCompat preferenceHeaderFragmentCompat) {
            super(true);
            this.d = preferenceHeaderFragmentCompat;
            ((SlidingPaneLayout) preferenceHeaderFragmentCompat.requireView()).q.add(this);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public final void a(View panel) {
            Intrinsics.h(panel, "panel");
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public final void b(View panel) {
            Intrinsics.h(panel, "panel");
            i(true);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public final void c(View panel) {
            Intrinsics.h(panel, "panel");
            i(false);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void e() {
            ((SlidingPaneLayout) this.d.requireView()).a();
        }
    }

    public abstract PreferenceFragmentCompat E1();

    @Override // androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback
    public final boolean P(PreferenceFragmentCompat preferenceFragmentCompat, Preference preference) {
        FragmentManager.BackStackEntry backStackEntry;
        String str = preference.p;
        if (preferenceFragmentCompat.getId() != com.woolworths.R.id.preferences_header) {
            if (preferenceFragmentCompat.getId() != com.woolworths.R.id.preferences_detail) {
                return false;
            }
            FragmentFactory fragmentFactoryM = getChildFragmentManager().M();
            ClassLoader classLoader = requireContext().getClassLoader();
            Intrinsics.e(str);
            Fragment fragmentA = fragmentFactoryM.a(classLoader, str);
            Intrinsics.g(fragmentA, "childFragmentManager.fra….fragment!!\n            )");
            fragmentA.setArguments(preference.c());
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.g(childFragmentManager, "childFragmentManager");
            FragmentTransaction fragmentTransactionE = childFragmentManager.e();
            fragmentTransactionE.p = true;
            fragmentTransactionE.j(com.woolworths.R.id.preferences_detail, fragmentA, null);
            fragmentTransactionE.f = 4099;
            fragmentTransactionE.c(null);
            fragmentTransactionE.d();
            return true;
        }
        if (str == null) {
            Intent intent = preference.o;
            if (intent == null) {
                return true;
            }
            startActivity(intent);
            return true;
        }
        Fragment fragmentA2 = getChildFragmentManager().M().a(requireContext().getClassLoader(), str);
        if (fragmentA2 != null) {
            fragmentA2.setArguments(preference.c());
        }
        if (getChildFragmentManager().J() > 0) {
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            if (childFragmentManager2.d.size() == 0) {
                backStackEntry = childFragmentManager2.h;
                if (backStackEntry == null) {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                backStackEntry = (FragmentManager.BackStackEntry) childFragmentManager2.d.get(0);
            }
            Intrinsics.g(backStackEntry, "childFragmentManager.getBackStackEntryAt(0)");
            getChildFragmentManager().Y(backStackEntry.getId(), false);
        }
        FragmentManager childFragmentManager3 = getChildFragmentManager();
        Intrinsics.g(childFragmentManager3, "childFragmentManager");
        FragmentTransaction fragmentTransactionE2 = childFragmentManager3.e();
        fragmentTransactionE2.p = true;
        Intrinsics.e(fragmentA2);
        fragmentTransactionE2.j(com.woolworths.R.id.preferences_detail, fragmentA2, null);
        if (((SlidingPaneLayout) requireView()).d()) {
            fragmentTransactionE2.f = 4099;
        }
        ((SlidingPaneLayout) requireView()).e();
        fragmentTransactionE2.d();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.h(context, "context");
        super.onAttach(context);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.g(parentFragmentManager, "parentFragmentManager");
        FragmentTransaction fragmentTransactionE = parentFragmentManager.e();
        fragmentTransactionE.m(this);
        fragmentTransactionE.d();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(inflater.getContext());
        slidingPaneLayout.setId(com.woolworths.R.id.preferences_sliding_pane_layout);
        FragmentContainerView fragmentContainerView = new FragmentContainerView(inflater.getContext());
        fragmentContainerView.setId(com.woolworths.R.id.preferences_header);
        SlidingPaneLayout.LayoutParams layoutParams = new SlidingPaneLayout.LayoutParams(getResources().getDimensionPixelSize(com.woolworths.R.dimen.preferences_header_width));
        layoutParams.f3763a = getResources().getInteger(com.woolworths.R.integer.preferences_header_pane_weight);
        slidingPaneLayout.addView(fragmentContainerView, layoutParams);
        FragmentContainerView fragmentContainerView2 = new FragmentContainerView(inflater.getContext());
        fragmentContainerView2.setId(com.woolworths.R.id.preferences_detail);
        SlidingPaneLayout.LayoutParams layoutParams2 = new SlidingPaneLayout.LayoutParams(getResources().getDimensionPixelSize(com.woolworths.R.dimen.preferences_detail_width));
        layoutParams2.f3763a = getResources().getInteger(com.woolworths.R.integer.preferences_detail_pane_weight);
        slidingPaneLayout.addView(fragmentContainerView2, layoutParams2);
        if (getChildFragmentManager().F(com.woolworths.R.id.preferences_header) == null) {
            PreferenceFragmentCompat preferenceFragmentCompatE1 = E1();
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.g(childFragmentManager, "childFragmentManager");
            FragmentTransaction fragmentTransactionE = childFragmentManager.e();
            fragmentTransactionE.p = true;
            fragmentTransactionE.g(com.woolworths.R.id.preferences_header, preferenceFragmentCompatE1, null, 1);
            fragmentTransactionE.d();
        }
        slidingPaneLayout.setLockMode(3);
        return slidingPaneLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OnBackPressedDispatcher f;
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        this.d = new InnerOnBackPressedCallback(this);
        SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) requireView();
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        if (!slidingPaneLayout.isLaidOut() || slidingPaneLayout.isLayoutRequested()) {
            slidingPaneLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.preference.PreferenceHeaderFragmentCompat$onViewCreated$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    Intrinsics.i(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    PreferenceHeaderFragmentCompat preferenceHeaderFragmentCompat = this.f3602a;
                    OnBackPressedCallback onBackPressedCallback = preferenceHeaderFragmentCompat.d;
                    Intrinsics.e(onBackPressedCallback);
                    onBackPressedCallback.i(((SlidingPaneLayout) preferenceHeaderFragmentCompat.requireView()).h && ((SlidingPaneLayout) preferenceHeaderFragmentCompat.requireView()).d());
                }
            });
        } else {
            OnBackPressedCallback onBackPressedCallback = this.d;
            Intrinsics.e(onBackPressedCallback);
            onBackPressedCallback.i(((SlidingPaneLayout) requireView()).h && ((SlidingPaneLayout) requireView()).d());
        }
        getChildFragmentManager().o.add(new FragmentManager.OnBackStackChangedListener() { // from class: androidx.preference.a
            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void onBackStackChanged() {
                PreferenceHeaderFragmentCompat this$0 = this.f3610a;
                Intrinsics.h(this$0, "this$0");
                OnBackPressedCallback onBackPressedCallback2 = this$0.d;
                Intrinsics.e(onBackPressedCallback2);
                onBackPressedCallback2.i(this$0.getChildFragmentManager().J() == 0);
            }
        });
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwnerA = ViewTreeOnBackPressedDispatcherOwner.a(view);
        if (onBackPressedDispatcherOwnerA == null || (f = onBackPressedDispatcherOwnerA.getF()) == null) {
            return;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        OnBackPressedCallback onBackPressedCallback2 = this.d;
        Intrinsics.e(onBackPressedCallback2);
        f.a(viewLifecycleOwner, onBackPressedCallback2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        Fragment fragmentA;
        super.onViewStateRestored(bundle);
        if (bundle == null) {
            Fragment fragmentF = getChildFragmentManager().F(com.woolworths.R.id.preferences_header);
            if (fragmentF == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.preference.PreferenceFragmentCompat");
            }
            PreferenceFragmentCompat preferenceFragmentCompat = (PreferenceFragmentCompat) fragmentF;
            if (preferenceFragmentCompat.e.g.Q.size() <= 0) {
                fragmentA = null;
            } else {
                int size = preferenceFragmentCompat.e.g.Q.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    Preference preferenceD = preferenceFragmentCompat.e.g.D(i);
                    Intrinsics.g(preferenceD, "headerFragment.preferenc…reen.getPreference(index)");
                    String str = preferenceD.p;
                    if (str == null) {
                        i = i2;
                    } else {
                        fragmentA = getChildFragmentManager().M().a(requireContext().getClassLoader(), str);
                        if (fragmentA != null) {
                            fragmentA.setArguments(preferenceD.c());
                        }
                    }
                }
                fragmentA = null;
            }
            if (fragmentA == null) {
                return;
            }
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.g(childFragmentManager, "childFragmentManager");
            FragmentTransaction fragmentTransactionE = childFragmentManager.e();
            fragmentTransactionE.p = true;
            fragmentTransactionE.j(com.woolworths.R.id.preferences_detail, fragmentA, null);
            fragmentTransactionE.d();
        }
    }
}
