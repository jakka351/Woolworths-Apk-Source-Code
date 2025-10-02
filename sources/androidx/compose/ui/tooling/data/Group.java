package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntRect;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@StabilityInferred
@UiToolingDataApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/tooling/data/Group;", "", "Landroidx/compose/ui/tooling/data/CallGroup;", "Landroidx/compose/ui/tooling/data/EmptyGroup;", "Landroidx/compose/ui/tooling/data/NodeGroup;", "ui-tooling-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class Group {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2188a;
    public final String b;
    public final SourceLocation c;
    public final Object d;
    public final IntRect e;
    public final Object f;
    public final Object g;

    public Group(Object obj, String str, SourceLocation sourceLocation, Object obj2, IntRect intRect, Collection collection, Collection collection2) {
        this.f2188a = obj;
        this.b = str;
        this.c = sourceLocation;
        this.d = obj2;
        this.e = intRect;
        this.f = collection;
        this.g = collection2;
    }

    public List a() {
        return EmptyList.d;
    }
}
