package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.common.services.buildings.BuildingsManagerImpl;

/* loaded from: classes2.dex */
public final class H extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final H f25722a = new H();

    public H() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new BuildingsManagerImpl();
    }
}
