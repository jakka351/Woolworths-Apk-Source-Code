package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/StaticProvidableCompositionLocal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/ProvidableCompositionLocal;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StaticProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    public final ProvidedValue b(Object obj) {
        return new ProvidedValue(this, obj, obj == null, null, null, null, false);
    }
}
