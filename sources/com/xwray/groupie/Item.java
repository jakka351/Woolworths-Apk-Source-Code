package com.xwray.groupie;

import YU.a;
import android.view.View;
import com.xwray.groupie.GroupieViewHolder;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes7.dex */
public abstract class Item<VH extends GroupieViewHolder> implements Group, SpanSizeProvider {
    public static final AtomicLong f = new AtomicLong(0);
    public GroupDataObserver d;
    public final long e;

    public Item() {
        long jDecrementAndGet = f.decrementAndGet();
        new HashMap();
        this.e = jDecrementAndGet;
    }

    @Override // com.xwray.groupie.Group
    public final int a() {
        return 1;
    }

    public abstract void b(GroupieViewHolder groupieViewHolder);

    public void c(GroupieViewHolder groupieViewHolder, int i) {
        b(groupieViewHolder);
        throw null;
    }

    @Override // com.xwray.groupie.Group
    public final void d(Section section) {
    }

    @Override // com.xwray.groupie.Group
    public final void e(GroupDataObserver groupDataObserver) {
        this.d = groupDataObserver;
    }

    public void f(GroupieViewHolder groupieViewHolder, int i, List list) {
        groupieViewHolder.f23758a = this;
        c(groupieViewHolder, i);
    }

    public GroupieViewHolder g(View view) {
        return new GroupieViewHolder(view);
    }

    @Override // com.xwray.groupie.Group
    public final Item getItem(int i) {
        if (i == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException(a.e(i, "Wanted item at position ", " but an Item is a Group of size 1"));
    }

    public abstract int h();
}
