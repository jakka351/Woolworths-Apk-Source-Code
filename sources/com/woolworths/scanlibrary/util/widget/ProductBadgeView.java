package com.woolworths.scanlibrary.util.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/ProductBadgeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "Lcom/woolworths/scanlibrary/util/widget/Badge;", "badges", "", "setBadges", "(Ljava/util/List;)V", "", "d", "Ljava/util/List;", "getBadgeList", "()Ljava/util/List;", "badgeList", "BadgeAdapter", "BadgeViewHolder", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductBadgeView extends FrameLayout {
    public final ArrayList d;
    public final BadgeAdapter e;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/ProductBadgeView$BadgeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/woolworths/scanlibrary/util/widget/ProductBadgeView$BadgeViewHolder;", "Lcom/woolworths/scanlibrary/util/widget/ProductBadgeView;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class BadgeAdapter extends RecyclerView.Adapter<BadgeViewHolder> {
        public BadgeAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int i() {
            return ProductBadgeView.this.getBadgeList().size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void v(RecyclerView.ViewHolder viewHolder, int i) {
            ProductBadgeView productBadgeView = ProductBadgeView.this;
            Badge badge = productBadgeView.getBadgeList().get(i);
            TextView textView = ((BadgeViewHolder) viewHolder).f21382a;
            textView.setText(badge.d);
            textView.setBackgroundResource(badge.e);
            textView.setTextColor(ResourcesCompat.a(R.color.sng_app_text_color, null, productBadgeView.getContext().getResources()));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
            Object systemService = ProductBadgeView.this.getContext().getSystemService("layout_inflater");
            Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.view_badge_item, viewGroup, false);
            Intrinsics.e(viewInflate);
            return new BadgeViewHolder(viewInflate);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/ProductBadgeView$BadgeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class BadgeViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f21382a;

        public BadgeViewHolder(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.txtLabel);
            Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.f21382a = (TextView) viewFindViewById;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductBadgeView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.h(context, "context");
        Intrinsics.h(attrs, "attrs");
        this.d = new ArrayList();
        BadgeAdapter badgeAdapter = new BadgeAdapter();
        this.e = badgeAdapter;
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.view_badge_holder, (ViewGroup) this, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.badgeRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        recyclerView.setAdapter(badgeAdapter);
        addView(viewInflate, -1, -2);
    }

    @NotNull
    public final List<Badge> getBadgeList() {
        return this.d;
    }

    @SuppressLint
    public final void setBadges(@NotNull List<? extends Badge> badges) {
        Intrinsics.h(badges, "badges");
        ArrayList arrayList = this.d;
        arrayList.clear();
        arrayList.addAll(badges);
        this.e.l();
        setVisibility(badges.isEmpty() ? 8 : 0);
    }
}
