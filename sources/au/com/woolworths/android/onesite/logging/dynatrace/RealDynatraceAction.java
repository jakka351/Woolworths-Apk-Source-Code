package au.com.woolworths.android.onesite.logging.dynatrace;

import com.apollographql.apollo.exception.ApolloException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/logging/dynatrace/RealDynatraceAction;", "Lau/com/woolworths/android/onesite/logging/dynatrace/DynatraceAction;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealDynatraceAction extends DynatraceAction {
    @Override // au.com.woolworths.android.onesite.logging.dynatrace.DynatraceAction
    public final void a() {
        throw null;
    }

    @Override // au.com.woolworths.android.onesite.logging.dynatrace.DynatraceAction
    public final void b(String name, ApolloException apolloException) {
        Intrinsics.h(name, "name");
        throw null;
    }

    @Override // au.com.woolworths.android.onesite.logging.dynatrace.DynatraceAction
    public final void c(String name) {
        Intrinsics.h(name, "name");
        throw null;
    }

    @Override // au.com.woolworths.android.onesite.logging.dynatrace.DynatraceAction
    public final void d(String str) {
        throw null;
    }
}
