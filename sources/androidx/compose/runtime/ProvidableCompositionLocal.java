package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/CompositionLocal;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ProvidableCompositionLocal<T> extends CompositionLocal<T> {
    public abstract ProvidedValue b(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[PHI: r5
  0x0034: PHI (r5v2 androidx.compose.runtime.DynamicValueHolder) = (r5v9 androidx.compose.runtime.DynamicValueHolder), (r5v10 androidx.compose.runtime.DynamicValueHolder) binds: [B:21:0x0040, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.ValueHolder c(androidx.compose.runtime.ProvidedValue r4, androidx.compose.runtime.ValueHolder r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof androidx.compose.runtime.DynamicValueHolder
            r1 = 0
            if (r0 == 0) goto L16
            boolean r0 = r4.f
            if (r0 == 0) goto L43
            r1 = r5
            androidx.compose.runtime.DynamicValueHolder r1 = (androidx.compose.runtime.DynamicValueHolder) r1
            androidx.compose.runtime.MutableState r5 = r1.f1635a
            java.lang.Object r0 = r4.a()
            r5.setValue(r0)
            goto L43
        L16:
            boolean r0 = r5 instanceof androidx.compose.runtime.StaticValueHolder
            if (r0 == 0) goto L36
            boolean r0 = r4.b
            if (r0 != 0) goto L22
            java.lang.Object r0 = r4.g
            if (r0 == 0) goto L43
        L22:
            boolean r0 = r4.f
            if (r0 != 0) goto L43
            java.lang.Object r0 = r4.a()
            androidx.compose.runtime.StaticValueHolder r5 = (androidx.compose.runtime.StaticValueHolder) r5
            java.lang.Object r2 = r5.f1670a
            boolean r0 = kotlin.jvm.internal.Intrinsics.c(r0, r2)
            if (r0 == 0) goto L43
        L34:
            r1 = r5
            goto L43
        L36:
            boolean r0 = r5 instanceof androidx.compose.runtime.ComputedValueHolder
            if (r0 == 0) goto L43
            kotlin.jvm.functions.Function1 r0 = r4.e
            androidx.compose.runtime.ComputedValueHolder r5 = (androidx.compose.runtime.ComputedValueHolder) r5
            kotlin.jvm.functions.Function1 r2 = r5.f1634a
            if (r0 != r2) goto L43
            goto L34
        L43:
            if (r1 != 0) goto L7d
            boolean r5 = r4.f
            androidx.compose.runtime.MutableState r0 = r4.d
            if (r5 == 0) goto L61
            androidx.compose.runtime.DynamicValueHolder r5 = new androidx.compose.runtime.DynamicValueHolder
            if (r0 != 0) goto L5d
            java.lang.Object r0 = r4.g
            androidx.compose.runtime.SnapshotMutationPolicy r4 = r4.c
            if (r4 != 0) goto L57
            androidx.compose.runtime.StructuralEqualityPolicy r4 = androidx.compose.runtime.StructuralEqualityPolicy.f1671a
        L57:
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = new androidx.compose.runtime.ParcelableSnapshotMutableState
            r1.<init>(r0, r4)
            r0 = r1
        L5d:
            r5.<init>(r0)
            return r5
        L61:
            kotlin.jvm.functions.Function1 r5 = r4.e
            if (r5 == 0) goto L6b
            androidx.compose.runtime.ComputedValueHolder r4 = new androidx.compose.runtime.ComputedValueHolder
            r4.<init>(r5)
            return r4
        L6b:
            if (r0 == 0) goto L73
            androidx.compose.runtime.DynamicValueHolder r4 = new androidx.compose.runtime.DynamicValueHolder
            r4.<init>(r0)
            return r4
        L73:
            androidx.compose.runtime.StaticValueHolder r5 = new androidx.compose.runtime.StaticValueHolder
            java.lang.Object r4 = r4.a()
            r5.<init>(r4)
            return r5
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ProvidableCompositionLocal.c(androidx.compose.runtime.ProvidedValue, androidx.compose.runtime.ValueHolder):androidx.compose.runtime.ValueHolder");
    }
}
