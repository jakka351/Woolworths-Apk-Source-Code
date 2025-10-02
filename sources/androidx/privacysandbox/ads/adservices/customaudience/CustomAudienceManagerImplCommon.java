package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.common.AdSelectionSignals;
import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import java.time.Instant;
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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\rJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0097@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0097@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManager;", "Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;", "request", "", "c", "(Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;", "a", "(Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/customaudience/LeaveCustomAudienceRequest;", "e", "(Landroidx/privacysandbox/ads/adservices/customaudience/LeaveCustomAudienceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ext10Impl", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint
@RestrictTo
@SourceDebugExtension
/* loaded from: classes2.dex */
public class CustomAudienceManagerImplCommon extends CustomAudienceManager {

    /* renamed from: a, reason: collision with root package name */
    public final android.adservices.customaudience.CustomAudienceManager f3625a;

    @RequiresExtension.Container
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon$Ext10Impl;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Ext10Impl {

        /* renamed from: a, reason: collision with root package name */
        public static final Companion f3626a = new Companion();

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0087@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon$Ext10Impl$Companion;", "", "Landroid/adservices/customaudience/CustomAudienceManager;", "customAudienceManager", "Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;", "fetchAndJoinCustomAudienceRequest", "", "a", "(Landroid/adservices/customaudience/CustomAudienceManager;Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            @RequiresPermission
            @DoNotInline
            @Nullable
            public final Object a(@NotNull android.adservices.customaudience.CustomAudienceManager customAudienceManager, @NotNull FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, @NotNull Continuation<? super Unit> continuation) {
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
                cancellableContinuationImpl.o();
                fetchAndJoinCustomAudienceRequest.getClass();
                android.adservices.customaudience.FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequestBuild = a.a().setName((String) null).setActivationTime((Instant) null).setExpirationTime((Instant) null).setUserBiddingSignals((AdSelectionSignals) null).build();
                Intrinsics.g(fetchAndJoinCustomAudienceRequestBuild, "Builder(fetchUri)\n      …s())\n            .build()");
                customAudienceManager.fetchAndJoinCustomAudience(fetchAndJoinCustomAudienceRequestBuild, new androidx.arch.core.executor.a(2), OutcomeReceiverKt.a(cancellableContinuationImpl));
                Object objN = cancellableContinuationImpl.n();
                return objN == CoroutineSingletons.d ? objN : Unit.f24250a;
            }
        }
    }

    public CustomAudienceManagerImplCommon(android.adservices.customaudience.CustomAudienceManager customAudienceManager) {
        Intrinsics.h(customAudienceManager, "customAudienceManager");
        this.f3625a = customAudienceManager;
    }

    @RequiresPermission
    @DoNotInline
    public static Object b(CustomAudienceManagerImplCommon customAudienceManagerImplCommon, FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, Continuation<? super Unit> continuation) {
        if (AdServicesInfo.a() < 10 && AdServicesInfo.b() < 10) {
            throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
        }
        Object objA = Ext10Impl.f3626a.a(customAudienceManagerImplCommon.f3625a, fetchAndJoinCustomAudienceRequest, continuation);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }

    @RequiresPermission
    @DoNotInline
    public static Object d(CustomAudienceManagerImplCommon customAudienceManagerImplCommon, JoinCustomAudienceRequest joinCustomAudienceRequest, Continuation<? super Unit> continuation) {
        new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation)).o();
        android.adservices.customaudience.CustomAudienceManager customAudienceManager = customAudienceManagerImplCommon.f3625a;
        androidx.privacysandbox.ads.adservices.adselection.a.A();
        joinCustomAudienceRequest.getClass();
        androidx.privacysandbox.ads.adservices.adselection.a.h();
        throw null;
    }

    @RequiresPermission
    @DoNotInline
    public static Object f(CustomAudienceManagerImplCommon customAudienceManagerImplCommon, LeaveCustomAudienceRequest leaveCustomAudienceRequest, Continuation<? super Unit> continuation) {
        new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation)).o();
        android.adservices.customaudience.CustomAudienceManager customAudienceManager = customAudienceManagerImplCommon.f3625a;
        androidx.privacysandbox.ads.adservices.adselection.a.x();
        leaveCustomAudienceRequest.getClass();
        throw null;
    }

    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object a(@NotNull FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, @NotNull Continuation<? super Unit> continuation) {
        return b(this, fetchAndJoinCustomAudienceRequest, continuation);
    }

    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object c(@NotNull JoinCustomAudienceRequest joinCustomAudienceRequest, @NotNull Continuation<? super Unit> continuation) {
        return d(this, joinCustomAudienceRequest, continuation);
    }

    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object e(@NotNull LeaveCustomAudienceRequest leaveCustomAudienceRequest, @NotNull Continuation<? super Unit> continuation) {
        return f(this, leaveCustomAudienceRequest, continuation);
    }
}
