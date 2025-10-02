package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeArucoDictionary;
import com.scandit.datacapture.core.internal.sdk.extensions.CollectionsExtensionsKt;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003H\u0097\u0001¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/data/ArucoDictionary;", "Lcom/scandit/datacapture/barcode/data/ArucoDictionaryProxy;", "impl", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeArucoDictionary;", "(Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeArucoDictionary;)V", "_impl", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ArucoDictionary implements ArucoDictionaryProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ArucoDictionaryProxyAdapter f17598a;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/barcode/data/ArucoDictionary$Companion;", "", "Lcom/scandit/datacapture/barcode/data/ArucoDictionaryPreset;", "preset", "Lcom/scandit/datacapture/barcode/data/ArucoDictionary;", "fromPreset", "", "markerSize", "", "Lcom/scandit/datacapture/barcode/data/ArucoMarker;", "markers", "createWithMarkers", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final ArucoDictionary createWithMarkers(int markerSize, @NotNull List<ArucoMarker> markers) {
            Intrinsics.h(markers, "markers");
            ArrayList arrayList = new ArrayList(CollectionsKt.s(markers, 10));
            Iterator<T> it = markers.iterator();
            while (it.hasNext()) {
                arrayList.add(((ArucoMarker) it.next()).getF17602a());
            }
            NativeArucoDictionary nativeArucoDictionaryCreateWithMarkers = NativeArucoDictionary.createWithMarkers(markerSize, CollectionsExtensionsKt.toArrayList(arrayList));
            if (nativeArucoDictionaryCreateWithMarkers == null) {
                return null;
            }
            return new ArucoDictionary(nativeArucoDictionaryCreateWithMarkers);
        }

        @JvmStatic
        @NotNull
        public final ArucoDictionary fromPreset(@NotNull ArucoDictionaryPreset preset) {
            Intrinsics.h(preset, "preset");
            NativeArucoDictionary nativeArucoDictionaryFromPreset = NativeArucoDictionary.fromPreset(preset);
            Intrinsics.g(nativeArucoDictionaryFromPreset, "fromPreset(preset)");
            return new ArucoDictionary(nativeArucoDictionaryFromPreset);
        }

        private Companion() {
        }
    }

    public ArucoDictionary(@NotNull NativeArucoDictionary impl) {
        Intrinsics.h(impl, "impl");
        this.f17598a = new ArucoDictionaryProxyAdapter(impl, null, 2, null);
    }

    @JvmStatic
    @Nullable
    public static final ArucoDictionary createWithMarkers(int i, @NotNull List<ArucoMarker> list) {
        return INSTANCE.createWithMarkers(i, list);
    }

    @JvmStatic
    @NotNull
    public static final ArucoDictionary fromPreset(@NotNull ArucoDictionaryPreset arucoDictionaryPreset) {
        return INSTANCE.fromPreset(arucoDictionaryPreset);
    }

    @Override // com.scandit.datacapture.barcode.data.ArucoDictionaryProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeArucoDictionary getF17600a() {
        return this.f17598a.getF17600a();
    }
}
