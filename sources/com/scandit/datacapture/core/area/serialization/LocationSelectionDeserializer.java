package com.scandit.datacapture.core.area.serialization;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.core.area.LocationSelection;
import com.scandit.datacapture.core.area.RadiusLocationSelection;
import com.scandit.datacapture.core.area.RectangularLocationSelection;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.SizeWithUnit;
import com.scandit.datacapture.core.internal.module.serialization.NativeLocationSelectionDeserializer;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.area.NoLocationSelection;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u0011\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013B\t\b\u0016¢\u0006\u0004\b\u0012\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0097\u0001J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\b\u0010\f\u001a\u0004\u0018\u00010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\r8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializer;", "Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializerProxy;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeLocationSelectionDeserializer;", "_impl", "Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializerHelper;", "helper", "", "_setHelper", "", "jsonData", "Lcom/scandit/datacapture/core/area/LocationSelection;", "locationSelectionFromJson", "_getAndResetLastLocationSelection", "", "getWarnings", "()Ljava/util/List;", "warnings", "impl", "<init>", "(Lcom/scandit/datacapture/core/internal/module/serialization/NativeLocationSelectionDeserializer;)V", "()V", "Helper", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@Mockable
/* loaded from: classes6.dex */
public final class LocationSelectionDeserializer implements LocationSelectionDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ LocationSelectionDeserializerProxyAdapter f18413a;
    private final Helper b;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializer$Helper;", "Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializerHelper;", "Lcom/scandit/datacapture/core/internal/sdk/area/NoLocationSelection;", "createNoLocationSelectionFromJson", "Lcom/scandit/datacapture/core/area/RadiusLocationSelection;", "createRadiusLocationSelectionFromJson", "Lcom/scandit/datacapture/core/area/RectangularLocationSelection;", "createRectangularLocationSelectionFromJson", "Lcom/scandit/datacapture/core/area/LocationSelection;", "a", "Lcom/scandit/datacapture/core/area/LocationSelection;", "getLocationSelection", "()Lcom/scandit/datacapture/core/area/LocationSelection;", "setLocationSelection", "(Lcom/scandit/datacapture/core/area/LocationSelection;)V", "locationSelection", "<init>", "()V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Helper implements LocationSelectionDeserializerHelper {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private LocationSelection locationSelection;

        @Override // com.scandit.datacapture.core.area.serialization.LocationSelectionDeserializerHelper
        @NotNull
        public NoLocationSelection createNoLocationSelectionFromJson() {
            NoLocationSelection noLocationSelection = new NoLocationSelection();
            this.locationSelection = noLocationSelection;
            return noLocationSelection;
        }

        @Override // com.scandit.datacapture.core.area.serialization.LocationSelectionDeserializerHelper
        @NotNull
        public RadiusLocationSelection createRadiusLocationSelectionFromJson() {
            RadiusLocationSelection radiusLocationSelection = new RadiusLocationSelection(new FloatWithUnit(BitmapDescriptorFactory.HUE_RED, MeasureUnit.FRACTION));
            this.locationSelection = radiusLocationSelection;
            return radiusLocationSelection;
        }

        @Override // com.scandit.datacapture.core.area.serialization.LocationSelectionDeserializerHelper
        @NotNull
        public RectangularLocationSelection createRectangularLocationSelectionFromJson() {
            FloatWithUnit floatWithUnit = new FloatWithUnit(BitmapDescriptorFactory.HUE_RED, MeasureUnit.FRACTION);
            RectangularLocationSelection rectangularLocationSelectionWithSize = RectangularLocationSelection.INSTANCE.withSize(new SizeWithUnit(floatWithUnit, floatWithUnit));
            this.locationSelection = rectangularLocationSelectionWithSize;
            return rectangularLocationSelectionWithSize;
        }

        @Nullable
        public final LocationSelection getLocationSelection() {
            return this.locationSelection;
        }

        public final void setLocationSelection(@Nullable LocationSelection locationSelection) {
            this.locationSelection = locationSelection;
        }
    }

    public LocationSelectionDeserializer(@NotNull NativeLocationSelectionDeserializer impl) {
        Intrinsics.h(impl, "impl");
        this.f18413a = new LocationSelectionDeserializerProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        Helper helper = new Helper();
        this.b = helper;
        _setHelper(helper);
    }

    @Nullable
    public final LocationSelection _getAndResetLastLocationSelection() {
        LocationSelection locationSelection = this.b.getLocationSelection();
        this.b.setLocationSelection(null);
        return locationSelection;
    }

    @Override // com.scandit.datacapture.core.area.serialization.LocationSelectionDeserializerProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeLocationSelectionDeserializer getF18416a() {
        return this.f18413a.getF18416a();
    }

    @Override // com.scandit.datacapture.core.area.serialization.LocationSelectionDeserializerProxy
    @ProxyFunction(nativeName = "setHelper")
    public void _setHelper(@Nullable LocationSelectionDeserializerHelper helper) {
        this.f18413a._setHelper(helper);
    }

    @Override // com.scandit.datacapture.core.area.serialization.LocationSelectionDeserializerProxy
    @ProxyFunction(property = "warnings")
    @NotNull
    public List<String> getWarnings() {
        return this.f18413a.getWarnings();
    }

    @NotNull
    public final LocationSelection locationSelectionFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        _getAndResetLastLocationSelection();
        getF18416a().locationSelectionFromJson(CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        LocationSelection locationSelection_getAndResetLastLocationSelection = _getAndResetLastLocationSelection();
        if (locationSelection_getAndResetLastLocationSelection != null) {
            return locationSelection_getAndResetLastLocationSelection;
        }
        throw new IllegalStateException("No Java location selection was created during deserialization");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocationSelectionDeserializer() {
        NativeLocationSelectionDeserializer nativeLocationSelectionDeserializerCreate = NativeLocationSelectionDeserializer.create();
        Intrinsics.g(nativeLocationSelectionDeserializerCreate, "create()");
        this(nativeLocationSelectionDeserializerCreate);
    }
}
