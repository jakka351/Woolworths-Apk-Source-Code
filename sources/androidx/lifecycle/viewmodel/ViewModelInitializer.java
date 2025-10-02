package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "Landroidx/lifecycle/ViewModel;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewModelInitializer<T extends ViewModel> {

    /* renamed from: a, reason: collision with root package name */
    public final KClass f2814a;
    public final Function1 b;

    public ViewModelInitializer(KClass clazz, Function1 initializer) {
        Intrinsics.h(clazz, "clazz");
        Intrinsics.h(initializer, "initializer");
        this.f2814a = clazz;
        this.b = initializer;
    }
}
