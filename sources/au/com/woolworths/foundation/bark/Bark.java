package au.com.woolworths.foundation.bark;

import au.com.woolworths.foundation.bark.common.ReportOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/bark/Bark;", "", "Barker", "Companion", "bark-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Bark {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f8483a = new Companion();
    public static volatile Barker b = NoOpBarker.f8484a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/bark/Bark$Barker;", "", "bark-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Barker {
        static /* synthetic */ void c(ReportOwner reportOwner, Throwable th, String str, int i) {
            Companion companion = Bark.f8483a;
            if ((i & 4) != 0) {
                str = null;
            }
            companion.d(reportOwner, th, str, null);
        }

        static /* synthetic */ void h(ReportOwner reportOwner, Throwable th, String str, int i) {
            Companion companion = Bark.f8483a;
            if ((i & 4) != 0) {
                str = null;
            }
            companion.e(reportOwner, th, str);
        }

        static /* synthetic */ void i(ReportOwner reportOwner, String str, String str2, int i) {
            Companion companion = Bark.f8483a;
            if ((i & 4) != 0) {
                str2 = null;
            }
            companion.g(reportOwner, str, str2);
        }

        void a(String str);

        void d(ReportOwner reportOwner, Throwable th, String str, String str2);

        void e(ReportOwner reportOwner, Throwable th, String str);

        void f(ReportOwner reportOwner, String str, String str2);

        void g(ReportOwner reportOwner, String str, String str2);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/bark/Bark$Companion;", "Lau/com/woolworths/foundation/bark/Bark$Barker;", "_barker", "Lau/com/woolworths/foundation/bark/Bark$Barker;", "bark-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Barker {
        @Override // au.com.woolworths.foundation.bark.Bark.Barker
        public final void a(String message) {
            Intrinsics.h(message, "message");
            Bark.b.a(message);
        }

        @Override // au.com.woolworths.foundation.bark.Bark.Barker
        public final void d(ReportOwner reportOwner, Throwable throwable, String str, String str2) {
            Intrinsics.h(throwable, "throwable");
            Bark.b.d(reportOwner, throwable, str, str2);
        }

        @Override // au.com.woolworths.foundation.bark.Bark.Barker
        public final void e(ReportOwner reportOwner, Throwable throwable, String str) {
            Intrinsics.h(throwable, "throwable");
            Bark.b.e(reportOwner, throwable, str);
        }

        @Override // au.com.woolworths.foundation.bark.Bark.Barker
        public final void f(ReportOwner reportOwner, String message, String str) {
            Intrinsics.h(message, "message");
            Bark.b.f(reportOwner, message, str);
        }

        @Override // au.com.woolworths.foundation.bark.Bark.Barker
        public final void g(ReportOwner reportOwner, String message, String str) {
            Intrinsics.h(message, "message");
            Bark.b.g(reportOwner, message, str);
        }

        public final void j(Barker barker) {
            Intrinsics.h(barker, "barker");
            if (barker.equals(this)) {
                throw new IllegalArgumentException("Cannot install Bark's companion object as the barker.");
            }
            synchronized (this) {
                Companion companion = Bark.f8483a;
                if (Bark.b != NoOpBarker.f8484a) {
                    throw new IllegalArgumentException("Barker already installed.");
                }
                Bark.b = barker;
            }
        }
    }
}
