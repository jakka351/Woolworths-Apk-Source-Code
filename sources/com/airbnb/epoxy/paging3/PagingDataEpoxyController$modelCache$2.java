package com.airbnb.epoxy.paging3;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PagingDataEpoxyController$modelCache$2 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ PagingDataEpoxyController h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingDataEpoxyController$modelCache$2(PagingDataEpoxyController pagingDataEpoxyController) {
        super(0);
        this.h = pagingDataEpoxyController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.h.requestModelBuild();
        return Unit.f24250a;
    }
}
