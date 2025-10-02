package com.scandit.datacapture.core.ui.serialization;

import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DataCaptureViewDeserializer.Helper f18943a;
    final /* synthetic */ DataCaptureView b;
    final /* synthetic */ JsonValue c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DataCaptureViewDeserializer.Helper helper, DataCaptureView dataCaptureView, JsonValue jsonValue) {
        super(0);
        this.f18943a = helper;
        this.b = dataCaptureView;
        this.c = jsonValue;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f18943a.a(this.b, this.c);
        return Unit.f24250a;
    }
}
