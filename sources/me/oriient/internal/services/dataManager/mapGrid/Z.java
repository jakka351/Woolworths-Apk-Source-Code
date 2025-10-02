package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.DataRepositoryImpl;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class Z implements W {

    @NotNull
    public static final Y Companion = new Y();

    /* renamed from: a, reason: collision with root package name */
    public final DataRepositoryImpl f25208a;

    public Z(DataRepositoryImpl mapGridUrlDataRepository) {
        Intrinsics.h(mapGridUrlDataRepository, "mapGridUrlDataRepository");
        this.f25208a = mapGridUrlDataRepository;
    }
}
