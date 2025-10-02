package me.oriient.internal.infra.di;

import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0005J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lme/oriient/internal/infra/di/DiRepository;", "", "()V", "diMap", "", "", "Lme/oriient/internal/infra/di/DependencyInjection;", "lock", "getDi", "id", "putDi", "", "di", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DiRepository {

    @NotNull
    public static final DiRepository INSTANCE = new DiRepository();

    @NotNull
    private static final Map<String, DependencyInjection> diMap = new LinkedHashMap();

    @NotNull
    private static final Object lock = new Object();

    private DiRepository() {
    }

    @Nullable
    public final DependencyInjection getDi(@NotNull String id) {
        DependencyInjection dependencyInjection;
        Intrinsics.h(id, "id");
        synchronized (lock) {
            dependencyInjection = diMap.get(id);
        }
        return dependencyInjection;
    }

    public final void putDi(@NotNull String id, @NotNull DependencyInjection di) {
        Intrinsics.h(id, "id");
        Intrinsics.h(di, "di");
        synchronized (lock) {
            diMap.put(id, di);
        }
    }
}
