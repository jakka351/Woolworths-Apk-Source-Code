package com.xwray.groupie;

import YU.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xwray.groupie.AsyncDiffUtil;
import com.xwray.groupie.GroupieViewHolder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class GroupAdapter<VH extends GroupieViewHolder> extends RecyclerView.Adapter<VH> implements GroupDataObserver {
    public final ArrayList g = new ArrayList();
    public final int h = 1;
    public Item i;

    public GroupAdapter() {
        new AsyncDiffUtil.Callback() { // from class: com.xwray.groupie.GroupAdapter.1
            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public final void a(int i, int i2, Object obj) {
                GroupAdapter.this.q(i, i2, obj);
            }

            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public final void b(int i, int i2) {
                GroupAdapter.this.s(i, i2);
            }

            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public final void c(int i, int i2) {
                GroupAdapter.this.p(i, i2);
            }

            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public final void d(int i, int i2) {
                GroupAdapter.this.r(i, i2);
            }
        };
        new GridLayoutManager.SpanSizeLookup() { // from class: com.xwray.groupie.GroupAdapter.2
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public final int c(int i) {
                GroupAdapter groupAdapter = GroupAdapter.this;
                int i2 = groupAdapter.h;
                try {
                    GroupUtils.a(i, groupAdapter.g).getClass();
                } catch (IndexOutOfBoundsException unused) {
                }
                return i2;
            }
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void A(RecyclerView.ViewHolder viewHolder) {
        ((GroupieViewHolder) viewHolder).f23758a.getClass();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void B(RecyclerView.ViewHolder viewHolder) {
        ((GroupieViewHolder) viewHolder).f23758a.getClass();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void C(RecyclerView.ViewHolder viewHolder) {
        GroupieViewHolder groupieViewHolder = (GroupieViewHolder) viewHolder;
        groupieViewHolder.f23758a.getClass();
        groupieViewHolder.f23758a = null;
    }

    public final void G(Group group) {
        if (group == null) {
            throw new RuntimeException("Group cannot be null");
        }
        ArrayList arrayList = this.g;
        int iB = GroupUtils.b(arrayList);
        group.e(this);
        arrayList.add(group);
        r(iB, group.a());
    }

    public final int H(Group group) {
        ArrayList arrayList = this.g;
        int iIndexOf = arrayList.indexOf(group);
        if (iIndexOf == -1) {
            return -1;
        }
        int iA = 0;
        for (int i = 0; i < iIndexOf; i++) {
            iA += ((Group) arrayList.get(i)).a();
        }
        return iA;
    }

    @Override // com.xwray.groupie.GroupDataObserver
    public final void b(NestedGroup nestedGroup, int i, int i2) {
        s(H(nestedGroup) + i, i2);
    }

    @Override // com.xwray.groupie.GroupDataObserver
    public final void c(Group group, int i, int i2, Object obj) {
        q(H(group) + i, i2, obj);
    }

    @Override // com.xwray.groupie.GroupDataObserver
    public final void f(NestedGroup nestedGroup, int i, int i2) {
        int iH = H(nestedGroup);
        p(i + iH, iH + i2);
    }

    @Override // com.xwray.groupie.GroupDataObserver
    public final void g(NestedGroup nestedGroup, int i, int i2) {
        r(H(nestedGroup) + i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int i() {
        return GroupUtils.b(this.g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long j(int i) {
        return GroupUtils.a(i, this.g).e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int k(int i) {
        Item itemA = GroupUtils.a(i, this.g);
        this.i = itemA;
        if (itemA != null) {
            return itemA.h();
        }
        throw new RuntimeException(a.d(i, "Invalid position "));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void v(RecyclerView.ViewHolder viewHolder, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void w(RecyclerView.ViewHolder viewHolder, int i, List list) {
        GroupUtils.a(i, this.g).f((GroupieViewHolder) viewHolder, i, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
        Item item;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        Item item2 = this.i;
        if (item2 == null || item2.h() != i) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.g;
                if (i2 >= GroupUtils.b(arrayList)) {
                    throw new IllegalStateException(a.d(i, "Could not find model for view type: "));
                }
                Item itemA = GroupUtils.a(i2, arrayList);
                if (itemA.h() == i) {
                    item = itemA;
                    break;
                }
                i2++;
            }
        } else {
            item = this.i;
        }
        return item.g(layoutInflaterFrom.inflate(item.h(), viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean z(RecyclerView.ViewHolder viewHolder) {
        ((GroupieViewHolder) viewHolder).f23758a.getClass();
        return true;
    }
}
