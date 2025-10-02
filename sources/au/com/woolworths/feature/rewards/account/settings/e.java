package au.com.woolworths.feature.rewards.account.settings;

import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.ActivityRecyclerPool;
import com.airbnb.epoxy.ActivityRecyclerPoolKt;
import com.airbnb.epoxy.EpoxyRecyclerView;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ EpoxyRecyclerView e;

    public /* synthetic */ e(EpoxyRecyclerView epoxyRecyclerView, int i) {
        this.d = i;
        this.e = epoxyRecyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        EpoxyRecyclerView epoxyRecyclerView = this.e;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = AccountSettingsFragmentOld.r;
                epoxyRecyclerView.T();
                break;
            default:
                ActivityRecyclerPool activityRecyclerPool = EpoxyRecyclerView.a1;
                if (epoxyRecyclerView.W0) {
                    epoxyRecyclerView.W0 = false;
                    RecyclerView.Adapter adapter = epoxyRecyclerView.getAdapter();
                    if (adapter != null) {
                        epoxyRecyclerView.C0(null, true);
                        epoxyRecyclerView.T0 = adapter;
                    }
                    if (ActivityRecyclerPoolKt.a(epoxyRecyclerView.getContext())) {
                        epoxyRecyclerView.getRecycledViewPool().a();
                        break;
                    }
                }
                break;
        }
    }
}
