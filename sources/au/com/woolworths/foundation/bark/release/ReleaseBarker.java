package au.com.woolworths.foundation.bark.release;

import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.BarkException;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.bark.engine.reporting.ErrorReporter;
import au.com.woolworths.foundation.bark.engine.tracing.Tracer;
import com.google.firebase.crashlytics.FirebaseCrashlyticsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/bark/release/ReleaseBarker;", "Lau/com/woolworths/foundation/bark/Bark$Barker;", "bark-release_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReleaseBarker implements Bark.Barker {

    /* renamed from: a, reason: collision with root package name */
    public final ErrorReporter f8486a;

    public ReleaseBarker(ErrorReporter errorReporter, Tracer tracer) {
        Intrinsics.h(errorReporter, "errorReporter");
        Intrinsics.h(tracer, "tracer");
        this.f8486a = errorReporter;
    }

    @Override // au.com.woolworths.foundation.bark.Bark.Barker
    public final void a(String message) {
        Intrinsics.h(message, "message");
        this.f8486a.getClass();
        FirebaseCrashlyticsKt.a().a(message);
    }

    @Override // au.com.woolworths.foundation.bark.Bark.Barker
    public final void d(ReportOwner reportOwner, Throwable throwable, String str, String str2) {
        Intrinsics.h(throwable, "throwable");
        int i = BarkException.e;
        this.f8486a.a(reportOwner, true, BarkException.Companion.d(str, str2, throwable));
    }

    @Override // au.com.woolworths.foundation.bark.Bark.Barker
    public final void e(ReportOwner reportOwner, Throwable throwable, String str) {
        Intrinsics.h(throwable, "throwable");
        int i = BarkException.e;
        this.f8486a.a(reportOwner, false, BarkException.Companion.b(str, throwable));
    }

    @Override // au.com.woolworths.foundation.bark.Bark.Barker
    public final void f(ReportOwner reportOwner, String message, String str) {
        Intrinsics.h(message, "message");
        int i = BarkException.e;
        this.f8486a.a(reportOwner, true, BarkException.Companion.c(message, str));
    }

    @Override // au.com.woolworths.foundation.bark.Bark.Barker
    public final void g(ReportOwner reportOwner, String message, String str) {
        Intrinsics.h(message, "message");
        int i = BarkException.e;
        this.f8486a.a(reportOwner, false, BarkException.Companion.a(message, str));
    }
}
