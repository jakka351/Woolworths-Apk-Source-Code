package androidx.compose.material;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material/DraggableAnchorsConfig;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalMaterialApi
/* loaded from: classes2.dex */
public final class DraggableAnchorsConfig<T> {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1275a = new LinkedHashMap();

    public final void a(Object obj, float f) {
        this.f1275a.put(obj, Float.valueOf(f));
    }

    /* renamed from: b, reason: from getter */
    public final LinkedHashMap getF1275a() {
        return this.f1275a;
    }
}
