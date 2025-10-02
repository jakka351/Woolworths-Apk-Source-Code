package androidx.compose.ui.autofill;

import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ContentType_androidKt {
    public static final ContentType a(String str) {
        return new AndroidContentType(SetsKt.i(str));
    }

    public static final String[] b(ContentType contentType) {
        Intrinsics.f(contentType, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((AndroidContentType) contentType).b.toArray(new String[0]);
    }
}
