package au.com.woolworths.foundation.bark;

import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/bark/NoOpBarker;", "Lau/com/woolworths/foundation/bark/Bark$Barker;", "bark-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class NoOpBarker implements Bark.Barker {

    /* renamed from: a, reason: collision with root package name */
    public static final NoOpBarker f8484a = new NoOpBarker();

    @Override // au.com.woolworths.foundation.bark.Bark.Barker
    public final void a(String message) {
        Intrinsics.h(message, "message");
    }

    @Override // au.com.woolworths.foundation.bark.Bark.Barker
    public final void d(ReportOwner reportOwner, Throwable throwable, String str, String str2) {
        Intrinsics.h(throwable, "throwable");
    }

    @Override // au.com.woolworths.foundation.bark.Bark.Barker
    public final void e(ReportOwner reportOwner, Throwable throwable, String str) {
        Intrinsics.h(throwable, "throwable");
    }

    @Override // au.com.woolworths.foundation.bark.Bark.Barker
    public final void f(ReportOwner reportOwner, String message, String str) {
        Intrinsics.h(message, "message");
    }

    @Override // au.com.woolworths.foundation.bark.Bark.Barker
    public final void g(ReportOwner reportOwner, String message, String str) {
        Intrinsics.h(message, "message");
    }
}
