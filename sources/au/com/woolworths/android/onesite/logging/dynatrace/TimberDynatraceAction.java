package au.com.woolworths.android.onesite.logging.dynatrace;

import YU.a;
import com.apollographql.apollo.exception.ApolloException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/logging/dynatrace/TimberDynatraceAction;", "Lau/com/woolworths/android/onesite/logging/dynatrace/DynatraceAction;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TimberDynatraceAction extends DynatraceAction {
    public TimberDynatraceAction(TimberDynatraceLogger timberDynatraceLogger, String str) {
        super(timberDynatraceLogger, str);
    }

    @Override // au.com.woolworths.android.onesite.logging.dynatrace.DynatraceAction
    public final void a() {
        Timber.f27013a.b(a.i("Leave action: ", this.b, ", ", ""), new Object[0]);
    }

    @Override // au.com.woolworths.android.onesite.logging.dynatrace.DynatraceAction
    public final void b(String name, ApolloException apolloException) {
        Intrinsics.h(name, "name");
        Timber.f27013a.a(a.i("Report Error: ", name, " on action ", this.b), apolloException, new Object[0]);
    }

    @Override // au.com.woolworths.android.onesite.logging.dynatrace.DynatraceAction
    public final void c(String name) {
        Intrinsics.h(name, "name");
        Timber.f27013a.b(a.i("Report event: ", name, " on action ", this.b), new Object[0]);
    }

    @Override // au.com.woolworths.android.onesite.logging.dynatrace.DynatraceAction
    public final void d(String str) {
        Timber.f27013a.b(a.i("Report value: Id => ", str, " on action ", this.b), new Object[0]);
    }
}
