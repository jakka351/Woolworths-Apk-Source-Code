package com.airbnb.epoxy;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"epoxy-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposeInteropKt {
    public static final void a(ModelCollector modelCollector, String id, Object[] objArr, ComposableLambdaImpl composableLambdaImpl) {
        Intrinsics.h(modelCollector, "<this>");
        Intrinsics.h(id, "id");
        ComposeEpoxyModel composeEpoxyModel = new ComposeEpoxyModel(Arrays.copyOf(objArr, objArr.length), composableLambdaImpl);
        composeEpoxyModel.p(id);
        modelCollector.add(composeEpoxyModel);
    }

    public static final ComposeEpoxyModel b(String id, Object[] objArr, ComposableLambdaImpl composableLambdaImpl) {
        Intrinsics.h(id, "id");
        ComposeEpoxyModel composeEpoxyModel = new ComposeEpoxyModel(Arrays.copyOf(objArr, objArr.length), composableLambdaImpl);
        composeEpoxyModel.p(id);
        return composeEpoxyModel;
    }
}
