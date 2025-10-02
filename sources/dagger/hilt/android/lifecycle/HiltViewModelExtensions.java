package dagger.hilt.android.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"java_dagger_hilt_android_lifecycle-hilt_view_model_extensions_internal_kt"}, k = 2, mv = {1, 6, 0}, xi = 48)
@JvmName
/* loaded from: classes7.dex */
public final class HiltViewModelExtensions {
    public static final MutableCreationExtras a(CreationExtras creationExtras, final Function1 callback) {
        Intrinsics.h(creationExtras, "<this>");
        Intrinsics.h(callback, "callback");
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(creationExtras);
        mutableCreationExtras.f2811a.put(HiltViewModelFactory.d, new Function1<Object, ViewModel>() { // from class: dagger.hilt.android.lifecycle.HiltViewModelExtensions$addCreationCallback$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return (ViewModel) callback.invoke(obj);
            }
        });
        return mutableCreationExtras;
    }
}
