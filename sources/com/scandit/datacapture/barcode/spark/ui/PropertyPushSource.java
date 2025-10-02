package com.scandit.datacapture.barcode.spark.ui;

import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanAnalyticsManager;
import com.scandit.datacapture.core.internal.sdk.analytics.NativePropertyBehaviorSubject;
import com.scandit.datacapture.core.internal.sdk.analytics.NativePropertyPushSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/ui/PropertyPushSource;", "Lcom/scandit/datacapture/core/internal/sdk/analytics/NativePropertyPushSource;", "", "identifier", "Lcom/scandit/datacapture/core/internal/sdk/analytics/NativePropertyBehaviorSubject;", "getBehaviorSubject", "Lcom/scandit/datacapture/barcode/internal/module/spark/data/SparkScanAnalyticsManager;", "analyticsManager", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/spark/data/SparkScanAnalyticsManager;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class PropertyPushSource extends NativePropertyPushSource {

    /* renamed from: a, reason: collision with root package name */
    private final SparkScanAnalyticsManager f18120a;

    public PropertyPushSource(@NotNull SparkScanAnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.f18120a = analyticsManager;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.analytics.NativePropertyPushSource
    @Nullable
    public NativePropertyBehaviorSubject getBehaviorSubject(@Nullable String identifier) {
        return this.f18120a.a(identifier);
    }
}
