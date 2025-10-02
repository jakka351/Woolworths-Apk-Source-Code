package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Stable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/CompositionLocal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CompositionLocal<T> {

    /* renamed from: a, reason: collision with root package name */
    public final LazyValueHolder f1631a;

    public CompositionLocal(Function0 function0) {
        this.f1631a = new LazyValueHolder(function0);
    }

    public ValueHolder a() {
        return this.f1631a;
    }
}
