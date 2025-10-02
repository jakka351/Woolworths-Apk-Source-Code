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
import me.oriient.navigation.turnByTurn.models.NavigationInstruction;

/* loaded from: classes8.dex */
public final class I2 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public static final I2 f25956a = new I2();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(NavigationExtKt.toSdkInstruction((NavigationInstruction) it.next()));
        }
        for (IPSLiveNavigationListener iPSLiveNavigationListener : ExtensionsKt.copyOf(Navigation.h)) {
            if (iPSLiveNavigationListener != null) {
                iPSLiveNavigationListener.onNavigationInstructionsUpdate(arrayList);
            }
        }
        return Unit.f24250a;
    }
}
