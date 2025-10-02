package com.scandit.datacapture.core.ui;

import android.widget.Toast;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList f18895a;
    final /* synthetic */ DataCaptureView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ArrayList arrayList, DataCaptureView dataCaptureView) {
        super(0);
        this.f18895a = arrayList;
        this.b = dataCaptureView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Toast.makeText(this.b.getContext(), CollectionsKt.M(this.f18895a, "\n", null, null, a.f18885a, 30), 1).show();
        return Unit.f24250a;
    }
}
