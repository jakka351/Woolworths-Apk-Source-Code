package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/AbstractApplier;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/Applier;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AbstractApplier<T> implements Applier<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1617a;
    public final ArrayList b = new ArrayList();
    public Object c;

    public AbstractApplier(Object obj) {
        this.f1617a = obj;
        this.c = obj;
    }

    @Override // androidx.compose.runtime.Applier
    /* renamed from: g, reason: from getter */
    public final Object getC() {
        return this.c;
    }

    @Override // androidx.compose.runtime.Applier
    public final void i(Object obj) {
        this.b.add(this.c);
        this.c = obj;
    }

    @Override // androidx.compose.runtime.Applier
    public final void j() {
        this.c = this.b.remove(r0.size() - 1);
    }

    public final void k() {
        this.b.clear();
        this.c = this.f1617a;
        l();
    }

    public abstract void l();
}
