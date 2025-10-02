package com.airbnb.epoxy;

import androidx.collection.LongSparseArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class DiffPayload {

    /* renamed from: a, reason: collision with root package name */
    public final EpoxyModel f13311a;
    public final LongSparseArray b;

    public DiffPayload(EpoxyModel epoxyModel) {
        List<EpoxyModel> listSingletonList = Collections.singletonList(epoxyModel);
        if (listSingletonList.isEmpty()) {
            throw new IllegalStateException("Models must not be empty");
        }
        int size = listSingletonList.size();
        if (size == 1) {
            this.f13311a = (EpoxyModel) listSingletonList.get(0);
            this.b = null;
            return;
        }
        this.f13311a = null;
        this.b = new LongSparseArray(size);
        for (EpoxyModel epoxyModel2 : listSingletonList) {
            this.b.h(epoxyModel2.d, epoxyModel2);
        }
    }
}
