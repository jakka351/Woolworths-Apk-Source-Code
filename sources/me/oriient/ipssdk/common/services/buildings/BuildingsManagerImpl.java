package me.oriient.ipssdk.common.services.buildings;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.common.utils.ExtensionsKt;
import me.oriient.ipssdk.common.utils.models.Building;
import me.oriient.ipssdk.common.utils.models.BuildingId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u0003J\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lme/oriient/ipssdk/common/services/buildings/BuildingsManagerImpl;", "Lme/oriient/ipssdk/common/services/buildings/BuildingsManager;", "<init>", "()V", "", "Lme/oriient/ipssdk/common/utils/models/Building;", "buildings", "", "addBuildings", "(Ljava/util/List;)V", "building", "addBuilding", "(Lme/oriient/ipssdk/common/utils/models/Building;)V", "clearBuildings", "getBuildings", "()Ljava/util/List;", "Lme/oriient/ipssdk/common/utils/models/BuildingId;", "buildingId", "getBuilding-TVSKQeo", "(Ljava/lang/String;)Lme/oriient/ipssdk/common/utils/models/Building;", "getBuilding", "Lme/oriient/ipssdk/common/services/buildings/BuildingsChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addBuildingsChangeListener", "(Lme/oriient/ipssdk/common/services/buildings/BuildingsChangeListener;)V", "removeBuildingsChangeListener", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class BuildingsManagerImpl implements BuildingsManager {

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f25774a = DependencyInjectionKt.getDi().inject(Reflection.f24268a.b(Logger.class));
    private final ArrayList b = new ArrayList();
    private final ArrayList c = new ArrayList();

    private final boolean a(Building building) {
        synchronized (this.b) {
            if (this.b.contains(building)) {
                return false;
            }
            this.b.add(building);
            return true;
        }
    }

    @Override // me.oriient.ipssdk.common.services.buildings.BuildingsManager
    public void addBuilding(@NotNull Building building) {
        Intrinsics.h(building, "building");
        if (a(building)) {
            ((Logger) this.f25774a.getD()).d("BuildingsManager", "addBuilding: new building added: " + building);
            List<Building> listCopyOf = ExtensionsKt.copyOf((List) this.b);
            Iterator it = ExtensionsKt.copyOf((List) this.c).iterator();
            while (it.hasNext()) {
                ((BuildingsChangeListener) it.next()).onBuildingsChanged(listCopyOf);
            }
        }
    }

    @Override // me.oriient.ipssdk.common.services.buildings.BuildingsManager
    public void addBuildings(@NotNull List<Building> buildings) {
        Intrinsics.h(buildings, "buildings");
        boolean z = false;
        for (Building building : buildings) {
            if (a(building)) {
                ((Logger) this.f25774a.getD()).d("BuildingsManager", "addBuildings: new building added: " + building);
                z = true;
            }
        }
        if (z) {
            List<Building> listCopyOf = ExtensionsKt.copyOf((List) this.b);
            Iterator it = ExtensionsKt.copyOf((List) this.c).iterator();
            while (it.hasNext()) {
                ((BuildingsChangeListener) it.next()).onBuildingsChanged(listCopyOf);
            }
        }
    }

    @Override // me.oriient.ipssdk.common.services.buildings.BuildingsManager
    public void addBuildingsChangeListener(@NotNull BuildingsChangeListener listener) {
        Intrinsics.h(listener, "listener");
        this.c.add(listener);
    }

    @Override // me.oriient.ipssdk.common.services.buildings.BuildingsManager
    public void clearBuildings() {
        synchronized (this.b) {
            if (!this.b.isEmpty()) {
                ((Logger) this.f25774a.getD()).d("BuildingsManager", "clearBuildings: buildings cleared");
                this.b.clear();
                Iterator it = ExtensionsKt.copyOf((List) this.c).iterator();
                while (it.hasNext()) {
                    ((BuildingsChangeListener) it.next()).onBuildingsChanged(EmptyList.d);
                }
            }
        }
    }

    @Override // me.oriient.ipssdk.common.services.buildings.BuildingsManager
    @Nullable
    /* renamed from: getBuilding-TVSKQeo */
    public Building mo435getBuildingTVSKQeo(@NotNull String buildingId) {
        Object obj;
        Building building;
        Intrinsics.h(buildingId, "buildingId");
        synchronized (this.b) {
            try {
                Iterator it = this.b.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    Building building2 = (Building) next;
                    String buildingId2 = building2 != null ? building2.getBuildingId() : null;
                    if (buildingId2 == null ? false : BuildingId.m443equalsimpl0(buildingId2, buildingId)) {
                        obj = next;
                        break;
                    }
                }
                building = (Building) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return building;
    }

    @Override // me.oriient.ipssdk.common.services.buildings.BuildingsManager
    @NotNull
    public List<Building> getBuildings() {
        return this.b;
    }

    @Override // me.oriient.ipssdk.common.services.buildings.BuildingsManager
    public void removeBuildingsChangeListener(@NotNull BuildingsChangeListener listener) {
        Intrinsics.h(listener, "listener");
        this.c.remove(listener);
    }
}
