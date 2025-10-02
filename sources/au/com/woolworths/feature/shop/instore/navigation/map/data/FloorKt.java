package au.com.woolworths.feature.shop.instore.navigation.map.data;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.ipssdk.api.models.IPSEntrance;
import me.oriient.ipssdk.api.models.IPSFloor;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FloorKt {
    public static final Floor a(IPSFloor iPSFloor) {
        Object next;
        Entrance entrance;
        String id = iPSFloor.getId();
        Intrinsics.g(id, "getId(...)");
        String name = iPSFloor.getName();
        Intrinsics.g(name, "getName(...)");
        String shortName = iPSFloor.getShortName();
        Intrinsics.g(shortName, "getShortName(...)");
        int order = iPSFloor.getOrder();
        String mapId = iPSFloor.getMapId();
        Intrinsics.g(mapId, "getMapId(...)");
        List<IPSEntrance> entrances = iPSFloor.getEntrances();
        Intrinsics.g(entrances, "getEntrances(...)");
        Iterator<T> it = entrances.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((IPSEntrance) next).getIsMain()) {
                break;
            }
        }
        IPSEntrance iPSEntrance = (IPSEntrance) next;
        if (iPSEntrance != null) {
            String id2 = iPSEntrance.getId();
            Intrinsics.g(id2, "getId(...)");
            entrance = new Entrance(id2, iPSEntrance.getIsMain(), iPSEntrance.getX(), iPSEntrance.getY());
        } else {
            entrance = null;
        }
        return new Floor(id, name, shortName, order, mapId, entrance);
    }
}
