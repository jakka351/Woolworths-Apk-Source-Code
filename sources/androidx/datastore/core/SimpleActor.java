package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/SimpleActor;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SimpleActor<T> {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f2571a;
    public final Function2 b;
    public final BufferedChannel c = ChannelKt.a(Integer.MAX_VALUE, 6, null);
    public final AtomicInt d = new AtomicInt();

    public SimpleActor(CoroutineScope coroutineScope, final Function1 function1, Function2 function2) {
        this.f2571a = coroutineScope;
        this.b = function2;
        Job job = (Job) coroutineScope.getE().get(Job.Key.d);
        if (job != null) {
            job.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.datastore.core.SimpleActor.1
                public final /* synthetic */ Function2 j = DataStoreImpl$writeActor$2.h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit unit;
                    Unit unit2;
                    Throwable th = (Throwable) obj;
                    ((DataStoreImpl$writeActor$1) function1).invoke(th);
                    BufferedChannel bufferedChannel = this.c;
                    bufferedChannel.l(th, false);
                    do {
                        Object objB = ChannelResult.b(bufferedChannel.o());
                        unit = Unit.f24250a;
                        if (objB != null) {
                            DataStoreImpl$writeActor$2.h.invoke(objB, th);
                            unit2 = unit;
                        } else {
                            unit2 = null;
                        }
                    } while (unit2 != null);
                    return unit;
                }
            });
        }
    }
}
