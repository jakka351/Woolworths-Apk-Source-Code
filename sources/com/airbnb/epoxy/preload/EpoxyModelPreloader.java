package com.airbnb.epoxy.preload;

import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.preload.PreloadRequestHolder;
import com.airbnb.epoxy.preload.ViewMetadata;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0001*\n\b\u0001\u0010\u0004*\u0004\u0018\u00010\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u00020\u0007:\u0001\b¨\u0006\t"}, d2 = {"Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;", "Lcom/airbnb/epoxy/EpoxyModel;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/airbnb/epoxy/preload/ViewMetadata;", "U", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "P", "", "Companion", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class EpoxyModelPreloader<T extends EpoxyModel<?>, U extends ViewMetadata, P extends PreloadRequestHolder> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/epoxy/preload/EpoxyModelPreloader$Companion;", "", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    public abstract void a(EpoxyModel epoxyModel, PreloadRequestHolder preloadRequestHolder, ViewData viewData);

    public Object b(EpoxyModel epoxyModel) {
        Intrinsics.h(epoxyModel, "epoxyModel");
        return null;
    }
}
