package com.otaliastudios.zoom.internal.movement;

import com.otaliastudios.zoom.internal.matrix.MatrixController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/zoom/internal/movement/MovementManager;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public abstract class MovementManager {

    /* renamed from: a, reason: collision with root package name */
    public final Lambda f16822a;

    /* JADX WARN: Multi-variable type inference failed */
    public MovementManager(Function0 function0) {
        this.f16822a = (Lambda) function0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    public final MatrixController a() {
        return (MatrixController) this.f16822a.invoke();
    }
}
