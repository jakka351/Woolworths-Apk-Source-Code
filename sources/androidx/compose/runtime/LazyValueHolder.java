package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/LazyValueHolder;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/ValueHolder;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyValueHolder<T> implements ValueHolder<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f1644a;

    public LazyValueHolder(Function0 function0) {
        this.f1644a = LazyKt.b(function0);
    }

    @Override // androidx.compose.runtime.ValueHolder
    public final Object a(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return this.f1644a.getD();
    }
}
