package me.oriient.ipssdk.realtime.ofs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.ipssdk.api.listeners.IPSLiveNavigationListener;
import me.oriient.ipssdk.realtime.ips.Navigation;
import me.oriient.ipssdk.realtime.ips.NavigationExtKt;
import me.oriient.ipssdk.realtime.utils.ExtensionsKt;
import me.oriient.navigation.common.models.Turn;

/* loaded from: classes8.dex */
public final class G2 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public static final G2 f25944a = new G2();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(NavigationExtKt.toSdkTurn((Turn) it.next()));
        }
        for (IPSLiveNavigationListener iPSLiveNavigationListener : ExtensionsKt.copyOf(Navigation.h)) {
            if (iPSLiveNavigationListener != null) {
                iPSLiveNavigationListener.onNavigationTurnsUpdate(arrayList);
            }
        }
        return Unit.f24250a;
    }
}
