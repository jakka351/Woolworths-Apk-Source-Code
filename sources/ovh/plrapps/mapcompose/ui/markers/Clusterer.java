package ovh.plrapps.mapcompose.ui.markers;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import ovh.plrapps.mapcompose.api.MarkerDataSnapshot;
import ovh.plrapps.mapcompose.api.ReferentialSnapshot;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lovh/plrapps/mapcompose/ui/markers/Clusterer;", "", "Barycenter", "ClusteringResult", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class Clusterer {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.markers.Clusterer$1", f = "Clusterer.kt", l = {88}, m = "invokeSuspend")
    /* renamed from: ovh.plrapps.mapcompose.ui.markers.Clusterer$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "markers", "", "Lovh/plrapps/mapcompose/ui/markers/Marker;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.markers.Clusterer$1$1", f = "Clusterer.kt", l = {90}, m = "invokeSuspend")
        /* renamed from: ovh.plrapps.mapcompose.ui.markers.Clusterer$1$1, reason: invalid class name and collision with other inner class name */
        final class C04241 extends SuspendLambda implements Function2<List<? extends Marker>, Continuation<? super Unit>, Object> {

            @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "", "Lovh/plrapps/mapcompose/api/MarkerDataSnapshot;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.markers.Clusterer$1$1$1", f = "Clusterer.kt", l = {92}, m = "invokeSuspend")
            /* renamed from: ovh.plrapps.mapcompose.ui.markers.Clusterer$1$1$1, reason: invalid class name and collision with other inner class name */
            final class C04251 extends SuspendLambda implements Function2<List<? extends MarkerDataSnapshot>, Continuation<? super Unit>, Object> {

                @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lovh/plrapps/mapcompose/api/ReferentialSnapshot;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.markers.Clusterer$1$1$1$1", f = "Clusterer.kt", l = {95, 104}, m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: ovh.plrapps.mapcompose.ui.markers.Clusterer$1$1$1$1, reason: invalid class name and collision with other inner class name */
                final class C04261 extends SuspendLambda implements Function2<ReferentialSnapshot, Continuation<? super Unit>, Object> {

                    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "exemptionSet", "", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.markers.Clusterer$1$1$1$1$1", f = "Clusterer.kt", l = {105}, m = "invokeSuspend")
                    /* renamed from: ovh.plrapps.mapcompose.ui.markers.Clusterer$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    final class C04271 extends SuspendLambda implements Function2<Set<? extends String>, Continuation<? super Unit>, Object> {

                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.markers.Clusterer$1$1$1$1$1$1", f = "Clusterer.kt", l = {106}, m = "invokeSuspend")
                        /* renamed from: ovh.plrapps.mapcompose.ui.markers.Clusterer$1$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                        final class C04281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation create(Object obj, Continuation continuation) {
                                throw null;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                throw null;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                                ResultKt.b(obj);
                                throw null;
                            }
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            throw null;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            throw null;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                            ResultKt.b(obj);
                            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
                            throw null;
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        throw null;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        throw null;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        throw null;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    throw null;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    throw null;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                    ResultKt.b(obj);
                    throw null;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                throw null;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                throw null;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/markers/Clusterer$Barycenter;", "", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Barycenter {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Barycenter) && Double.compare(0.0d, 0.0d) == 0 && Double.compare(0.0d, 0.0d) == 0;
        }

        public final int hashCode() {
            return Integer.hashCode(0) + a.a(0.0d, Double.hashCode(0.0d) * 31, 31);
        }

        public final String toString() {
            StringBuilder sbN = androidx.constraintlayout.core.state.a.n(0.0d, "Barycenter(x=", ", y=");
            sbN.append(0.0d);
            sbN.append(", weight=");
            sbN.append(0);
            sbN.append(")");
            return sbN.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/markers/Clusterer$ClusteringResult;", "", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClusteringResult {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClusteringResult) && Intrinsics.c(null, null) && Intrinsics.c(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ClusteringResult(clusters=" + ((Object) null) + ", markers=" + ((Object) null) + ")";
        }
    }
}
