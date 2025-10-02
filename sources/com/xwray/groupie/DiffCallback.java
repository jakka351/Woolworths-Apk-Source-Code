package com.xwray.groupie;

import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes7.dex */
class DiffCallback extends DiffUtil.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final int f23756a;
    public final int b;
    public final ArrayList c;
    public final Object d;

    public DiffCallback(ArrayList arrayList, Collection collection) {
        this.f23756a = GroupUtils.b(arrayList);
        this.b = GroupUtils.b(collection);
        this.c = arrayList;
        this.d = collection;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean a(int i, int i2) {
        return GroupUtils.a(i2, this.d).equals(GroupUtils.a(i, this.c));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean b(int i, int i2) {
        Item itemA = GroupUtils.a(i, this.c);
        Item itemA2 = GroupUtils.a(i2, this.d);
        return itemA2.h() == itemA.h() && itemA2.e == itemA.e;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final Object c(int i, int i2) {
        Item itemA = GroupUtils.a(i, this.c);
        GroupUtils.a(i2, this.d);
        itemA.getClass();
        return null;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int d() {
        return this.b;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int e() {
        return this.f23756a;
    }
}
