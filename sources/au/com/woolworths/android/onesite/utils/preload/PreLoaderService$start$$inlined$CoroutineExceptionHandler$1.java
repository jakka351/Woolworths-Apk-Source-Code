package au.com.woolworths.android.onesite.utils.preload;

import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineExceptionHandler;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PreLoaderService$start$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public PreLoaderService$start$$inlined$CoroutineExceptionHandler$1() {
        super(CoroutineExceptionHandler.Key.d);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void d(Throwable th) {
        Timber.f27013a.o("Exception caught while running preloader " + th, new Object[0]);
    }
}
