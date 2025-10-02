package me.oriient.ipssdk.realtime.ips;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.internal.services.dataManager.building.Floor;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.api.listeners.IPSProximityEventsListener;
import me.oriient.ipssdk.api.listeners.IPSTriggersListener;
import me.oriient.ipssdk.api.models.IPSCancelable;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.common.ips.ListenerException;
import me.oriient.ipssdk.common.services.rest.CancellableRestRequest;
import me.oriient.ipssdk.common.utils.models.Error;
import me.oriient.ipssdk.common.utils.runtimedata.CommonRuntimeDataProvider;
import me.oriient.ipssdk.ips.IPSLocalProximityEvent;
import me.oriient.ipssdk.realtime.ips.proximity.ProximityStatsManager;
import me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventManager;
import me.oriient.ipssdk.realtime.ofs.AbstractC1691n0;
import me.oriient.ipssdk.realtime.ofs.C3;
import me.oriient.ipssdk.realtime.ofs.J4;
import me.oriient.ipssdk.realtime.ofs.L4;
import me.oriient.ipssdk.realtime.services.rest.IRegionsListener;
import me.oriient.ipssdk.realtime.services.rest.IRegionsTriggersListener;
import me.oriient.ipssdk.realtime.services.rest.MapsRestService;
import me.oriient.ipssdk.realtime.utils.DwellEventListener;
import me.oriient.ipssdk.realtime.utils.models.Position;
import me.oriient.ipssdk.realtime.utils.models.ProximityTrigger;
import me.oriient.ipssdk.realtime.utils.models.Region;
import me.oriient.ipssdk.realtime.utils.models.RegionPlacementInBuilding;
import me.oriient.ipssdk.realtime.utils.models.TriggerEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J'\u0010*\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010&2\u000e\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0004¢\u0006\u0004\b,\u0010\rJ\u001b\u0010/\u001a\u00020\u00042\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\b¢\u0006\u0004\b/\u00100J\u001b\u00101\u001a\u00020\u00042\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\b¢\u0006\u0004\b1\u00100J\u001b\u00102\u001a\u00020\u00042\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\b¢\u0006\u0004\b2\u00100J\u001b\u00104\u001a\u00020\u00042\f\u00103\u001a\b\u0012\u0004\u0012\u00020&0\b¢\u0006\u0004\b4\u00100J\r\u00105\u001a\u00020\u0004¢\u0006\u0004\b5\u0010\rR*\u0010<\u001a\u00020\"2\u0006\u00106\u001a\u00020\"8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010\r\u001a\u0004\b9\u0010:R\u001b\u0010B\u001a\u00020=8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/Proximity;", "Lme/oriient/ipssdk/realtime/utils/DwellEventListener;", "Lme/oriient/ipssdk/api/listeners/IPSTriggersListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addTriggersListener", "(Lme/oriient/ipssdk/api/listeners/IPSTriggersListener;)V", "removeTriggersListener", "", "Lme/oriient/ipssdk/api/models/IPSRegion;", "getRegionsContainingUser", "()Ljava/util/List;", "onSpaceChanged", "()V", "onUserLogout", "clearCache", "Lme/oriient/ipssdk/api/listeners/IPSProximityEventsListener;", "addProximityEventsListener", "(Lme/oriient/ipssdk/api/listeners/IPSProximityEventsListener;)V", "removeProximityEventsListener", "Lme/oriient/ipssdk/realtime/utils/models/ProximityTrigger;", "trigger", "Lme/oriient/ipssdk/realtime/utils/models/Region;", "region", "", "time", "onDwellEvent", "(Lme/oriient/ipssdk/realtime/utils/models/ProximityTrigger;Lme/oriient/ipssdk/realtime/utils/models/Region;J)V", "Lme/oriient/ipssdk/realtime/utils/models/Position;", "position", "onPositionUpdate", "(Lme/oriient/ipssdk/realtime/utils/models/Position;)V", "Lme/oriient/internal/services/dataManager/building/Building;", "building", "", "floorOrder", "onNewBuilding", "(Lme/oriient/internal/services/dataManager/building/Building;I)V", "", "oldFloorId", "", "regions", "onNewFloor", "(Ljava/lang/String;Ljava/util/List;)V", "onPositioningStopped", "Lme/oriient/ipssdk/ips/IPSLocalProximityEvent;", "events", "addLocalProximityEvents", "(Ljava/util/List;)V", "removeLocalProximityEvents", "setLocalProximityEvents", "groupIds", "removeLocalProximityEventsByGroupIds", "removeAllLocalProximityEvents", "<set-?>", "k", "I", "getCurrentServiceState", "()I", "getCurrentServiceState$annotations", "currentServiceState", "Lkotlinx/coroutines/CoroutineScope;", "l", "Lkotlin/Lazy;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class Proximity implements DwellEventListener {

    @NotNull
    public static final Proximity INSTANCE = new Proximity();

    /* renamed from: a, reason: collision with root package name */
    private static final Lazy f25852a;
    private static final Lazy b;
    private static final Lazy c;
    private static final Lazy d;
    private static final ArrayList e;
    private static List f;
    private static final ArrayList g;
    private static final HashMap h;
    private static Building i;
    private static String j;

    /* renamed from: k, reason: from kotlin metadata */
    private static int currentServiceState;

    /* renamed from: l, reason: from kotlin metadata */
    private static final Lazy coroutineScope;

    static {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        f25852a = di.inject(reflectionFactory.b(Logger.class));
        b = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ELog.class));
        c = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ProximityEventManager.class), "CLIENT");
        d = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ProximityStatsManager.class));
        e = new ArrayList();
        g = new ArrayList();
        h = new HashMap();
        coroutineScope = LazyKt.b(C3.f25921a);
    }

    private Proximity() {
    }

    private static void a(Floor floor, Building building, String str, Proximity$onNewBuilding$1$1 proximity$onNewBuilding$1$1) {
        List<? extends Region> list;
        ((Logger) f25852a.getD()).d("Proximity", "getRegionsForFloor() called with: floor = [" + floor.getOrder() + "], ipsBuilding = [" + building.getId() + "], listener = [" + proximity$onNewBuilding$1$1 + ']');
        Map map = (Map) h.get(building.getId());
        if (map != null && (list = (List) map.get(Integer.valueOf(floor.getOrder()))) != null) {
            INSTANCE.onNewFloor(str, list);
            return;
        }
        User user = CoreLogic.INSTANCE.getUser();
        if (user == null) {
            proximity$onNewBuilding$1$1.onError(new Error("not logged in", 4, 0));
            return;
        }
        L4 l4 = new L4(((RemoteConfigManager) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(RemoteConfigManager.class))).getRealTimeConfig().getMisc().getMaxProximityDataRetryAttempts(), new androidx.credentials.playservices.b(user, floor, building, proximity$onNewBuilding$1$1));
        synchronized (l4) {
            if (l4.b) {
                return;
            }
            l4.b = true;
            l4.b(1);
        }
    }

    public static final Logger access$getLogger(Proximity proximity) {
        proximity.getClass();
        return (Logger) f25852a.getD();
    }

    public static /* synthetic */ void getCurrentServiceState$annotations() {
    }

    public final void addLocalProximityEvents(@NotNull List<IPSLocalProximityEvent> events) {
        Intrinsics.h(events, "events");
        ((ProximityEventManager) c.getD()).addProximityEvents(events);
    }

    public final void addProximityEventsListener(@NotNull IPSProximityEventsListener listener) {
        Intrinsics.h(listener, "listener");
        Lazy lazy = f25852a;
        ((Logger) lazy.getD()).d("Proximity", "addProximityEventsListener() called with: listener = [" + listener + ']');
        ArrayList arrayList = g;
        if (arrayList.contains(listener)) {
            ((Logger) lazy.getD()).w("Proximity", "addProximityEventsListener: can't add same listener twice");
        } else {
            arrayList.add(listener);
        }
    }

    public final void addTriggersListener(@NotNull IPSTriggersListener listener) {
        Intrinsics.h(listener, "listener");
        Lazy lazy = f25852a;
        ((Logger) lazy.getD()).d("Proximity", "addTriggersListener() called with: listener = [" + listener + ']');
        ArrayList arrayList = e;
        if (arrayList.contains(listener)) {
            ((Logger) lazy.getD()).w("Proximity", "addTriggersListener: can't add same listener twice");
            return;
        }
        arrayList.add(listener);
        if (j == null) {
            Floor activeFloor = CoreLogic.INSTANCE.getActiveFloor();
            if ((activeFloor != null ? activeFloor.getId() : null) == null) {
                return;
            }
        }
        List list = f;
        if (list != null) {
            List listG0 = CollectionsKt.G0(list);
            HashSet hashSet = new HashSet();
            Iterator it = listG0.iterator();
            while (it.hasNext()) {
                CollectionsKt.h(((Region) it.next()).triggers, hashSet);
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                try {
                    listener.onTriggerAdded((ProximityTrigger) it2.next());
                } catch (Exception e2) {
                    ListenerException listenerException = new ListenerException("addTriggersListener", e2);
                    INSTANCE.getClass();
                    AbstractC1691n0.a(listenerException, "errorMessage", (ELog) b.getD(), "addTriggersListener", "Exception in application");
                    ((Logger) f25852a.getD()).e("addTriggersListener", "Exception in application", listenerException);
                }
            }
        }
    }

    public final void clearCache() {
        h.clear();
    }

    @NotNull
    public final CoroutineScope getCoroutineScope() {
        return (CoroutineScope) coroutineScope.getD();
    }

    public final int getCurrentServiceState() {
        return currentServiceState;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<me.oriient.ipssdk.api.models.IPSRegion> getRegionsContainingUser() {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            me.oriient.ipssdk.realtime.ips.Positioning r1 = me.oriient.ipssdk.realtime.ips.Positioning.INSTANCE
            me.oriient.ipssdk.realtime.utils.models.Position r1 = r1.getLastKnownLockedPosition()
            if (r1 != 0) goto Le
            goto L68
        Le:
            java.lang.String r2 = me.oriient.ipssdk.realtime.ips.Proximity.j
            if (r2 != 0) goto L23
            me.oriient.ipssdk.realtime.ips.CoreLogic r2 = me.oriient.ipssdk.realtime.ips.CoreLogic.INSTANCE
            me.oriient.internal.services.dataManager.building.Floor r2 = r2.getActiveFloor()
            if (r2 == 0) goto L1f
            java.lang.String r2 = r2.getId()
            goto L20
        L1f:
            r2 = 0
        L20:
            if (r2 != 0) goto L23
            goto L68
        L23:
            java.util.List r2 = me.oriient.ipssdk.realtime.ips.Proximity.f
            if (r2 == 0) goto L68
            java.util.List r2 = kotlin.collections.CollectionsKt.G0(r2)
            java.util.Iterator r2 = r2.iterator()
        L2f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L68
            java.lang.Object r3 = r2.next()
            me.oriient.ipssdk.realtime.utils.models.Region r3 = (me.oriient.ipssdk.realtime.utils.models.Region) r3
            java.util.List<? extends me.oriient.ipssdk.realtime.utils.models.RegionPlacementInBuilding> r4 = r3.placements
            java.lang.Object r4 = kotlin.collections.CollectionsKt.F(r4)
            me.oriient.ipssdk.realtime.utils.models.RegionPlacementInBuilding r4 = (me.oriient.ipssdk.realtime.utils.models.RegionPlacementInBuilding) r4
            if (r4 != 0) goto L46
            goto L2f
        L46:
            int r5 = r1.getFloorOrder()
            int r6 = r4.getFloorOrder()
            if (r5 == r6) goto L51
            goto L2f
        L51:
            me.oriient.ipssdk.realtime.utils.models.Shape r4 = r4.getShape()
            double r5 = r1.getX()
            double r7 = r1.getY()
            boolean r4 = r4.isInside(r5, r7)
            if (r4 != 0) goto L64
            goto L2f
        L64:
            r0.add(r3)
            goto L2f
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ips.Proximity.getRegionsContainingUser():java.util.List");
    }

    @Override // me.oriient.ipssdk.realtime.utils.DwellEventListener
    public void onDwellEvent(@NotNull ProximityTrigger trigger, @NotNull Region region, long time) {
        Intrinsics.h(trigger, "trigger");
        Intrinsics.h(region, "region");
        Logger logger = (Logger) f25852a.getD();
        StringBuilder sb = new StringBuilder("onDwellEvent() called with: trigger = [");
        sb.append(trigger.getF26200a());
        sb.append("], region = [");
        sb.append(region.getF26196a());
        sb.append("], time = [");
        logger.d("Proximity", androidx.camera.core.impl.b.q(sb, time, ']'));
        Iterator it = CollectionsKt.G0(g).iterator();
        while (it.hasNext()) {
            ((IPSProximityEventsListener) it.next()).onDwellInRegion(trigger, region, time);
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [me.oriient.ipssdk.realtime.ips.Proximity$onNewBuilding$1$1] */
    public final void onNewBuilding(@NotNull Building building, int floorOrder) {
        Intrinsics.h(building, "building");
        ((Logger) f25852a.getD()).d("Proximity", "onNewBuilding() called with: building = [" + building.getId() + "], floorOrder = [" + floorOrder + ']');
        Positioning positioning = Positioning.INSTANCE;
        if (positioning.getPositioningState() == 2 || positioning.getPositioningState() == 1) {
            a(1);
        }
        final Floor floor = building.getFloor(floorOrder);
        if (floor == null) {
            floor = building.getPrimaryFloor();
        }
        final String str = j;
        j = floor.getId();
        i = building;
        for (Floor floor2 : building.getFloors()) {
            final int order = floor2.getOrder();
            Proximity proximity = INSTANCE;
            ?? r5 = new IRegionsListener() { // from class: me.oriient.ipssdk.realtime.ips.Proximity$onNewBuilding$1$1
                @Override // me.oriient.ipssdk.api.listeners.IPSFailable
                public void onError(@NotNull IPSError error) {
                    Intrinsics.h(error, "error");
                    Proximity.access$getLogger(Proximity.INSTANCE).e("Proximity", "getRegionsForFloor " + order + " onError() called with: error = [" + error.getMessage() + ']');
                }

                @Override // me.oriient.ipssdk.realtime.services.rest.IRegionsListener
                public void onReceived(@NotNull List<Region> regions) {
                    Intrinsics.h(regions, "regions");
                    Proximity proximity2 = Proximity.INSTANCE;
                    Proximity.access$getLogger(proximity2).d("Proximity", "onReceived() called for floor " + floor.getOrder() + " with: regions = [" + regions.size() + ']');
                    if (order == floor.getOrder()) {
                        proximity2.onNewFloor(str, regions);
                    }
                }
            };
            proximity.getClass();
            a(floor2, building, str, r5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onNewFloor(@org.jetbrains.annotations.Nullable java.lang.String r9, @org.jetbrains.annotations.NotNull java.util.List<? extends me.oriient.ipssdk.realtime.utils.models.Region> r10) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ips.Proximity.onNewFloor(java.lang.String, java.util.List):void");
    }

    public final void onPositionUpdate(@NotNull Position position) {
        Unit unit;
        Intrinsics.h(position, "position");
        Building building = i;
        if (building != null) {
            Positioning positioning = Positioning.INSTANCE;
            if (positioning.getPositioningState() != 2) {
                INSTANCE.getClass();
                ((Logger) f25852a.getD()).d("Proximity", "onPositionUpdate: not positioning");
                return;
            }
            HashMap map = h;
            Map map2 = (Map) map.get(building.getId());
            if (map2 == null) {
                INSTANCE.getClass();
                ((Logger) f25852a.getD()).d("Proximity", "onPositionUpdate: no building regions");
                return;
            }
            Proximity proximity = INSTANCE;
            proximity.getClass();
            a(2);
            Floor floor = building.getFloor(position.getFloorOrder());
            if (floor == null) {
                ((Logger) f25852a.getD()).d("Proximity", "onPositionUpdate: no floor");
                return;
            }
            List<? extends Region> arrayList = (List) map2.get(Integer.valueOf(position.getFloorOrder()));
            if (!Intrinsics.c(floor.getId(), j)) {
                ((Logger) f25852a.getD()).d("Proximity", "onPositionUpdate: new map");
                String str = j;
                j = floor.getId();
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                proximity.onNewFloor(str, arrayList);
            } else if (arrayList == null) {
                Lazy lazy = f25852a;
                ((Logger) lazy.getD()).d("Proximity", "onPositionUpdate: no regions list for floor " + position.getFloorOrder());
                ((Logger) lazy.getD()).d("Proximity", "onPositionUpdate: " + map.size());
            } else {
                if (!positioning.isPositionLocked(position)) {
                    return;
                }
                Iterator it = map2.values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        INSTANCE.a(position, (Region) it2.next());
                    }
                }
            }
            unit = Unit.f24250a;
        } else {
            unit = null;
        }
        if (unit == null) {
            Lazy lazy2 = f25852a;
            ((Logger) lazy2.getD()).d("Proximity", "onPositionUpdate: no building");
            if (CoreLogic.INSTANCE.getActiveFloor() == null) {
                return;
            }
            Positioning positioning2 = Positioning.INSTANCE;
            if (positioning2.getPositioningState() != 2) {
                ((Logger) lazy2.getD()).w("Proximity", "onPositionUpdate: got position update but not positioning");
                return;
            }
            List list = f;
            if (list != null) {
                List listG0 = CollectionsKt.G0(list);
                if (positioning2.isPositionLocked(position)) {
                    Iterator it3 = listG0.iterator();
                    while (it3.hasNext()) {
                        a(position, (Region) it3.next());
                    }
                }
            }
        }
    }

    public final void onPositioningStopped() {
        ((Logger) f25852a.getD()).d("Proximity", "onPositioningStopped() called");
        String id = j;
        if (id == null) {
            Floor activeFloor = CoreLogic.INSTANCE.getActiveFloor();
            id = activeFloor != null ? activeFloor.getId() : null;
        }
        if (id != null) {
            INSTANCE.getClass();
            b();
        }
        a(0);
    }

    public final void onSpaceChanged() {
        a();
        removeAllLocalProximityEvents();
    }

    public final void onUserLogout() {
        ((Logger) f25852a.getD()).d("Proximity", "onUserLogout() called");
        a();
        removeAllLocalProximityEvents();
    }

    public final void removeAllLocalProximityEvents() {
        ((ProximityEventManager) c.getD()).removeAllProximityEvents();
    }

    public final void removeLocalProximityEvents(@NotNull List<IPSLocalProximityEvent> events) {
        Intrinsics.h(events, "events");
        ((ProximityEventManager) c.getD()).removeProximityEvents(events);
    }

    public final void removeLocalProximityEventsByGroupIds(@NotNull List<String> groupIds) {
        Intrinsics.h(groupIds, "groupIds");
        ((ProximityEventManager) c.getD()).removeProximityEventsByGroupIds(groupIds);
    }

    public final void removeProximityEventsListener(@NotNull IPSProximityEventsListener listener) {
        Intrinsics.h(listener, "listener");
        ((Logger) f25852a.getD()).d("Proximity", "removeProximityEventsListener() called with: listener = [" + listener + ']');
        g.remove(listener);
    }

    public final void removeTriggersListener(@NotNull IPSTriggersListener listener) {
        Intrinsics.h(listener, "listener");
        Lazy lazy = f25852a;
        ((Logger) lazy.getD()).d("Proximity", "removeTriggersListener() called with: listener = [" + listener + ']');
        if (e.remove(listener)) {
            return;
        }
        ((Logger) lazy.getD()).e("Proximity", "removeTriggersListener: listener not removed!");
    }

    public final void setLocalProximityEvents(@NotNull List<IPSLocalProximityEvent> events) {
        Intrinsics.h(events, "events");
        ((ProximityEventManager) c.getD()).setProximityEvents(events);
    }

    private static void b() {
        List<Region> list = f;
        if (list != null) {
            for (Region region : list) {
                region.reset();
                Iterator<T> it = region.triggers.iterator();
                while (it.hasNext()) {
                    ((ProximityTrigger) it.next()).cancelDwellEvents();
                }
            }
        }
    }

    private static void a(String str) {
        ((Logger) f25852a.getD()).d("Proximity", "notifyAllTriggersRemoved() called with: mapId = [" + str + ']');
        List list = f;
        if (list != null) {
            List listG0 = CollectionsKt.G0(list);
            HashSet hashSet = new HashSet();
            Iterator it = listG0.iterator();
            while (it.hasNext()) {
                CollectionsKt.h(((Region) it.next()).triggers, hashSet);
            }
            List listG02 = CollectionsKt.G0(e);
            ((Logger) f25852a.getD()).d("Proximity", "notifyAllTriggersRemoved: found " + hashSet.size() + " triggers");
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ProximityTrigger proximityTrigger = (ProximityTrigger) it2.next();
                Iterator it3 = listG02.iterator();
                while (it3.hasNext()) {
                    try {
                        ((IPSTriggersListener) it3.next()).onTriggerRemoved(proximityTrigger);
                    } catch (Exception e2) {
                        ListenerException listenerException = new ListenerException("notifyAllTriggersRemoved", e2);
                        INSTANCE.getClass();
                        AbstractC1691n0.a(listenerException, "errorMessage", (ELog) b.getD(), "notifyAllTriggersRemoved", "Exception in application");
                        ((Logger) f25852a.getD()).e("notifyAllTriggersRemove", "Exception in application", listenerException);
                    }
                }
            }
        }
    }

    private static void a() {
        String id = j;
        if (id == null) {
            Floor activeFloor = CoreLogic.INSTANCE.getActiveFloor();
            id = activeFloor != null ? activeFloor.getId() : null;
        }
        if (id != null) {
            INSTANCE.getClass();
            b();
            a(id);
        }
        h.clear();
        i = null;
        j = null;
        f = null;
        a(0);
    }

    private final void a(Position position, Region region) {
        RegionPlacementInBuilding regionPlacementInBuilding = region.placements.get(0);
        if (regionPlacementInBuilding != null && position.getFloorOrder() == regionPlacementInBuilding.getFloorOrder()) {
            List<TriggerEvent> allTriggersEvents = region.getAllTriggersEvents();
            if (allTriggersEvents.isEmpty()) {
                return;
            }
            if (regionPlacementInBuilding.getShape().isInside(position.getX(), position.getY())) {
                if (region.isInside) {
                    return;
                }
                region.isInside = true;
                ((Logger) f25852a.getD()).d("Proximity", "onPositionUpdate(" + region.getB() + "): user inside. " + allTriggersEvents.size() + " events, " + g.size() + " listeners");
                for (TriggerEvent triggerEvent : allTriggersEvents) {
                    if (triggerEvent instanceof ProximityTrigger.TriggerEventEnter) {
                        ((ProximityTrigger.TriggerEventEnter) triggerEvent).onEntered(region);
                        Iterator it = CollectionsKt.G0(g).iterator();
                        while (it.hasNext()) {
                            ((IPSProximityEventsListener) it.next()).onEnterRegion(triggerEvent.getD(), region);
                        }
                    } else if (triggerEvent instanceof ProximityTrigger.TriggerEventDwell) {
                        ((ProximityTrigger.TriggerEventDwell) triggerEvent).onEntered(region, this);
                    }
                }
                return;
            }
            if (region.isInside) {
                ((Logger) f25852a.getD()).d("Proximity", "onPositionUpdate(" + region.getB() + "): user outside");
                region.isInside = false;
                for (TriggerEvent triggerEvent2 : allTriggersEvents) {
                    if (triggerEvent2 instanceof ProximityTrigger.TriggerEventExit) {
                        triggerEvent2.onExited(region);
                        Iterator it2 = CollectionsKt.G0(g).iterator();
                        while (it2.hasNext()) {
                            ((IPSProximityEventsListener) it2.next()).onExitRegion(triggerEvent2.getD(), region);
                        }
                    } else {
                        ProximityTrigger.TriggerEventDwell triggerEventDwell = triggerEvent2 instanceof ProximityTrigger.TriggerEventDwell ? (ProximityTrigger.TriggerEventDwell) triggerEvent2 : null;
                        if (triggerEventDwell != null) {
                            triggerEventDwell.onExited(region);
                        }
                    }
                }
            }
        }
    }

    private static void a(int i2) {
        if (currentServiceState == i2) {
            return;
        }
        currentServiceState = i2;
        Iterator it = CollectionsKt.G0(g).iterator();
        while (it.hasNext()) {
            try {
                ((IPSProximityEventsListener) it.next()).onServiceStateChanged(i2);
            } catch (Exception e2) {
                ListenerException listenerException = new ListenerException("updateServiceState", e2);
                INSTANCE.getClass();
                AbstractC1691n0.a(listenerException, "errorMessage", (ELog) b.getD(), "updateServiceState", "Exception in application");
                INSTANCE.getClass();
                ((Logger) f25852a.getD()).e("updateServiceState", "Exception in application", listenerException);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IPSCancelable a(User user, final Floor floor, final Building ipsBuilding, final IRegionsListener iRegionsListener, final J4 errorHandler) {
        Intrinsics.h(user, "$user");
        Intrinsics.h(floor, "$floor");
        Intrinsics.h(ipsBuilding, "$ipsBuilding");
        Intrinsics.h(errorHandler, "errorHandler");
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        return new CancellableRestRequest(((MapsRestService) DependencyInjectionKt.getDi().get(reflectionFactory.b(MapsRestService.class))).getAllMapEntitiesJava(user, ((CommonRuntimeDataProvider) di.get(reflectionFactory.b(CommonRuntimeDataProvider.class))).getUserSessionIdJava(), floor.getId(), floor.getId(), floor.getOrder(), ipsBuilding.getId(), new IRegionsTriggersListener() { // from class: me.oriient.ipssdk.realtime.ips.Proximity$getRegionsForFloor$2$1
            @Override // me.oriient.ipssdk.api.listeners.IPSFailable
            public void onError(@NotNull IPSError error) {
                Intrinsics.h(error, "error");
                Proximity.access$getLogger(Proximity.INSTANCE).e("Proximity", "getRegionsForFloor onError() called for floor " + floor.getOrder() + " with: error = [" + error.getMessage() + ']');
                errorHandler.a(error);
            }

            @Override // me.oriient.ipssdk.realtime.services.rest.IRegionsTriggersListener
            public void onReceived(@NotNull List<Region> regions) {
                Intrinsics.h(regions, "regions");
                Proximity proximity = Proximity.INSTANCE;
                Proximity.access$getLogger(proximity).d("Proximity", "getRegionsForFloor onReceived() called with: regions for floor " + floor.getOrder() + " = [" + regions.size() + ']');
                Map map = (Map) Proximity.h.get(ipsBuilding.getId());
                if (map == null) {
                    map = new HashMap();
                }
                map.put(Integer.valueOf(floor.getOrder()), regions);
                Proximity.h.put(ipsBuilding.getId(), map);
                Building building = Proximity.i;
                if (building != null) {
                    Building building2 = ipsBuilding;
                    Floor floor2 = floor;
                    if (Intrinsics.c(building2.getId(), building.getId()) && Intrinsics.c(floor2.getId(), Proximity.j)) {
                        proximity.onNewFloor(null, regions);
                    }
                }
                IRegionsListener iRegionsListener2 = iRegionsListener;
                if (iRegionsListener2 != null) {
                    iRegionsListener2.onReceived(regions);
                }
            }
        }));
    }
}
