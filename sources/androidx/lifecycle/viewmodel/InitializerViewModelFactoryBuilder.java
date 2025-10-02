package androidx.lifecycle.viewmodel;

import io.jsonwebtoken.JwtParser;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;", "", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ViewModelFactoryDsl
/* loaded from: classes2.dex */
public final class InitializerViewModelFactoryBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2813a = new LinkedHashMap();

    public final void a(KClass clazz, Function1 initializer) {
        Intrinsics.h(clazz, "clazz");
        Intrinsics.h(initializer, "initializer");
        LinkedHashMap linkedHashMap = this.f2813a;
        if (!linkedHashMap.containsKey(clazz)) {
            linkedHashMap.put(clazz, new ViewModelInitializer(clazz, initializer));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + clazz.x() + JwtParser.SEPARATOR_CHAR).toString());
    }

    public final InitializerViewModelFactory b() {
        Collection initializers = this.f2813a.values();
        Intrinsics.h(initializers, "initializers");
        ViewModelInitializer[] viewModelInitializerArr = (ViewModelInitializer[]) initializers.toArray(new ViewModelInitializer[0]);
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }
}
