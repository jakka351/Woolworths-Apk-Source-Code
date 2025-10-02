package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/StaticValueHolder;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/ValueHolder;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StaticValueHolder<T> implements ValueHolder<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1670a;

    public StaticValueHolder(Object obj) {
        this.f1670a = obj;
    }

    @Override // androidx.compose.runtime.ValueHolder
    public final Object a(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return this.f1670a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StaticValueHolder) && Intrinsics.c(this.f1670a, ((StaticValueHolder) obj).f1670a);
    }

    public final int hashCode() {
        Object obj = this.f1670a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return android.support.v4.media.session.a.s(new StringBuilder("StaticValueHolder(value="), this.f1670a, ')');
    }
}
