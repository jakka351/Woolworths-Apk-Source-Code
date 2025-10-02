package com.woolworths.scanlibrary.ui.stores;

import androidx.recyclerview.widget.RecyclerView;
import com.woolworths.R;
import com.woolworths.scanlibrary.databinding.ActivityAvailableStoresBinding;
import com.woolworths.scanlibrary.ui.stores.dto.StateDTO;
import com.woolworths.scanlibrary.util.widget.AnimationGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/woolworths/scanlibrary/ui/stores/AvailableStoresActivity$getAvailableStateListView$onItemClickListener$1", "Lcom/woolworths/scanlibrary/ui/stores/OnItemClickListener;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AvailableStoresActivity$getAvailableStateListView$onItemClickListener$1 implements OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AvailableStoresActivity f21342a;
    public final /* synthetic */ List b;

    public AvailableStoresActivity$getAvailableStateListView$onItemClickListener$1(AvailableStoresActivity availableStoresActivity, List list) {
        this.f21342a = availableStoresActivity;
        this.b = list;
    }

    public final void a(StateDTO selectedState, int i) {
        Intrinsics.h(selectedState, "selectedState");
        int i2 = AvailableStoresActivity.L;
        AvailableStoresActivity availableStoresActivity = this.f21342a;
        if (availableStoresActivity.V4().p != i) {
            List list = this.b;
            ((StateDTO) list.get(i)).b = true;
            ((StateDTO) list.get(availableStoresActivity.V4().p)).b = false;
            AvailableStoreViewModel availableStoreViewModelV4 = availableStoresActivity.V4();
            String state = ((StateDTO) list.get(i)).f21343a;
            Intrinsics.h(state, "state");
            availableStoreViewModelV4.i.c(new AvailableStoreViewModel$trackStateFilter$1(state));
            ActivityAvailableStoresBinding activityAvailableStoresBinding = availableStoresActivity.E;
            if (activityAvailableStoresBinding == null) {
                Intrinsics.p("viewBinding");
                throw null;
            }
            RecyclerView.Adapter adapter = activityAvailableStoresBinding.y.getAdapter();
            if (adapter != null) {
                adapter.m(availableStoresActivity.V4().p);
                adapter.m(i);
            }
            availableStoresActivity.V4().p = i;
            List listS6 = availableStoresActivity.V4().s6(selectedState.f21343a);
            AvailableStoresActivity$getAvailableStoreLocationListView$1 availableStoresActivity$getAvailableStoreLocationListView$1 = availableStoresActivity.H;
            if (availableStoresActivity$getAvailableStoreLocationListView$1 == null) {
                Intrinsics.p("availableStoreListAdapter");
                throw null;
            }
            availableStoresActivity$getAvailableStoreLocationListView$1.H(listS6);
            if (listS6.isEmpty()) {
                AnimationGroup animationGroup = availableStoresActivity.J;
                if (animationGroup == null) {
                    Intrinsics.p("emptyGroup");
                    throw null;
                }
                animationGroup.a(8);
                availableStoresActivity.X4(listS6);
                return;
            }
            ActivityAvailableStoresBinding activityAvailableStoresBinding2 = availableStoresActivity.E;
            if (activityAvailableStoresBinding2 == null) {
                Intrinsics.p("viewBinding");
                throw null;
            }
            RecyclerView availableStores = activityAvailableStoresBinding2.z;
            Intrinsics.g(availableStores, "availableStores");
            AvailableStoresActivity.W4(R.anim.layout_animation_fall_down, availableStores);
            availableStoresActivity.X4(listS6);
        }
    }
}
