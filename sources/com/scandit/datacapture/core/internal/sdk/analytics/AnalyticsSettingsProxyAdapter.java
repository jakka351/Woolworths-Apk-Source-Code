package com.scandit.datacapture.core.internal.sdk.analytics;

import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/analytics/AnalyticsSettingsProxyAdapter;", "Lcom/scandit/datacapture/core/internal/sdk/analytics/AnalyticsSettingsProxy;", "Lcom/scandit/datacapture/core/internal/sdk/analytics/NativeAnalyticsSettings;", "_impl", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "_NativeAnalyticsSettings", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/analytics/NativeAnalyticsSettings;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class AnalyticsSettingsProxyAdapter implements AnalyticsSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeAnalyticsSettings f18647a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public AnalyticsSettingsProxyAdapter(@NotNull NativeAnalyticsSettings _NativeAnalyticsSettings, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeAnalyticsSettings, "_NativeAnalyticsSettings");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18647a = _NativeAnalyticsSettings;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.analytics.AnalyticsSettingsProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeAnalyticsSettings getF18647a() {
        return this.f18647a;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ AnalyticsSettingsProxyAdapter(NativeAnalyticsSettings nativeAnalyticsSettings, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeAnalyticsSettings, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
