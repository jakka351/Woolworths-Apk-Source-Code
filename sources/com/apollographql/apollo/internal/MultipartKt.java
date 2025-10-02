package com.apollographql.apollo.internal;

import com.apollographql.apollo.api.http.HttpResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MultipartKt {
    public static final FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 a(HttpResponse httpResponse) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(FlowKt.B(new MultipartKt$multipartBodyFlow$1(objectRef, httpResponse, null)), new MultipartKt$multipartBodyFlow$2(objectRef, null));
    }
}
