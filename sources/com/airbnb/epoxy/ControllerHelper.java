package com.airbnb.epoxy;

import com.airbnb.epoxy.EpoxyController;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ControllerHelper<T extends EpoxyController> {
    public abstract void resetAutoModels();

    public void setControllerToStageTo(EpoxyModel<?> epoxyModel, T t) {
        epoxyModel.h = t;
    }

    public void validateModelHashCodesHaveNotChanged(T t) {
        List list = t.getAdapter().m.f;
        for (int i = 0; i < list.size(); i++) {
            ((EpoxyModel) list.get(i)).B(i, "Model has changed since it was added to the controller.");
        }
    }
}
