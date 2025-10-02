package androidx.compose.ui;

import androidx.annotation.RestrictTo;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\u0005j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006`\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/SessionMutex;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Session", "currentSessionHolder", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/SessionMutex$Session;", "Landroidx/compose/ui/AtomicReference;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InternalComposeUiApi
@JvmInline
@RestrictTo
/* loaded from: classes.dex */
public final class SessionMutex<T> {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/SessionMutex$Session;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Session<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Job f1726a;
        public final Object b;

        public Session(Job job, Object obj) {
            this.f1726a = job;
            this.b = obj;
        }
    }

    public static final Object a(AtomicReference atomicReference) {
        Session session = (Session) atomicReference.get();
        if (session != null) {
            return session.b;
        }
        return null;
    }

    public static final Object b(AtomicReference atomicReference, Function1 function1, Function2 function2, ContinuationImpl continuationImpl) {
        return CoroutineScopeKt.c(new SessionMutex$withSessionCancellingPrevious$2(function1, atomicReference, function2, null), continuationImpl);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof SessionMutex) && Intrinsics.c(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "SessionMutex(currentSessionHolder=null)";
    }
}
