package com.scandit.datacapture.core.common.geometry;

import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeSizeWithUnitAndAspect;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0015\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u0097\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/core/common/geometry/SizeWithUnitAndAspect;", "Lcom/scandit/datacapture/core/common/geometry/SizeWithUnitAndAspectProxy;", "impl", "Lcom/scandit/datacapture/core/internal/sdk/common/geometry/NativeSizeWithUnitAndAspect;", "(Lcom/scandit/datacapture/core/internal/sdk/common/geometry/NativeSizeWithUnitAndAspect;)V", "heightAndAspectRatio", "Lcom/scandit/datacapture/core/common/geometry/SizeWithAspect;", "getHeightAndAspectRatio", "()Lcom/scandit/datacapture/core/common/geometry/SizeWithAspect;", "shorterDimensionAndAspectRatio", "getShorterDimensionAndAspectRatio", "sizingMode", "Lcom/scandit/datacapture/core/common/geometry/SizingMode;", "getSizingMode", "()Lcom/scandit/datacapture/core/common/geometry/SizingMode;", "widthAndAspectRatio", "getWidthAndAspectRatio", "widthAndHeight", "Lcom/scandit/datacapture/core/common/geometry/SizeWithUnit;", "getWidthAndHeight", "()Lcom/scandit/datacapture/core/common/geometry/SizeWithUnit;", "_impl", "toJson", "", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SizeWithUnitAndAspect implements SizeWithUnitAndAspectProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SizeWithUnitAndAspectProxyAdapter f18478a;

    public SizeWithUnitAndAspect(@NotNull NativeSizeWithUnitAndAspect impl) {
        Intrinsics.h(impl, "impl");
        this.f18478a = new SizeWithUnitAndAspectProxyAdapter(impl, null, 2, null);
    }

    @Override // com.scandit.datacapture.core.common.geometry.SizeWithUnitAndAspectProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeSizeWithUnitAndAspect getF18479a() {
        return this.f18478a.getF18479a();
    }

    @Nullable
    public final SizeWithAspect getHeightAndAspectRatio() {
        return getF18479a().getHeightWithAspect();
    }

    @Nullable
    public final SizeWithAspect getShorterDimensionAndAspectRatio() {
        return getF18479a().getShorterDimensionWithAspect();
    }

    @NotNull
    public final SizingMode getSizingMode() {
        SizingMode sizingMode = getF18479a().getSizingMode();
        Intrinsics.g(sizingMode, "_impl().sizingMode");
        return sizingMode;
    }

    @Nullable
    public final SizeWithAspect getWidthAndAspectRatio() {
        return getF18479a().getWidthWithAspect();
    }

    @Nullable
    public final SizeWithUnit getWidthAndHeight() {
        return getF18479a().getWidthAndHeight();
    }

    @Override // com.scandit.datacapture.core.common.geometry.SizeWithUnitAndAspectProxy
    @ProxyFunction(nativeName = "toJson")
    @NotNull
    public String toJson() {
        return this.f18478a.toJson();
    }
}
