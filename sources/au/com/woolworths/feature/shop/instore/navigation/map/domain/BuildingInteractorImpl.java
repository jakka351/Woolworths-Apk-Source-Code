package au.com.woolworths.feature.shop.instore.navigation.map.domain;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.instore.navigation.map.data.Building;
import au.com.woolworths.feature.shop.instore.navigation.map.data.Floor;
import au.com.woolworths.feature.shop.instore.navigation.map.data.FloorKt;
import au.com.woolworths.feature.shop.instore.navigation.map.data.IpsCoordinateExtKt;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMap;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMapOffset;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMetersCoordinate;
import au.com.woolworths.feature.shop.instore.navigation.map.data.WowCoordinate;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.ipssdk.api.listeners.IPSBuildingListener;
import me.oriient.ipssdk.api.listeners.IPSCoordinatesConverterListener;
import me.oriient.ipssdk.api.listeners.IPSMapListener;
import me.oriient.ipssdk.api.models.IPSBuilding;
import me.oriient.ipssdk.api.models.IPSBuildingCoordinatesConverter;
import me.oriient.ipssdk.api.models.IPSCoordinate;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.api.models.IPSFloor;
import me.oriient.ipssdk.api.models.IPSMap;
import me.oriient.ipssdk.api.models.IPSOffset;
import me.oriient.ipssdk.ips.IPSCore;
import me.oriient.ipssdk.ips.IPSDataManager;
import me.oriient.ipssdk.ips.IPSDataStatusObserver;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/BuildingInteractorImpl;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/BuildingInteractor;", "DataStatusObserver", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BuildingInteractorImpl implements BuildingInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final MutableStateFlow f7359a = StateFlowKt.a(null);
    public final MutableStateFlow b = StateFlowKt.a(null);
    public final MutableStateFlow c = StateFlowKt.a(Boolean.FALSE);
    public final SharedFlowImpl d = SharedFlowKt.a(0, 1, BufferOverflow.e);
    public final MutableStateFlow e = StateFlowKt.a(EmptyList.d);
    public IPSBuildingCoordinatesConverter f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/BuildingInteractorImpl$DataStatusObserver;", "Lme/oriient/ipssdk/ips/IPSDataStatusObserver;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class DataStatusObserver implements IPSDataStatusObserver {
        public DataStatusObserver() {
        }

        @Override // me.oriient.ipssdk.ips.IPSDataStatusObserver
        public final void onDataPreparationFailed(String buildingId, IPSError error) {
            Intrinsics.h(buildingId, "buildingId");
            Intrinsics.h(error, "error");
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.h(new ReportOwner(ReportOwner.Squad.u), OriientErrorKt.a(error), "onDataPreparationFailed() called with: buildingId = " + buildingId + ", error = " + error, 24);
            BuildingInteractorImpl buildingInteractorImpl = BuildingInteractorImpl.this;
            buildingInteractorImpl.c.setValue(Boolean.FALSE);
            buildingInteractorImpl.d.f(OriientErrorKt.a(error));
        }

        @Override // me.oriient.ipssdk.ips.IPSDataStatusObserver
        public final void onDataStatusChanged(String buildingId, int i) {
            Intrinsics.h(buildingId, "buildingId");
            boolean z = false;
            Timber.f27013a.b("onDataStatusChanged() called with: buildingId = " + buildingId + ", newStatus = " + i, new Object[0]);
            MutableStateFlow mutableStateFlow = BuildingInteractorImpl.this.c;
            if (i != 0 && i != 1 && i == 2) {
                z = true;
            }
            mutableStateFlow.setValue(Boolean.valueOf(z));
        }
    }

    public BuildingInteractorImpl() {
        IPSDataManager.addDataStatusObserver(new DataStatusObserver());
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor
    public final Object a(final String str, Continuation continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.b(continuation));
        IPSCore.getBuildingByClientId(str, new IPSBuildingListener() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractorImpl$fetchBuildingForWooliesStore$2$1
            @Override // me.oriient.ipssdk.api.listeners.IPSBuildingListener
            public final void onBuildingReceived(IPSBuilding ipsBuilding) {
                Intrinsics.h(ipsBuilding, "ipsBuilding");
                Timber.f27013a.b("fetchBuilding onBuildingReceived() called with: ipsBuilding = " + ipsBuilding, new Object[0]);
                String id = ipsBuilding.getId();
                Intrinsics.g(id, "getId(...)");
                IPSFloor primaryFloor = ipsBuilding.getPrimaryFloor();
                Intrinsics.g(primaryFloor, "getPrimaryFloor(...)");
                Floor floorA = FloorKt.a(primaryFloor);
                List<IPSFloor> floors = ipsBuilding.getFloors();
                Intrinsics.g(floors, "getFloors(...)");
                List<IPSFloor> list = floors;
                ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                for (IPSFloor iPSFloor : list) {
                    Intrinsics.e(iPSFloor);
                    arrayList.add(FloorKt.a(iPSFloor));
                }
                final Building building = new Building(id, floorA, arrayList);
                final BuildingInteractorImpl buildingInteractorImpl = this;
                buildingInteractorImpl.f7359a.setValue(building);
                String id2 = ipsBuilding.getId();
                final SafeContinuation safeContinuation2 = safeContinuation;
                IPSCore.createCoordinatesConverter(id2, new IPSCoordinatesConverterListener() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractorImpl$fetchBuildingForWooliesStore$2$1$onBuildingReceived$1
                    @Override // me.oriient.ipssdk.api.listeners.IPSCoordinatesConverterListener
                    public final void onCreated(IPSBuildingCoordinatesConverter converter) {
                        Intrinsics.h(converter, "converter");
                        BuildingInteractorImpl buildingInteractorImpl2 = buildingInteractorImpl;
                        buildingInteractorImpl2.f = converter;
                        MutableStateFlow mutableStateFlow = buildingInteractorImpl2.e;
                        Building building2 = building;
                        mutableStateFlow.setValue(CollectionsKt.u0(new BuildingInteractorImpl$fetchBuildingForWooliesStore$2$1$onBuildingReceived$1$onCreated$$inlined$sortedBy$1(), building2.c));
                        safeContinuation2.resumeWith(new OriientResult.Success(building2));
                    }

                    @Override // me.oriient.ipssdk.api.listeners.IPSFailable
                    public final void onError(IPSError error) {
                        Intrinsics.h(error, "error");
                        Bark.Companion companion = Bark.f8483a;
                        Bark.Barker.c(new ReportOwner(ReportOwner.Squad.u), OriientErrorKt.a(error), "Error creating Coordinate converter " + error.getMessage(), 8);
                        safeContinuation2.resumeWith(new OriientResult.Failure(OriientErrorKt.a(error)));
                    }
                });
            }

            @Override // me.oriient.ipssdk.api.listeners.IPSFailable
            public final void onError(IPSError error) {
                Intrinsics.h(error, "error");
                Bark.Companion companion = Bark.f8483a;
                Bark.Barker.c(new ReportOwner(ReportOwner.Squad.u), OriientErrorKt.a(error), "fetchBuilding storeId: " + str + " onError() called with: error = " + error, 8);
                safeContinuation.resumeWith(new OriientResult.Failure(OriientErrorKt.a(error)));
            }
        });
        Object objA = safeContinuation.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objA;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor
    public final void b(String str) {
        Object next;
        Building building = (Building) this.f7359a.getValue();
        if (building != null) {
            Iterator it = building.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Floor it2 = (Floor) next;
                Intrinsics.h(it2, "it");
                if (it2.f7335a.equals(str)) {
                    break;
                }
            }
            Floor floor = (Floor) next;
            if (floor != null) {
                this.b.setValue(floor);
            }
        }
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor
    public final Object c(String str, String str2, Continuation continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.b(continuation));
        Building building = (Building) this.f7359a.getValue();
        String str3 = building != null ? building.f7331a : null;
        if (str3 != null) {
            IPSCore.getMapById(str3, str2, str, new IPSMapListener() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractorImpl$fetchMap$2$1
                @Override // me.oriient.ipssdk.api.listeners.IPSFailable
                public final void onError(IPSError error) {
                    Intrinsics.h(error, "error");
                    Bark.Companion companion = Bark.f8483a;
                    Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.u), "fetchMap onError() called with: error = " + error, null);
                    safeContinuation.resumeWith(new OriientResult.Failure(OriientErrorKt.a(error)));
                }

                @Override // me.oriient.ipssdk.api.listeners.IPSMapListener
                public final void onMapReceived(IPSMap ipsMap) {
                    Intrinsics.h(ipsMap, "ipsMap");
                    Timber.f27013a.b("fetchMap onMapReceived() called with: ipsMap = " + ipsMap, new Object[0]);
                    String name = ipsMap.getName();
                    Intrinsics.g(name, "getName(...)");
                    Bitmap image = ipsMap.getImage();
                    Intrinsics.g(image, "getImage(...)");
                    double pixelToMeter = ipsMap.getPixelToMeter();
                    double widthInMeters = ipsMap.getWidthInMeters();
                    double heightInMeters = ipsMap.getHeightInMeters();
                    IPSOffset offset = ipsMap.getOffset();
                    Intrinsics.g(offset, "getOffset(...)");
                    safeContinuation.resumeWith(new OriientResult.Success(new OriientMap(name, image, pixelToMeter, widthInMeters, heightInMeters, new OriientMapOffset(offset.getX(), offset.getY()))));
                }
            });
        }
        Object objA = safeContinuation.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objA;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor
    public final void d(Floor floor) {
        Intrinsics.h(floor, "floor");
        this.b.setValue(floor);
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor
    public final OriientMetersCoordinate e(final WowCoordinate wowCoordinate, String str) {
        Intrinsics.h(wowCoordinate, "wowCoordinate");
        IPSBuildingCoordinatesConverter iPSBuildingCoordinatesConverter = this.f;
        if (iPSBuildingCoordinatesConverter == null) {
            return null;
        }
        IPSCoordinate iPSCoordinate = new IPSCoordinate() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.data.WowCoordinateKt$toIPSCoordinate$1
            @Override // me.oriient.ipssdk.api.models.IPSCoordinate
            /* renamed from: getX */
            public final double getD() {
                return wowCoordinate.f7347a;
            }

            @Override // me.oriient.ipssdk.api.models.IPSCoordinate
            /* renamed from: getY */
            public final double getE() {
                return wowCoordinate.b;
            }

            @Override // me.oriient.ipssdk.api.models.IPSCoordinate
            /* renamed from: getZ */
            public final double getF() {
                return 0.0d;
            }
        };
        if (str == null) {
            Floor floor = (Floor) this.b.getValue();
            str = floor != null ? floor.f7335a : "";
        }
        IPSCoordinate iPSCoordinateConvertToOriient = iPSBuildingCoordinatesConverter.convertToOriient(iPSCoordinate, str);
        if (iPSCoordinateConvertToOriient != null) {
            return IpsCoordinateExtKt.a(iPSCoordinateConvertToOriient);
        }
        return null;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor
    public final StateFlow getCurrentBuilding() {
        return this.f7359a;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor
    public final StateFlow getCurrentFloor() {
        return this.b;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor
    public final StateFlow getFloors() {
        return FlowKt.b(this.e);
    }
}
