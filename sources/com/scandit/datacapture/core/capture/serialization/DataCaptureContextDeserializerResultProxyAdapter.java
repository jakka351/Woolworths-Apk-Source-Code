package com.scandit.datacapture.core.capture.serialization;

import com.scandit.datacapture.core.component.DataCaptureComponent;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerResult;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.component.NativeDataCaptureComponent;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerResultProxyAdapter;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerResultProxy;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializerResult;", "_impl", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "Lcom/scandit/datacapture/core/component/DataCaptureComponent;", "getComponents", "()Ljava/util/List;", "components", "", "getWarnings", "warnings", "_NativeDataCaptureContextDeserializerResult", "<init>", "(Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializerResult;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class DataCaptureContextDeserializerResultProxyAdapter implements DataCaptureContextDeserializerResultProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeDataCaptureContextDeserializerResult f18453a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public DataCaptureContextDeserializerResultProxyAdapter(@NotNull NativeDataCaptureContextDeserializerResult _NativeDataCaptureContextDeserializerResult, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeDataCaptureContextDeserializerResult, "_NativeDataCaptureContextDeserializerResult");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18453a = _NativeDataCaptureContextDeserializerResult;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerResultProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeDataCaptureContextDeserializerResult getF18453a() {
        return this.f18453a;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerResultProxy
    @NotNull
    public List<DataCaptureComponent> getComponents() {
        ArrayList<NativeDataCaptureComponent> _0 = this.f18453a.getComponents();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerResultProxy
    @NotNull
    public List<String> getWarnings() {
        ArrayList<String> _0 = this.f18453a.getWarnings();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ DataCaptureContextDeserializerResultProxyAdapter(NativeDataCaptureContextDeserializerResult nativeDataCaptureContextDeserializerResult, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeDataCaptureContextDeserializerResult, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
