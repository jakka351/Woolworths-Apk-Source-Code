package me.oriient.internal.services.dataManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.rest.RestHelperImpl;

/* renamed from: me.oriient.internal.services.dataManager.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1302m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1302m f25191a = new C1302m();

    public C1302m() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new RestHelperImpl();
    }
}
