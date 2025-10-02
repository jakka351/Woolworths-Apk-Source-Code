package androidx.lifecycle.viewmodel;

import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/viewmodel/MutableCreationExtras;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MutableCreationExtras extends CreationExtras {
    public MutableCreationExtras(CreationExtras initialExtras) {
        Intrinsics.h(initialExtras, "initialExtras");
        LinkedHashMap initialExtras2 = initialExtras.f2811a;
        Intrinsics.h(initialExtras2, "initialExtras");
        this.f2811a.putAll(initialExtras2);
    }

    @Override // androidx.lifecycle.viewmodel.CreationExtras
    public final Object a(CreationExtras.Key key) {
        return this.f2811a.get(key);
    }

    public /* synthetic */ MutableCreationExtras(int i) {
        this(CreationExtras.Empty.b);
    }
}
