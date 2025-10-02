package com.scandit.datacapture.barcode.tracking.data;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.time.TimeInterval;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001J\t\u0010\t\u001a\u00020\bH\u0097\u0001J\b\u0010\u000b\u001a\u00020\nH\u0007R\u001b\u0010\u0011\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u0018R \u0010\u001f\u001a\u00020\u001e8\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\u001c\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;", "Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcodeProxy;", "Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeTrackedBarcode;", "_impl", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "anchor", "Lcom/scandit/datacapture/core/common/geometry/Point;", "getAnchorPosition", "", "toJson", "Lcom/scandit/datacapture/core/time/TimeInterval;", "getDeltaTimeToPrediction", "Lcom/scandit/datacapture/barcode/data/Barcode;", "b", "Lkotlin/Lazy;", "getBarcode", "()Lcom/scandit/datacapture/barcode/data/Barcode;", "barcode", "", "getIdentifier", "()I", "identifier", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "getLocation", "()Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "location", "getPredictedLocation", "getPredictedLocation$annotations", "()V", "predictedLocation", "", "shouldAnimateFromPreviousToNextState", "Z", "getShouldAnimateFromPreviousToNextState", "()Z", "getShouldAnimateFromPreviousToNextState$annotations", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeTrackedBarcode;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@Mockable
/* loaded from: classes6.dex */
public final class TrackedBarcode implements TrackedBarcodeProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TrackedBarcodeProxyAdapter f18190a;

    /* renamed from: b, reason: from kotlin metadata */
    private final Lazy barcode;

    public TrackedBarcode(@NotNull NativeTrackedBarcode impl) {
        Intrinsics.h(impl, "impl");
        this.f18190a = new TrackedBarcodeProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.barcode = LazyKt.b(new a(impl));
    }

    @Deprecated
    public static /* synthetic */ void getPredictedLocation$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getShouldAnimateFromPreviousToNextState$annotations() {
    }

    @Override // com.scandit.datacapture.barcode.tracking.data.TrackedBarcodeProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeTrackedBarcode getF18191a() {
        return this.f18190a.getF18191a();
    }

    @Override // com.scandit.datacapture.barcode.tracking.data.TrackedBarcodeProxy
    @ProxyFunction
    @NotNull
    public Point getAnchorPosition(@NotNull Anchor anchor) {
        Intrinsics.h(anchor, "anchor");
        return this.f18190a.getAnchorPosition(anchor);
    }

    @NotNull
    public final Barcode getBarcode() {
        return (Barcode) this.barcode.getD();
    }

    @Deprecated
    @NotNull
    public final TimeInterval getDeltaTimeToPrediction() {
        return TimeInterval.INSTANCE.seconds(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.scandit.datacapture.barcode.tracking.data.TrackedBarcodeProxy
    @ProxyFunction(property = "identifier")
    public int getIdentifier() {
        return this.f18190a.getIdentifier();
    }

    @Override // com.scandit.datacapture.barcode.tracking.data.TrackedBarcodeProxy
    @ProxyFunction(property = "location")
    @NotNull
    public Quadrilateral getLocation() {
        return this.f18190a.getLocation();
    }

    @NotNull
    public final Quadrilateral getPredictedLocation() {
        return getLocation();
    }

    public final boolean getShouldAnimateFromPreviousToNextState() {
        return false;
    }

    @Override // com.scandit.datacapture.barcode.tracking.data.TrackedBarcodeProxy
    @ProxyFunction
    @NotNull
    public String toJson() {
        return this.f18190a.toJson();
    }
}
