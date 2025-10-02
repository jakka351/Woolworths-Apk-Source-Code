package com.xwray.groupie;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes7.dex */
public class GroupieViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public Item f23758a;
    public final View.OnClickListener b;

    /* renamed from: com.xwray.groupie.GroupieViewHolder$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.g(view);
            try {
            } finally {
                Callback.h();
            }
        }
    }

    /* renamed from: com.xwray.groupie.GroupieViewHolder$2, reason: invalid class name */
    public class AnonymousClass2 implements View.OnLongClickListener {
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return false;
        }
    }

    public GroupieViewHolder(View view) {
        super(view);
        this.b = new AnonymousClass1();
    }
}
