package com.airbnb.epoxy;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class EpoxyRecyclerView$initViewPool$1 extends Lambda implements Function0<RecyclerView.RecycledViewPool> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new UnboundedViewPool();
    }
}
