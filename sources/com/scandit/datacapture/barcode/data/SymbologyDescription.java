package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeSymbologyCompat;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeSymbologyDescription;
import com.scandit.datacapture.core.data.Range;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\"\u001a\u00020\u0003H\u0097\u0001J\t\u0010#\u001a\u00020\fH\u0097\u0001R\u0014\u0010\u0005\u001a\u00020\u00068WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00108WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\f8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/scandit/datacapture/barcode/data/SymbologyDescription;", "Lcom/scandit/datacapture/barcode/data/SymbologyDescriptionProxy;", "impl", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeSymbologyDescription;", "(Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeSymbologyDescription;)V", "activeSymbolCountRange", "Lcom/scandit/datacapture/core/data/Range;", "getActiveSymbolCountRange", "()Lcom/scandit/datacapture/core/data/Range;", "defaultSymbolCountRange", "getDefaultSymbolCountRange", "identifier", "", "getIdentifier", "()Ljava/lang/String;", "isAvailable", "", "()Z", "isColorInvertible", "readableName", "getReadableName", "supportedChecksums", "Ljava/util/EnumSet;", "Lcom/scandit/datacapture/barcode/data/Checksum;", "getSupportedChecksums", "()Ljava/util/EnumSet;", "supportedExtensions", "", "getSupportedExtensions", "()Ljava/util/Set;", "symbology", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getSymbology", "()Lcom/scandit/datacapture/barcode/data/Symbology;", "_impl", "toJson", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Mockable
/* loaded from: classes6.dex */
public final class SymbologyDescription implements SymbologyDescriptionProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SymbologyDescriptionProxyAdapter f17616a;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0007¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/barcode/data/SymbologyDescription$Companion;", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "symbology", "Lcom/scandit/datacapture/barcode/data/SymbologyDescription;", "create", "", "identifier", "forIdentifier", "symbologyFromIdentifier", "", "all", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final List<SymbologyDescription> all() {
            ArrayList<Symbology> arrayListAll = NativeSymbologyCompat.all();
            Intrinsics.g(arrayListAll, "all()");
            ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListAll, 10));
            for (Symbology it : arrayListAll) {
                Companion companion = SymbologyDescription.INSTANCE;
                Intrinsics.g(it, "it");
                arrayList.add(companion.create(it));
            }
            return arrayList;
        }

        @JvmStatic
        @NotNull
        public final SymbologyDescription create(@NotNull Symbology symbology) {
            Intrinsics.h(symbology, "symbology");
            NativeSymbologyDescription nativeSymbologyDescriptionCreate = NativeSymbologyDescription.create(symbology);
            Intrinsics.g(nativeSymbologyDescriptionCreate, "create(symbology)");
            return new SymbologyDescription(nativeSymbologyDescriptionCreate);
        }

        @JvmStatic
        @Nullable
        public final SymbologyDescription forIdentifier(@NotNull String identifier) {
            Intrinsics.h(identifier, "identifier");
            NativeSymbologyDescription nativeSymbologyDescriptionSymbologyDescriptionFromIdentifier = NativeSymbologyDescription.symbologyDescriptionFromIdentifier(identifier);
            if (nativeSymbologyDescriptionSymbologyDescriptionFromIdentifier != null) {
                return new SymbologyDescription(nativeSymbologyDescriptionSymbologyDescriptionFromIdentifier);
            }
            return null;
        }

        @Deprecated
        @JvmStatic
        @NotNull
        public final Symbology symbologyFromIdentifier(@NotNull String identifier) {
            Intrinsics.h(identifier, "identifier");
            Symbology symbologySymbologyFromIdentifier = NativeSymbologyDescription.symbologyFromIdentifier(identifier);
            Intrinsics.g(symbologySymbologyFromIdentifier, "symbologyFromIdentifier(identifier)");
            return symbologySymbologyFromIdentifier;
        }

        private Companion() {
        }
    }

    public SymbologyDescription(@NotNull NativeSymbologyDescription impl) {
        Intrinsics.h(impl, "impl");
        this.f17616a = new SymbologyDescriptionProxyAdapter(impl, null, 2, null);
    }

    @JvmStatic
    @NotNull
    public static final List<SymbologyDescription> all() {
        return INSTANCE.all();
    }

    @JvmStatic
    @NotNull
    public static final SymbologyDescription create(@NotNull Symbology symbology) {
        return INSTANCE.create(symbology);
    }

    @JvmStatic
    @Nullable
    public static final SymbologyDescription forIdentifier(@NotNull String str) {
        return INSTANCE.forIdentifier(str);
    }

    @Deprecated
    @JvmStatic
    @NotNull
    public static final Symbology symbologyFromIdentifier(@NotNull String str) {
        return INSTANCE.symbologyFromIdentifier(str);
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeSymbologyDescription getF17617a() {
        return this.f17616a.getF17617a();
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @ProxyFunction(property = "activeSymbolCountRange")
    @NotNull
    public Range getActiveSymbolCountRange() {
        return this.f17616a.getActiveSymbolCountRange();
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @ProxyFunction(property = "defaultSymbolCountRange")
    @NotNull
    public Range getDefaultSymbolCountRange() {
        return this.f17616a.getDefaultSymbolCountRange();
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @ProxyFunction(property = "identifier")
    @NotNull
    public String getIdentifier() {
        return this.f17616a.getIdentifier();
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @ProxyFunction(property = "readableName")
    @NotNull
    public String getReadableName() {
        return this.f17616a.getReadableName();
    }

    @NotNull
    public final EnumSet<Checksum> getSupportedChecksums() {
        EnumSet<Checksum> supportedChecksumsBits = getF17617a().getSupportedChecksumsBits();
        Intrinsics.g(supportedChecksumsBits, "_impl().supportedChecksumsBits");
        return supportedChecksumsBits;
    }

    @NotNull
    public final Set<String> getSupportedExtensions() {
        HashSet<String> publicExtensions = getF17617a().getPublicExtensions();
        Intrinsics.g(publicExtensions, "_impl().publicExtensions");
        return publicExtensions;
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @ProxyFunction(property = "symbology")
    @NotNull
    public Symbology getSymbology() {
        return this.f17616a.getSymbology();
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @ProxyFunction(property = "isAvailable")
    public boolean isAvailable() {
        return this.f17616a.isAvailable();
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @ProxyFunction(property = "isColorInvertible")
    public boolean isColorInvertible() {
        return this.f17616a.isColorInvertible();
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @ProxyFunction(nativeName = "toJson")
    @NotNull
    public String toJson() {
        return this.f17616a.toJson();
    }
}
