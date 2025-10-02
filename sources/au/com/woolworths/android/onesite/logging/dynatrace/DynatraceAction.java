package au.com.woolworths.android.onesite.logging.dynatrace;

import com.apollographql.apollo.exception.ApolloException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/logging/dynatrace/DynatraceAction;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class DynatraceAction {

    /* renamed from: a, reason: collision with root package name */
    public final DynatraceLogger f4271a;
    public final String b;

    public DynatraceAction(DynatraceLogger dynatraceLogger, String str) {
        this.f4271a = dynatraceLogger;
        this.b = str;
    }

    public abstract void a();

    public abstract void b(String str, ApolloException apolloException);

    public abstract void c(String str);

    public abstract void d(String str);
}
