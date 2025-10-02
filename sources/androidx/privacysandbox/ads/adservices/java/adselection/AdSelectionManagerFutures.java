package androidx.privacysandbox.ads.adservices.java.adselection;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.compose.ui.input.pointer.a;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome;
import androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataOutcome;
import androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest;
import androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest;
import androidx.privacysandbox.ads.adservices.adselection.ReportEventRequest;
import androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest;
import androidx.privacysandbox.ads.adservices.adselection.UpdateAdCounterHistogramRequest;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/adselection/AdSelectionManagerFutures;", "", "Api33Ext4JavaImpl", "Companion", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class AdSelectionManagerFutures {

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/adselection/AdSelectionManagerFutures$Api33Ext4JavaImpl;", "Landroidx/privacysandbox/ads/adservices/java/adselection/AdSelectionManagerFutures;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "adSelectionConfig", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "e", "(Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;", "adSelectionFromOutcomesConfig", "f", "(Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;", "reportImpressionRequest", "", "d", "(Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;", "updateAdCounterHistogramRequest", "g", "(Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "reportEventRequest", "c", "(Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "getAdSelectionDataRequest", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;", "a", "(Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;", "persistAdSelectionResultRequest", "b", "(Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api33Ext4JavaImpl extends AdSelectionManagerFutures {
        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<GetAdSelectionDataOutcome> a(@NotNull GetAdSelectionDataRequest getAdSelectionDataRequest) {
            Intrinsics.h(getAdSelectionDataRequest, "getAdSelectionDataRequest");
            return a.g(BuildersKt.a(CoroutineScopeKt.a(Dispatchers.f24691a), null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$getAdSelectionDataAsync$1(this, getAdSelectionDataRequest, null), 3));
        }

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<AdSelectionOutcome> b(@NotNull PersistAdSelectionResultRequest persistAdSelectionResultRequest) {
            Intrinsics.h(persistAdSelectionResultRequest, "persistAdSelectionResultRequest");
            return a.g(BuildersKt.a(CoroutineScopeKt.a(Dispatchers.f24691a), null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$persistAdSelectionResultAsync$1(this, persistAdSelectionResultRequest, null), 3));
        }

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<Unit> c(@NotNull ReportEventRequest reportEventRequest) {
            Intrinsics.h(reportEventRequest, "reportEventRequest");
            return a.g(BuildersKt.a(CoroutineScopeKt.a(Dispatchers.f24691a), null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$reportEventAsync$1(this, reportEventRequest, null), 3));
        }

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<Unit> d(@NotNull ReportImpressionRequest reportImpressionRequest) {
            Intrinsics.h(reportImpressionRequest, "reportImpressionRequest");
            return a.g(BuildersKt.a(CoroutineScopeKt.a(Dispatchers.f24691a), null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1(this, reportImpressionRequest, null), 3));
        }

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<AdSelectionOutcome> e(@NotNull AdSelectionConfig adSelectionConfig) {
            Intrinsics.h(adSelectionConfig, "adSelectionConfig");
            return a.g(BuildersKt.a(CoroutineScopeKt.a(Dispatchers.f24691a), null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1(this, adSelectionConfig, null), 3));
        }

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<AdSelectionOutcome> f(@NotNull AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig) {
            Intrinsics.h(adSelectionFromOutcomesConfig, "adSelectionFromOutcomesConfig");
            return a.g(BuildersKt.a(CoroutineScopeKt.a(Dispatchers.f24691a), null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$2(this, adSelectionFromOutcomesConfig, null), 3));
        }

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<Unit> g(@NotNull UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest) {
            Intrinsics.h(updateAdCounterHistogramRequest, "updateAdCounterHistogramRequest");
            return a.g(BuildersKt.a(CoroutineScopeKt.a(Dispatchers.f24691a), null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$updateAdCounterHistogramAsync$1(this, updateAdCounterHistogramRequest, null), 3));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/adselection/AdSelectionManagerFutures$Companion;", "", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }
}
