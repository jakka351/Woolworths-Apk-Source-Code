package androidx.privacysandbox.ads.adservices.java.measurement;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.compose.ui.input.pointer.a;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.measurement.DeletionRequest;
import androidx.privacysandbox.ads.adservices.measurement.MeasurementManager;
import androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest;
import androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest;
import androidx.privacysandbox.ads.adservices.measurement.WebTriggerRegistrationRequest;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/measurement/MeasurementManagerFutures;", "", "Api33Ext5JavaImpl", "Companion", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class MeasurementManagerFutures {

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004H\u0017¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/measurement/MeasurementManagerFutures$Api33Ext5JavaImpl;", "Landroidx/privacysandbox/ads/adservices/java/measurement/MeasurementManagerFutures;", "Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;", "deletionRequest", "Lcom/google/common/util/concurrent/ListenableFuture;", "", "e", "(Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;", "request", "f", "(Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "trigger", "d", "(Landroid/net/Uri;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;", "g", "(Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerRegistrationRequest;", "h", "(Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerRegistrationRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "", "b", "()Lcom/google/common/util/concurrent/ListenableFuture;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api33Ext5JavaImpl extends MeasurementManagerFutures {

        /* renamed from: a, reason: collision with root package name */
        public final MeasurementManager f3629a;

        public Api33Ext5JavaImpl(MeasurementManager measurementManager) {
            this.f3629a = measurementManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<Integer> b() {
            return a.g(BuildersKt.a(CoroutineScopeKt.a(Dispatchers.f24691a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1(this, null), 3));
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<Unit> c(@NotNull Uri attributionSource, @Nullable InputEvent inputEvent) {
            Intrinsics.h(attributionSource, "attributionSource");
            return a.g(BuildersKt.a(CoroutineScopeKt.a(Dispatchers.f24691a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1(this, attributionSource, inputEvent, null), 3));
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<Unit> d(@NotNull Uri trigger) {
            Intrinsics.h(trigger, "trigger");
            return a.g(BuildersKt.a(CoroutineScopeKt.a(Dispatchers.f24691a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1(this, trigger, null), 3));
        }

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<Unit> e(@NotNull DeletionRequest deletionRequest) {
            Intrinsics.h(deletionRequest, "deletionRequest");
            return a.g(BuildersKt.a(CoroutineScopeKt.a(Dispatchers.f24691a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1(this, deletionRequest, null), 3));
        }

        @NotNull
        @RequiresPermission
        @DoNotInline
        @ExperimentalFeatures.RegisterSourceOptIn
        public ListenableFuture<Unit> f(@NotNull SourceRegistrationRequest request) {
            Intrinsics.h(request, "request");
            return a.g(BuildersKt.a(CoroutineScopeKt.a(Dispatchers.f24691a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$2(this, request, null), 3));
        }

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<Unit> g(@NotNull WebSourceRegistrationRequest request) {
            Intrinsics.h(request, "request");
            return a.g(BuildersKt.a(CoroutineScopeKt.a(Dispatchers.f24691a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1(this, request, null), 3));
        }

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<Unit> h(@NotNull WebTriggerRegistrationRequest request) {
            Intrinsics.h(request, "request");
            return a.g(BuildersKt.a(CoroutineScopeKt.a(Dispatchers.f24691a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1(this, request, null), 3));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/measurement/MeasurementManagerFutures$Companion;", "", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    public static final MeasurementManagerFutures a(Context context) {
        Intrinsics.h(context, "context");
        MeasurementManager measurementManagerA = MeasurementManager.Companion.a(context);
        if (measurementManagerA != null) {
            return new Api33Ext5JavaImpl(measurementManagerA);
        }
        return null;
    }

    public abstract ListenableFuture b();

    public abstract ListenableFuture c(Uri uri, InputEvent inputEvent);

    public abstract ListenableFuture d(Uri uri);
}
