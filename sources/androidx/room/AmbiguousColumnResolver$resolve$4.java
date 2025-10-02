package androidx.room;

import androidx.room.AmbiguousColumnResolver;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Landroidx/room/AmbiguousColumnResolver$Match;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AmbiguousColumnResolver$resolve$4 extends Lambda implements Function1<List<? extends AmbiguousColumnResolver.Match>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List it = (List) obj;
        Intrinsics.h(it, "it");
        int i = AmbiguousColumnResolver.Solution.g;
        List list = it;
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            throw null;
        }
        Iterator it3 = list.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        throw null;
    }
}
