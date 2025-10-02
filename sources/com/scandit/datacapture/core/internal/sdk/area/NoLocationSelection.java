package com.scandit.datacapture.core.internal.sdk.area;

import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0004H\u0097\u0001J\t\u0010\u0007\u001a\u00020\bH\u0097\u0001J\t\u0010\t\u001a\u00020\nH\u0097\u0001¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/area/NoLocationSelection;", "Lcom/scandit/datacapture/core/internal/sdk/area/NoLocationSelectionProxy;", "()V", "impl", "Lcom/scandit/datacapture/core/internal/sdk/area/NativeNoLocationSelection;", "(Lcom/scandit/datacapture/core/internal/sdk/area/NativeNoLocationSelection;)V", "_impl", "_locationSelectionImpl", "Lcom/scandit/datacapture/core/internal/sdk/area/NativeLocationSelection;", "toJson", "", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Mockable
/* loaded from: classes6.dex */
public final class NoLocationSelection implements NoLocationSelectionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ NoLocationSelectionProxyAdapter f18653a;

    public NoLocationSelection(@NotNull NativeNoLocationSelection impl) {
        Intrinsics.h(impl, "impl");
        this.f18653a = new NoLocationSelectionProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.area.NoLocationSelectionProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeNoLocationSelection getF18654a() {
        return this.f18653a.getF18654a();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.area.NoLocationSelectionProxy, com.scandit.datacapture.core.area.LocationSelection, com.scandit.datacapture.core.area.RadiusLocationSelectionProxy
    @NativeImpl
    @NotNull
    /* renamed from: _locationSelectionImpl */
    public NativeLocationSelection getC() {
        return this.f18653a.getC();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.area.NoLocationSelectionProxy, com.scandit.datacapture.core.area.LocationSelection, com.scandit.datacapture.core.area.RadiusLocationSelectionProxy
    @ProxyFunction(nativeName = "toJson")
    @NotNull
    public String toJson() {
        return this.f18653a.toJson();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NoLocationSelection() {
        NativeNoLocationSelection nativeNoLocationSelectionCreate = NativeNoLocationSelection.create();
        Intrinsics.g(nativeNoLocationSelectionCreate, "create()");
        this(nativeNoLocationSelectionCreate);
    }
}
