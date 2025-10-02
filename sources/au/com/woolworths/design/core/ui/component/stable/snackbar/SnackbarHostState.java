package au.com.woolworths.design.core.ui.component.stable.snackbar;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/snackbar/SnackbarHostState;", "", "SnackbarVisualsImpl", "SnackbarDataImpl", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SnackbarHostState {

    /* renamed from: a, reason: collision with root package name */
    public final MutexImpl f4768a = MutexKt.a();
    public final MutableState b = SnapshotStateKt.f(null);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/snackbar/SnackbarHostState$SnackbarDataImpl;", "Lau/com/woolworths/design/core/ui/component/stable/snackbar/SnackbarData;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SnackbarDataImpl implements SnackbarData {

        /* renamed from: a, reason: collision with root package name */
        public final SnackbarVisuals f4769a;
        public final CancellableContinuationImpl b;

        public SnackbarDataImpl(SnackbarVisuals visuals, CancellableContinuationImpl cancellableContinuationImpl) {
            Intrinsics.h(visuals, "visuals");
            this.f4769a = visuals;
            this.b = cancellableContinuationImpl;
        }

        @Override // au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarData
        public final void a() {
            CancellableContinuationImpl cancellableContinuationImpl = this.b;
            if (cancellableContinuationImpl.t()) {
                cancellableContinuationImpl.resumeWith(SnackbarResult.e);
            }
        }

        @Override // au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarData
        /* renamed from: b, reason: from getter */
        public final SnackbarVisuals getF4769a() {
            return this.f4769a;
        }

        @Override // au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarData
        public final void dismiss() {
            CancellableContinuationImpl cancellableContinuationImpl = this.b;
            if (cancellableContinuationImpl.t()) {
                cancellableContinuationImpl.resumeWith(SnackbarResult.d);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SnackbarDataImpl.class != obj.getClass()) {
                return false;
            }
            SnackbarDataImpl snackbarDataImpl = (SnackbarDataImpl) obj;
            return Intrinsics.c(this.f4769a, snackbarDataImpl.f4769a) && this.b.equals(snackbarDataImpl.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f4769a.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/snackbar/SnackbarHostState$SnackbarVisualsImpl;", "Lau/com/woolworths/design/core/ui/component/stable/snackbar/SnackbarVisuals;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SnackbarVisualsImpl implements SnackbarVisuals {

        /* renamed from: a, reason: collision with root package name */
        public final String f4770a;
        public final String b;
        public final SnackbarDuration c;

        public SnackbarVisualsImpl(String message, String str, SnackbarDuration duration) {
            Intrinsics.h(message, "message");
            Intrinsics.h(duration, "duration");
            this.f4770a = message;
            this.b = str;
            this.c = duration;
        }

        @Override // au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarVisuals
        public final boolean a() {
            return false;
        }

        @Override // au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarVisuals
        /* renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SnackbarVisualsImpl.class != obj.getClass()) {
                return false;
            }
            SnackbarVisualsImpl snackbarVisualsImpl = (SnackbarVisualsImpl) obj;
            return Intrinsics.c(this.f4770a, snackbarVisualsImpl.f4770a) && Intrinsics.c(this.b, snackbarVisualsImpl.b) && this.c == snackbarVisualsImpl.c;
        }

        @Override // au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarVisuals
        /* renamed from: getDuration, reason: from getter */
        public final SnackbarDuration getC() {
            return this.c;
        }

        @Override // au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarVisuals
        /* renamed from: getMessage, reason: from getter */
        public final String getF4770a() {
            return this.f4770a;
        }

        public final int hashCode() {
            int iHashCode = this.f4770a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + androidx.camera.core.impl.b.e((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, false);
        }
    }

    public static Object c(SnackbarHostState snackbarHostState, String str, String str2, SnackbarDuration snackbarDuration, Continuation continuation, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            snackbarDuration = str2 == null ? SnackbarDuration.d : SnackbarDuration.e;
        }
        snackbarHostState.getClass();
        return snackbarHostState.b(new SnackbarVisualsImpl(str, str2, snackbarDuration), continuation);
    }

    public final SnackbarData a() {
        return (SnackbarData) ((SnapshotMutableStateImpl) this.b).getD();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v0, types: [au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarVisuals, kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r9v9, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarVisuals r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState$showSnackbar$2
            if (r0 == 0) goto L13
            r0 = r10
            au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState$showSnackbar$2 r0 = (au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState$showSnackbar$2) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState$showSnackbar$2 r0 = new au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState$showSnackbar$2
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.u
            androidx.compose.runtime.MutableState r3 = r8.b
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L43
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            kotlinx.coroutines.sync.Mutex r9 = r0.q
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L2f
            goto L7e
        L2f:
            r10 = move-exception
            goto L8b
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            kotlinx.coroutines.sync.Mutex r9 = r0.q
            au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarVisuals r2 = r0.p
            kotlin.ResultKt.b(r10)
            r10 = r9
            r9 = r2
            goto L55
        L43:
            kotlin.ResultKt.b(r10)
            r0.p = r9
            kotlinx.coroutines.sync.MutexImpl r10 = r8.f4768a
            r0.q = r10
            r0.u = r5
            java.lang.Object r2 = r10.a(r0)
            if (r2 != r1) goto L55
            goto L7a
        L55:
            r0.p = r9     // Catch: java.lang.Throwable -> L87
            r0.q = r10     // Catch: java.lang.Throwable -> L87
            r0.r = r0     // Catch: java.lang.Throwable -> L87
            r0.u = r4     // Catch: java.lang.Throwable -> L87
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L87
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r0)     // Catch: java.lang.Throwable -> L87
            r2.<init>(r5, r0)     // Catch: java.lang.Throwable -> L87
            r2.o()     // Catch: java.lang.Throwable -> L87
            au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState$SnackbarDataImpl r0 = new au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState$SnackbarDataImpl     // Catch: java.lang.Throwable -> L87
            r0.<init>(r9, r2)     // Catch: java.lang.Throwable -> L87
            r9 = r3
            androidx.compose.runtime.SnapshotMutableStateImpl r9 = (androidx.compose.runtime.SnapshotMutableStateImpl) r9     // Catch: java.lang.Throwable -> L87
            r9.setValue(r0)     // Catch: java.lang.Throwable -> L87
            java.lang.Object r9 = r2.n()     // Catch: java.lang.Throwable -> L87
            if (r9 != r1) goto L7b
        L7a:
            return r1
        L7b:
            r7 = r10
            r10 = r9
            r9 = r7
        L7e:
            androidx.compose.runtime.SnapshotMutableStateImpl r3 = (androidx.compose.runtime.SnapshotMutableStateImpl) r3     // Catch: java.lang.Throwable -> L91
            r3.setValue(r6)     // Catch: java.lang.Throwable -> L91
            r9.c(r6)
            return r10
        L87:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L8b:
            androidx.compose.runtime.SnapshotMutableStateImpl r3 = (androidx.compose.runtime.SnapshotMutableStateImpl) r3     // Catch: java.lang.Throwable -> L91
            r3.setValue(r6)     // Catch: java.lang.Throwable -> L91
            throw r10     // Catch: java.lang.Throwable -> L91
        L91:
            r10 = move-exception
            r9.c(r6)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState.b(au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarVisuals, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
