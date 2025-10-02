package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/datastore/core/Message;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Read", "Update", "Landroidx/datastore/core/Message$Read;", "Landroidx/datastore/core/Message$Update;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Message<T> {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/Message$Read;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/Message;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Read<T> extends Message<T> {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/Message$Update;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/Message;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Update<T> extends Message<T> {

        /* renamed from: a, reason: collision with root package name */
        public final SuspendLambda f2566a;
        public final CompletableDeferred b;
        public final State c;
        public final CoroutineContext d;

        /* JADX WARN: Multi-variable type inference failed */
        public Update(Function2 function2, CompletableDeferred completableDeferred, State state, CoroutineContext callerContext) {
            Intrinsics.h(callerContext, "callerContext");
            this.f2566a = (SuspendLambda) function2;
            this.b = completableDeferred;
            this.c = state;
            this.d = callerContext;
        }
    }
}
