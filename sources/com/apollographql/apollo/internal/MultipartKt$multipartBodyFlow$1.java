package com.apollographql.apollo.internal;

import com.apollographql.apollo.api.http.HttpResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;
import okio.BufferedSource;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lokio/BufferedSource;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$1", f = "multipart.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MultipartKt$multipartBodyFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super BufferedSource>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ Ref.ObjectRef r;
    public final /* synthetic */ HttpResponse s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartKt$multipartBodyFlow$1(Ref.ObjectRef objectRef, HttpResponse httpResponse, Continuation continuation) {
        super(2, continuation);
        this.r = objectRef;
        this.s = httpResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MultipartKt$multipartBodyFlow$1 multipartKt$multipartBodyFlow$1 = new MultipartKt$multipartBodyFlow$1(this.r, this.s, continuation);
        multipartKt$multipartBodyFlow$1.q = obj;
        return multipartKt$multipartBodyFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MultipartKt$multipartBodyFlow$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0114, code lost:
    
        if (r9 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0118, code lost:
    
        if (r8.g == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011a, code lost:
    
        r8.i = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0122, code lost:
    
        throw new com.apollographql.apollo.exception.DefaultApolloException("expected at least 1 part", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0128, code lost:
    
        throw new com.apollographql.apollo.exception.DefaultApolloException("unexpected characters after boundary", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0129, code lost:
    
        r8.g++;
        r9 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0133, code lost:
    
        r11 = r10.B1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013b, code lost:
    
        if (r11.length() != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013d, code lost:
    
        r10 = r8.new PartSource();
        r8.j = r10;
        r8 = new com.apollographql.apollo.internal.MultipartReader.Part(r9, okio.Okio.c(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014e, code lost:
    
        r12 = kotlin.text.StringsKt.B(r11, ':', r3, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0155, code lost:
    
        if (r12 == (-1)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0157, code lost:
    
        r15 = r11.substring(r3, r12);
        kotlin.jvm.internal.Intrinsics.g(r15, "substring(...)");
        r15 = kotlin.text.StringsKt.k0(r15).toString();
        r11 = r11.substring(r12 + 1);
        kotlin.jvm.internal.Intrinsics.g(r11, "substring(...)");
        r9.add(new com.apollographql.apollo.api.http.HttpHeader(r15, kotlin.text.StringsKt.k0(r11).toString()));
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0192, code lost:
    
        throw new java.lang.IllegalStateException("Unexpected header: ".concat(r11).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0195, code lost:
    
        if (r8.g == 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0197, code lost:
    
        r8.i = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b5, code lost:
    
        throw new com.apollographql.apollo.exception.DefaultApolloException("expected at least 1 part", null);
     */
    /* JADX WARN: Path cross not found for [B:27:0x00ac, B:11:0x003e], limit reached: 110 */
    /* JADX WARN: Path cross not found for [B:35:0x00ca, B:34:0x00c7], limit reached: 110 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x01aa -> B:83:0x01ad). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
