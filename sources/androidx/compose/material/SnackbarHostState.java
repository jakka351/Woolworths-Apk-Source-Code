package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material/SnackbarHostState;", "", "SnackbarDataImpl", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SnackbarHostState {

    /* renamed from: a, reason: collision with root package name */
    public final MutexImpl f1326a = MutexKt.a();
    public final MutableState b = SnapshotStateKt.f(null);

    @Stable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/SnackbarHostState$SnackbarDataImpl;", "Landroidx/compose/material/SnackbarData;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class SnackbarDataImpl implements SnackbarData {

        /* renamed from: a, reason: collision with root package name */
        public final String f1327a;
        public final String b;
        public final SnackbarDuration c;
        public final CancellableContinuationImpl d;

        public SnackbarDataImpl(String str, String str2, SnackbarDuration snackbarDuration, CancellableContinuationImpl cancellableContinuationImpl) {
            this.f1327a = str;
            this.b = str2;
            this.c = snackbarDuration;
            this.d = cancellableContinuationImpl;
        }

        @Override // androidx.compose.material.SnackbarData
        public final void a() {
            CancellableContinuationImpl cancellableContinuationImpl = this.d;
            if (cancellableContinuationImpl.t()) {
                cancellableContinuationImpl.resumeWith(SnackbarResult.e);
            }
        }

        @Override // androidx.compose.material.SnackbarData
        /* renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        @Override // androidx.compose.material.SnackbarData
        public final void dismiss() {
            CancellableContinuationImpl cancellableContinuationImpl = this.d;
            if (cancellableContinuationImpl.t()) {
                cancellableContinuationImpl.resumeWith(SnackbarResult.d);
            }
        }

        @Override // androidx.compose.material.SnackbarData
        /* renamed from: getDuration, reason: from getter */
        public final SnackbarDuration getC() {
            return this.c;
        }

        @Override // androidx.compose.material.SnackbarData
        /* renamed from: getMessage, reason: from getter */
        public final String getF1327a() {
            return this.f1327a;
        }
    }

    public static /* synthetic */ Object b(SnackbarHostState snackbarHostState, String str, String str2, SnackbarDuration snackbarDuration, Continuation continuation, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            snackbarDuration = SnackbarDuration.d;
        }
        return snackbarHostState.a(str, str2, snackbarDuration, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String, kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r9v9, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r9, java.lang.String r10, androidx.compose.material.SnackbarDuration r11, kotlin.coroutines.Continuation r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof androidx.compose.material.SnackbarHostState$showSnackbar$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.material.SnackbarHostState$showSnackbar$1 r0 = (androidx.compose.material.SnackbarHostState$showSnackbar$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            androidx.compose.material.SnackbarHostState$showSnackbar$1 r0 = new androidx.compose.material.SnackbarHostState$showSnackbar$1
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.v
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4e
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            kotlinx.coroutines.sync.Mutex r9 = r0.t
            androidx.compose.material.SnackbarHostState r10 = r0.p
            kotlin.ResultKt.b(r12)     // Catch: java.lang.Throwable -> L30
            goto L99
        L30:
            r11 = move-exception
            goto Lab
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            kotlinx.coroutines.sync.Mutex r9 = r0.t
            androidx.compose.material.SnackbarDuration r11 = r0.s
            java.lang.String r10 = r0.r
            java.lang.String r2 = r0.q
            androidx.compose.material.SnackbarHostState r6 = r0.p
            kotlin.ResultKt.b(r12)
            r12 = r9
            r9 = r2
            r2 = r11
            r11 = r10
            r10 = r6
            goto L69
        L4e:
            kotlin.ResultKt.b(r12)
            r0.p = r8
            r0.q = r9
            r0.r = r10
            r0.s = r11
            kotlinx.coroutines.sync.MutexImpl r12 = r8.f1326a
            r0.t = r12
            r0.x = r4
            java.lang.Object r2 = r12.a(r0)
            if (r2 != r1) goto L66
            goto L95
        L66:
            r2 = r11
            r11 = r10
            r10 = r8
        L69:
            r0.p = r10     // Catch: java.lang.Throwable -> La4
            r0.q = r9     // Catch: java.lang.Throwable -> La4
            r0.r = r11     // Catch: java.lang.Throwable -> La4
            r0.s = r2     // Catch: java.lang.Throwable -> La4
            r0.t = r12     // Catch: java.lang.Throwable -> La4
            r0.u = r0     // Catch: java.lang.Throwable -> La4
            r0.x = r3     // Catch: java.lang.Throwable -> La4
            kotlinx.coroutines.CancellableContinuationImpl r3 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> La4
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r0)     // Catch: java.lang.Throwable -> La4
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> La4
            r3.o()     // Catch: java.lang.Throwable -> La4
            androidx.compose.material.SnackbarHostState$SnackbarDataImpl r0 = new androidx.compose.material.SnackbarHostState$SnackbarDataImpl     // Catch: java.lang.Throwable -> La4
            r0.<init>(r9, r11, r2, r3)     // Catch: java.lang.Throwable -> La4
            androidx.compose.runtime.MutableState r9 = r10.b     // Catch: java.lang.Throwable -> La9
            androidx.compose.runtime.SnapshotMutableStateImpl r9 = (androidx.compose.runtime.SnapshotMutableStateImpl) r9     // Catch: java.lang.Throwable -> La9
            r9.setValue(r0)     // Catch: java.lang.Throwable -> La9
            java.lang.Object r9 = r3.n()     // Catch: java.lang.Throwable -> La4
            if (r9 != r1) goto L96
        L95:
            return r1
        L96:
            r7 = r12
            r12 = r9
            r9 = r7
        L99:
            androidx.compose.runtime.MutableState r10 = r10.b     // Catch: java.lang.Throwable -> Lb3
            androidx.compose.runtime.SnapshotMutableStateImpl r10 = (androidx.compose.runtime.SnapshotMutableStateImpl) r10     // Catch: java.lang.Throwable -> Lb3
            r10.setValue(r5)     // Catch: java.lang.Throwable -> Lb3
            r9.c(r5)
            return r12
        La4:
            r11 = move-exception
        La5:
            r9 = r12
            goto Lab
        La7:
            r11 = r9
            goto La5
        La9:
            r9 = move-exception
            goto La7
        Lab:
            androidx.compose.runtime.MutableState r10 = r10.b     // Catch: java.lang.Throwable -> Lb3
            androidx.compose.runtime.SnapshotMutableStateImpl r10 = (androidx.compose.runtime.SnapshotMutableStateImpl) r10     // Catch: java.lang.Throwable -> Lb3
            r10.setValue(r5)     // Catch: java.lang.Throwable -> Lb3
            throw r11     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            r10 = move-exception
            r9.c(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostState.a(java.lang.String, java.lang.String, androidx.compose.material.SnackbarDuration, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
