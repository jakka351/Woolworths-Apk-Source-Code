package au.com.woolworths.android.onesite.modules;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import au.com.woolworths.android.onesite.modules.mvp.BaseMainView;
import au.com.woolworths.android.onesite.network.ApiEventListener;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.woolworths.R;
import io.reactivex.disposables.CompositeDisposable;

/* loaded from: classes3.dex */
public abstract class LegacyBaseFragment extends Fragment implements BaseMainView, ApiEventListener {
    public Unbinder d;
    public final CompositeDisposable e = new CompositeDisposable();

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_rewards_setup, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.e.e();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.d = ButterKnife.a(view, this);
    }
}
