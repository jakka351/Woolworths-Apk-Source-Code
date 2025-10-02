package au.com.woolworths.shop.lists.ui.lists;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import au.com.woolworths.shop.lists.ui.lists.ListsContract;
import au.com.woolworths.shop.lists.ui.lists.mylists.MyListsFragment;
import au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/ListsPagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ListsPagerAdapter extends FragmentStateAdapter {
    public final List p;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ListsContract.ListsTabsContent.values().length];
            try {
                iArr[ListsContract.ListsTabsContent.f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ListsContract.ListsTabsContent.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListsPagerAdapter(List list, FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        Intrinsics.h(lifecycle, "lifecycle");
        this.p = list;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment I(int i) {
        int iOrdinal = ((ListsContract.ListsTabsContent) this.p.get(i)).ordinal();
        if (iOrdinal == 0) {
            return new MyListsFragment();
        }
        if (iOrdinal == 1) {
            return new SuggestedListsFragment();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int i() {
        return this.p.size();
    }
}
