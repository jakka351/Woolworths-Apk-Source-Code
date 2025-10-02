package me.oriient.internal.services.dataManager.plai;

import com.github.doyaaaaaken.kotlincsv.client.CsvReader;
import kotlin.Lazy;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataManager.rest.RestHelper;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class Y implements T {

    @NotNull
    private static final U Companion = new U();

    /* renamed from: a, reason: collision with root package name */
    public final CsvReader f25292a = new CsvReader();
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;

    public Y() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.b = di.inject(reflectionFactory.b(Logger.class));
        this.c = InternalDiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.d = InternalDiKt.getDi().inject(reflectionFactory.b(RestHelper.class));
        this.e = InternalDiKt.getDi().inject(reflectionFactory.b(OriientApiProvider.class));
    }
}
