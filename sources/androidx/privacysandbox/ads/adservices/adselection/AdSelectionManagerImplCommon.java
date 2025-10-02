package androidx.privacysandbox.ads.adservices.adselection;

import android.annotation.SuppressLint;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.platform.h;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresExtension.Container
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0002!\"J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0097@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0097@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0097@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0097@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0097@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0097@¢\u0006\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "adSelectionConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "i", "(Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;", "adSelectionFromOutcomesConfig", "j", "(Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;", "reportImpressionRequest", "", "g", "(Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "reportEventRequest", "e", "(Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;", "updateAdCounterHistogramRequest", "m", "(Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "getAdSelectionDataRequest", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;", "a", "(Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;", "persistAdSelectionResultRequest", "c", "(Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ext10Impl", "Ext8Impl", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint
@RestrictTo
@SourceDebugExtension
/* loaded from: classes2.dex */
public class AdSelectionManagerImplCommon extends AdSelectionManager {

    /* renamed from: a, reason: collision with root package name */
    public final android.adservices.adselection.AdSelectionManager f3618a;

    @RequiresExtension.Container
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext10Impl;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Ext10Impl {

        /* renamed from: a, reason: collision with root package name */
        public static final Companion f3619a = new Companion();

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0087@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0087@¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0087@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext10Impl$Companion;", "", "Landroid/adservices/adselection/AdSelectionManager;", "adSelectionManager", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "getAdSelectionDataRequest", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;", "a", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;", "persistAdSelectionResultRequest", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "b", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;", "adSelectionFromOutcomesConfig", "c", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @androidx.annotation.RequiresPermission
            @androidx.annotation.DoNotInline
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(@org.jetbrains.annotations.NotNull android.adservices.adselection.AdSelectionManager r5, @org.jetbrains.annotations.NotNull androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataOutcome> r7) {
                /*
                    r4 = this;
                    boolean r0 = r7 instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1
                    if (r0 == 0) goto L13
                    r0 = r7
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 r0 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1) r0
                    int r1 = r0.s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.s = r1
                    goto L18
                L13:
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 r0 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1
                    r0.<init>(r4, r7)
                L18:
                    java.lang.Object r7 = r0.q
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                    int r1 = r0.s
                    r2 = 1
                    if (r1 == 0) goto L3d
                    if (r1 != r2) goto L35
                    java.lang.Object r5 = r0.p
                    androidx.media3.datasource.c.x(r5)
                    kotlin.ResultKt.b(r7)
                    android.adservices.adselection.GetAdSelectionDataOutcome r5 = androidx.compose.ui.platform.h.b(r7)
                    androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataOutcome r6 = new androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataOutcome
                    r6.<init>(r5)
                    return r6
                L35:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L3d:
                    kotlin.ResultKt.b(r7)
                    r0.p = r5
                    r0.s = r2
                    kotlinx.coroutines.CancellableContinuationImpl r5 = new kotlinx.coroutines.CancellableContinuationImpl
                    kotlin.coroutines.Continuation r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r0)
                    r5.<init>(r2, r7)
                    r5.o()
                    r6.getClass()
                    int r5 = androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.a()
                    r6 = 0
                    r7 = 12
                    if (r5 >= r7) goto L67
                    int r5 = androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.b()
                    if (r5 < r7) goto L63
                    goto L67
                L63:
                    androidx.compose.ui.platform.h.z()
                    throw r6
                L67:
                    androidx.compose.ui.platform.h.z()
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.Ext10Impl.Companion.a(android.adservices.adselection.AdSelectionManager, androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest, kotlin.coroutines.Continuation):java.lang.Object");
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @androidx.annotation.RequiresPermission
            @androidx.annotation.DoNotInline
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object b(@org.jetbrains.annotations.NotNull android.adservices.adselection.AdSelectionManager r5, @org.jetbrains.annotations.NotNull androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> r7) {
                /*
                    r4 = this;
                    boolean r0 = r7 instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1
                    if (r0 == 0) goto L13
                    r0 = r7
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1 r0 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1) r0
                    int r1 = r0.s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.s = r1
                    goto L18
                L13:
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1 r0 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1
                    r0.<init>(r4, r7)
                L18:
                    java.lang.Object r7 = r0.q
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                    int r2 = r0.s
                    r3 = 1
                    if (r2 == 0) goto L34
                    if (r2 != r3) goto L2c
                    java.lang.Object r5 = r0.p
                    androidx.media3.datasource.c.x(r5)
                    kotlin.ResultKt.b(r7)
                    goto L77
                L2c:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L34:
                    kotlin.ResultKt.b(r7)
                    r0.p = r5
                    r0.s = r3
                    kotlinx.coroutines.CancellableContinuationImpl r7 = new kotlinx.coroutines.CancellableContinuationImpl
                    kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r0)
                    r7.<init>(r3, r0)
                    r7.o()
                    r6.getClass()
                    android.adservices.adselection.PersistAdSelectionResultRequest$Builder r6 = androidx.compose.ui.platform.h.c()
                    android.adservices.adselection.PersistAdSelectionResultRequest$Builder r6 = androidx.compose.ui.platform.h.d(r6)
                    android.adservices.adselection.PersistAdSelectionResultRequest$Builder r6 = androidx.compose.ui.platform.h.x(r6)
                    android.adservices.adselection.PersistAdSelectionResultRequest$Builder r6 = androidx.compose.ui.platform.h.B(r6)
                    android.adservices.adselection.PersistAdSelectionResultRequest r6 = androidx.compose.ui.platform.h.e(r6)
                    java.lang.String r0 = "Builder()\n            .s…ult)\n            .build()"
                    kotlin.jvm.internal.Intrinsics.g(r6, r0)
                    androidx.arch.core.executor.a r0 = new androidx.arch.core.executor.a
                    r2 = 2
                    r0.<init>(r2)
                    android.os.OutcomeReceiver r2 = androidx.core.os.OutcomeReceiverKt.a(r7)
                    androidx.compose.ui.platform.h.m(r5, r6, r0, r2)
                    java.lang.Object r7 = r7.n()
                    if (r7 != r1) goto L77
                    return r1
                L77:
                    android.adservices.adselection.AdSelectionOutcome r5 = androidx.media3.datasource.c.m(r7)
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome r6 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome
                    r6.<init>(r5)
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.Ext10Impl.Companion.b(android.adservices.adselection.AdSelectionManager, androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest, kotlin.coroutines.Continuation):java.lang.Object");
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @androidx.annotation.RequiresPermission
            @androidx.annotation.DoNotInline
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object c(@org.jetbrains.annotations.NotNull android.adservices.adselection.AdSelectionManager r5, @org.jetbrains.annotations.NotNull androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> r7) {
                /*
                    r4 = this;
                    boolean r0 = r7 instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1
                    if (r0 == 0) goto L13
                    r0 = r7
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 r0 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1) r0
                    int r1 = r0.s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.s = r1
                    goto L18
                L13:
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 r0 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1
                    r0.<init>(r4, r7)
                L18:
                    java.lang.Object r7 = r0.q
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                    int r1 = r0.s
                    r2 = 1
                    if (r1 == 0) goto L3d
                    if (r1 != r2) goto L35
                    java.lang.Object r5 = r0.p
                    androidx.media3.datasource.c.x(r5)
                    kotlin.ResultKt.b(r7)
                    android.adservices.adselection.AdSelectionOutcome r5 = androidx.media3.datasource.c.m(r7)
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome r6 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome
                    r6.<init>(r5)
                    return r6
                L35:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L3d:
                    kotlin.ResultKt.b(r7)
                    r0.p = r5
                    r0.s = r2
                    kotlinx.coroutines.CancellableContinuationImpl r5 = new kotlinx.coroutines.CancellableContinuationImpl
                    kotlin.coroutines.Continuation r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r0)
                    r5.<init>(r2, r7)
                    r5.o()
                    r6.getClass()
                    androidx.compose.ui.platform.h.l()
                    r5 = 0
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.Ext10Impl.Companion.c(android.adservices.adselection.AdSelectionManager, androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }
    }

    @RequiresExtension.Container
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext8Impl;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Ext8Impl {

        /* renamed from: a, reason: collision with root package name */
        public static final Companion f3620a = new Companion();

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0087@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0087@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext8Impl$Companion;", "", "Landroid/adservices/adselection/AdSelectionManager;", "adSelectionManager", "Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;", "updateAdCounterHistogramRequest", "", "b", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "reportEventRequest", "a", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            @RequiresPermission
            @DoNotInline
            @Nullable
            public final Object a(@NotNull android.adservices.adselection.AdSelectionManager adSelectionManager, @NotNull ReportEventRequest reportEventRequest, @NotNull Continuation<? super Unit> continuation) {
                android.adservices.adselection.ReportEventRequest reportEventRequestBuild;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
                cancellableContinuationImpl.o();
                reportEventRequest.getClass();
                if (AdServicesInfo.a() >= 10 || AdServicesInfo.b() >= 10) {
                    h.C();
                    reportEventRequestBuild = h.f().setInputEvent((InputEvent) null).build();
                    Intrinsics.g(reportEventRequestBuild, "Builder(\n               …                 .build()");
                } else {
                    h.C();
                    reportEventRequestBuild = h.f().build();
                    Intrinsics.g(reportEventRequestBuild, "Builder(\n               …                 .build()");
                }
                adSelectionManager.reportEvent(reportEventRequestBuild, new androidx.arch.core.executor.a(2), OutcomeReceiverKt.a(cancellableContinuationImpl));
                Object objN = cancellableContinuationImpl.n();
                return objN == CoroutineSingletons.d ? objN : Unit.f24250a;
            }

            @RequiresPermission
            @DoNotInline
            @Nullable
            public final Object b(@NotNull android.adservices.adselection.AdSelectionManager adSelectionManager, @NotNull UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, @NotNull Continuation<? super Unit> continuation) {
                new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation)).o();
                updateAdCounterHistogramRequest.getClass();
                h.D();
                throw null;
            }
        }
    }

    public AdSelectionManagerImplCommon(android.adservices.adselection.AdSelectionManager mAdSelectionManager) {
        Intrinsics.h(mAdSelectionManager, "mAdSelectionManager");
        this.f3618a = mAdSelectionManager;
    }

    @RequiresPermission
    @DoNotInline
    public static /* synthetic */ Object b(AdSelectionManagerImplCommon adSelectionManagerImplCommon, GetAdSelectionDataRequest getAdSelectionDataRequest, Continuation<? super GetAdSelectionDataOutcome> continuation) {
        if (AdServicesInfo.a() >= 10 || AdServicesInfo.b() >= 10) {
            return Ext10Impl.f3619a.a(adSelectionManagerImplCommon.f3618a, getAdSelectionDataRequest, continuation);
        }
        throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
    }

    @RequiresPermission
    @DoNotInline
    public static /* synthetic */ Object d(AdSelectionManagerImplCommon adSelectionManagerImplCommon, PersistAdSelectionResultRequest persistAdSelectionResultRequest, Continuation<? super AdSelectionOutcome> continuation) {
        if (AdServicesInfo.a() >= 10 || AdServicesInfo.b() >= 10) {
            return Ext10Impl.f3619a.b(adSelectionManagerImplCommon.f3618a, persistAdSelectionResultRequest, continuation);
        }
        throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
    }

    @RequiresPermission
    @DoNotInline
    public static Object f(AdSelectionManagerImplCommon adSelectionManagerImplCommon, ReportEventRequest reportEventRequest, Continuation<? super Unit> continuation) {
        if (AdServicesInfo.a() < 8 && AdServicesInfo.b() < 9) {
            throw new UnsupportedOperationException("API is unsupported. Min version is API 33 ext 8 or API 31/32 ext 9");
        }
        Object objA = Ext8Impl.f3620a.a(adSelectionManagerImplCommon.f3618a, reportEventRequest, continuation);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }

    @RequiresPermission
    @DoNotInline
    public static Object h(AdSelectionManagerImplCommon adSelectionManagerImplCommon, ReportImpressionRequest reportImpressionRequest, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.o();
        android.adservices.adselection.AdSelectionManager adSelectionManager = adSelectionManagerImplCommon.f3618a;
        reportImpressionRequest.getClass();
        if (AdServicesInfo.a() < 10 && AdServicesInfo.b() < 10) {
            if (Intrinsics.c(null, AdSelectionConfig.e)) {
                throw new UnsupportedOperationException("adSelectionConfig is mandatory forAPI versions lower than ext 10");
            }
            a.s();
            throw null;
        }
        if (!Intrinsics.c(null, AdSelectionConfig.e)) {
            a.s();
            throw null;
        }
        a.s();
        adSelectionManager.reportImpression(h.i(), new androidx.arch.core.executor.a(2), OutcomeReceiverKt.a(cancellableContinuationImpl));
        Object objN = cancellableContinuationImpl.n();
        return objN == CoroutineSingletons.d ? objN : Unit.f24250a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.RequiresPermission
    @androidx.annotation.DoNotInline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object k(androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon r9, androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig r10, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> r11) {
        /*
            boolean r0 = r11 instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$selectAds$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$selectAds$1 r0 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$selectAds$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$selectAds$1 r0 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$selectAds$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            kotlin.ResultKt.b(r11)
            goto Le2
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L30:
            kotlin.ResultKt.b(r11)
            r10.getClass()
            android.adservices.adselection.AdSelectionConfig$Builder r11 = androidx.media3.datasource.c.d()
            android.adservices.common.AdSelectionSignals r2 = androidx.privacysandbox.ads.adservices.adselection.a.f()
            java.lang.String r4 = "fromString(signals)"
            kotlin.jvm.internal.Intrinsics.g(r2, r4)
            android.adservices.adselection.AdSelectionConfig$Builder r11 = androidx.media3.datasource.c.f(r11, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.adservices.adselection.AdSelectionConfig$Builder r11 = androidx.media3.datasource.c.h(r11, r2)
            android.net.Uri r2 = android.net.Uri.EMPTY
            android.adservices.adselection.AdSelectionConfig$Builder r11 = androidx.media3.datasource.c.e(r11)
            android.adservices.common.AdTechIdentifier r2 = androidx.privacysandbox.ads.adservices.adselection.a.g()
            java.lang.String r5 = "fromString(identifier)"
            kotlin.jvm.internal.Intrinsics.g(r2, r5)
            android.adservices.adselection.AdSelectionConfig$Builder r11 = androidx.media3.datasource.c.g(r11, r2)
            java.util.Map r10 = r10.d
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Set r6 = r10.keySet()
            java.util.Iterator r6 = r6.iterator()
        L72:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L9d
            java.lang.Object r7 = r6.next()
            androidx.privacysandbox.ads.adservices.common.AdTechIdentifier r7 = (androidx.privacysandbox.ads.adservices.common.AdTechIdentifier) r7
            r7.getClass()
            android.adservices.common.AdTechIdentifier r8 = androidx.privacysandbox.ads.adservices.adselection.a.g()
            kotlin.jvm.internal.Intrinsics.g(r8, r5)
            java.lang.Object r7 = r10.get(r7)
            androidx.privacysandbox.ads.adservices.common.AdSelectionSignals r7 = (androidx.privacysandbox.ads.adservices.common.AdSelectionSignals) r7
            if (r7 == 0) goto L98
            android.adservices.common.AdSelectionSignals r7 = androidx.privacysandbox.ads.adservices.adselection.a.f()
            kotlin.jvm.internal.Intrinsics.g(r7, r4)
            goto L99
        L98:
            r7 = 0
        L99:
            r2.put(r8, r7)
            goto L72
        L9d:
            android.adservices.adselection.AdSelectionConfig$Builder r10 = androidx.media3.datasource.c.i(r11, r2)
            android.adservices.common.AdSelectionSignals r11 = androidx.privacysandbox.ads.adservices.adselection.a.f()
            kotlin.jvm.internal.Intrinsics.g(r11, r4)
            android.adservices.adselection.AdSelectionConfig$Builder r10 = androidx.media3.datasource.c.B(r10, r11)
            android.net.Uri r11 = android.net.Uri.EMPTY
            android.adservices.adselection.AdSelectionConfig$Builder r10 = androidx.media3.datasource.c.A(r10)
            android.adservices.adselection.AdSelectionConfig r10 = androidx.media3.datasource.c.j(r10)
            java.lang.String r11 = "Builder()\n            .s…Uri)\n            .build()"
            kotlin.jvm.internal.Intrinsics.g(r10, r11)
            r0.r = r3
            r9.getClass()
            kotlinx.coroutines.CancellableContinuationImpl r11 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r0)
            r11.<init>(r3, r0)
            r11.o()
            android.adservices.adselection.AdSelectionManager r9 = r9.f3618a
            androidx.arch.core.executor.a r0 = new androidx.arch.core.executor.a
            r2 = 2
            r0.<init>(r2)
            android.os.OutcomeReceiver r2 = androidx.core.os.OutcomeReceiverKt.a(r11)
            androidx.media3.datasource.c.r(r9, r10, r0, r2)
            java.lang.Object r11 = r11.n()
            if (r11 != r1) goto Le2
            return r1
        Le2:
            android.adservices.adselection.AdSelectionOutcome r9 = androidx.media3.datasource.c.m(r11)
            androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome r10 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome
            r10.<init>(r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.k(androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon, androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @RequiresPermission
    @DoNotInline
    public static /* synthetic */ Object l(AdSelectionManagerImplCommon adSelectionManagerImplCommon, AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, Continuation<? super AdSelectionOutcome> continuation) {
        if (AdServicesInfo.a() >= 10 || AdServicesInfo.b() >= 10) {
            return Ext10Impl.f3619a.c(adSelectionManagerImplCommon.f3618a, adSelectionFromOutcomesConfig, continuation);
        }
        throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
    }

    @RequiresPermission
    @DoNotInline
    public static Object n(AdSelectionManagerImplCommon adSelectionManagerImplCommon, UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, Continuation<? super Unit> continuation) {
        if (AdServicesInfo.a() < 8 && AdServicesInfo.b() < 9) {
            throw new UnsupportedOperationException("API is unsupported. Min version is API 33 ext 8 or API 31/32 ext 9");
        }
        Object objB = Ext8Impl.f3620a.b(adSelectionManagerImplCommon.f3618a, updateAdCounterHistogramRequest, continuation);
        return objB == CoroutineSingletons.d ? objB : Unit.f24250a;
    }

    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object a(@NotNull GetAdSelectionDataRequest getAdSelectionDataRequest, @NotNull Continuation<? super GetAdSelectionDataOutcome> continuation) {
        return b(this, getAdSelectionDataRequest, continuation);
    }

    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object c(@NotNull PersistAdSelectionResultRequest persistAdSelectionResultRequest, @NotNull Continuation<? super AdSelectionOutcome> continuation) {
        return d(this, persistAdSelectionResultRequest, continuation);
    }

    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object e(@NotNull ReportEventRequest reportEventRequest, @NotNull Continuation<? super Unit> continuation) {
        return f(this, reportEventRequest, continuation);
    }

    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object g(@NotNull ReportImpressionRequest reportImpressionRequest, @NotNull Continuation<? super Unit> continuation) {
        return h(this, reportImpressionRequest, continuation);
    }

    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object i(@NotNull AdSelectionConfig adSelectionConfig, @NotNull Continuation<? super AdSelectionOutcome> continuation) {
        return k(this, adSelectionConfig, continuation);
    }

    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object j(@NotNull AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, @NotNull Continuation<? super AdSelectionOutcome> continuation) {
        return l(this, adSelectionFromOutcomesConfig, continuation);
    }

    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object m(@NotNull UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, @NotNull Continuation<? super Unit> continuation) {
        return n(this, updateAdCounterHistogramRequest, continuation);
    }
}
