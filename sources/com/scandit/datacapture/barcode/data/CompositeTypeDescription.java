package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeCompositeTypeDescription;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u0097\u0001R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/barcode/data/CompositeTypeDescription;", "Lcom/scandit/datacapture/barcode/data/CompositeTypeDescriptionProxy;", "impl", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeCompositeTypeDescription;", "(Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeCompositeTypeDescription;)V", "symbologies", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getSymbologies", "()Ljava/util/Set;", "types", "Ljava/util/EnumSet;", "Lcom/scandit/datacapture/barcode/data/CompositeType;", "getTypes", "()Ljava/util/EnumSet;", "_impl", "toJson", "", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Mockable
/* loaded from: classes6.dex */
public final class CompositeTypeDescription implements CompositeTypeDescriptionProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CompositeTypeDescriptionProxyAdapter f17609a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/barcode/data/CompositeTypeDescription$Companion;", "", "Ljava/util/EnumSet;", "Lcom/scandit/datacapture/barcode/data/CompositeType;", "type", "Lcom/scandit/datacapture/barcode/data/CompositeTypeDescription;", "create", "", "all", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final List<CompositeTypeDescription> all() {
            ArrayList<NativeCompositeTypeDescription> arrayListAll = NativeCompositeTypeDescription.all();
            Intrinsics.g(arrayListAll, "all()");
            ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListAll, 10));
            for (NativeCompositeTypeDescription it : arrayListAll) {
                Intrinsics.g(it, "it");
                arrayList.add(new CompositeTypeDescription(it));
            }
            return arrayList;
        }

        @JvmStatic
        @NotNull
        public final CompositeTypeDescription create(@NotNull EnumSet<CompositeType> type) {
            Intrinsics.h(type, "type");
            NativeCompositeTypeDescription nativeCompositeTypeDescriptionCreate = NativeCompositeTypeDescription.create(type);
            Intrinsics.g(nativeCompositeTypeDescriptionCreate, "create(type)");
            return new CompositeTypeDescription(nativeCompositeTypeDescriptionCreate);
        }

        private Companion() {
        }
    }

    public CompositeTypeDescription(@NotNull NativeCompositeTypeDescription impl) {
        Intrinsics.h(impl, "impl");
        this.f17609a = new CompositeTypeDescriptionProxyAdapter(impl, null, 2, null);
    }

    @JvmStatic
    @NotNull
    public static final List<CompositeTypeDescription> all() {
        return INSTANCE.all();
    }

    @JvmStatic
    @NotNull
    public static final CompositeTypeDescription create(@NotNull EnumSet<CompositeType> enumSet) {
        return INSTANCE.create(enumSet);
    }

    @Override // com.scandit.datacapture.barcode.data.CompositeTypeDescriptionProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeCompositeTypeDescription getF17610a() {
        return this.f17609a.getF17610a();
    }

    @Override // com.scandit.datacapture.barcode.data.CompositeTypeDescriptionProxy
    @ProxyFunction(property = "symbologies")
    @NotNull
    public Set<Symbology> getSymbologies() {
        return this.f17609a.getSymbologies();
    }

    @Override // com.scandit.datacapture.barcode.data.CompositeTypeDescriptionProxy
    @ProxyFunction(nativeName = "getTypesBits", property = "types")
    @NotNull
    public EnumSet<CompositeType> getTypes() {
        return this.f17609a.getTypes();
    }

    @Override // com.scandit.datacapture.barcode.data.CompositeTypeDescriptionProxy
    @ProxyFunction(nativeName = "toJson")
    @NotNull
    public String toJson() {
        return this.f17609a.toJson();
    }
}
