package com.airbnb.epoxy.preload;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import com.airbnb.epoxy.BaseEpoxyAdapter;
import com.airbnb.epoxy.EpoxyModel;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/airbnb/epoxy/preload/PreloadableViewDataProvider;", "", "CacheKey", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PreloadableViewDataProvider {

    /* renamed from: a, reason: collision with root package name */
    public final BaseEpoxyAdapter f13336a;
    public final LinkedHashMap b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/epoxy/preload/PreloadableViewDataProvider$CacheKey;", "", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class CacheKey {

        /* renamed from: a, reason: collision with root package name */
        public final Class f13337a;
        public final int b;
        public final int c;
        public final Object d;

        public CacheKey(Class cls, int i, int i2, Object obj) {
            this.f13337a = cls;
            this.b = i;
            this.c = i2;
            this.d = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CacheKey)) {
                return false;
            }
            CacheKey cacheKey = (CacheKey) obj;
            return Intrinsics.c(this.f13337a, cacheKey.f13337a) && this.b == cacheKey.b && this.c == cacheKey.c && Intrinsics.c(this.d, cacheKey.d);
        }

        public final int hashCode() {
            int iA = b.a(this.c, b.a(this.b, this.f13337a.hashCode() * 31, 31), 31);
            Object obj = this.d;
            return iA + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CacheKey(epoxyModelClass=");
            sb.append(this.f13337a);
            sb.append(", spanSize=");
            sb.append(this.b);
            sb.append(", viewType=");
            sb.append(this.c);
            sb.append(", signature=");
            return a.s(sb, this.d, ')');
        }
    }

    public PreloadableViewDataProvider(BaseEpoxyAdapter baseEpoxyAdapter) {
        Intrinsics.h(null, "errorHandler");
        this.f13336a = baseEpoxyAdapter;
        this.b = new LinkedHashMap();
    }

    public final CacheKey a(EpoxyModelPreloader epoxyModelPreloader, EpoxyModel epoxyModel, int i) {
        BaseEpoxyAdapter baseEpoxyAdapter = this.f13336a;
        int i2 = baseEpoxyAdapter.g;
        return new CacheKey(epoxyModel.getClass(), i2 > 1 ? epoxyModel.z(i2, i, baseEpoxyAdapter.i()) : 1, epoxyModel.n(), epoxyModelPreloader.b(epoxyModel));
    }
}
