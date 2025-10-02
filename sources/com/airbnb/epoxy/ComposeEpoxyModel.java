package com.airbnb.epoxy;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/airbnb/epoxy/ComposeEpoxyModel;", "Lcom/airbnb/epoxy/EpoxyModelWithView;", "Landroidx/compose/ui/platform/ComposeView;", "epoxy-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposeEpoxyModel extends EpoxyModelWithView<ComposeView> {
    public final Object[] n;
    public final ComposableLambdaImpl o;
    public final Lazy p;

    public ComposeEpoxyModel(Object[] keys, ComposableLambdaImpl composableLambdaImpl) {
        Intrinsics.h(keys, "keys");
        this.n = keys;
        this.o = composableLambdaImpl;
        this.p = LazyKt.b(ComposeEpoxyModel$keyedTags$2.h);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final void h(ComposeView view) {
        Intrinsics.h(view, "view");
        view.setContent(this.o);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final ComposeView j(ViewGroup parent) {
        Intrinsics.h(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.g(context, "parent.context");
        return new ComposeView(context, null, 6, 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ComposeEpoxyModel)) {
            return false;
        }
        return Arrays.equals(this.n, ((ComposeEpoxyModel) obj).n);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode();
        for (Object obj : this.n) {
            iHashCode = (iHashCode * 31) + obj.hashCode();
        }
        return iHashCode;
    }
}
