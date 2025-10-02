package au.com.woolworths.android.onesite.modules;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import au.com.woolworths.android.onesite.modules.mvp.BaseMainView;
import au.com.woolworths.android.onesite.network.ApiEventListener;
import au.com.woolworths.base.shopapp.utils.Views;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.reactivex.disposables.CompositeDisposable;

/* loaded from: classes3.dex */
public abstract class BaseFragment extends Fragment implements BaseMainView, ApiEventListener {
    public Unbinder e;
    public boolean d = false;
    public final CompositeDisposable f = new CompositeDisposable();

    public abstract int E1();

    @Override // au.com.woolworths.android.onesite.modules.mvp.BaseMainView
    public final void Q0(int i) {
        if (getActivity() == null || getView() == null) {
            return;
        }
        Views.c((AppCompatActivity) getActivity(), i);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(E1(), viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f.e();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.d) {
            return;
        }
        this.e = ButterKnife.a(view, this);
    }

    @Override // au.com.woolworths.android.onesite.modules.mvp.BaseMainView
    public final void u() {
        Q0(0);
    }

    @Override // au.com.woolworths.android.onesite.modules.mvp.BaseMainView
    public final void y() {
        if (getActivity() == null || getView() == null) {
            return;
        }
        Views.b((AppCompatActivity) getActivity());
    }
}
