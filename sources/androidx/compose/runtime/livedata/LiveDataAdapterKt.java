package androidx.compose.runtime.livedata;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime-livedata_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LiveDataAdapterKt {
    public static final MutableState a(LiveData liveData, Composer composer) {
        return b(liveData, liveData.e(), composer);
    }

    public static final MutableState b(final LiveData liveData, Object obj, Composer composer) {
        final LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.x(LocalLifecycleOwnerKt.f2808a);
        Object objG = composer.G();
        Object obj2 = Composer.Companion.f1624a;
        if (objG == obj2) {
            if (liveData.e != LiveData.k) {
                obj = liveData.e();
            }
            objG = SnapshotStateKt.f(obj);
            composer.A(objG);
        }
        final MutableState mutableState = (MutableState) objG;
        boolean zI = composer.I(liveData) | composer.I(lifecycleOwner);
        Object objG2 = composer.G();
        if (zI || objG2 == obj2) {
            objG2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.runtime.livedata.LiveDataAdapterKt$observeAsState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    final a aVar = new a(mutableState, 0);
                    LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                    final LiveData liveData2 = liveData;
                    liveData2.f(lifecycleOwner2, aVar);
                    return new DisposableEffectResult() { // from class: androidx.compose.runtime.livedata.LiveDataAdapterKt$observeAsState$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public final void dispose() {
                            liveData2.k(aVar);
                        }
                    };
                }
            };
            composer.A(objG2);
        }
        EffectsKt.b(liveData, lifecycleOwner, (Function1) objG2, composer);
        return mutableState;
    }
}
