package me.oriient.internal.di;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadSchedulerImpl;

/* loaded from: classes7.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f24920a = new b();

    public b() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new DataUploadSchedulerImpl();
    }
}
