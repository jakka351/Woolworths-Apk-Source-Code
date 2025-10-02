package com.airbnb.epoxy;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@EpoxyModelClass
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/airbnb/epoxy/GroupModel;", "Lcom/airbnb/epoxy/EpoxyModelGroup;", "Lcom/airbnb/epoxy/ModelCollector;", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class GroupModel extends EpoxyModelGroup implements ModelCollector {
    @Override // com.airbnb.epoxy.ModelCollector
    public final void add(EpoxyModel model) {
        Intrinsics.h(model, "model");
        this.o |= model.y();
        this.n.add(model);
    }
}
