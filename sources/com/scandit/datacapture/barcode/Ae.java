package com.scandit.datacapture.barcode;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Ae extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f17098a;
    final /* synthetic */ De b;
    final /* synthetic */ String c;
    final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ae(boolean z, De de, String str, Function0 function0) {
        super(1);
        this.f17098a = z;
        this.b = de;
        this.c = str;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.h(it, "it");
        if (this.f17098a) {
            re reVarA = this.b.a();
            if (reVarA != null) {
                pe peVar = pe.TextOnly;
                String str = this.c;
                if (str == null) {
                    str = "";
                }
                reVarA.a(peVar, str);
            }
        } else {
            re reVarA2 = this.b.a();
            if (reVarA2 != null) {
                reVarA2.a();
            }
        }
        this.d.invoke();
        return Unit.f24250a;
    }
}
