package androidx.privacysandbox.ads.adservices.measurement;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresExtension.Container
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0097@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0007H\u0097@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0097@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0014H\u0097@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0017H\u0097@¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH\u0097@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManager;", "Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;", "deletionRequest", "", "a", "(Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trigger", "e", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;", "request", "f", "(Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;", "d", "(Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerRegistrationRequest;", "g", "(Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint
@RestrictTo
@SourceDebugExtension
/* loaded from: classes2.dex */
public class MeasurementManagerImplCommon extends MeasurementManager {

    /* renamed from: a, reason: collision with root package name */
    public final android.adservices.measurement.MeasurementManager f3631a;

    public MeasurementManagerImplCommon(android.adservices.measurement.MeasurementManager mMeasurementManager) {
        Intrinsics.h(mMeasurementManager, "mMeasurementManager");
        this.f3631a = mMeasurementManager;
    }

    @DoNotInline
    public static Object h(MeasurementManagerImplCommon measurementManagerImplCommon, DeletionRequest deletionRequest, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.o();
        android.adservices.measurement.MeasurementManager measurementManager = measurementManagerImplCommon.f3631a;
        deletionRequest.getClass();
        android.adservices.measurement.DeletionRequest deletionRequestBuild = androidx.privacysandbox.ads.adservices.adselection.a.k().setDeletionMode(0).setMatchBehavior(0).setStart(null).setEnd(null).setDomainUris(null).setOriginUris(null).build();
        Intrinsics.g(deletionRequestBuild, "Builder()\n            .s…ris)\n            .build()");
        measurementManager.deleteRegistrations(deletionRequestBuild, new androidx.arch.core.executor.a(2), OutcomeReceiverKt.a(cancellableContinuationImpl));
        Object objN = cancellableContinuationImpl.n();
        return objN == CoroutineSingletons.d ? objN : Unit.f24250a;
    }

    @RequiresPermission
    @DoNotInline
    public static Object i(MeasurementManagerImplCommon measurementManagerImplCommon, Continuation<? super Integer> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.o();
        measurementManagerImplCommon.f3631a.getMeasurementApiStatus(new androidx.arch.core.executor.a(2), OutcomeReceiverKt.a(cancellableContinuationImpl));
        Object objN = cancellableContinuationImpl.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objN;
    }

    @RequiresPermission
    @DoNotInline
    public static Object j(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, InputEvent inputEvent, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.o();
        measurementManagerImplCommon.f3631a.registerSource(uri, inputEvent, new androidx.arch.core.executor.a(2), OutcomeReceiverKt.a(cancellableContinuationImpl));
        Object objN = cancellableContinuationImpl.n();
        return objN == CoroutineSingletons.d ? objN : Unit.f24250a;
    }

    @RequiresPermission
    @DoNotInline
    @ExperimentalFeatures.RegisterSourceOptIn
    public static Object k(MeasurementManagerImplCommon measurementManagerImplCommon, SourceRegistrationRequest sourceRegistrationRequest, Continuation<? super Unit> continuation) {
        Object objC = CoroutineScopeKt.c(new MeasurementManagerImplCommon$registerSource$4(measurementManagerImplCommon, sourceRegistrationRequest, null), continuation);
        return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
    }

    @RequiresPermission
    @DoNotInline
    public static Object l(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.o();
        measurementManagerImplCommon.f3631a.registerTrigger(uri, new androidx.arch.core.executor.a(2), OutcomeReceiverKt.a(cancellableContinuationImpl));
        Object objN = cancellableContinuationImpl.n();
        return objN == CoroutineSingletons.d ? objN : Unit.f24250a;
    }

    @RequiresPermission
    @DoNotInline
    public static Object m(MeasurementManagerImplCommon measurementManagerImplCommon, WebSourceRegistrationRequest webSourceRegistrationRequest, Continuation<? super Unit> continuation) {
        new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation)).o();
        android.adservices.measurement.MeasurementManager measurementManager = measurementManagerImplCommon.f3631a;
        webSourceRegistrationRequest.getClass();
        a.r();
        Intrinsics.h(null, "request");
        new ArrayList();
        throw null;
    }

    @RequiresPermission
    @DoNotInline
    public static Object n(MeasurementManagerImplCommon measurementManagerImplCommon, WebTriggerRegistrationRequest webTriggerRegistrationRequest, Continuation<? super Unit> continuation) {
        new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation)).o();
        android.adservices.measurement.MeasurementManager measurementManager = measurementManagerImplCommon.f3631a;
        webTriggerRegistrationRequest.getClass();
        a.C();
        Intrinsics.h(null, "request");
        new ArrayList();
        throw null;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @DoNotInline
    @Nullable
    public Object a(@NotNull DeletionRequest deletionRequest, @NotNull Continuation<? super Unit> continuation) {
        return h(this, deletionRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object b(@NotNull Continuation<? super Integer> continuation) {
        return i(this, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object c(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull Continuation<? super Unit> continuation) {
        return j(this, uri, inputEvent, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @Nullable
    @RequiresPermission
    @DoNotInline
    @ExperimentalFeatures.RegisterSourceOptIn
    public Object d(@NotNull SourceRegistrationRequest sourceRegistrationRequest, @NotNull Continuation<? super Unit> continuation) {
        return k(this, sourceRegistrationRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object e(@NotNull Uri uri, @NotNull Continuation<? super Unit> continuation) {
        return l(this, uri, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object f(@NotNull WebSourceRegistrationRequest webSourceRegistrationRequest, @NotNull Continuation<? super Unit> continuation) {
        return m(this, webSourceRegistrationRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object g(@NotNull WebTriggerRegistrationRequest webTriggerRegistrationRequest, @NotNull Continuation<? super Unit> continuation) {
        return n(this, webTriggerRegistrationRequest, continuation);
    }
}
