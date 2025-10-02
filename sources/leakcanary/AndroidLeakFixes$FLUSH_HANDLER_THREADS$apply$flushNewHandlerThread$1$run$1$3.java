package leakcanary;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes7.dex */
final class AndroidLeakFixes$FLUSH_HANDLER_THREADS$apply$flushNewHandlerThread$1$run$1$3 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ HandlerThread h;
    public final /* synthetic */ Ref.BooleanRef i;
    public final /* synthetic */ Handler j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLeakFixes$FLUSH_HANDLER_THREADS$apply$flushNewHandlerThread$1$run$1$3(HandlerThread handlerThread, Ref.BooleanRef booleanRef, Handler handler) {
        super(0);
        this.h = handlerThread;
        this.i = booleanRef;
        this.j = handler;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.h.isAlive()) {
            Ref.BooleanRef booleanRef = this.i;
            if (booleanRef.d) {
                booleanRef.d = false;
                try {
                    this.j.postDelayed(new Runnable() { // from class: leakcanary.AndroidLeakFixes$FLUSH_HANDLER_THREADS$apply$flushNewHandlerThread$1$run$1$3$posted$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.d.i.d = true;
                        }
                    }, 1000L);
                } catch (RuntimeException unused) {
                }
            }
        }
        return Unit.f24250a;
    }
}
