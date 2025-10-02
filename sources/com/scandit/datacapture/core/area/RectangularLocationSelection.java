package com.scandit.datacapture.core.area;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.SizeWithUnit;
import com.scandit.datacapture.core.common.geometry.SizeWithUnitAndAspect;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.area.NativeLocationSelection;
import com.scandit.datacapture.core.internal.sdk.area.NativeRectangularLocationSelection;
import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeSizeWithUnitAndAspect;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u000fB\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0004H\u0097\u0001J\t\u0010\u000b\u001a\u00020\fH\u0097\u0001J\t\u0010\r\u001a\u00020\u000eH\u0097\u0001R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/scandit/datacapture/core/area/RectangularLocationSelection;", "Lcom/scandit/datacapture/core/area/LocationSelection;", "Lcom/scandit/datacapture/core/area/RectangularLocationSelectionProxy;", "impl", "Lcom/scandit/datacapture/core/internal/sdk/area/NativeRectangularLocationSelection;", "(Lcom/scandit/datacapture/core/internal/sdk/area/NativeRectangularLocationSelection;)V", "sizeWithUnitAndAspect", "Lcom/scandit/datacapture/core/common/geometry/SizeWithUnitAndAspect;", "getSizeWithUnitAndAspect", "()Lcom/scandit/datacapture/core/common/geometry/SizeWithUnitAndAspect;", "_impl", "_locationSelectionImpl", "Lcom/scandit/datacapture/core/internal/sdk/area/NativeLocationSelection;", "toJson", "", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Mockable
/* loaded from: classes6.dex */
public final class RectangularLocationSelection implements LocationSelection, RectangularLocationSelectionProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ RectangularLocationSelectionProxyAdapter f18411a;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bH\u0007¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/core/area/RectangularLocationSelection$Companion;", "", "Lcom/scandit/datacapture/core/common/geometry/SizeWithUnit;", "size", "Lcom/scandit/datacapture/core/area/RectangularLocationSelection;", "withSize", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "width", "", "heightToWidthAspectRatio", "withWidthAndAspectRatio", "height", "widthToHeightAspectRatio", "withHeightAndAspectRatio", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final RectangularLocationSelection withHeightAndAspectRatio(@NotNull FloatWithUnit height, float widthToHeightAspectRatio) {
            Intrinsics.h(height, "height");
            NativeRectangularLocationSelection nativeRectangularLocationSelectionCreate = NativeRectangularLocationSelection.create();
            nativeRectangularLocationSelectionCreate.setHeightAndAspectRatio(height, widthToHeightAspectRatio);
            return new RectangularLocationSelection(nativeRectangularLocationSelectionCreate);
        }

        @JvmStatic
        @NotNull
        public final RectangularLocationSelection withSize(@NotNull SizeWithUnit size) {
            Intrinsics.h(size, "size");
            NativeRectangularLocationSelection nativeRectangularLocationSelectionCreate = NativeRectangularLocationSelection.create();
            nativeRectangularLocationSelectionCreate.setWidthAndHeight(size.getWidth(), size.getHeight());
            return new RectangularLocationSelection(nativeRectangularLocationSelectionCreate);
        }

        @JvmStatic
        @NotNull
        public final RectangularLocationSelection withWidthAndAspectRatio(@NotNull FloatWithUnit width, float heightToWidthAspectRatio) {
            Intrinsics.h(width, "width");
            NativeRectangularLocationSelection nativeRectangularLocationSelectionCreate = NativeRectangularLocationSelection.create();
            nativeRectangularLocationSelectionCreate.setWidthAndAspectRatio(width, heightToWidthAspectRatio);
            return new RectangularLocationSelection(nativeRectangularLocationSelectionCreate);
        }

        private Companion() {
        }
    }

    public RectangularLocationSelection(@NotNull NativeRectangularLocationSelection impl) {
        Intrinsics.h(impl, "impl");
        this.f18411a = new RectangularLocationSelectionProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @JvmStatic
    @NotNull
    public static final RectangularLocationSelection withHeightAndAspectRatio(@NotNull FloatWithUnit floatWithUnit, float f) {
        return INSTANCE.withHeightAndAspectRatio(floatWithUnit, f);
    }

    @JvmStatic
    @NotNull
    public static final RectangularLocationSelection withSize(@NotNull SizeWithUnit sizeWithUnit) {
        return INSTANCE.withSize(sizeWithUnit);
    }

    @JvmStatic
    @NotNull
    public static final RectangularLocationSelection withWidthAndAspectRatio(@NotNull FloatWithUnit floatWithUnit, float f) {
        return INSTANCE.withWidthAndAspectRatio(floatWithUnit, f);
    }

    @Override // com.scandit.datacapture.core.area.RectangularLocationSelectionProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeRectangularLocationSelection getF18412a() {
        return this.f18411a.getF18412a();
    }

    @Override // com.scandit.datacapture.core.area.LocationSelection, com.scandit.datacapture.core.area.RadiusLocationSelectionProxy
    @NativeImpl
    @NotNull
    /* renamed from: _locationSelectionImpl */
    public NativeLocationSelection getC() {
        return this.f18411a.getC();
    }

    @NotNull
    public final SizeWithUnitAndAspect getSizeWithUnitAndAspect() {
        NativeSizeWithUnitAndAspect sizeWithUnitAndAspect = getF18412a().getSizeWithUnitAndAspect();
        Intrinsics.g(sizeWithUnitAndAspect, "_impl().sizeWithUnitAndAspect");
        return new SizeWithUnitAndAspect(sizeWithUnitAndAspect);
    }

    @Override // com.scandit.datacapture.core.area.LocationSelection, com.scandit.datacapture.core.area.RadiusLocationSelectionProxy
    @ProxyFunction(nativeName = "toJson")
    @NotNull
    public String toJson() {
        return this.f18411a.toJson();
    }
}
