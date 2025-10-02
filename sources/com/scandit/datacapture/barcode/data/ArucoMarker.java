package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeArucoMarker;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\r\u001a\u00020\u0003H\u0097\u0001R\u0014\u0010\u0005\u001a\u00020\u00068WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/barcode/data/ArucoMarker;", "Lcom/scandit/datacapture/barcode/data/ArucoMarkerProxy;", "impl", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeArucoMarker;", "(Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeArucoMarker;)V", "data", "", "getData", "()[B", "size", "", "getSize", "()I", "_impl", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ArucoMarker implements ArucoMarkerProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ArucoMarkerProxyAdapter f17601a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/barcode/data/ArucoMarker$Companion;", "", "", "markerSize", "", "markerData", "Lcom/scandit/datacapture/barcode/data/ArucoMarker;", "create", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ArucoMarker create(int markerSize, @NotNull byte[] markerData) {
            Intrinsics.h(markerData, "markerData");
            NativeArucoMarker nativeArucoMarkerCreate = NativeArucoMarker.create(markerSize, markerData);
            Intrinsics.g(nativeArucoMarkerCreate, "create(markerSize, markerData)");
            return new ArucoMarker(nativeArucoMarkerCreate);
        }

        private Companion() {
        }
    }

    public ArucoMarker(@NotNull NativeArucoMarker impl) {
        Intrinsics.h(impl, "impl");
        this.f17601a = new ArucoMarkerProxyAdapter(impl, null, 2, null);
    }

    @JvmStatic
    @NotNull
    public static final ArucoMarker create(int i, @NotNull byte[] bArr) {
        return INSTANCE.create(i, bArr);
    }

    @Override // com.scandit.datacapture.barcode.data.ArucoMarkerProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeArucoMarker getF17602a() {
        return this.f17601a.getF17602a();
    }

    @Override // com.scandit.datacapture.barcode.data.ArucoMarkerProxy
    @ProxyFunction(nativeName = "getBits", property = "data")
    @NotNull
    public byte[] getData() {
        return this.f17601a.getData();
    }

    @Override // com.scandit.datacapture.barcode.data.ArucoMarkerProxy
    @ProxyFunction(property = "size")
    public int getSize() {
        return this.f17601a.getSize();
    }
}
