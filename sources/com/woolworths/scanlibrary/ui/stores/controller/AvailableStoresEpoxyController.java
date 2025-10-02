package com.woolworths.scanlibrary.ui.stores.controller;

import androidx.compose.runtime.internal.StabilityInferred;
import com.airbnb.epoxy.TypedEpoxyController;
import com.woolworths.scanlibrary.ViewAvailableStoreInfoBindingModel_;
import com.woolworths.scanlibrary.models.store.Store;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014¨\u0006\t"}, d2 = {"Lcom/woolworths/scanlibrary/ui/stores/controller/AvailableStoresEpoxyController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "Lcom/woolworths/scanlibrary/models/store/Store;", "<init>", "()V", "buildModels", "", "data", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AvailableStoresEpoxyController extends TypedEpoxyController<List<? extends Store>> {
    public static final int $stable = 8;

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends Store> list) {
        buildModels2((List<Store>) list);
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(@Nullable List<Store> data) {
        if (data != null) {
            for (Store store : data) {
                ViewAvailableStoreInfoBindingModel_ viewAvailableStoreInfoBindingModel_ = new ViewAvailableStoreInfoBindingModel_();
                viewAvailableStoreInfoBindingModel_.M("store_" + store.getName().hashCode());
                viewAvailableStoreInfoBindingModel_.t();
                viewAvailableStoreInfoBindingModel_.n = store;
                add(viewAvailableStoreInfoBindingModel_);
            }
        }
    }
}
