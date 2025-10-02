package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.internal.infra.utils.android.OsDataImpl;

/* renamed from: me.oriient.ipssdk.common.ofs.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1557o extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DependencyInjection f25762a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1557o(DependencyInjection dependencyInjection) {
        super(0);
        this.f25762a = dependencyInjection;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new OsDataImpl(((ContextProvider) this.f25762a.get(Reflection.f24268a.b(ContextProvider.class))).getContext());
    }
}
