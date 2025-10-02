package me.oriient.internal.services.dataManager.plaiCategories;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: me.oriient.internal.services.dataManager.plaiCategories.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1396v extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1397w f25358a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1396v(C1397w c1397w, String str, String str2) {
        super(1);
        this.f25358a = c1397w;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C1376a it = (C1376a) obj;
        Intrinsics.h(it, "it");
        C1397w c1397w = this.f25358a;
        String str = this.b;
        String str2 = this.c;
        List list = it.f25339a;
        c1397w.getClass();
        return C1397w.a(str, str2, list);
    }
}
