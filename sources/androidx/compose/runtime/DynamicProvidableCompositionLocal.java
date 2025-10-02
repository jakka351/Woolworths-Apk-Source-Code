package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/DynamicProvidableCompositionLocal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/ProvidableCompositionLocal;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DynamicProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    public final SnapshotMutationPolicy b;

    public DynamicProvidableCompositionLocal(Function0 function0) {
        super(function0);
        this.b = StructuralEqualityPolicy.f1671a;
    }

    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    public final ProvidedValue b(Object obj) {
        return new ProvidedValue(this, obj, obj == null, this.b, null, null, true);
    }
}
