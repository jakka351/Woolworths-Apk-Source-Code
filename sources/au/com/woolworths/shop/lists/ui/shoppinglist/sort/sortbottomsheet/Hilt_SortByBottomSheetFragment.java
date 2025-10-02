package au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;

/* loaded from: classes4.dex */
abstract class Hilt_SortByBottomSheetFragment extends BottomSheetDialogFragment implements GeneratedComponentManagerHolder {
    public ViewComponentManager.FragmentContextWrapper d;
    public boolean e;
    public volatile FragmentComponentManager f;
    public final Object g = new Object();
    public boolean h = false;

    public final void I1() {
        if (this.d == null) {
            this.d = new ViewComponentManager.FragmentContextWrapper(super.getContext(), this);
            this.e = FragmentGetContextFix.a(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.e) {
            return null;
        }
        I1();
        return this.d;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        I1();
        if (this.h) {
            return;
        }
        this.h = true;
        ((SortByBottomSheetFragment_GeneratedInjector) t3()).getClass();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new ViewComponentManager.FragmentContextWrapper(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object t3() {
        if (this.f == null) {
            synchronized (this.g) {
                try {
                    if (this.f == null) {
                        this.f = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.f.t3();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = this.d;
        Preconditions.a(fragmentContextWrapper == null || FragmentComponentManager.b(fragmentContextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        I1();
        if (this.h) {
            return;
        }
        this.h = true;
        ((SortByBottomSheetFragment_GeneratedInjector) t3()).getClass();
    }
}
