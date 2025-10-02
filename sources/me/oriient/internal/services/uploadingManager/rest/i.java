package me.oriient.internal.services.uploadingManager.rest;

import java.io.File;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.rest.HttpContent;
import me.oriient.internal.infra.rest.HttpEncoding;
import me.oriient.internal.infra.rest.HttpRequestBody;
import me.oriient.internal.infra.rest.PutRequestBuilder;

/* loaded from: classes7.dex */
public final class i extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25653a;
    public final /* synthetic */ HttpEncoding b;
    public final /* synthetic */ File c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, HttpEncoding httpEncoding, File file) {
        super(1);
        this.f25653a = str;
        this.b = httpEncoding;
        this.c = file;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PutRequestBuilder putReturningUnit = (PutRequestBuilder) obj;
        Intrinsics.h(putReturningUnit, "$this$putReturningUnit");
        putReturningUnit.url(this.f25653a);
        putReturningUnit.contentType(HttpContent.CONTENT_OCTET_STREAM);
        HttpEncoding httpEncoding = this.b;
        if (httpEncoding != null) {
            putReturningUnit.contentEncoding(httpEncoding);
        }
        putReturningUnit.body(new HttpRequestBody.Bytes(FilesKt.d(this.c)));
        return Unit.f24250a;
    }
}
