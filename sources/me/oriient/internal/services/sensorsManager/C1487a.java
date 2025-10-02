package me.oriient.internal.services.sensorsManager;

import me.oriient.internal.infra.utils.android.appState.AppState;

/* renamed from: me.oriient.internal.services.sensorsManager.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1487a {

    /* renamed from: a, reason: collision with root package name */
    public int f25565a;
    public long b;
    public float[] c;
    public AppState d = AppState.UNDEFINED;
    public long e;

    public C1487a(int i) {
        this.c = new float[i];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.f25565a);
        sb.append(": ");
        return androidx.camera.core.impl.b.q(sb, this.b, '}');
    }
}
