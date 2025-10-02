package coil3.compose.internal;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.RememberedCoroutineScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import coil3.ImageLoader;
import coil3.compose.AsyncImageModelEqualityDelegate;
import coil3.compose.ConstraintsSizeResolver;
import coil3.compose.LocalAsyncImageModelEqualityDelegateKt;
import coil3.request.ImageRequest;
import coil3.size.SizeResolver;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-compose-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class UtilsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final CoroutineDispatcher f13070a;

    static {
        CoroutineDispatcher coroutineDispatcherT;
        try {
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            coroutineDispatcherT = MainDispatcherLoader.f24726a.T();
            coroutineDispatcherT.v(EmptyCoroutineContext.d);
        } catch (Throwable unused) {
            coroutineDispatcherT = Dispatchers.b;
        }
        f13070a = coroutineDispatcherT;
    }

    public static final AsyncImageState a(Object obj, ImageLoader imageLoader, Composer composer) {
        return new AsyncImageState(obj, (AsyncImageModelEqualityDelegate) composer.x(LocalAsyncImageModelEqualityDelegateKt.f13065a), imageLoader);
    }

    public static final CoroutineScope b(Composer composer) {
        CoroutineContext coroutineContextT;
        CoroutineContext coroutineContextPlus;
        Object objG = composer.G();
        Object obj = Composer.Companion.f1624a;
        if (objG == obj) {
            objG = new CompositionScopedCoroutineScopeCanceller(new RememberedCoroutineScope(composer.y()));
            composer.A(objG);
        }
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objG).d;
        boolean zBooleanValue = ((Boolean) composer.x(InspectionModeKt.f1972a)).booleanValue();
        boolean zN = composer.n(coroutineScope) | composer.p(zBooleanValue);
        Object objG2 = composer.G();
        if (zN || objG2 == obj) {
            if (zBooleanValue) {
                coroutineContextPlus = coroutineScope.getE().plus(Dispatchers.b);
            } else {
                CoroutineContext e = coroutineScope.getE();
                CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) e.get(CoroutineDispatcher.e);
                if (coroutineDispatcher instanceof MainCoroutineDispatcher) {
                    try {
                        coroutineContextT = ((MainCoroutineDispatcher) coroutineDispatcher).T();
                    } catch (UnsupportedOperationException unused) {
                    }
                    coroutineContextPlus = e.plus(coroutineContextT);
                } else {
                    coroutineContextT = f13070a;
                    coroutineContextPlus = e.plus(coroutineContextT);
                }
            }
            objG2 = CoroutineScopeKt.a(coroutineContextPlus);
            composer.A(objG2);
        }
        return (CoroutineScope) objG2;
    }

    public static final ImageRequest c(Object obj, Composer composer) {
        composer.o(1319639034);
        if (obj instanceof ImageRequest) {
            composer.o(-72322677);
            ImageRequest imageRequest = (ImageRequest) obj;
            composer.l();
            composer.l();
            return imageRequest;
        }
        composer.o(-72283431);
        Context context = (Context) composer.x(AndroidCompositionLocals_androidKt.b);
        boolean zN = composer.n(context) | composer.n(obj);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            ImageRequest.Builder builder = new ImageRequest.Builder(context);
            builder.c = obj;
            objG = builder.a();
            composer.A(objG);
        }
        ImageRequest imageRequest2 = (ImageRequest) objG;
        composer.l();
        composer.l();
        return imageRequest2;
    }

    public static final ImageRequest d(Object obj, ContentScale contentScale, Composer composer) {
        SizeResolver sizeResolver;
        composer.o(-329318062);
        boolean z = obj instanceof ImageRequest;
        if (z) {
            ImageRequest imageRequest = (ImageRequest) obj;
            if (imageRequest.t.h != null) {
                composer.l();
                return imageRequest;
            }
        }
        boolean zC = Intrinsics.c(contentScale, ContentScale.Companion.f);
        Object obj2 = Composer.Companion.f1624a;
        if (zC) {
            composer.o(-858313867);
            composer.l();
            sizeResolver = SizeResolver.q3;
        } else {
            composer.o(-858270839);
            Object objG = composer.G();
            if (objG == obj2) {
                objG = new ConstraintsSizeResolver();
                composer.A(objG);
            }
            sizeResolver = (ConstraintsSizeResolver) objG;
            composer.l();
        }
        if (z) {
            composer.o(-858186178);
            ImageRequest imageRequest2 = (ImageRequest) obj;
            boolean zN = composer.n(imageRequest2) | composer.n(sizeResolver);
            Object objG2 = composer.G();
            if (zN || objG2 == obj2) {
                ImageRequest.Builder builderA = ImageRequest.a(imageRequest2);
                builderA.n = sizeResolver;
                objG2 = builderA.a();
                composer.A(objG2);
            }
            ImageRequest imageRequest3 = (ImageRequest) objG2;
            composer.l();
            composer.l();
            return imageRequest3;
        }
        composer.o(-858022374);
        Context context = (Context) composer.x(AndroidCompositionLocals_androidKt.b);
        boolean zN2 = composer.n(context) | composer.n(obj) | composer.n(sizeResolver);
        Object objG3 = composer.G();
        if (zN2 || objG3 == obj2) {
            ImageRequest.Builder builder = new ImageRequest.Builder(context);
            builder.c = obj;
            builder.n = sizeResolver;
            objG3 = builder.a();
            composer.A(objG3);
        }
        ImageRequest imageRequest4 = (ImageRequest) objG3;
        composer.l();
        composer.l();
        return imageRequest4;
    }
}
