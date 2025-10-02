package com.airbnb.epoxy.paging3;

import com.airbnb.epoxy.EpoxyModel;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u0001H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Lcom/airbnb/epoxy/EpoxyModel;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "pos", "", "item", "invoke", "(ILjava/lang/Object;)Lcom/airbnb/epoxy/EpoxyModel;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PagingDataEpoxyController$modelCache$1<T> extends Lambda implements Function2<Integer, T, EpoxyModel<?>> {
    public final /* synthetic */ PagingDataEpoxyController h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingDataEpoxyController$modelCache$1(PagingDataEpoxyController pagingDataEpoxyController) {
        super(2);
        this.h = pagingDataEpoxyController;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return this.h.buildItemModel(((Number) obj).intValue(), obj2);
    }
}
