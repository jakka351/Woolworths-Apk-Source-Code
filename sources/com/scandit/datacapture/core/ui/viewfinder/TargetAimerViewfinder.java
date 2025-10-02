package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeTargetAimerViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0005H\u0097\u0001J\t\u0010\b\u001a\u00020\tH\u0097\u0001¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/TargetAimerViewfinder;", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "Lcom/scandit/datacapture/core/ui/viewfinder/TargetAimerViewfinderProxy;", "()V", "impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeTargetAimerViewfinder;", "(Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeTargetAimerViewfinder;)V", "_impl", "_viewfinderImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TargetAimerViewfinder implements Viewfinder, TargetAimerViewfinderProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TargetAimerViewfinderProxyAdapter f18969a;

    public TargetAimerViewfinder(@NotNull NativeTargetAimerViewfinder impl) {
        Intrinsics.h(impl, "impl");
        this.f18969a = new TargetAimerViewfinderProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.TargetAimerViewfinderProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeTargetAimerViewfinder getF18970a() {
        return this.f18969a.getF18970a();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.Viewfinder
    @NativeImpl
    @NotNull
    /* renamed from: _viewfinderImpl */
    public NativeViewfinder getC() {
        return this.f18969a.getC();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TargetAimerViewfinder() {
        NativeTargetAimerViewfinder nativeTargetAimerViewfinderCreate = NativeTargetAimerViewfinder.create();
        Intrinsics.g(nativeTargetAimerViewfinderCreate, "create()");
        this(nativeTargetAimerViewfinderCreate);
    }
}
