package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class HandlerDispatcherKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f24696a = 0;

    @Nullable
    private static volatile Choreographer choreographer;

    static {
        Object objA;
        try {
            objA = new HandlerContext(b(Looper.getMainLooper()));
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        if (objA instanceof Result.Failure) {
            objA = null;
        }
    }

    public static final void a() {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            Intrinsics.e(choreographer2);
            choreographer = choreographer2;
        }
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: kotlinx.coroutines.android.a
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                int i = HandlerDispatcherKt.f24696a;
                DefaultScheduler defaultScheduler = Dispatchers.f24691a;
                MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.f24726a;
                throw null;
            }
        });
    }

    public static final Handler b(Looper looper) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        Intrinsics.f(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }
}
