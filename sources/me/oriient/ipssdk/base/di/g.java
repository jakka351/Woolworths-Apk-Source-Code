package me.oriient.ipssdk.base.di;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.persistentStorage.PersistentStorageFactory;
import me.oriient.internal.infra.utils.android.ContextProvider;

/* loaded from: classes2.dex */
public final class g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DependencyInjection f25690a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DependencyInjection dependencyInjection) {
        super(0);
        this.f25690a = dependencyInjection;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return PersistentStorageFactory.INSTANCE.create(((ContextProvider) this.f25690a.get(Reflection.f24268a.b(ContextProvider.class))).getContext());
    }
}
